import java.util.Scanner;
public class RideBillCalculator {
    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);   
     System.out.println("Enter the height: ");
     int height = sc.nextInt();
     int totalBill=0;

      if(height>120){
        System.out.println("Can Ride");
      

       System.out.println("Enter the age: ");
       int age = sc.nextInt();
      
       if(age<12){
        totalBill=5;
       }
       else if(age>=12 && age<18){
        totalBill=5;
       }
       else if(age>=18 && age<45){
         totalBill= 12;
       }
       else if(age>=45 && age<55){
        totalBill=0;
       }
    }
        else{
            System.out.println("Can't Ride");
        }
       

        System.out.println("Want Photos: ");
        String photos=sc.next();

        if(photos.equalsIgnoreCase("yes")){
           totalBill=totalBill+3;
            System.out.println("The Total Bill is "+totalBill);
        }
        else if (photos.equalsIgnoreCase("no")){
            System.out.println("The Total Bill is "+totalBill);
        }
      
    }
    
}
