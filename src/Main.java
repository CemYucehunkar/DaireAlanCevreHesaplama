import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r;
        double π=3.14;

        Scanner yarıcap=new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Giriniz:");
        r=yarıcap.nextInt();

    double alan=r*r*π;
    System.out.println("Daireni Alanı:"+ alan);

    double cevre=2*π*r;
    System.out.print("Dairenin Çevresi:"+ cevre);
        }
    }
