/**
 * 
 */
package br.ufrn.imd.web2.calculator.bean;

/**
 * @author kaduardo
 *
 */
public class CalculatorBeanBase implements Calculator {

	/**
	 * 
	 */
	public CalculatorBeanBase() {
	}

	/* (non-Javadoc)
	 * @see br.ufrn.imd.imd0409.calculator.bean.CalculatorCommonBusiness#add(int[])
	 */
	@Override
	public int add(int... arguments) {
		int result = 0;
		
		for (int arg : arguments) {
			result += arg;
		}
		return result;
	}
        public int sub(int... arguments) {
		int result = 0;
		
		for (int arg : arguments) {
			result -= arg;
		}
		return result;
	}
        public int div(int... arguments) {
		int result = 1;
		
		for (int arg : arguments) {
			result = arg/result;
		}
		return result;
	}
        public int mult(int... arguments) {
		int result = 1;
		
		for (int arg : arguments) {
			result = arg*result;
		}
		return result;
	}

}
