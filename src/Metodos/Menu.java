package Metodos;
import Principal.PrincipalApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu() {
        Moneda moneda;
        boolean salida;

        do {
            PrincipalApi principalApi = new PrincipalApi();
            double cuantoDinero = 0;
            salida = false;

            System.out.println("Seleciona la conversion que necesitas");
            List<String> menu = new ArrayList<>(6);
            menu.add("1. Dolares USD ---> Dírham AED");
            menu.add("2. Dírham AED ---> Dolares USD");
            menu.add("3. Afgani AFN ---> Dírham AED");
            menu.add("4. Lek albanés ALL ---> Afgani AFN");
            menu.add("5. Pesos Mexicanos MXN---> Afgani AFN");
            menu.add("6. Salir");
            for (String list : menu) {
                System.out.println(list);
            }
            Scanner opcionMenu = new Scanner(System.in);
            int opcionDelMenu = opcionMenu.nextInt();
            System.out.println("********************************************");

            try {

                switch (opcionDelMenu) {

                    case 1:
                        String paisuno = "Dolares USD";
                        String paisunoTresLetras = "USD";
                        String paisdos = "Dírham AED";
                        String paisdosTresLetras = "AED";
                        System.out.println("Usted selecciono[" + opcionDelMenu + ". " + paisuno + " ---> " + paisdos + "]");
                        System.out.println("¿Cuanto dinero quieres convertir?");
                        Scanner dinero = new Scanner(System.in);
                        cuantoDinero = dinero.nextDouble();
                        moneda = principalApi.pedirdatos(paisunoTresLetras, paisdosTresLetras, cuantoDinero);
                        System.out.println("La tasa de conversión actual es de: " + moneda.conversion_rate());
                        System.out.println(cuantoDinero + "[" + paisunoTresLetras + "]" + " son " + moneda.conversion_result() + "[" + paisdosTresLetras + "]");
                        break;
                    case 2:
                        paisuno = "Dírham AED";
                        paisunoTresLetras = "AED";
                        paisdos = "Dolares USD";
                        paisdosTresLetras = "USD";
                        System.out.println("Usted selecciono[" + opcionDelMenu + ". " + paisuno + " ---> " + paisdos + "]");
                        System.out.println("¿Cuanto dinero quieres convertir?");
                        dinero = new Scanner(System.in);
                        cuantoDinero = dinero.nextDouble();
                        moneda = principalApi.pedirdatos(paisunoTresLetras, paisdosTresLetras, cuantoDinero);
                        System.out.println("La tasa de conversión actual es de: " + moneda.conversion_rate());
                        System.out.println(cuantoDinero + "[" + paisunoTresLetras + "]" + " son " + moneda.conversion_result() + "[" + paisdosTresLetras + "]");
                        break;
                    case 3:
                        paisuno = "Afgani AFN";
                        paisunoTresLetras = "AFN";
                        paisdos = "Dírham AED";
                        paisdosTresLetras = "AED";
                        System.out.println("Usted selecciono[" + opcionDelMenu + ". " + paisuno + " ---> " + paisdos + "]");
                        System.out.println("¿Cuanto dinero quieres convertir?");
                        dinero = new Scanner(System.in);
                        cuantoDinero = dinero.nextDouble();
                        moneda = principalApi.pedirdatos(paisunoTresLetras, paisdosTresLetras, cuantoDinero);
                        System.out.println("La tasa de conversión actual es de: " + moneda.conversion_rate());
                        System.out.println(cuantoDinero + "[" + paisunoTresLetras + "]" + " son " + moneda.conversion_result() + "[" + paisdosTresLetras + "]");
                        break;
                    case 4:
                        paisuno = "Lek albanés ALL";
                        paisunoTresLetras = "ALL";
                        paisdos = "Afgani AFN";
                        paisdosTresLetras = "AFN";
                        System.out.println("Usted selecciono[" + opcionDelMenu + ". " + paisuno + " ---> " + paisdos + "]");
                        System.out.println("¿Cuanto dinero quieres convertir?");
                        dinero = new Scanner(System.in);
                        cuantoDinero = dinero.nextDouble();
                        moneda = principalApi.pedirdatos(paisunoTresLetras, paisdosTresLetras, cuantoDinero);
                        System.out.println("La tasa de conversión actual es de: " + moneda.conversion_rate());
                        System.out.println(cuantoDinero + "[" + paisunoTresLetras + "]" + " son " + moneda.conversion_result() + "[" + paisdosTresLetras + "]");
                        break;
                    case 5:
                        paisuno = "Pesos Mexicanos MXN";
                        paisunoTresLetras = "MXN";
                        paisdos = "Afgani AFN";
                        paisdosTresLetras = "AFN";
                        System.out.println("Usted selecciono[" + opcionDelMenu + ". " + paisuno + " ---> " + paisdos + "]");
                        System.out.println("¿Cuanto dinero quieres convertir?");
                        dinero = new Scanner(System.in);
                        cuantoDinero = dinero.nextDouble();
                        moneda = principalApi.pedirdatos(paisunoTresLetras, paisdosTresLetras, cuantoDinero);
                        System.out.println("La tasa de conversión actual es de: " + moneda.conversion_rate());
                        System.out.println(cuantoDinero + "[" + paisunoTresLetras + "]" + " son " + moneda.conversion_result() + "[" + paisdosTresLetras + "]");
                        break;
                    case 6:
                        salida = true;

                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opcion no valida");
            }
        } while (salida == false);
    }
}
