package hello;

public class Box {
	int lenght;
	int width;
	int height;
	
	Box(int l,int w,int h){
		lenght=l;
		width=w;
		height=h;
		
	}
	

	int area() {
		return lenght*width;
	}
}
