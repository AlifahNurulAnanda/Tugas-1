/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Kamis, 3 Maret 2023
Waktu Pengerjaan : 17:00 */


/* pemakaian beberapa operator terhadap relational dan bit */

public class Oper2{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		/* Kamus */
		char i, j;

		/* Algoritma */
		i = 3;		/* 00000011 dalam biner */
		j = 4;		/* 00000100 dalam biner */

		System.out.println ("i = "+ (int) i);
		System.out.println ("j = "+ j);

		System.out.println ("i & j = "+ (i & j));
		/* 0 : 00000000 dalam biner */

		System.out.println ("i | j = "+ (i | j));
		/* 7 : 00000111 dalam biner */

		System.out.println ("i ^ j = "+ (i ^ j));
		/* 7 : 00000111 dalam biner. Ingat!!! operator
		"^" pada bahasa Java bukan sebagai pangkat */

		System.out.println (Math.pow(i, j));
		/* Class Math memiliki method pow(a, b) 
		untuk pemangkatan*/

		System.out.println ("~i = "+ ~i);
		/* ~4 : 11111100 dalam biner */
	}
}