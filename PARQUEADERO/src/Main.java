import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Parqueadero p = new Parqueadero ();
        int op;

        do{
            System.out.println("SISTEMA PARQUIMATIC");
            System.out.println("1. Administracion del parqueadero");
            System.out.println("2. Administracion de usuarios");
            System.out.println("3. Uso del parqueadero");
            System.out.println("4. Pagos y recargas");
            System.out.println("5. Mostrar informacion");
            System.out.println("6. Guardar informacion");
            System.out.println("7. Cargar informacion");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    menuParquedero (sc, p);
                    break;
                case 2:
                    menuUsuarios (sc, p);
                    break;
                case 3:
                    menuUsoParqueadero (sc, p);
                    break;
                case 4:
                    menuPagos (sc, p);
                    break;
                case 5:
                    menuMostrar (sc, p);
                    break;
                case 6:
                    p.guardarTodo();
                    break;
                case 7:
                    p.cargarTodo();
                    break;
                case 0:
                    p.guardarTodo();
                    System.out.println("Saliendo del Sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }while (op != 0);
        sc.close();
    }
    public static void menuParquedero (Scanner sc, Parqueadero p){
        int op;
        do{
            System.out.println("\n ADMINISTRACION PARQUEADERO");
            System.out.println("1. Crear piso");
            System.out.println("2. Modificar piso");
            System.out.println("3. Eliminar piso");
            System.out.println("4. Mostrar pisos");
            System.out.println("5. Mostrar caja");
            System.out.println("6. Agregar dinero a caja");
            System.out.println("7. Ajustar tarifas");
            System.out.println("8. Pasar tiempo");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    p.crearPiso();
                    break;
                case 2:
                    p.modificarPiso();
                    break;
                case 3:
                    p.eliminarPiso();
                    break;
                case 4:
                    p.mostrarPisos();
                    break;
                case 5:
                    p.mostrarCaja();
                    break;
                case 6:
                    p.agregarDineroCaja();
                    break;
                case 7:
                    p.ajustarTarifas();
                    break;
                case 8:
                    p.pasarTiempo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida.");

            }

        }while(op != 0)

    }
    public static void menuUsuarios(Scanner sc, Parqueadero p) {
        int op;
        do {
            System.out.println("\n ADMINISTRACION USUARIOS ");
            System.out.println("1. Crear usuario");
            System.out.println("2. Modificar usuario");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Asociar vehiculo");
            System.out.println("5. Desasociar vehiculo");
            System.out.println("6. Mostrar usuarios");
            System.out.println("7. Mostrar historial de visitas");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    p.crearUsuario();
                    break;
                case 2:
                    p.modificarUsuario();
                    break;
                case 3:
                    p.eliminarUsuario();
                    break;
                case 4:
                    p.asociarVehiculo();
                    break;
                case 5:
                    p.desasociarVehiculo();
                    break;
                case 6:
                    p.mostrarUsuarios();
                    break;
                case 7:
                    p.mostrarHistorialUsuario();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (op != 0);
    }
    public static void menuUsoParqueadero(Scanner sc, Parqueadero p) {
        int op;
        do {
            System.out.println("\n USO DEL PARQUEADERO");
            System.out.println("1. Ingresar al parqueadero");
            System.out.println("2. Salir del parqueadero");
            System.out.println("3. Mostrar ocupacion");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    parqueadero.ingresarParqueadero();
                    break;
                case 2:
                    parqueadero.salirParqueadero();
                    break;
                case 3:
                    parqueadero.mostrarOcupacion();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (op != 0);
    }
    public static void menuPagos(Scanner sc, Parqueadero p) {
        int op;
        do {
            System.out.println("\n PAGOS Y RECARGAS");
            System.out.println("1. Recargar saldo");
            System.out.println("2. Pagar parqueadero");
            System.out.println("3. Mostrar movimientos");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    p.recargarSaldo();
                    break;
                case 2:
                    p.pagarParqueadero();
                    break;
                case 3:
                    p.mostrarMovimientos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (op != 0);
    }
    public static void menuMostrar(Scanner sc, Parqueadero p) {
        int op;
        do {
            System.out.println("\n MOSTRAR INFORMACION");
            System.out.println("1. Mostrar pisos");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Mostrar ocupacion");
            System.out.println("4. Mostrar caja");
            System.out.println("5. Mostrar tarifas");
            System.out.println("6. Mostrar movimientos");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    p.mostrarPisos();
                    break;
                case 2:
                    p.mostrarUsuarios();
                    break;
                case 3:
                    p.mostrarOcupacion();
                    break;
                case 4:
                    p.mostrarCaja();
                    break;
                case 5:
                    p.mostrarTarifas();
                    break;
                case 6:
                    p.mostrarMovimientos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (op != 0);
    }
}
