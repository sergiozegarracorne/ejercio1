/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upn.grupo12.ejercio1;

import java.util.ArrayList;

public class ControladorUsuarios {

    public static double calcularPromedioEdad(ArrayList<Usuario> listaUsuarios) {
        int suma = 0;
        for (Usuario u : listaUsuarios) {
            suma += u.getEdad();
        }
        return (double) suma / listaUsuarios.size();
    }

    public static Usuario buscarUsuario(ArrayList<Usuario> listaUsuarios, String nombre) {
        for (Usuario u : listaUsuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                return u;
            }
        }
        return null;
    }


    public static ArrayList<Usuario> buscarUsuarioPorCiudad(ArrayList<Usuario> listaUsuarios, String ciudad) {
        ArrayList<Usuario> encontrados = new ArrayList<>();
        for (Usuario u : listaUsuarios) {
            if (u.getCiudad().equalsIgnoreCase(ciudad)) {
                encontrados.add(u);
            }
        }
        return encontrados;
    }

    // Clase anidada estática para mostrar mensaje decorativo
    public static class Mensaje {
        public static void saludo() {
            System.out.println("==== Bienvenido al Sistema de Usuarios ====");
        }
    }
}