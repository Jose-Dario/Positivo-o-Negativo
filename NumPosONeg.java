
import java.util.Scanner;
public class NumPosONeg
{
    public static void main (String []args){
    Scanner x=new Scanner(System.in);
    double s;
    
    System.out.println ("Digite un numero");
    s=x.nextDouble();
    
    if (s>0){
    System.out.println ("El numero es positivo");
    }
    
    if (s==0){
        System.out.println ("El numero ingresado es 0");
    } 
    
    if(s<0){
    System.out.println ("El numero es negativo");
    }
    }
    }

