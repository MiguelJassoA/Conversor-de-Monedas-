package Metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu() {
        System.out.println("Seleciona la conversion que necesitas");
        List<String> menu = new ArrayList<>(6);
        menu.add("1. Dolares USA ---> Dírham AED");
        menu.add("2. Dírham AED ---> Dolares USA");
        menu.add("3. Afgani AFN ---> Dírham AED");
        menu.add("4. Lek albanés All ---> Afgani AFN");
        menu.add("5. Dram armenio---> Afgani AFN");
        menu.add("6. Salir");
        for (String list : menu) {
            System.out.println(list);
        }
        Scanner opcionMenu = new Scanner(System.in);
        int opcionDelMenu = opcionMenu.nextInt();

       /* switch (opcionDelMenu){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:

        }*/

        System.out.println("¿Cuanto dinero quieres convertir?");
        Scanner dinero = new Scanner(System.in);
        double cuantoDinero = dinero.nextDouble();

        System.out.println("Tu dinero es: ");

    }

}
