/**
 * 
 */
package br.ufrn.imd.web2.calculator.bean;

/**
 * @author kaduardo
 *
 */
public interface Calculator {
	public int add(int... arguments);
        public int sub(int... arguments);
        public int div(int... arguments);
        public int mult(int... arguments);
}
