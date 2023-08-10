import java.util.*;
public class Bank1 {
    static{
        System.out.println("WELCOME TO SBI BANK");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b= 1234;int bal=500;int dept;int wid;int count=0;
        int i=1;
        while(i<=3){
            System.out.print("Enter your ATM pin:");
            int a = sc.nextInt();
            if (a == b) {
                System.out.println("valid ATM pin");
                for(i=0;i<=20;i++){
                    System.out.println("choose any of the the following option");
                    System.out.println("1.check balance");
                    System.out.println("2.Deposit");
                    System.out.println("3.withdrawal");
                    System.out.println("4.ATM pin set");
                    System.out.println("5.ATM pin is");
                    System.out.println("6.exit");
                    System.out.println();
                    int choice=sc.nextInt();
                    switch (choice){
                        case 1:if(choice==1){
                            System.out.println("Your Bank Balance"+bal);
                            break;
                        }
                        case 2:if (choice==2){
                            System.out.println("Enter the deposit amount");
                            int d=sc.nextInt();
                            System.out.println(" congragulation your deposit is succesfull");
                            bal=bal+d;
                            break;
                        }
                        case 3:if (choice==3){
                            System.out.println("enter the withdrwal amount");
                            wid=sc.nextInt();
                            count++;
                            if(count>3){
                                System.out.println("your limit is over");
                            }
                            else
                            if (bal < wid) {
                                System.out.println("balance is less");
                            }
                            else
                            {
                                System.out.println("your withdrwal is succesfull");
                                bal = bal - wid;
                            }
                            break;
                        }
                        case 4:if(choice==4)
                        {
                            System.out.println("plz enter your 4 digit pin ");
                            int r=sc.nextInt();
                            b=r;
                            break;
                        }
                        case 5:if(choice==5)
                        {
                            System.out.println("Your ATM pin is: "+b);
                            break;
                        }
                        case 6:if(choice==6){
                            System.out.println("THANK YOU FOR BANKING");
                            System.exit(0);
                        }
                        default:
                            System.out.println("invalid numder");
                    }

                }
            }
            else
            {
                System.out.println("invalid ATM pin");
                i++;
            }
            System.out.println("contact your bank manager");
        }

    }

}