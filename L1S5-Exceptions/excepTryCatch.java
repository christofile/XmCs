package L1S5;

public class excepTryCatch {
	public static void main(String[] args) {
		try {
			try{
				String s=null; 
				System.out.println(s.length()); 
			}
			catch(NullPointerException e){
				System.out.print("First Exception in: ");
				System.out.println(e);
			}
		}
		catch(NullPointerException e1){
			System.out.println("Second Exception!");
			System.out.println(e1);
		}
		System.out.println("Keep on execution."); 
	}
}
