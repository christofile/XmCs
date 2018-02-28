package L1S2;
public class S2A1{
	public static void main(String args[]) {
		Address[] add = new Address[3];
		add[0]=new College("Jiangning");
		add[1]=new Staff("Xianlin");
		add[2]=new Student("Gulou");
		
		System.out.println("CollegeAddress="+add[0].getAddress());
		System.out.println("StaffAddress="+add[1].getAddress());
		System.out.println("StudentAddress="+add[2].getAddress());
	}
}

