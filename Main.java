import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tugas PBO");
        ArrayList <String> kopi = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);

        Mesinkopi robusta = new Mesinkopi();
        robusta.setJeniskopi("Robusta");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJeniskopi());

        Mesinkopi arabica = new Mesinkopi();
        arabica.setJeniskopi("Kopi Arabica");
        arabica.setJumlahStokKopi(20);
        kopi.add(robusta.getJeniskopi());

        Mesinkopi flores = new Mesinkopi();
        flores.setJeniskopi("kopi flores");
        flores.setJumlahStokKopi(30);
        kopi.add(flores.getJeniskopi());

        System.out.println("Menu Kopi");
        for(int i = 0; i<kopi.size(); i++){
            int j = i+1;
            System.out.println(j+" " +kopi.get(i));
        }
        System.out.println("Masukan kopi yang mau dipilih : ");
        int pilihanKopi = keyboard.nextInt()-1;

        ArrayList <String> Topping = new ArrayList<String>();

        Topping susu = new Topping();
        susu.setJenisTopping("susu");
        susu.setJumlahStokTopping(30);
        Topping.add(susu.getJenisTopping());

        Topping gula = new Topping();
        gula.setJenisTopping("gula");
        gula.setJumlahStokTopping(30);
        Topping.add(gula.getJenisTopping());

        Topping Cream = new Topping();
        Cream.setJenisTopping("Cream");
        Cream.setJumlahStokTopping(30);
        Topping.add(Cream.getJenisTopping());

        System.out.println("Menu Topping");
        for (int x=0; x<Topping.size(); x++){
            int z = x+1;
            System.out.println(z+" "+Topping.get(x));
        }
        System.out.println("Silahkan pilih topping");
        int pilihanTopping = keyboard.nextInt()-1;

        System.out.println("Pesanan anda adalah " + kopi.get(pilihanKopi)+ " dengan topping " + Topping.get(pilihanTopping));

    }
}
