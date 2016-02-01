void clear(){
	splatter = createGraphics(splatter.width, splatter.height);
	splatter.beginDraw();
		splatter.background(255);
	splatter.endDraw();
}

void dither(){
	if(SHOW_DITHER){
		SHOW_DITHER = false;
	}else{
		DITHER.make(splatter);
		SHOW_DITHER = true;
	}
}

void splat(){
	SHOW_DITHER = false;
	spawn();
	gradientize();
	gradient.mask(blob);
	splatter.beginDraw();
		splatter.tint(255, random(200, 255));
		splatter.image(gradient, 0, 0);
	splatter.endDraw();
}