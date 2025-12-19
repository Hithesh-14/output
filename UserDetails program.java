class Login
{
private String username;
private String password;
Login(String username,String password)
{
this.username=username;
this.password=password;
}
String getUsername()
{
return username;
}
String getPassword()
{
if(password.length() >=8)
{
System.out.println("password is created");
}
else
System.out.println("password should be atleast 8 characters");
return password;
}
}
class UserDetails
{
public static void main(String[] args)
{
Login l=new Login("pavan","2222222222");
System.out.println("username is:"+l.getUsername());
System.out.println("password is:"+l.getPassword());
}
}
