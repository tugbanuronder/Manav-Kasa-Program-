import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner input =new Scanner(System.in);
    double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5.00,tutar;
    float a,e,d,m,p;

    System.out.print("Armut Kac Kilo ? :");
    a= input.nextFloat();
    System.out.print("Elma Kac Kilo ? :");
    e= input.nextFloat();
    System.out.print("Domates Kac Kilo ? :");
    d= input.nextFloat();
    System.out.print("Muz Kac Kilo ? :");
    m= input.nextFloat();
    System.out.print("Patlican Kac Kilo ? :");
    p= input.nextFloat();

    tutar=(a*Armut)+(e*Elma)+(d*Domates)+(m*Muz)+(p*Patlıcan);
    System.out.println("Toplam Tutar :"+ tutar);





    }

}
