import java.util.Scanner;

public class CalculadoraNotas {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		ActividadNotas();
	}
	
	public static void pedirNotas() {
		System.out.println("Introduce tu nombre");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		
		System.out.println("Introduce una nota entre 0 y 10");
		int numero1 =teclado.nextInt();
		while (numero1 < 0 || numero1 > 10) {
			System.out.println("El numero no es correcto tiene que ser un valor entre 0 y 10");
			numero1 = teclado.nextInt();
		}
	
	}
		
	public static void ActividadNotas() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, n3, media1;
		
		System.out.println("Introduce la nota 1 del 1 al 10");
		n1 = teclado.nextInt();
		
		while (n1 < 0 || n1 > 10) {
		    System.out.println("Error: el número debe estar entre 0 y 10.");
		    System.out.print("Introduce otro número: ");
		    n1 = teclado.nextInt();
		}
		
		System.out.println("Introduce la nota 2 del 1 al 10");
		n2 = teclado.nextInt();
		
		while (n2 < 0 || n2 > 10) {
		    System.out.println("Error: el número debe estar entre 0 y 10.");
		    System.out.print("Introduce otro número: ");
		    n2 = teclado.nextInt();
		}
		
		System.out.println("Introduce la nota 3 del 1 al 10");
		n3 = teclado.nextInt();
		
		while (n3 < 0 || n3 > 10) {
		    System.out.println("Error: el número debe estar entre 0 y 10.");
		    System.out.print("Introduce otro número: ");
		    n3 = teclado.nextInt();
		}
		
		media1 = (n1+n2+n3)/3;
		System.out.println("calcularemos tu media");
		System.out.println("tu nota media es: "+media1);
		
		System.out.println("ahora veremos si suspendes o no");
				
		if (media1 < 5) {
		System.out.println("tu nota es menor que 5, suspendes");
		}
		
		else if (media1 >= 5) {
		System.out.println("tu nota es mayor que 5, superaste");
		}
			
	}
	

}
