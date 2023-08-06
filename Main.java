import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = {"Taş(0)", "Kağıt(1)", "Makas(2)"};
        Random rand = new Random();
        int puan = 0;

        while (true) {

            System.out.println("Taş Kağıt Makas Oyununa Hoşgeldin");
            System.out.println("Hazırsan Başlayalım");
            System.out.println("0-Taş 1-Kağıt 2-Makas");
            int secim = scan.nextInt();
            if (secim >= 0 && secim <= 2) {
                System.out.println("*****************");

                int pcSecim = rand.nextInt(0, 3);
                System.out.println("Pc seçimi: " + arr[pcSecim]);

                switch (secim) {
                    case 0:
                        if (pcSecim == 0) {
                            System.out.println("Berabere");
                        } else if (pcSecim == 1) {
                            System.out.println("Kaybettin");
                            if (puan >= 5) {
                                puan -= 5;
                            } else {
                                puan = 0;
                            }
                        } else {
                            System.out.println("Kazandın");
                            puan += 10;
                        }
                        break;
                    case 1:
                        if (pcSecim == 1) {
                            System.out.println("Berabere");
                        } else if (pcSecim == 0) {
                            System.out.println("Kaybettin");
                            if (puan >= 5) {
                                puan -= 5;
                            } else {
                                puan = 0;
                            }
                        } else {
                            System.out.println("Kazandın");
                            puan += 10;
                        }
                        break;
                    case 2:
                        if (pcSecim == 2) {
                            System.out.println("Berabere");
                        } else if (pcSecim == 0) {
                            System.out.println("Kaybettin");
                            if (puan >= 5) {
                                puan -= 5;
                            } else {
                                puan = 0;
                            }

                        } else {
                            System.out.println("Kazandın");
                            puan += 10;
                        }
                        break;

                }
                System.out.println("Puanın: " + puan);
            }
            System.out.println("*****************");
        }


    }

}

