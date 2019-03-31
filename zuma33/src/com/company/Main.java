package assignment;
import java.util.*;
public class Employee {


    public int jackhan;
    public String name;
    public int salary;
    public int tax;
    public int hour;
    public int gorss;

    public int rssb;
    public int net;


    public static class Month extends Employee{
        public void obj1()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter salary  per month");
            salary=in.nextInt();

            tax= (salary*30)/100;
            rssb=(salary*3)/100;
            net=salary-(tax+rssb);


        }


    }
    public static class Week extends Employee{
        public void obj2(){
            System.out.println("Enter salary he get per week");
            Scanner in = new Scanner(System.in);
            salary=in.nextInt();
            net=salary;

        }
    }
    public static class Hour extends Employee{

        public int jackhan;

        public  void obj3(){
            System.out.println("Please enter valber of hours he works");
            Scanner in = new Scanner(System.in);
            hour = in.nextInt();
            System.out.println("Please enter salary per  hours he works");
            salary = in.nextInt();

            if(hour<=40){
                net = hour*salary;

            }
            else{
                net=(40*salary);
                net=net+((hour-40)*(salary))+((hour-40)*(salary)*10/100);



            }
        }
    }



    public  static void main(String[] args) {
        int a;

        Hour val = new Hour();
        Week val1=new Week();
        Month val2=new Month();


        System.out.println("Please enter name  of an employee:");

        Scanner in = new Scanner(System.in);

        val.name=in.nextLine();
        System.out.println("select type of employee according to type; 1:month,2:weekly,type3:hour");
        val.jackhan=in.nextInt();
        System.out.println("name is "+val.name);

        if(val.jackhan==1)
        {

            val2.obj1();

            System.out.println("result is"+val2.net);

        }
        else if(val.jackhan==2){

            val1.obj2();
            System.out.println("result is"+val1.net);
        }
        else if(val.jackhan==3){

            val.obj3();
            System.out.println("result is"+val.net);

        }
        else{
            System.out.println("incorrect select");
        }


    }

}
