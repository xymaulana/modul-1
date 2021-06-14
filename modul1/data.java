import javax.swing.JOptionPane;
import java.util.Scanner;

public class data{
  public static void main(String[] args){
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  String namaDepan="Ahmad";
	  String namaBelakang=" maulana";
	  int usia = 21;
	  int targetTahunkuliah = 4;
	  double ipk = 3.5;
	  char nilaiAbjad = 'A';
	  boolean tampan = true;
	  
	  System.out.print("input nama depan: ");
	  namaDepan = scanner.nextLine();
	  System.out.print("input usia : ");
	  usia = scanner.nextInt();
	  System.out.print("input ipk : ");
	  ipk = scanner.nextDouble();
	  System.out.print("");
	  System.out.print("input nilai Abjad: ");
	  nilaiAbjad = scanner.next().charAt(0);
	  System.out.print("tampan? : ");
	  tampan = scanner.nextBoolean();
	  
	  System.out.println("============OUTPUT===========");
	  System.out.println("nama depan= " + namaDepan);
	  System.out.println("nama belakang: "+ namaBelakang);
	  System.out.println("usia : "+ usia);
	  System.out.println("target kuliah: "+ targetTahunkuliah + " tahun");
	  System.out.println("ipk : "+ ipk);
	  System.out.println("nilai PBO: "+ nilaiAbjad);
	  System.out.println("tampan : " + tampan);
	  
	  JOptionPane.showMessageDialog(null, "Hai, " +namaDepan +namaBelakang);
	  
  }
}