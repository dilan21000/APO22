import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		
		String[] nombre = new String[10];
		String[] apellido = new String[10];
		double[] nota = new double[10];
		double notaMax = 0;
		int c=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<=9; i++) 
		{
			c=i+1;
			System.out.println("Ingrese el nombre del estudiante #"+c+": ");
			nombre[i]=sc.next();
			
			System.out.println("Ingrese el apellido del estudiante #"+c+": ");
			apellido[i]=sc.next();
			
			System.out.println("Digite la nota del estudiante #"+c+": ");
			nota[i]=sc.nextDouble();
			
		}
		
		for (int i = 1; i<=9; i++) {
			if (notaMax < nota[i] || notaMax < nota[i-1]) {
			notaMax = (nota[i]<nota[i-1]?nota[i-1]:nota[i]);
			c=(nota[i]<nota[i-1]?i-1:i);
			}
			}
		System.out.println("\n");	
		for (int i = 0; i<=9; i++) 
		{
			System.out.println("Estudiante #"+(i+1)+": "+nombre[i]+" "+apellido[i]+"   Nota: "+nota[i]);
			System.out.println("----------------------------------------------------");
		}
		
		System.out.println("El alumno con la nota más alta es: "+nombre[c]+" "+apellido[c]);
		System.out.println("Con una nota de: "+notaMax);
	}

}