class UserDetails
{
	private String name;
	private String email;
	
	public UserDetails(String n,String e) {
		name=n;
		email=e;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName() {
		name="lily";
	}
	
}
 
public class L1S1
{
   public static void main(String args[])
      {
          UserDetails[] user=new UserDetails[2];
          user[0]=new UserDetails("Kevin","kevin.Li@citrix.com");
          user[1]=new UserDetails("Donnie","Donnie.Shi@citrix.com");
          
          for(UserDetails e:user) {        	  	
        	  	System.out.println("Name="+e.getName());
        	  	System.out.println("Email="+e.getEmail());
          }
          
          for(UserDetails e:user) {        	  	
      	  	e.setName();
          }
          
          for(UserDetails e:user) {        	  	
      	  	System.out.println("Name="+e.getName());
      	  	System.out.println("Email="+e.getEmail());
        }
          
          
        	  		
          
      }
}
