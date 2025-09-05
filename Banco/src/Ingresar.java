import java.util.Scanner;

class Ingresar {
	private int saldo;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void ingresarDinero(Scanner sc) {
		System.out.print("Ingrese cantidad a ingresar: $");
		int cantidad = sc.nextInt();
		if (cantidad > 0) {
			saldo += cantidad;
			System.out.println("Ingreso exitoso. Nuevo saldo: $" + saldo);
		} else {
			System.out.println("Cantidad inválida.");
		}
	}
}
