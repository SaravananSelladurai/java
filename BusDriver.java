package Saravanan.JavaProject.MiniBus;
import java.util.*;
public class BusDriver {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<BusPassenger> passenger_list = new ArrayList<>();
    static ArrayList<Bus> bus_list = new ArrayList<>();
    public static void main(String[]args){
        System.out.println("\t\t*************Bus Driver Class*************");
       
        
        boolean continueOrNot = false;
        do{
            System.out.println("**********************************************************");
            System.out.println("Enter your option....");
            System.out.println("..........................................................");
            System.out.println("For Booking... 1\nFor Canceling... 2\nFor Exit... 3 ");
            System.out.println("..........................................................");
            int check = sc.nextInt();
            
            switch(check){
                case 1:
                    System.out.println("\t\tBooking....");
                    bookingTicket();
                    continueOrNot = true;
                    break;
                case 2:
                    System.out.println("\t\tCanceling....");
                    continueOrNot = true;
                    break;
                case 3:
                    System.out.println("\t\tExit....");
                    continueOrNot = false;
                    break;
                case 4:
                    passengerDetails();
                    busDetails();
                    continueOrNot = true;
                    break;
                default :
                    System.out.println("Invalid response... Enter valid data....");
                    continueOrNot  = true;
                    break;
            }
        }while(continueOrNot);
        System.out.println("Thank you for the booking....! Happy journey....!");
    }

    public static void bookingTicket(){
        System.out.println("Enter the number of tickets :  ");
        int tickets = sc.nextInt();
        busTicket(tickets);
        for(int i=0;i<tickets;i++){
            System.out.println("Enter the passenger name :");
            String p_name = sc.nextLine();
            System.out.println("Enter the age of a passenger :");
            int p_age = sc.nextInt();
            System.out.println("Gender of a passenger : ");
            String gender = sc.next();
            System.out.println("Enter the phone number : ");
            long ph_num = sc.nextLong();
            BusPassenger obj = new BusPassenger(p_name,p_age,gender,ph_num);
            passenger_list.add(obj);
        }
    }

    public static void busTicket(int tickets){
        for(int i=0;i<tickets;i++){
            System.out.println("Enter the bus number : ");
            int bus_no = sc.nextInt();
            System.out.println("Enter the destination place : ");
            String des_place = sc.nextLine();
            Bus bus = new Bus(bus_no,1,des_place);
            bus_list.add(bus);
        }
    }

    public static void passengerDetails(){
        for(BusPassenger i : passenger_list){
            System.out.println("\t\tThe name of passenger:"+i.getP_name());
            System.out.println("\t\tPassenger age  :"+i.P_name);
            System.out.println("\t\tPassenger gender : "+i.getGender());
            System.out.println("\t\tPassenger phone number : "+i.getPh_num());
        }
    }
    public static void busDetails(){
        Bus pointer = new Bus(0, 0, null);
        System.out.println("Bus number is : "+((Object) pointer).getBus_no());
        System.out.println("Bus destination is : "+pointer.getDes_place());
        System.out.println("Bus capacity is : "+pointer.getCapacity());
    }
}
