void spawn(){
	int x = 0,
		y = 0,
		px = 0,
		py = 0;

	float tightness = random(0.5, 1.0);
	float curviness = random(0.8, 1.0);

	blob.beginDraw();
		blob.background(0);
		blob.noStroke();
		blob.fill(255);

		blob.beginShape(POLYGON);
			blob.vertex(0, y+=random(0, blob.height*.5));
			do{
				x += random(50*tightness, 200*tightness);
				y += (y<0) ? random(200*curviness) : random(-100*curviness, 100*curviness);
				blob.curveVertex(x, y);
			}while(x<blob.width);
			blob.curveVertex(x+=100, y+=random(100));

			y += int(blob.height*.25);
			do{
				x -= random(50*tightness, 200*tightness);
				y += (y<0) ? random(200*curviness) : random(-100*curviness, 100*curviness);
				blob.curveVertex(x, y);
			}while(x>0);
			blob.curveVertex(x-=100, y+=random(-100));


		blob.endShape(CLOSE);

	blob.endDraw();
}