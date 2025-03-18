import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dataSimples = new SimpleDateFormat("dd-MM-yyyy");

        Calendar calendario = Calendar.getInstance();
        System.out.println("Data atual: " + dataSimples.format((calendario.getTime())));

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduza a sua data de nascimento (DD-MM-YYYY): ");
        String input = scan.nextLine();

        Date dataNascimento = dataSimples.parse(input);

        Calendar aniversario = Calendar.getInstance();
        aniversario.setTime(dataNascimento);
        aniversario.set(Calendar.YEAR, calendario.get(Calendar.YEAR));
        if (aniversario.before(calendario)) {
            aniversario.set(Calendar.YEAR, calendario.get(Calendar.YEAR) +1);
        }

        long diferenca = aniversario.getTimeInMillis() - calendario.getTimeInMillis();
        long dias = diferenca / (24 * 60 * 60 * 1000);

        System.out.println("Faltam " + dias + " dias para o seu proximo aniversário.");
    }
}