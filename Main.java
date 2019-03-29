import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
    public static synchronized void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Place> place  = new ArrayList<Place>();
        List<Player> player  = new ArrayList<Player>();
        int d1, d2, nPlayer;
        String pName, cmd;
        boolean nextP = false;

        //PenambahanMap
        
        //Pembacaan jumlah player
        nPlayer = s.nextInt();
        for (int i = 1 ; i <= nPlayer ; i++) {
            System.out.println("Nama Player Ke-"+i+":");
            pName = s.next();
            //player.add(new Player(pName));
            //Player harusnya parameter nama
		}
        
        //Instant Dadu
        Dadu dadu = new Dadu();

        //Iterasi permainan




        //Tutup scanner (penting ga sih)
        s.close();
    }
}
