
package upn.grupo12.ejercio1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Ejercio1 {

public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        ControladorUsuarios.Mensaje.saludo();

        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            try {
                System.out.print("Ingrese nombre: ");
                String nombre = input.nextLine();

                System.out.print("Ingrese edad: ");
                int edad = Integer.parseInt(input.nextLine());
                if (edad <= 0) throw new NumberFormatException();

                System.out.print("Ingrese ciudad: ");
                String ciudad = input.nextLine();

                Usuario nuevo = new Usuario(nombre, edad, ciudad);
                usuarios.add(nuevo);
            } catch (NumberFormatException e) {
                System.out.println("Edad no valida. Intente nuevamente");
                continue;
            }

            System.out.print("¿Desea ingresar otro usuario? (s/n): ");
            continuar = input.nextLine();
        }

        // Mostrar total
        System.out.println("\nTOTAL de usuarios registrados: " + usuarios.size());

        // Promedio de edad
        if (!usuarios.isEmpty()) {
            double promedio = ControladorUsuarios.calcularPromedioEdad(usuarios);
            System.out.println("Promedio de edad: " + promedio);
        }

        // Nombre más largo
        String nombreLargo = "";
        for (Usuario u : usuarios) {
            if (u.getNombre().length() > nombreLargo.length()) {
                nombreLargo = u.getNombre();
            }
        }
        System.out.println("Nombre mas largo: " + nombreLargo);

        // Usuario destacado
        if (!usuarios.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(usuarios.size());
            Usuario destacado = usuarios.get(index);
            System.out.println("Usuario destacado: " + destacado.getNombre() + " de " + destacado.getCiudad());
        }

        input.close();
    }
}