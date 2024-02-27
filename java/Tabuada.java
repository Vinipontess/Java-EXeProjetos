class Tabuada{
	public static void main(String[] args){
		int x = 1;
		int y = 1;
		System.out.println("Tabuada do " + x);
		while(x<11){
			int res = x*y;
			System.out.println(x + " x " + y + " = " + res);
			y = y+1;
			if(y == 11){
				y = y-10;
				x = x+1;
				System.out.println(" ");
				
				if(x<11){
				System.out.println("Tabuada do " + x);
				}
			}
		}
	}
}