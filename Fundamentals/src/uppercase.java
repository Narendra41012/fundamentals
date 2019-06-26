
public class uppercase {
	public static void main(String[] args){
		char a1='s';
		if(a1>='A' && a1<='Z') 
			a1=(char) (a1+32);
			
		else 
			a1=(char) (a1-32);
			
		System.out.print(a1);
	}
}
