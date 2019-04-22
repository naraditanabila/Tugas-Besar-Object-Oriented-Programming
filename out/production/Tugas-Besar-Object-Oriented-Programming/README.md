# Tugas-Besar-Object-Oriented-Programming
Tugas Besar Mata Kuliah Object Oriented Programming
MONOPOLY GAMES - Kelompok 9 (Penikmat Senja)

Cara Menjalankan Program:
Masuk ke folder "dist", lalu klik dua kali pada executable jar file "MonpolyTubes". Kemudian, pilih jumlah pemain dan masukkan nama pemain sesuai urutan jalannya pemain sesuai kesepakatan.

Rules dari Permainan:
1. Jumlah pemain 2-4 orang, dengan urutan jalannya pemain sesuai urutan nama yang diinput pada NewGame Frame
2. Setiap pemain memulai permainan dari kotak START, dengan mendapat modal uang sebesar 15000
3. Permainan dimulai dengan pemain pertama menekan tombol "roll" untuk mendapatkan nilai dari 2 dadu, lalu maju sebanyak jumlah nilai kedua dadu yang didapat
4. Jika kedua dadu menunjukkan nilai yang sama, pemain mendapat kesempatan menekan tombol "roll" lagi sampai maksimal 3 kali. Jika lebih dari 3 kali pemain masih mendapat nilai kedua dadu yang sama, maka pemain harus masuk penjara
5. Setiap pemain yang melewati kotak "Start" akan mendapatkan uang sebesar 200
6. Jika pemain berhenti di kotak "Go To Jail", maka pemain akan masuk penjara dan secara otomatis token pemain akan berpindah ke kotak "Penjara", sehingga tidak berhak melanjutkan perjalanan hingga dinyatakan keluar dari penjara.
7. Jika pemain berhenti di kotak "Chance Card" atau "Community Chest", maka pemain akan mendapatkan kartu dengan nomor yang di random dan menjalankan apa yang tertera pada kartu tersebut.
8. Jika pemain berhenti di kotak "Free Parking", pemain berhak memilih tempat yang ingin ia datangi.
9. Jika pemain berhenti di kotak "Tax", pemain wajib membayar pajak senilai dengan yang tertera pada kotak "Tax".
10. Jika pemain berhenti di kotak "Property":
   - Jika properti tersebut belum dimiliki oleh siapapun, pemain berhak membeli properti tersebut sesuai dengan harga yang tertera pada kotak properti.
   - Jika properti tersebut sudah dimiliki oleh pemain lain, maka pemain wajib membayar biaya sewa sesuai aturan pada spek soal kepada pemilik properti tersebut.
   - Jika properti tersebut merupakan milik sediri, maka pemain dapat membeli rumah (upgrade properti) dengan ketentuan bahwa jenis properti adalah "Lot", pemain sudah memiliki 1 kompleks tanah, jumlah maksimal rumah yang dapat dibeli adalah 4 buah dengan 1 buah rumah per kunjungan.
11. Jika pemain masuk penjara, pemain dapat keluar dari penjara pada saat gilirannya jalan dengan cara mendapatkan nilai kedua dadu yang sama atau membayar denda sebesar 1000.
12. Jika uang pemain habis, pemain dapat menjual properti yang pertama dibeli dengan harga jual setengan dari harga beli.
    
Batasan program:
1. Program hanya bisa dijalankan secara full interface pada layar berukuran 1920 x 1080 pixel
