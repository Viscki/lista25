package br.edu.unoesc.lista_25;

public class ConversorNumerico {
	static boolean ehNumerico(String strNumero) {
		if (strNumero == null) return false;
		
		String numero = strNumero.replaceAll(",", ".");
		
		try {
			Double.parseDouble(numero);
			return true;
		} catch (NumberFormatException e) {
			return false;
	
		}
		
	}
	
	static Double converteParaDouble(String strNumero) {
		if(strNumero == null) return 0D;
		
		String numero = strNumero.replaceAll(",", ".");
		if(ehNumerico(numero)) return Double.parseDouble(numero);
		
		return 0D;
	}
}

