/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Kamis, 2 Maret 2023
Waktu Pengerjaan : 18:59 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;	// import package Class Scanner
import java.io.*;		// import package Class Console
import javax.swing.*; 		// import package Class JOptionPane 


public class Bacakar{
	public static void main(String[] args) throws 
	IOException {
	//TODO Auto-generated method stub
	/* Kamus */
	char cc;
	int bil;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader dataIn = new BufferedReader(isr);

	// atau

	BufferedReader datAIn = new BufferedReader(new 
	InputStreamReader(System.in));
	
	/* Algoritma */
	System.out.print("Hello\n");
	System.out.print("Baca 1 karakter : ");

	//perintah baca karakter CC
	cc=dataIn.readLine().charAt(0);
	System.out.print("Baca 1 bilangan : ");

	//perintah baca bil
	bil=Integer.parseInt(dataIn.readLine());


	System.out.print (cc +"\n" +bil+"\n");
	

	
	/* Tambahkan program membaca/input data menggunakan
	Class Scanner, Class Console dan Class JOptionPane */


	// input & output/membaca class Scanner
	System.out.println("\nBerikut adalah penggunaan Class Scanner");
	System.out.println("Masukkan nilai : ");
	Scanner masukan = new Scanner(System.in);
	int a = masukan.nextInt();
	System.out.println("Nilai yang dimasukkan adalah : "+a);


	// input & output/membaca class Console
	System.out.println("\nBerikut adalah penggunaan Class Console");
	System.out.println("Masukkan nilai : ");
	Console input = System.console();
	String b = input.readLine();
	System.out.println("Nilai yang dimasukkan adalah : "+b);


	// input & output/membaca class JOptionPane
	JOptionPane.showMessageDialog(null,"Hello, \nBerikut adalah penggunaan Class JOptionPane, tekan enter atau OK");
	String kar = JOptionPane.showInputDialog("Masukkan Karakter : ");
	System.out.println("\nBerikut adalah penggunaan Class JOptionPane \nKarakter yang baru saja dimasukkan : "+kar);

	System.out.println("\nBye :)");



	}
}