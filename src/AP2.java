
import java.util.Scanner;

public class AP2 {
    private static final String DADES = "genere \tcategoria \tpaís \trepetidor \ttemps"; //constant amb els valors
    public static void main(String[] args) {
        boolean fun = true;
        boolean tasty = false; //booleans per las condicions i fer les comparacions
        boolean error = true;


        System.out.println("És noia (1), noi (2) o prefereix no respondre (3):");
        Scanner userGenere = new Scanner(System.in);
        int genere = userGenere.nextInt();
        while (genere > 4 && error) {
            System.out.println("Error en dades"); //bucle per si en el cas que no compleixi la condició mostri error
            return; //Per finalitzar i no deixi continuar
        }

        System.out.println("categoria?:\n\tinfantil (0)\n\tjunior (1)\n\tsenior (2)");
        Scanner userCategoria = new Scanner(System.in);
        int categoria = userCategoria.nextInt();
        while (categoria > 3 && error) {
            System.out.println("Error en dades");
            return;
        }

        System.out.println("Pais de procedència?\n\tFrança (1)\n\tEspanya (2)\n\tEEUU (3)\n\tItàlia (4)\n\tUK (5)\n\tAltres (0)");
        Scanner userPais = new Scanner(System.in);
        int pais = userPais.nextInt();
        while (pais > 6 && error) {
            System.out.println("Error en dades");
            return;
        }

        System.out.println("És la primera vegada que participa?\n\tSi, es la primera vegada (0)\n\tNo, sóc repetidor (1)");
        Scanner userRepetidor = new Scanner(System.in);
        int repetidor = userRepetidor.nextInt();
        while (repetidor > 2 && error) {
            System.out.println("Error en dades");
            return;
        }
        int temps = 0; //variable de temps


        switch (repetidor) { //condició per si s'introdueix 0 passi pero si es posa 1 demani el temps
            case 0:
                break;
            case 1:
                System.out.println("Temps?: ");
                Scanner userTemps = new Scanner(System.in);
                temps = userTemps.nextInt();
                break;
        }

        while (temps >= 500 && error) {
            System.out.println("Error en dades");
            return;
        }

        System.out.println(DADES); //mostrem per pantalla la constant dels valors

         do {
            if (genere == 1 && fun) {
                System.out.print("noia ");
            } else if (genere == 2 && fun) {  //Condició per mostrar el valor del número introduit
                System.out.print("noi ");
            } else if (genere == 3 && fun) {
                System.out.print("prefereix no respondre");
            }
            genere++;
        } while (genere <= 3 && tasty);

        switch (categoria) { //Condició per mostrar el valor del número introduit
            case 0:
                System.out.print("\tinfantil\t");
                break;
            case 1:
                System.out.print("\tjunior\t");
                break;
            case 2:
                System.out.print("\tsenior\t");
                break;
        }

        switch (pais) { //Condició per mostrar el valor del número introduit
            case 0:
                System.out.print("\tAltres\t");
                break;
            case 1:
                System.out.print("\tFrança\t");
                break;
            case 2:
                System.out.print("\tEspanya\t");
                break;
            case 3:
                System.out.print("\tEEUU\t");
                break;
            case 4:
                System.out.print("\tItàlia\t");
                break;
            case 5:
                System.out.print("\tUK\t");
                break;
        }

        do {
            if (repetidor == 0 && fun) { //Condició per mostrar el valor del número introduit
                System.out.print("\t" + repetidor + "\t");
            } else if (repetidor == 1 && fun){
                System.out.print("\t" + repetidor + "\t");
            }
        } while (repetidor <= 1 && tasty);

        if (temps >= 0 && temps <= 500 ) { //Condició per mostrar el valor del número introduit
            System.out.print("\t" + temps);
        }
    }
}
