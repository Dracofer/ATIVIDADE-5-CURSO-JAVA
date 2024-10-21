import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double pn1;
    double pn2;
    double np1;
    double np2;
    double vp1;
    double vp2;
    double total;
    
    pn1 = sc.nextDouble();
    np1 = sc.nextDouble();
    vp1 = sc.nextDouble();
    pn2 = sc.nextDouble(); 
    np2 = sc.nextDouble();
    vp2 = sc.nextDouble();
    total = (np1 * vp1) + (np2 * vp2);
  
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    sc.close();
   
  }
}