/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Kamis, 7 Maret 2023
Waktu Pengerjaan : 23:33 */




import java.util.Scanner;

public class KonversiWaktu{
	public static void main(String[] args){
		
		int totJam, jam, totMen, menit, detik;

		System.out.print("Masukkan total detik : ");
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		detik = a % 60;
		totMen = a / 60;
		menit = totMen % 60;
		totJam = totMen / 60;
		jam = totJam % 24;

		System.out.println("Detik sekarang	: "+detik+" detik");
		System.out.println("Total menit	: "+totMen+" menit");
		System.out.println("Menit sekarang	: "+menit+" menit");
		System.out.println("Total jam	: "+totJam+" jam");
		System.out.println("Jam sekarang	: "+jam+" jam");
		System.out.println("Tampil waktu	: "+jam+ ":" +menit+ ":" +detik);

	}
}