public class prime {
    public static void main(String[]args){
        int n=1,divisble=0;
        while(n<=100);
        {
            int  primecheck=2;
            while (primecheck<=n/2){
                if(n%primecheck==0){
                    divisble++;
                    break;
                }
                primecheck++;
            }
            if(divisble==0&&n!=1){
                System.out.println(n+" ");
            }
            n++;

        }



    }
}
