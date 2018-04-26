package br.ufrn.imd.web2.calculator.bean;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class NoInterfaceViewCalculatorBean
 */
@Stateless
@Local
public class NoInterfaceViewCalculatorBean extends CalculatorBeanBase {
       
    /**
     * @see CalculatorBeanBase#CalculatorBeanBase()
     */
    public NoInterfaceViewCalculatorBean() {
        super();
    }

}
