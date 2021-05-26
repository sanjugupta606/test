import java.util.Scanner;

public class year {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please put the required Year");
        int year=keyboard.nextInt();
        keyboard.close();//close the stream using close method. keyboard input reader closed
        boolean isLeap=false;//Ok
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                isLeap=true;
                else
                    isLeap=false;


            }
            else
                isLeap=true;

        }else{
            isLeap=false;

        }
        if(isLeap==true)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
