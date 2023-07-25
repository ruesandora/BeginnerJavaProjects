import java.util.Scanner;

public class B08_BasitHesapMakinesi {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("1-Toplama" + "\n2-Çıkarma" + "\n3-Çarpma" + "\n4-Bölme" +
            "\nYapmak istediğiniz işlemi giriniz: " );
    int islem = scan.nextInt();


    System.out.print("1. sayınızı giriniz: ");
    double num1 = scan.nextDouble();
    System.out.print("2. Sayınızı giriniz: ");
    double num2 = scan.nextDouble();

/*    switch (islem){
      case 1:
        System.out.println(num1 + num2);
        break;
      case 2:
        System.out.println(num1 - num2);
        break;
      case 3:
        System.out.println(num1 * num2);
        break;
      case 4:
        System.out.println(num1 / num2);
        break;
      default:
        System.out.println("Geçersiz işlem..");
    }*/

    // Farklı bir yöntem:

    if (islem == 1){
      System.out.println(num1 + num2);
    } else if (islem == 2) {
      System.out.println(num1 - num2);
    } else if (islem == 3) {
      System.out.println(num1 * num2);
    } else if (num1 >= 1 && num2 >= 1 && islem == 4) {
      System.out.println(num1 / num2);
    } else System.out.println("Geçersiz işlem..");


  }
}
