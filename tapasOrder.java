
/**
 * tapasOrder represents a restaurant booking. 
 * This includes the sharer platter, the amount of guests at each table and their server.
 * 
 * tapasOrder is a composite class.
 * 
 * An object of the tapasOrder class has-an object of the Waiter class,
 * which represents the server of the table in a restaurant.
 * 
 * For TipPercent() if the estimated value of the tip is over 50% 
 * (due to a combination of high guest size and/or years of service) 
 * then the tip percentage is capped at 50%
 * 
 * @Stewart Fitzpatrick 
 * @26/01/2021
 */
public class tapasOrder
{
   // instance variables
   private String tapasPlatter; // The type of sharer platter that is ordered, e.g. "Spicy"
   private String tableNumber; // The table number of the order, e.g. "3"
   private int numberGuestSeated; // The amount of people seated at the table for the meal, e.g. 4
   private Waiter waiter; // a tapasOrder has-an waiter of type Waiter

   /**
    * Constructor for objects of class tapasOrder
    */
   public tapasOrder(String aPlatter, String aTable, int aGuest, Waiter theWaiter)
   {
      // initialise instance variables
      this.tapasPlatter = aPlatter;
      this.tableNumber = aTable;
      this.numberGuestSeated = aGuest;
      this.waiter = theWaiter;
     
   }

    /**
    * Constructor for objects of class tapasOrder,
    * where only the tapas platter is known.
    * This is the minimum information required to construct
    * a tapasOrder object.
    */
   public tapasOrder (String aPlatter)
   {
      this.tapasPlatter = aPlatter;
      this.tableNumber = null;
      this.numberGuestSeated = 0;
      this.waiter = new Waiter();
   } 
   
   /**
    * Setter to be able to set a waiter 
    * to tapasOrder and even overwrite a
    * waiter already assigned to a tapasOrder
    */
   public void setWaiter(Waiter aWaiter)
   {
    this.waiter = aWaiter;
   }
   
   /**
    * Getter that receives the information
    * of a tapasOrder's waiter
    */
   public Waiter getWaiter()
   {
      return this.waiter;
   }
   
   /**
    * Setter for setting the number of years
    * of service at that restaurant for that waiter,
    * overwriting previous year amounts
    */
   public void setYearsService(Waiter aService)
   {
      this.waiter = aService;
   }
   
   /**
    * Setter for setting the name of the waiter
    * at the restaurant
    */
   public void setWaiterName(String aName)
   {
      // put your code here
      this.waiter.setName(aName);
   }
   
   /**
    * Getter for a waiter's name
    */
   public String getWaiterName()
   {
      return this.waiter.getName();
   }
   
   /**
    * Setter for a waiters years of service at the restaurant
    */
   public void setYearsService(int aService)
   {
      this.waiter.setYearsService(aService);
   }
   
   /**
    * Getter for the years of service at of the waiter
    */
   public int getYearsService()
   {
      return this.waiter.getYearsService();
   }
   
   /**
    * Setter for the platter of the order
    */
   public void setTapasPlatter(String aPlatter)
   {
      this.tapasPlatter = aPlatter;
   }

   /**
    * Getter for the platter of the order
    */
   public String getTapasPlatter()
   {
      return this.tapasPlatter;
   }
   
   /**
    * Setter for the table number of the order
    */
   public void setTableNumber(String aTable)
   {
      this.tableNumber = aTable;
   }
   
   /**
    * Getter of the table number of the order
    */
   public String getTableNumber()
   {
      return this.tableNumber;
   }
   
   /**
    * Setter for the number of guests at the table of the order
    */
   public void setNumberGuestsSeated(int aGuest)
   {
      this.numberGuestSeated = aGuest;
   }
   
   /**
    * Getter for the number of guests at the table of the order
    */
   public int getNumberGuestsSeated()
   {
      return this.numberGuestSeated;
   }
   
   /**
    * Returns a string describing this object
    * (in this case, a detailed summary of the order)
    */
   public String toString()
   {
      return "Order for a " + this.tapasPlatter 
      + " for table " + this.tableNumber + ", attended to by " + this.getWaiterName() + ". " 
      + this.numberGuestSeated + " plates needed for the table.";
   }
   
   /**
    * Prints out the estimated tip for the waiter of the table
    * (this is worked out using the amount of people at the table
    * and the years of service of the waiter). If the tip is to 
    * exceed 50%, then the tip amount is capped at 50%
    */
   public void TipPercent()  
   {
      String staff = this.getWaiterName();
      int estimate = this.numberGuestSeated * this.getYearsService();
      
      if (estimate > 50)
      {
         System.out.println("The estimated tip for " + staff + " is 50%");
      }
      else
      {
        System.out.println("The estimated tip for " + staff + " is " + estimate + "%"); 
      }
   }
}
