
/* Problem Statement:

Jon Snow and the men in the north decided to open Castle Black for the northerners and the Castle was turned into a Hotel. 
The Hotel was flourishing and there was high demand for the rooms. 
So Jon Snow decided to modify the tariff accordingly. 
Write a program to calculate the hotel tariff. 
The room rent is 20% high during peak seasons [April-June and November-December].

Input Format

The first input integer denotes the count of the month. 
The second input integer denotes the room rent per day. 
The third input integer denotes the number of days stayed in the hotel.

Output Format

Print the hotel tariff to be paid. 
(Note: if the month value entered is not ranging from 1-12, print as Invalid Input) */

import java.util.*;
public class HotelFareCalci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Month(1-12)");
        int month=sc.nextInt();
        System.out.println("Enter the Room rent(per day):");
        int rent=sc.nextInt();
        System.out.println("Enter the number of Days stayed:");
        int days=sc.nextInt();

        if (month<1 || month>12) {
            System.out.println("Invalid Input");
        }else{
            if (month ==11|| month ==12||(month>3&&month<7)){
                System.out.println("Room Rent will be:"+(rent*1.2)*days);
            }else{
                System.out.println("Room Rent will be:"+(rent)*days);
            }
        }
        sc.close();
        


    }
    
}
