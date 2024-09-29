import java.util.*;
class Invoice{
    String  num,description;
    int quantity;
    double price;
    Invoice(String  num,String description,int quantity,double price){
        this.num=numb;
        this.description=description;
        this.quantity = quantity;
        this.price=price;
    }
    int getInvoiceAmount(){
        return quantity*price;
    }

    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        String  num,description;
        int quantity; 
        double price;
        System.out.println("Enter number,description,quantity,price:");
        number = sc.next();
        description=sc.next();
        quantity=sc.nextInt();
        price=sc.nextDouble();
        Invoice i = new Invoice(num,description,quantity,price);
        System.out.println("Total invoice amount= " + i.getInvoiceAmount());
        
    }
}