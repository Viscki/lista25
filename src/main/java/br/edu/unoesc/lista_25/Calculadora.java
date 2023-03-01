package br.edu.unoesc.lista_25;

public class Calculadora {
	static double Somar(String n1, String n2) {
		if(!ConversorNumerico.ehNumerico(n1) || !ConversorNumerico.ehNumerico(n2)) {
			return 0D;
		}
		
		return ConversorNumerico.converteParaDouble(n1) + ConversorNumerico.converteParaDouble(n2);
	}

	static double Subtrair(String n1, String n2) {
		if(!ConversorNumerico.ehNumerico(n1) || !ConversorNumerico.ehNumerico(n2)) {
			return 0D;
		}
		
		return ConversorNumerico.converteParaDouble(n1) - ConversorNumerico.converteParaDouble(n2);
	}
	
	static double Multiplicar(String n1, String n2) {
		if(!ConversorNumerico.ehNumerico(n1) || !ConversorNumerico.ehNumerico(n2)) {
			return 0D;
		}
		
		return ConversorNumerico.converteParaDouble(n1) * ConversorNumerico.converteParaDouble(n2);
	}
	
	static double Dividir(String n1, String n2) {
		if(!ConversorNumerico.ehNumerico(n1) || !ConversorNumerico.ehNumerico(n2)) {
			return 0D;
		}
		
		if(ConversorNumerico.converteParaDouble(n2) == 0) {
			return 0D;
		}
		
		return ConversorNumerico.converteParaDouble(n1) / ConversorNumerico.converteParaDouble(n2);
		
	}
	
	static double Media(String n1, String n2) {
		if(!ConversorNumerico.ehNumerico(n1) || !ConversorNumerico.ehNumerico(n2)) {
			return 0D;
		}
		
		return (ConversorNumerico.converteParaDouble(n1) + ConversorNumerico.converteParaDouble(n2))/2;
	}
	
	static double Potencia(String n1, String n2) {
		if(!ConversorNumerico.ehNumerico(n1) || !ConversorNumerico.ehNumerico(n2)) {
			return 0D;
		}
		
		return Math.pow(ConversorNumerico.converteParaDouble(n1), ConversorNumerico.converteParaDouble(n2));
	}
	
	static double Raiz(String n1) {
		if(!ConversorNumerico.ehNumerico(n1)) {
			return 0D;
		}
		return Math.sqrt(ConversorNumerico.converteParaDouble(n1));
	}
	
}
