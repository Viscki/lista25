package br.edu.unoesc.lista_25;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lista25Controller {

	private Logger logger = Logger.getLogger(Lista25Controller.class.getName());
	
	@GetMapping("/somar-query")
	public Double somarQuery(@RequestParam(value= "numero1", defaultValue = "0") String numero1,
			                 @RequestParam(value= "numero2", defaultValue = "0") String numero2) {
		logger.info("Calculando somar-query: " + numero1 + " + " + numero2);
		Double resultado = Calculadora.Somar(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}

	@RequestMapping(value = "/somar-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double somarPath(@PathVariable(value = "numero1") String numero1,
			                @PathVariable(value = "numero2") String numero2) throws Exception{
		logger.info("Calculando somar-path: " + numero1 + " + " + numero2);
		Double resultado = Calculadora.Somar(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}
	
	@GetMapping("/subtrair-query")
	public Double subtrairQuery(@RequestParam(value= "numero1", defaultValue = "0") String numero1,
			                 @RequestParam(value= "numero2", defaultValue = "0") String numero2) {
		logger.info("Calculando subtrair-query: " + numero1 + " - " + numero2);
		Double resultado = Calculadora.Subtrair(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}

	@RequestMapping(value = "/subtrair-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double subtrairPath(@PathVariable(value = "numero1") String numero1,
			                @PathVariable(value = "numero2") String numero2) throws Exception{
		logger.info("Calculando subtrair-path: " + numero1 + " - " + numero2);
		Double resultado = Calculadora.Subtrair(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}
	
	@GetMapping("/multiplicar-query")
	public Double multiplicarQuery(@RequestParam(value= "numero1", defaultValue = "0") String numero1,
			                 @RequestParam(value= "numero2", defaultValue = "0") String numero2) {
		logger.info("Calculando multiplicar-query: " + numero1 + " * " + numero2);
		Double resultado = Calculadora.Multiplicar(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}

	@RequestMapping(value = "/multiplicar-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double multiplicarPath(@PathVariable(value = "numero1") String numero1,
			                @PathVariable(value = "numero2") String numero2) throws Exception{
		logger.info("Calculando multiplicar-path: " + numero1 + " * " + numero2);
		Double resultado = Calculadora.Multiplicar(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}
	
	@GetMapping("/dividir-query")
	public Double dividirQuery(@RequestParam(value= "numero1", defaultValue = "0") String numero1,
			                 @RequestParam(value= "numero2", defaultValue = "0") String numero2) {
		logger.info("Calculando dividir-query: " + numero1 + " / " + numero2);
		Double resultado = Calculadora.Dividir(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}

	@RequestMapping(value = "/dividir-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double dividirPath(@PathVariable(value = "numero1") String numero1,
			                @PathVariable(value = "numero2") String numero2) throws Exception{
		logger.info("Calculando dividir-path: " + numero1 + " / " + numero2);
		Double resultado = Calculadora.Dividir(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}
	
	@GetMapping("/media-query")
	public Double mediaQuery(@RequestParam(value= "numero1", defaultValue = "0") String numero1,
			                 @RequestParam(value= "numero2", defaultValue = "0") String numero2) {
		logger.info("Calculando media-query: " + numero1 + " e " + numero2);
		Double resultado = Calculadora.Media(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}

	@RequestMapping(value = "/media-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double mediaPath(@PathVariable(value = "numero1") String numero1,
			                @PathVariable(value = "numero2") String numero2) throws Exception{
		logger.info("Calculando media-path: " + numero1 + " e " + numero2);
		Double resultado = Calculadora.Media(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}
	
	@GetMapping("/potencia-query")
	public Double potenciaQuery(@RequestParam(value= "numero1", defaultValue = "0") String numero1,
			                 @RequestParam(value= "numero2", defaultValue = "0") String numero2) {
		logger.info("Calculando potencia-query: " + numero1 + " ^ " + numero2);
		Double resultado = Calculadora.Potencia(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}

	@RequestMapping(value = "/potencia-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double potenciaPath(@PathVariable(value = "numero1") String numero1,
			                @PathVariable(value = "numero2") String numero2) throws Exception{
		logger.info("Calculando potencia-path: " + numero1 + " ^ " + numero2);
		Double resultado = Calculadora.Potencia(numero1, numero2);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}
	
	@GetMapping("/raiz-query")
	public Double raizQuery(@RequestParam(value= "numero1", defaultValue = "0") String numero1) {
		logger.info("Calculando raiz-query: " + numero1);
		Double resultado = Calculadora.Raiz(numero1);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}

	@RequestMapping(value = "/raiz-path/{numero1}", method = RequestMethod.GET)
	public Double raizPath(@PathVariable(value = "numero1") String numero1) throws Exception{
		logger.info("Calculando raiz-path: " + numero1);
		Double resultado = Calculadora.Raiz(numero1);
		logger.info("Resultado: " + resultado); 
		return resultado;
	}
}
