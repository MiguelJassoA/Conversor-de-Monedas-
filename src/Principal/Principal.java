package Principal;
import Metodos.Moneda;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       // Metodos.Menu menu = new Metodos.Menu();



        System.out.println("Dime que pais quieres");
        Scanner valorpais = new Scanner(System.in);
        String direcion= valorpais.nextLine();

        PrincipalApi principalApi = new PrincipalApi();
        Moneda moneda= principalApi.pedirdatos(direcion);
        System.out.println(moneda);










    }
}