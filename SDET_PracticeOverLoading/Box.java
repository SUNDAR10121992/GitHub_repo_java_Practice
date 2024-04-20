package SDET_PracticeOverLoading;

public class Box {
public static void main(String[] args) {
		
		Box b=new Box(10);
	//	Box b1=new Box(10.5,15.3,11.3);
		
	System.out.println(b.voilume());
	}
	double width, hieght, depth;

	Box() {
		width = hieght = depth = 0;

	}

	Box(double w, double h, double d)

	{
		width = w;
		hieght = h;
		depth = d;
	}

	Box(double len) {
		width = hieght = depth = len;
	}

	double voilume()
	{
	return(	width*depth*hieght);
	}
	
	
	
	}
