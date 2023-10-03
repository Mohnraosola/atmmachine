import java.util.*;

class atm{

    float balance;

   int pin = 1595;
   // Sytem.out.println("set pin");
   //Scanner sc = new Scanner(System.in);
    
    //int pin = sc.nextInt();

    public void checkping(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();

        if(enterpin == pin){
           menu();

        }else{
            System.out.println("Enter valid pin");
           // Scanner sc = new Scanner(System.in);
             // return enterpin;
        
        }
    }
    public void menu(){

        System.out.println("Enter your choice");
        System.out.println("1.check account balance");
        System.out.println("2.withdraw money");
        System.out.println("3.deposit money");
        System.out.println("4.exit/close");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1 ){
            checkbalane();
        }
        else if (option == 2){
            withdrawmoney();

        }
        else if (option == 3){
            depositmoney();
        }
        else if (option == 4){
            return;
        }else{
            System.out.println("Enter valid option");
        }
    
    }
    public void checkbalane(){
        System.out.println("balance: "+balance);
        menu();

    }
    public void withdrawmoney(){
        System.out.println("enter withdraw amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance){
            System.out.println("insuffient balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Money withdraw successfully");

        }
        menu();
    }
    public void depositmoney(){
        System.out.println("Enter deposit amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposited SuccessFully");
        System.out.println(balance);
       // menu();
       // checkbalane();
    }


}

public class atmmachine {
    public static void main(String []args){
        atm objatm = new atm();

        objatm.checkping();

        //objatm.menu();


    }
}
