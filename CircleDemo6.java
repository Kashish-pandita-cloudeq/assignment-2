class Circle{
	double x,y;
	double r;
	//Method 1
	Circle (double x, double y,double r){
	this.x=x;
	this.y=y;
	this.r=r;
	}
/*  //  Methods from 2to4
	Circle(double x,double y,double r){
	x=0;
	y=0;
	this.r=r;
	}

	Circle(Circle c){
	x=c.x;
	y=c.y;
	r=c.r;
	}

	Circle(){
	x=0.0;
	y=0.0;
	r=1.0;
	}

*/
	double circumference(){
	return 2*3.14*r;
	}
	double area(){
	return(22/7)*r*r;
	}
}

//Declare the objects

class CircleDemo6{
public static void main(String args[]){
	Circle c1=new Circle(3.0,4.0,5.0);
	//Circle c2=new Circle(9.0);
	//Circle c3=new Circle(c1);
	//Circle c4=new Circle();
	
	System.out.println("Circumference Of Circle1"+c1.circumference());
	System.out.println("Area Of Circle1"+c1.area());
	//System.out.println("Circumference Of Circle2"+c2.circumference());
	//System.out.println("Area Of Circle2"+c2.area());
	//System.out.println("Circumference Of Circle3"+c3.circumference());
	//System.out.println("Area Of Circle3"+c3.area());
	//System.out.println("Circumference Of Circle4"+c4.circumference());
	//System.out.println("Area Of Circle4"+c4.area());
	
}
}
