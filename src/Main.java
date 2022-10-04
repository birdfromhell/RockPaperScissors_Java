import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        boolean o ;

        String[] gambar =
                        //Batu
                {"""
                                _______
                            ---'   ____)
                                  (_____)
                                  (_____)
                                  (____)
                            ---.__(___)""",
                        //Kertas
                                """
                                _______
                            ---'   ____)____
                                      ______)
                                      _______)
                                     _______)
                            ---.__________)""",
                        //Gunting
                                """
                                 _______
                             ---'   ____)____
                                       ______)
                                    __________)
                                   (____)
                             ---.__(___)"""
                };


do {

    System.out.println("Apa yang Anda pilih? Ketik 0 untuk Batu, 1 untuk Kertas atau , 2 untuk Gunting ? ");
    int player = scan.nextInt();

    if (player >= 3 || player < 0) {
        System.out.println("Pilihan Tidak Ada !!!");
    }

    System.out.println("Pilihan Player : \n" + gambar[player]);

    int robot = (random.nextInt(3));
    System.out.println("Pilihan Robot : ");
    System.out.println(gambar[robot] + "\n");

    if (player == 0 && robot == 2) {
        System.out.println("Kamu Menang!!!");
    } else if (robot == 0 && player == 2) {
        System.out.println("Kamu Kalah!!!");
    } else if (player > robot) {
        System.out.println("Kamu Menang!!!");
    } else if (robot > player) {
        System.out.println("Kamu Kalah!!!");
    } else if (robot == player) {
        System.out.println("DRAW!!!");
    }
    System.out.println("1 Untuk Keluar , 2 Untuk Lanjut");
    int i = scan.nextInt();

    if (i == 2){
        o = true ;
    }else {
        o = false ;
        System.out.println("Anda telah Keluar Permainan");
    }
}while (o);

    }
}

