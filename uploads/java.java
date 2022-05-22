import java.util.*;
/*

 *Name :- Namra Ramsha
pcno:- SRKI_041
div - B
En No. SR21BSIT139
*/

class Transportation_Company{
    Scanner sc = new Scanner(System.in);
    String name,cname;
    double Rating;
    void GetData(){
        System.out.print("Enter Company Name:- ");
        name = sc.nextLine();
        System.out.println("Enter Cab name:- ");
        cname = sc.nextLine();
        System.out.println("Enter Rating (Strats):- ");
        Rating = sc.nextInt();

    }
    void DisplayData(){
        System.out.println("Company\tCab_Name\tRatings");
        System.out.println("------------------------------------------------------------------");
        System.out.println(name+"\t"+cname+"\t"+Rating);
        
    }
    void ChangeRating(){
        System.out.print("Enter Reating:- ");
        Rating = sc.nextInt();
    }
    
}
class Cabs extends Transportation_Company{
    Scanner dis = new Scanner(System.in);
    String dow,up,you;
    int cost;
    void GetDatac(){
        System.out.println("Enter Your Name :- ");
        you = sc.nextLine();
        System.out.println("Enter Your Pickup Point:- ");
        up = sc.nextLine();
        System.out.println("Enter Your Destation Name:- ");
        dow = sc.nextLine();
    
    }
    void DisplayDatac(){
        System.out.println("Company|\tCab_Name|\tFrom\t|Ride_To|\tCharges|\tRating");
        System.out.println(name+"|\t"+cname+"|\t"+up+"|\t"+dow+"|\t"+cost+"|\t"+Rating);
    
    }
}
class Rides extends Cabs{
    Scanner sc = new Scanner(System.in);
    void CalCharge(){
        System.err.println("If Distance < 100 KM Charge = 40 Rs./KM");
                System.err.println("Distance >100 KM nd < 200 KM Charge = 50 Rs. /KM");
 System.err.println("Distance > 200 KM Charge = 70 Rs. /KM \n");
    
    }
    void CalTotalKm(){
        System.out.println("Now Enter Destination in KM:- ");
        int c = sc.nextInt();
        if (c<=100){
            int sum =40;
            cost = sum * c;
            System.out.println("Toalt const is "+cost);
        }
        else if(c>99 && c<201){
        int sum = 50;
        int cost = sum * c;
                    System.out.println("Toalt const is "+cost);

        }else if(c>200){
            int sum = 70;
            int cost = sum * c;
                        System.out.println("Toalt const is "+cost);

        }
    }
    
}
public class exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               //System.out.println("Company Name\tCab_Name\tCustomer_name\tRide_From\tRide_To\tCharges\tRatingS");
        Scanner sc = new Scanner(System.in);
           Rides obj=new Rides();
          obj.GetData();
          obj.DisplayData();
          System.out.print("Do You Wnat to Change Rating? [1] for yes [2] for no");
         int y=sc.nextInt();
          switch (y) {
              case 1:
                   obj.ChangeRating();
                   break;
          }
          
           obj.DisplayData();
           obj.CalCharge();
           obj.GetDatac();
           obj.CalTotalKm();
           obj.DisplayDatac();
                

    }
    
}

