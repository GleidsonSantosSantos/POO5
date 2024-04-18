package controller;



public class OperacaoController {

	 public int operacaoValor(int numero) {
	        if (numero < 0) {
	            throw new ArithmeticException(" Não pode ser negativo");
	        }

	        if (numero % 2 == 0) {
	         
	            return numero * numero;
	        } else {
	         
	            return numero * numero * numero;
	        }
	    }

	public int operacaoValor11(int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int operacaoValor1(int numero) {
		// TODO Auto-generated method stub
		return 0;
	}
	}