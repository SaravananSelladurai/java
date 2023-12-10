package Saravanan.JavaProject.MiniBus;

public class Bus{
    private int bus_no;
    private static int capacity;
    private String des_place;
    private int tickets;
         //constructor is created....

    public Bus(int bus_no,int tickets,String des_place){
        this.bus_no = bus_no;
        this.tickets = tickets;
        this.des_place = des_place;
        capacity += tickets;
    }
    public void displayInfo(){
        System.out.println("Bus No : "+bus_no+"\ncapacity : "+capacity+"\ndes_place :"+des_place);
    }
}