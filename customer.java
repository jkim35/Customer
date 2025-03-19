public class customer  //super or parent class
{
    private String name;
    private String address;

    public customer(String n, String a)  //constructor
    {
       name = n;
       address = a;
    }

    public String toString()  //toString
    {
       return "Name: " + name + "\nAddress: " + address;
    }



    public static void main(String[] args)
    {
       customer c = new customer("Fran Santiago", "123 Main St., Anytown, USA");
       System.out.println(c);

       // Uncomment these to test OnlineCustomer
        OnlineCustomer c2 = new OnlineCustomer("Jasper Smith", "456 High St., Anytown, USA", "jsmith456@gmail.com");
        System.out.println(c2);  //call the class toString
    }

 }// end of the class Customer





 // Complete the OnlineCustomer class to inherit from Customer
 // It should have an email attribute,
 // a constructor with 3 arguments (name, address, email) that uses the super constructor,
 // and an overridden toString() method that calls the super toString() method
 //  and then prints "\nEmail:" and the email variable.
 class OnlineCustomer  extends customer
 {
      private String email; 
	private String name;
private String address;
      public OnlineCustomer(String n, String a, String e)

{
  
    super(n,a);
    email = e;

}

public String toString()
{
   	return super.toString()+"\nEmail: "+email;

} 




 }
 
