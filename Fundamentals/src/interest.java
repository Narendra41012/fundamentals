
public class interest {
	public static void main(String[] args){
		int a=Integer.parseInt(args[1]);
		if((args[0]).equals("male")) {
			if(a>1 && a<58)
				System.out.print("the percentage of interest is 9.2%.");
			if(a>58 && a<100)
				System.out.print("the percentage of interest is 10.5%.");
			}
		if((args[0]).equals("female")) {
			if(a>1 && a<58)
				System.out.print("the percentage of interest is 8.2%.");
			if(a>58 && a<100)
				System.out.print("the percentage of interest is 9.2%.");
	}
}
}