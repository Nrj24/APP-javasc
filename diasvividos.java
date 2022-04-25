import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class diasvividos
 {

    private int diaN;
    private int mesN;
    private int anioN;

    public diasvividos() {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su dia de nacimiento");
        int diaN = scanner.nextInt();
        System.out.println("Digite su mes de nacimiento");
        int mesN = scanner.nextInt();
        System.out.println("Digite su año de nacimiento");
        int anioN = scanner.nextInt();*/
        LocalDate diaNacimiento = LocalDate.of(anioN, mesN, diaN);
        LocalDate fechaActual = LocalDate.now();
        long diasvividos = ChronoUnit.DAYS.between(diaNacimiento, fechaActual);
        System.out.println("Tu numero de dias Vividos es " + diasvividos);
    }
}