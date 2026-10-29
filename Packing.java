import java.util.Scanner;
import java.util.Arrays;
    public class ParkingSlot{
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    int [][] row = new int[0][1];
      System.out.println("===========================");
      System.out.println("Mini Parking system");
      System.out.println("===========================");
      System.out.println("select option");
      System.out.println("simple parking");
      System.out.println("parking slot");
      System.out.println("car number");
      System.out.println("display parking status);
  
    System.out.println("Enter select option");
    int userInput = input.nextInt();
    
    switch(userInput){
        case 1:
            System.out.println(" simple parking");
            for(int count = 0; count < row.length; count++){
                    System.out.println(Arrays.toString(row[count]));
            }
            System.out.println("parking slot: ");
            int row = input.nextInt();
            System.out.println("Enter slot number: ");
            int userslot = input.nextInt();
            slot[row][userslot] = 1;
            for(int index = 0; index < row.length; index++){
                    System.out.println(Arrays.toString([index]));
            }
            break;
            
            case 2:
                  System.out.println("");
                   for(int count = 0; count < row.length; count++){                

System.out.println(Arrays.toString(slot[count]));
                   }
                  System.out.println("Start");
                  int rows = input.nextInt();       
                  System.out.println("Enter car number: ");
                  int user = input.nextInt();
                  slot[rows][user] = 1;
                  for(int index = 0; in99dex < row.length; index++){
                    System.out.println(Arrays.toString(row[index]));
                    }
                  break;
            case 3:
                  System.out.println( display parking status");
                   for(int count = 0; count < row.length; count++){                
                    System.out.println(Arrays.toString(seat[count]));
                   }
                  System.out.println("Enter number: ");
                  int value = input.nextInt();       
                  System.out.println("Exist the system ");
                  int userslot = input.nextInt();
                  [value][user park] = 1;
                  for(int index = 0; index < row.length; index++){
                    System.out.println(Arrays.toString(slot[index]));
                    }
                  break;
                    
                  
                  
                  
    }
}

}
