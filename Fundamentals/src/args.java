
public class args {
	public static void main(String[] args){
		int i;
		if(args.length==0)
			System.out.print("no value");
		else
			for(i=0;i<=args.length-1;i++) {
				System.out.print(args[i]);
		if(i<args.length-1)
			System.out.print(",");
    
	}
	}
}
