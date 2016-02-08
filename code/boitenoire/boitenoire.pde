int LENGTH = -1;


Ditherer DITHER;
PGraphics blob, gradient, splatter;
boolean SHOW_DITHER = false;

void setup(){
	size(991, 616);
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
			get(0, 0, int(width*.5), height).save("/Users/RNO/Desktop/export_boitenoire/"+i+".png");
			println("saving page #"+(i+1));
			get(int(width*.5), 0, int(width*.5), height).save("/Users/RNO/Desktop/export_boitenoire/"+(i+1)+".png");
		}
		println(LENGTH + " pages done !");
		println("XOXOXO.");
	}
}


void draw(){
	background(255);
	if(blob != null && gradient != null && splatter != null){
		if(SHOW_DITHER && DITHER.OUTPUT != null) image(DITHER.OUTPUT, 0, 0);
		else image(splatter, 0, 0);
	}
}


void keyPressed(){
	if(key == ' ') clear();
	if(key == 'd') dither();
	if(key == 'r') splat();
	if(key == 'a'){
		splat();
		dither();
	}
	if(key == 's'){
		println("Begin PNG record...");
		get(0, 0, int(width*.5), height).save("/Users/RNO/Desktop/boitenoire_left.png");
		get(int(width*.5), 0, int(width*.5), height).save("/Users/RNO/Desktop/boitenoire_right.png");
		println("End record.");
	}
}