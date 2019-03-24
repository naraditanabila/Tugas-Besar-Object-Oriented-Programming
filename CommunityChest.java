import java.util.ArrayList;
import java.util.Random;

public class CommunityChest {
    Random rand = new Random();
    
    ArrayList<String> ccList = new ArrayList<String>();
    
    public CommunityChest() {
        chanceLIst.add("Mendapat Sumbangan 1000"); //1, in
        chanceLIst.add("Pajak Negara 2000"); //2, out
        chanceLIst.add("Hadiah Ulang tahun 1750"); //3, in
        chanceLIst.add("Tagihan BPJS Bulanan 3500"); //4, out
        chanceLIst.add("Beasiswa BukaPigur 10000"); //5, in
        chanceLIst.add("Bayar UKT 8000"); //6, out
        chanceLIst.add("Nemu Duit 2000"); //7, in
        chanceLIst.add("Dipalak Preman 6500"); //8, out
        chanceLIst.add("Transferan Orang Tua 5000"); //9, in
        chanceLIst.add("Bayar Laundry 4000"); //10, out
    };

    public int getNum() {
        int n = rand.nextInt(10);
        return n;
    }

    public void print(int n) {
        System.out.println(ccList.get(n));
    }

    public void chanceAction(int n, Player p) {
        if (n == 1) {
            p.receive(1000);
        } else if (n == 2) {
            p.pay(2000);
        } else if (n == 3) {
            p.receive(1750);
        } else if (n == 4) {
            p.pay(3500);
        } else if (n == 5) {
            p.receive(10000);
        } else if (n == 6) {
            p.pay(8000);
        } else if (n == 7) {
            p.receive(2000);
        } else if (n == 8) {
            p.pay(6500);
        } else if (n == 9) {
            p.receive(5000);
        } else if (n == 10) {
            p.pay(4000);
        } 
    }
}