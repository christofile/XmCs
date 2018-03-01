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
		name="Lily";
	}
	
}
 
public class L1S1
{
   public static void main(String args[])
      {
          UserDetails user=new UserDetails(null, null);
          user=new UserDetails("Kevin","kevin.Li@citrix.com");
     	  	
        	  System.out.println("Name="+user.getName());
        	  System.out.println("Email="+user.getEmail());
	  	
      	  user.setName();
    	  	
      	  System.out.println("Name="+user.getName());
      	  System.out.println("Email="+user.getEmail());
          
          
        	  		
          
      }
}
