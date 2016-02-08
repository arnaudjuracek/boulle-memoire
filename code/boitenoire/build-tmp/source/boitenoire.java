import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class boitenoire extends PApplet {

int LENGTH = -1;


Ditherer DITHER;
PGraphics blob, gradient, splatter;
boolean SHOW_DITHER = false;

public void setup(){
	
	// 320*410 = 1 page
	// 640*410 = 2 pages

	DITHER = new Ditherer();
	blob = createGraphics(width, height);
	splatter = createGraphics(width, height);
	gradient = createGraphics(width, height);

	clear();

	if(LENGTH > 1){
		for(int i=0; i<LENGTH; i+=2){
			splat();
			dither();
			image(DITHER.OUTPUT, 0, 0);
			println("saving page #"+i);
			get().save("/Users/RNO/Desktop/export_boitenoire/_full/"+i+".png");
			get(0, 0, PApplet.parseInt(width*.5f), height).save("/Users/RNO/Desktop/export_boitenoire/"+i+".png");
			println("saving page #"+(i+1));
			get(PApplet.parseInt(width*.5f), 0, PApplet.parseInt(width*.5f), height).save("/Users/RNO/Desktop/export_boitenoire/"+(i+1)+".png");
		}
		println(LENGTH + " pages done !");
		println("XOXOXO.");
	}
}


public void draw(){
	background(255);
	if(blob != null && gradient != null && splatter != null){
		if(SHOW_DITHER && DITHER.OUTPUT != null) image(DITHER.OUTPUT, 0, 0);
		else image(splatter, 0, 0);
	}
}


public void keyPressed(){
	if(key == ' ') clear();
	if(key == 'd') dither();
	if(key == 'r') splat();
	if(key == 'a'){
		splat();
		dither();
	}
	if(key == 's'){
		println("Begin PNG record...");
		get(0, 0, PApplet.parseInt(width*.5f), height).save("/Users/RNO/Desktop/boitenoire_left.png");
		get(PApplet.parseInt(width*.5f), 0, PApplet.parseInt(width*.5f), height).save("/Users/RNO/Desktop/boitenoire_right.png");
		println("End record.");
	}
}
public class Ditherer{
	public PImage INPUT, OUTPUT;
	public int
		PIXELATION = 2,
		LEVEL = 4;
	public boolean COLORED = true;

	Ditherer(){}

	public PImage make(PGraphics input){
		PGraphics pg = createGraphics(input.width, input.height);
			pg.beginDraw();
				pg.background(255);
				if(input != null) pg.image(input, 0, 0);
			pg.endDraw();
		this.INPUT = pg;
		this.OUTPUT = this.INPUT.copy();
		this.OUTPUT.resize(this.INPUT.width/this.PIXELATION, 0);

		this.OUTPUT = this.dither(this.OUTPUT, this.LEVEL, this.COLORED);
		this.OUTPUT = this.zoom(this.OUTPUT, this.PIXELATION);

		return this.OUTPUT;
	}


	public void savePDF(String path, String filename){
		println("Begin PDF record...");
		rectMode(CENTER);
		beginRecord(PDF, path + filename + ".pdf");
			this.OUTPUT.loadPixels();
			stroke(0);
			for(int x=0; x<this.OUTPUT.width; x++){
				for(int y=0; y<this.OUTPUT.height; y++){
					int pos = x + y*this.OUTPUT.width;
					int c = this.OUTPUT.pixels[pos];
					if(brightness(c) < 128) point(x, y);
				}
			}
		endRecord();
		println("End record.");
	}


	public void savePNG(String path, String filename){
		println("Begin PNG record...");
		this.OUTPUT.save(path + filename + ".png");
		println("End record.");
	}


	private PImage dither(PImage img, int level, boolean colored){
		float f = 255.0f / (pow(2, 2 * level) + 1);

		img.loadPixels();
		for(int x=0; x<img.width; x++){
			for(int y =0; y<img.height; y++){
				int pos = x + y * img.width;
				int c = img.pixels[pos];
				float threshold = level > 0 ? d(x, y, level) * f : 128;

				int red = (c >> 16) & 0xFF,
					green = (c >> 8) & 0xFF,
					blue = c & 0xFF;

				if(colored){
					int r = threshold >= red ? 0 : 255,
						g = threshold >= green ? 0 : 255,
						b = threshold >= blue ? 0 : 255;
					c = (r << 16) | (g << 8) | b;
					if(brightness(c)==0) c = color(255, 0);
				}else c = color(PApplet.parseInt((threshold < (red + green + blue) / 3.0f))*255);


				img.pixels[pos] = c;
			}
		}
		img.updatePixels();
		return img;
	}


	private PImage zoom(PImage _img, int zoom){
		if(zoom>1){
			PImage img = createImage(_img.width*zoom, _img.height*zoom, RGB);
			_img.loadPixels();

			for(int x=0; x<img.width; x++){
				for(int y=0; y<img.height; y++){
					int c = _img.pixels[PApplet.parseInt(map(x, 0, img.width, 0, _img.width-1)) + PApplet.parseInt(map(y, 0, img.height, 0, _img.height-1))*_img.width];
					img.pixels[x + y * img.width] = c;
				}
			}
			img.updatePixels();
			return img;
		}else return _img;
	}


	private int d(int i, int j, int n){
	  	if(n == 1) return (i%2 != j%2 ? 2 : 0) + j%2;
	  	else return 4 * d(i%2, j%2, n-1) + d(PApplet.parseInt(i/2), PApplet.parseInt(j/2), n-1);
	}
}
public void spawn(){
	int x = 0,
		y = PApplet.parseInt(blob.height*.5f);

	float tightness = random(0.5f, 1.0f);
	float curviness = random(0.8f, 1.0f);

	blob.beginDraw();
		blob.background(0);
		blob.noStroke();
		blob.fill(255);

		blob.beginShape(POLYGON);
			blob.vertex(0, y+=random(0, blob.height*.5f));
			do{
				x += random(50*tightness, 200*tightness);
				y += (y>blob.height*.9f) ? random(-200*curviness) : ( (y<blob.height*.1f) ? random(200*curviness) : random(-100*curviness, 100*curviness) );
				blob.curveVertex(x, y);
			}while(x<blob.width);
			blob.curveVertex(x+=100, y+=random(100));

			y = PApplet.parseInt(blob.height*.5f);
			do{
				x -= random(50*tightness, 200*tightness);
				y += (y>blob.height*.9f) ? random(-200*curviness) : ( (y<blob.height*.1f) ? random(200*curviness) : random(-100*curviness, 100*curviness) );
				blob.curveVertex(x, y);
			}while(x>0);
			blob.curveVertex(x-=100, y+=random(-100));


		blob.endShape(CLOSE);

	blob.endDraw();
}
public void gradientize(){
	// colorMode(HSB);
	// color
	// 	c1 = color(random(255), 255, 255*.9),
	// 	c2 = color(random(255), 255, 255*.9);

	int
		c1 = color(random(255), 0, random(127)),
		c2 = color(0, random(255), random(127));

	ArrayList<PVector> points = new ArrayList<PVector>();
	int x = 0, y = -200;
	float tightness = random(1.0f);
	float curviness = random(1.0f);
	do{
		x += random(-100*curviness, 100*curviness);
		y += random(50*tightness, 200*tightness);
		points.add(new PVector(x, y));
	}while(y<gradient.height);

	gradient.beginDraw();
		gradient.background(0);
		for(int _x=-200; _x<gradient.width + 200; _x+=2){
			float inter = map(_x, -200, gradient.width + 200, 0, 1);
			int c = lerpColor(c1, c2, inter);
			gradient.stroke(c);
			gradient.strokeWeight(3);
			gradient.noFill();

			gradient.beginShape();
			for(PVector p : points) gradient.curveVertex(_x + p.x, p.y);
			gradient.endShape();

			// gradient.line(x, 0, x, gradient.height);
		}
	gradient.endDraw();
}
public void clear(){
	splatter = createGraphics(splatter.width, splatter.height);
	splatter.beginDraw();
		splatter.background(255);
	splatter.endDraw();
}

public void dither(){
	if(SHOW_DITHER){
		SHOW_DITHER = false;
	}else{
		DITHER.make(splatter);
		SHOW_DITHER = true;
	}
}

public void splat(){
	SHOW_DITHER = false;
	spawn();
	gradientize();
	gradient.mask(blob);
	splatter.beginDraw();
		splatter.tint(255, random(200, 255));
		splatter.image(gradient, 0, 0);
	splatter.endDraw();
}
  public void settings() { 	size(991, 616); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "boitenoire" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
