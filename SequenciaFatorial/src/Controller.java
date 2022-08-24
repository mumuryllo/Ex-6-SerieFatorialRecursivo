
public class Controller {
	
	public static double fatorial (double numero) {
		if (numero <= 1) {
			return 1;
		}
		return numero * fatorial(numero -1);
	}
	
	public  double sequencia(double numero) {
		if (numero == 1) {
			return 1;
		}
		return 1 /fatorial(numero) + sequencia(numero - 1);
	} 

}
