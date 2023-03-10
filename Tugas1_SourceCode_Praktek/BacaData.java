/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Kamis, 2 Maret 2023
Waktu Pengerjaan : 18:37 */


import java.util.Scanner;

// contoh membaca integer menggunakan Class Scanner

public class BacaData{
	public static void main (String[] args){
		//TODO Auto-generated method stub
		/* Kamus */
		int a;
		Scanner masukan;

		// Program
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer : \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt();
		/* coba ketik : masukan.nextInt();
		Apa akibatnya ? */
		System.out.print("Nilai yang dibaca : "+ a);

	}
}