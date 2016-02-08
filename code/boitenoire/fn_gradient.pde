void gradientize(){
	// colorMode(HSB);
	// color
	// 	c1 = color(random(255), 255, 255*.9),
	// 	c2 = color(random(255), 255, 255*.9);

	color
		c1 = color(random(255), 0, random(127)),
		c2 = color(0, random(255), random(127));

	ArrayList<PVector> points = new ArrayList<PVector>();
	int x = 0, y = -200;
	float tightness = random(1.0);
	float curviness = random(1.0);
	do{
		x += random(-100*curviness, 100*curviness);
		y += random(50*tightness, 200*tightness);
		points.add(new PVector(x, y));
	}while(y<gradient.height);

	gradient.beginDraw();
		gradient.background(0);
		for(int _x=-200; _x<gradient.width + 200; _x+=2){
			float inter = map(_x, -200, gradient.width + 200, 0, 1);
			color c = lerpColor(c1, c2, inter);
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