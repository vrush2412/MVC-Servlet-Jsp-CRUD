package Reg.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Reg.Dao.RegisterImpl;
import Reg.Dao.RegisterInterface;

/**
 * Servlet implementation class Update_Controller
 */
@WebServlet("/Update_Controller")
public class Update_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String uname=request.getParameter("uname"); 
		  String pass=request.getParameter("pass");
		  String accbal=request.getParameter("AccBal");
		  int regno=Integer.parseInt(request.getParameter("regno"));
		  
		    RegisterInterface ri=new RegisterImpl();
		    int i=ri.Update(regno, uname, pass, accbal);
		    PrintWriter pw=response.getWriter();

			if(i>0)
			{
			    pw.println("<h1 >Record Updated!!!!!...</h1>");
			}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
