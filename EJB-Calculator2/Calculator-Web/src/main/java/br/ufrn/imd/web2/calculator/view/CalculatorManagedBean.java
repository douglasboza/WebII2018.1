package br.ufrn.imd.web2.calculator.view;

import javax.ejb.EJB;
import javax.inject.Named;

import br.ufrn.imd.web2.calculator.bean.NoInterfaceViewCalculatorBean;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

@Named(value = "calculatorManagedBean")
@RequestScoped

public class CalculatorManagedBean implements Serializable{
	private int numero1, numero2, resultado;
	
	@EJB
	NoInterfaceViewCalculatorBean calc;

	public CalculatorManagedBean() {
	}
	
	public String calcula() {
		setResultado(calc.add(numero1, numero2));
		System.out.println("Resultado: " + resultado);
		return "Soma";
	}
        public String subtracao() {
		setResultado(calc.sub(numero1, numero2));
		System.out.println("Resultado: " + resultado);
                return "Subtracao";
	}
        public String divisao() {
		setResultado(calc.div(numero1, numero2));
		System.out.println("Resultado2: " + resultado);
		return "Divisao";
	}
        public String multiplicacao() {
		setResultado(calc.mult(numero1, numero2));
		System.out.println("Resultado3: " + resultado);
		return "Multiplicacao";
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

}
