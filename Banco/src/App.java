import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorrecto = "tony";
        String contrasenaCorrecta = "1234";

        Consultar consultar = new Consultar();
        Depositar depositar = new Depositar();
        Ingresar ingresar = new Ingresar();

        // Inicializar saldo en todas las clases
        consultar.setSaldo(0);
        depositar.setSaldo(0);
        ingresar.setSaldo(0);

        System.out.println("Bienvenido al Banco");
        System.out.print("Ingrese usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contrasena = sc.nextLine();

        if (!usuario.equals(usuarioCorrecto) || !contrasena.equals(contrasenaCorrecta)) {
            System.out.println("Usuario o contraseña incorrectos");
            return;
        }

        int opcion;
        do {
            System.out.println("\nMenu Banco");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    consultar.consultarSaldo();
                    break;
                case 2:
                    depositar.depositarDinero(sc);
                    int nuevoSaldo2 = depositar.getSaldo();
                    consultar.setSaldo(nuevoSaldo2);
                    ingresar.setSaldo(nuevoSaldo2);
                    break;
                case 3:
                    ingresar.ingresarDinero(sc);
                    int nuevoSaldo3 = ingresar.getSaldo();
                    consultar.setSaldo(nuevoSaldo3);
                    depositar.setSaldo(nuevoSaldo3);
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}

//De tony
