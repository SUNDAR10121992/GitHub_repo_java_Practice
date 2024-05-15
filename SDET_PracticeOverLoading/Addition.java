package SDET_PracticeOverLoading;



public class Addition {
int a=10;
int b=20;

void sum()
{
	System.out.println(a+b);
	
}
double sum(Double a, int b)
{
	return a+b;
	
}

void sum(int x,int y)
{
	System.out.println(a+b);
	
}
void sum(int x, double y)
{
	System.out.println(x+y);
}

void sum(double x,int y)
{
	System.out.println(x+y);
}
public static void main(String[] args) {
	
	Addition addition=new Addition();
	
	addition.sum();
	addition.sum(2.3,4);

	addition.sum(10,20);
	
	addition.sum(12, 2.3);
	
	addition.sum(12.3,1);
}
}
