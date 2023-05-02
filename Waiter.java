
/**
 * Waiter represents the waiter serving the table
 * The details of the waiter include the name 
 * and their amount of years serving the restaurant
 * 
 * @Stewart Fitzpatrick
 * @26/01/2021
 */
public class Waiter
{
   // instance variables
   private String name; // a waiter has-a name, e.g. "Bob"
   private int yearsService; // a waiter has-a years of service, e.g. 3
   
   /**
    * Constructor for objects of class Waiter
    * if we don't know any details
    */
   public Waiter()
   {
      // initialise instance variables
      this.name = null;
      this.yearsService = 0;
   }

   /**
    * A constructor for objects of class Waiter
    * if we know their name
    */
   public Waiter(String aName)
   {
      // put your code here
      this.name = aName;
      this.yearsService = 0;
   }
   
   /**
    * Constructor for waiter if we know both
    * their name and years of service
    */
   public Waiter(String aName, int aService)
   {
      this.name = aName;
      this.yearsService = aService;
   }
   
   /**
    * Setter for a waiter's name
    */
   public void setName(String aName)
   {
      this.name = aName;
   }
   
   /**
    * Getter for a waiter's name
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Setter for the waiter's years of 
    * service at the restaurant
    */
   public void setYearsService(int aService)
   {
      this.yearsService = aService;
   }
   
   /**
    * Getter for a waiter's years
    * of service at the restaurant
    */
   public int getYearsService()
   {
      return this.yearsService;
   }
   
   /**
    * Returns a description of this object as a string
    * (in this case, the name of the waiter and their
    * years of service at the restaurant)
    */
   public String toString()
   {
      return this.name + " has " + this.yearsService + " years experience as a waiter at this restaurant";
   }
   
}
