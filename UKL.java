
package ukl;

public class UKL {
   
    public static void main(String[] args) {   
        
//    //MUDAH    
//        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan total belanja: Rp ");
//
//        double totalBelanja = scanner.nextDouble();
//        double diskon = (totalBelanja >= 100000 && totalBelanja <= 200000) ? 0.1 
//               : (totalBelanja > 200000) ? 0.2 
//               : 0.0;
//
//        double totalBayar = totalBelanja - (totalBelanja * diskon);
//        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
//        scanner.close();
        

    //SEDANG

//      int tabunganBulanan = 100000; 
//        int kenaikan = 50000;        
//        int totalTabungan = 0;       
//
//        System.out.println("Jumlah tabungan setiap bulan:");
//        for (int bulan = 1; bulan <= 12; bulan++) {
//            System.out.println("Bulan ke-" + bulan + ": Rp " + tabunganBulanan);
//
//            totalTabungan += tabunganBulanan; 
//            tabunganBulanan += kenaikan;
//        }
//
//        System.out.println("\nTotal tabungan setelah 12 bulan: Rp " + totalTabungan);
        
        
//    SULIT    
    
        int[] array = {7, 7, 3, 3, 7, 8, 3};
        int elemenTerbanyak = array[0];
        int jumlahTerbanyak = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;            
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > jumlahTerbanyak) {
                elemenTerbanyak = array[i];
                jumlahTerbanyak = count;
            }
        }        
        System.out.println("Elemen yang paling sering muncul adalah " + elemenTerbanyak 
                + " sebanyak " + jumlahTerbanyak + " kali");
    }
    
}
