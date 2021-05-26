public class interest {public static void main(String[]args){
    double P=3000,R=5,T=2;
    double SI=(P*T*R)/100;
    double CI=P*(Math.pow((1+R/100),T));
    System.out.println("The compound interest is "+CI);
    System.out.println("The simple interest is "+SI);
}
}
