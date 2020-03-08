package LAB5;
import java.util.Scanner;
public class ATM {

   private static Account[] accounts = new Account[10];
	
    
    public ATM()
    {
    	accounts();
    	mainMenuOptions();   
    	
    }
    public static void accounts() //create accounts
    {
         for (int i = 0; i < accounts.length; i++) //initialize 100 dollars
        {
          accounts[i] = new Account(i, 100);
        }
    }
      
     public static void mainMenuOptions()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an id: "); //enter id
        int id = input.nextInt();
        
        int index = -1;
        for (int i = 0; i < accounts.length; i++)
        {
          if (accounts[i].getId() == id)
          {
            index = i;
            break;
          }
        }

       
       if(id <=9)
       {
          int choice = 1;
          
          while (choice != 4) 
          {
          mainMenu();
          System.out.println("Enter choice: ");
          choice = input.nextInt();
          
       
        	
          if (choice == 1) 
            {
            System.out.println("The balance is " + accounts[index].getBalance());
            } 
          else if (choice == 2)
            {
            System.out.println("Enter an amount to withdraw ");
            double amount = input.nextDouble();
            accounts[index].withdraw(amount);//withdraw method
            }
          else if (choice == 3) 
            {
            System.out.println("Enter an amount to deposit ");
            double amount = input.nextDouble();
            accounts[index].deposit(amount);//deposit method
            } 
          else if(choice == 4)
            {
              mainMenuOptions();
            } 
          }
       }
          else
          {
              System.out.println("Please enter a correct id");
              mainMenuOptions();
          } 
      }

        public static void mainMenu() //main menu method
        {
        System.out.println("Main menu" + "\n1:check balance" + "\n2:withdraw" + "\n3:deposit" + "\n4:exit");

        }
}