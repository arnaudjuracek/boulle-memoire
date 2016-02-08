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
					color c = this.OUTPUT.pixels[pos];
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
		float f = 255.0 / (pow(2, 2 * level) + 1);

		img.loadPixels();
		for(int x=0; x<img.width; x++){
			for(int y =0; y<img.height; y++){
				int pos = x + y * img.width;
				color c = img.pixels[pos];
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
				}else c = color(int((threshold < (red + green + blue) / 3.0))*255);


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
					color c = _img.pixels[int(map(x, 0, img.width, 0, _img.width-1)) + int(map(y, 0, img.height, 0, _img.height-1))*_img.width];
					img.pixels[x + y * img.width] = c;
				}
			}
			img.updatePixels();
			return img;
		}else return _img;
	}


	private int d(int i, int j, int n){
	  	if(n == 1) return (i%2 != j%2 ? 2 : 0) + j%2;
	  	else return 4 * d(i%2, j%2, n-1) + d(int(i/2), int(j/2), n-1);
	}
}