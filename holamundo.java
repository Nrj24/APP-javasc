import java.util.Scanner;

public class holamundo 
{
    public static void main (String[] args)
    {
    System.out.println ("Bienvenidos al mundo!!");
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Cual es tu nombre?");
    String nom = scanner.nextLine();

    System.out.println ("Bienvenido" + nom + "Entraste al mundo infinito");
    
    }

}
