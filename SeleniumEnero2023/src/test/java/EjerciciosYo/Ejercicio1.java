package EjerciciosYo;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 25;
		int var3 = 10;
		
		int suma = var1+var2+var3;
		int resta = var1-var2-var3;
		int multiplicacion = var1*var2*var3;
		int division = var1/var2/var3;
		
		String ResultadoSuma = ("El valor de la suma es:" + suma);
		String ResultadoResta = ("El valor de la resta es:" + resta);
		String ResultadoMultip = ("El valor de la multiplicacion es:" + multiplicacion);
		String ResultadoDiv = ("El resultado de la division es:" + division);
		
		System.out.println(ResultadoSuma);
		System.out.println(ResultadoResta);
		System.out.println(ResultadoMultip);
		System.out.println(ResultadoDiv);
		
	}

}
