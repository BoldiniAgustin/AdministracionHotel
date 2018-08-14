package registroclientes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RegistroCliente {

    public static void main(String[] args) throws ParseException {
        RegistroCliente r = new RegistroCliente();
    }

    public RegistroCliente() throws ParseException {
        HashMap grupo = new HashMap();
        Scanner sc = new Scanner(System.in);
        boolean stop = false;

        System.out.println("Registro de clientes");
        while (stop == false) {
            System.out.println("1_ Nuevo grupo");
            System.out.println("2_ Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    List<Cliente> personas = new ArrayList<>();
                    System.out.print("Grupo: ");
                    sc.nextLine();
                    String clave = sc.nextLine();
                    System.out.print("Cantidad de personas: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Dni: ");
                        String dni = sc.nextLine();
                        System.out.print("Nacionalidad: ");
                        String nacionalidad = sc.nextLine();
                        System.out.print("Fecha de nacimiento: ");
                        String nacimientotxt = sc.nextLine();
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        Date nacimiento = sdf.parse(nacimientotxt);
                        System.out.print("Sexo: ");
                        sc.nextLine();
                        boolean sexo = sc.nextLine().equals("Masculino");
                        Cliente c = new Cliente(nombre, dni, nacionalidad, nacimiento, sexo);
                        personas.add(c);

                    }
                    grupo.put(clave, personas);

                    break;
                }
                case 2: {
                    stop = true;
                    break;
                }

            }
        }

        Iterator it = grupo.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

}
