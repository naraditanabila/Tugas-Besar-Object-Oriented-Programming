import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
    public static synchronized void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Place> place = new ArrayList<Place>();
        List<Player> player = new ArrayList<Player>();
        int d1, d2, nPlayer;
        String pName, cmd;
        boolean nextP = false;

        //PenambahanMap
        place.add(new Lot("UDINUS", 1, 400));
		place.add(new Space("Community Chest", 0));
        place.add(new Lot("UPN Surabaya", 1, 400));
		place.add(new Space("Tax", 500));
		place.add(new Railroad("Laboratorium 1"));
		place.add(new Lot("UNISBA", 3, 600));
		place.add(new Space("Chance Card", 0));
		place.add(new Lot("POLBAN", 3, 700));
		place.add(new Lot("ITHB", 3, 800));
		place.add(new Space("Penjara", 0));
		place.add(new Lot("UNIKOM", 4, 800));
		place.add(new Utility("Dana Usaha"));
		place.add(new Lot("Tel-U", 4, 800));
		place.add(new Lot("UNPAR", 4, 900));
		place.add(new Railroad("Laboratorium 2"));
		place.add(new Lot("UII", 6, 1000));
		place.add(new Space("Community Chest", 0));
		place.add(new Lot("UPN Jogja", 6, 1000));
		place.add(new Lot("Atma Jaya", 6, 1100));
		place.add(new Space("Free Parking", 0));
		place.add(new Lot("BINUS", 7, 1200));
		place.add(new Space("Chance Card", 0));
		place.add(new Lot("Trisakti", 7, 1200));
		place.add(new Lot("UNTAR", 7, 1200));
		place.add(new Railroad("Laboratorium 3"));
		place.add(new Lot("UNUD", 8, 1400));
		place.add(new Lot("UNS", 8, 1500));
		place.add(new Utility("Kaos Panitia"));
		place.add(new Lot("PENS", 8, 1500));
		place.add(new Space("Go To Jail", 0));
		place.add(new Lot("UB", 1, 1500));
		place.add(new Lot("UGM", 1, 1600));
		place.add(new Space("Community Chest", 0));
		place.add(new Lot("ITS", 1, 1600));
		place.add(new Railroad("Laboratorium 4"));
		place.add(new Space("Chance Card", 0));
		place.add(new Lot("UI", 1, 2000));
		place.add(new Space("Tax", 100));
		place.add(new Lot("ITB", 1, 2500));
		
		//Copy attribut place di main ke Space
		for (int v = 0 ; v <= place.size() ; v++) {
			Space.addP(place.get(v));
		}
		
        //Pembacaan jumlah player
        nPlayer = s.nextInt();

        //Pembacaan nama tiap player
        for (int i = 1 ; i <= nPlayer ; i++) {
            System.out.println("Nama Player Ke-" + i + ":");
            pName = s.next();
            player.add(new Player(pName));
		}
        
        //Instant Dadu
        Dadu dadu = new Dadu();
		
		//Instant Card
		ListCard<String, ChanceCard> chanceList = new ListCard <String, ChanceCard> ();
		chanceList.add("Masuk Penjara",new ChanceCard(1)); //1, 
        chanceList.add("Maju 3 Langkah",new ChanceCard(2)); //2, position
        chanceList.add("Mundur 3 Langkah",new ChanceCard(3)); //3, position
        chanceList.add("Bayar Zakat 10%",new ChanceCard(4)); //4, outcome
        chanceList.add("Pergi ke Start",new ChanceCard(5)); //5, position
        chanceList.add("Mendapat Sumbangan 20%",new ChanceCard(6)); //6, income
        chanceList.add("Maju 5 Langkah",new ChanceCard(7)); //7, position
        chanceList.add("Mundur 5 Langkah",new ChanceCard(8)); //8, position
        chanceList.add("Mundur 3 Langkah",new ChanceCard(9)); //9, position
        chanceList.add("Maju 5 Langkah",new ChanceCard(10)); //10, position
		ListCard<String, CommunityChest> ccList = new ListCard <String, CommunityChest> ();
		ccList.add("Mendapat Sumbangan 1000",new CommunityChest(1)); //1, in
        ccList.add("Pajak Negara 2000",new CommunityChest(2)); //2, out
        ccList.add("Hadiah Ulang tahun 1750",new CommunityChest(3)); //3, in
        ccList.add("Tagihan BPJS Bulanan 3500",new CommunityChest(4)); //4, out
        ccList.add("Beasiswa BukaPigur 10000",new CommunityChest(5)); //5, in
        ccList.add("Bayar UKT 8000",new CommunityChest(6)); //6, out
        ccList.add("Nemu Duit 2000",new CommunityChest(7)); //7, in
        ccList.add("Dipalak Preman 6500",new CommunityChest(8)); //8, out
        ccList.add("Transferan Orang Tua 5000",new CommunityChest(9)); //9, in
        ccList.add("Bayar Laundry 4000",new CommunityChest(10)); //10, out
        //Iterasi permainan




        //Tutup scanner (penting ga sih)
        s.close();
    }
}
