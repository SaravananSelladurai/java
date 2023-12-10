package Saravanan.JavaProject.MiniBus;
import java.util.*;

public class BusPassenger {
    static Scanner sc = new Scanner(System.in);
    private String p_name;
    private int p_age;
    private String gender; 
    private long ph_num;
           //constructor is created fro passenger class....
    public BusPassenger(){
        System.out.println("Enter the passenger name :");
        p_name = sc.nextLine();
        System.out.println("Enter the age of a passenger :");
        p_age = sc.nextInt();
        System.out.println("Gender of a passenger : ");
        gender = sc.next();
        System.out.println("Enter the phone number : ");
        ph_num = sc.nextLong();
        //calling another constructor using this() method ....
        //this(p_name,p_age,gender,ph_num);
    }
    public BusPassenger(String p_name,int p_age,String gender,long ph_num ){
        this.p_name = p_name;
        this.p_age = p_age;
        this.gender = gender;
        this.ph_num = ph_num;
    }

}
