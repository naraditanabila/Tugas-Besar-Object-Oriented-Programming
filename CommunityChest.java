import java.util.ArrayList;
import java.util.Random;

public class CommunityChest {
    Random rand = new Random();
    
    ArrayList<String> CommunityChest = new ArrayList<String>();
    
    public ChanceCard() {
        chanceLIst.add("Mendapat Sumbangan 1000"); //in
        chanceLIst.add("Pajak Negara 2000"); //out
        chanceLIst.add("Hadiah Ulang tahun 1750"); //in
        chanceLIst.add("Tagihan BPJS Bulanan 3500"); //out
        chanceLIst.add("Beasiswa BukaPigur 10000"); //in
        chanceLIst.add("Bayar UKT 8000"); //out
        chanceLIst.add("Nemu Duit 2000"); //in
        chanceLIst.add("Dipalak Preman 6500"); //out
        chanceLIst.add("Transferan Orang Tua 5000"); //in
        chanceLIst.add("Bayar Laundry 4000"); //out
    };

    public int CCnum() {
        int n = rand.nextInt(10);
        return n;
    }

    public void print() {
        System.out.println(CommunityChest.get(CCnum()));
    }
}