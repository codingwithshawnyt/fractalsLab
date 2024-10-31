import java.awt.*;

class fractalsShells {
	public static void main(String[] args) {
		//This is the code used to create the image you see on the panel.
		
		DrawingPanel panel = new DrawingPanel(300,300); //The Canvas
			panel.setBackground(Color.WHITE);
		Graphics g = panel.getGraphics();//Create the paintbrush
		
		//Everything else in main is for adding aspects to the canvas
		
		g.setColor(Color.RED); //Setting the paintbrush to the color red
		g.drawString("Hello, world!", 20, 50); //create a RED string onto the canvas
		
		g.setColor(Color.BLACK);//Setting the paintbrush to the color BLACK
		
		//Now I need to assign the points of my equilateral triangle.
		Point bottomLeft = new Point(50, 250);
		Point topMiddle = new Point(150, 50);
		Point bottomRight = new Point(250, 250);

		//Time to use my custom method!
		drawTriangle(g, bottomLeft, topMiddle, bottomRight);
		
		g.setColor(Color.WHITE);
	}

	public static void drawTriangle(Graphics g, Point p1, Point p2, Point p3)
	{
		/* 
			Since the Graphics class doesn't contain a drawTriangle method,
			I decided to create my own using the Polygon class, which will
			basically trace the shape starting from the first point to the
			next point and so on and so on. It will then close the shape by
			tracing from the last point to the first point.
		*/

		//If you want to create a custom shape, edit this function to fit the
			//your design.
		Polygon p = new Polygon();
		p.addPoint(p1.x, p1.y);
		p.addPoint(p2.x, p2.y);
		p.addPoint(p3.x, p3.y);
		g.fillPolygon(p);
		
		g.setColor(Color.WHITE);
		Polygon w = new Polygon();
		w.addPoint(100,150);
		w.addPoint(150,250);
		w.addPoint(200,150);
		g.fillPolygon(w);
		//or you can use:   g.drawPolygon(p);
		
  	}
  	
  	public static Point midpoint(Point p1, Point p2)
  	{
  		//This method should give us the midpoint of 2 coordinates
		  	//Use this site as a guide: https://www.mathsisfun.com/algebra/line-midpoint.html
  		
  		Point mid = new Point();
  		//mid.x = ?
  		//mid.y = ?
  		
  		return mid;
  	}

	public static void recur(/*  What needs to go here?  */)
	{

	}
}