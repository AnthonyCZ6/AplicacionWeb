import java.util.Scanner;

class Depositar {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositarDinero(Scanner sc) {
        System.out.print("Ingrese cantidad a depositar: $");
        int cantidad = sc.nextInt();
        if (cantidad <= 0) {
            System.out.println("Ingrese Cantidad valida");
        } else if (saldo <= 0) {
            System.out.println("No se puede depositar porque el saldo es 0 o menor.");
        } else {
            saldo -= cantidad;
            System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
        }
    }
}
