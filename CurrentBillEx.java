import java.util.*;
class currentbill{
    int consumerno; 
    String consumer_name, EBtype ;
    double previous_month_reading, current_month_reading;
    currentbill(int consumerno,  String consumer_name, String EBtype , double previous_month_reading, double current_month_reading){
        this.consumerno=consumerno;
        this.consumer_name=consumer_name;
        this.type_EB = EBtype;
        this.previous_month_reading=previous_month_reading;
        this.current_month_reading=current_month_reading;
    }
    double calculateBillAmount(){
        double units = current_month_reading - previous_month_reading;
        double total=0;
        if(units>=250){
            total=total+(50*0.50);
            total = total+((units-50)*2.65);
        }
        else{
            total=total+(200*1.50);
            total = total+((units-200)*3.5);
        }
        return total;
    }
}
class CurrentBillEx{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int consumerno;  
        String consumer_name, EBtype ;
        double previous_month_reading, current_month_reading;
        System.out.println("Enter the Consumer  no.,  consumer  name,type of EB connection,  previous  month  reading, current month reading ");
        consumerno = sc.nextInt();
        consumer_name=sc.next(); 
        EBtype=sc.next(); 
        previous_month_reading=sc.nextDouble();
        current_month_reading=sc.nextDouble();
        currentbill c = new currentbill(consumerno,  consumer_name, EBtype, previous_month_reading, current_month_reading);
        System.out.println("Total bill"+c.calculateBillAmount());
        
    }