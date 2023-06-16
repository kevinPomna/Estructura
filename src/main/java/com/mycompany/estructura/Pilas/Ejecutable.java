/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura.Pilas;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author kepomacu
 */
public class Ejecutable {

    public static void main(String[] args) {
        GestorHistorial gestor = new GestorHistorial();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingressa el nombre de la web");
            String nombre = entrada.nextLine();
            System.out.println("Ingresa la direccion de la web");
            String direccion = entrada.nextLine();
            System.out.println("Desque que dispositivo Ingresas");
            String dispositivos = entrada.nextLine();
            gestor.visitarWeb(new PaginaWeb(nombre, direccion, new Date(), null, null, dispositivos));
        }
        gestor.historial();
        System.out.println("------------------------");
        System.out.println("-------------------------");
        System.out.println(gestor.obtenerUiltimaWebVisitada().toString());
        gestor.cerrarWeb();
        System.out.println(gestor.obtenerUiltimaWebVisitada().toString());
        gestor.eliminarWeb();
        System.out.println(gestor.obtenerUiltimaWebVisitada());

        System.out.println("-------------------------------------");
        System.out.println("--------------------------------------");

        System.out.println("--------------------------------------");

        System.out.println("Ingrese dispositivo");
        String dispositivos = entrada.next();
        System.out.println(gestor.obtenerUtilmaWebVisitadaDispositivo(dispositivos).toString());

    }
}
