package br.ufrn.imd.web2.calculator.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.web2.calculator.bean.NoInterfaceViewCalculatorBean;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private NoInterfaceViewCalculatorBean calc;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
                out.println("<head>");
                out.println("<title>Resulado com Servlet</title>");
                out.println("</head>");
                out.println("<body>");
		
		try {
			int numero1 = Integer.parseInt(request.getParameter("numero1"));
			int numero2 = Integer.parseInt(request.getParameter("numero2"));
			int teste = Integer.parseInt(request.getParameter("teste"));
                          
			out.println("Numero 1: " + teste + "<br>");
			out.println("Numero 2: " + numero2 + "<br>");
			out.println("Resultado: " + calc.add(numero1, numero2) + "<br>");
		} catch (Exception e) {
			out.println("ERROR: " + e.getLocalizedMessage() + "<br>");
			e.printStackTrace(out);
		} finally {
			out.println("</body></html>");
			out.close();
		}
	}



}
