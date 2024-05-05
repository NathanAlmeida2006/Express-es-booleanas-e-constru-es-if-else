import java.util.Scanner;

public class StringEquality {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean moe;
    String nome;

    System.out.print("Informe seu nome: ");
    nome = sc.nextLine();

    moe = nome.equals("Moe");

    if (moe) {
      System.out.println("Você é o rei do rock!");

    } else {
      System.out.println("Você NÃO é o rei do rock!");

    }

    sc.close();

  }

}
