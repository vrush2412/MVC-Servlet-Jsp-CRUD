package Reg.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import Reg.Dao.RegisterImpl;
import Reg.Dao.RegisterInterface;
import Reg.model.Register;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete_Controller")
public class Delete_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   int regno=Integer.parseInt(request.getParameter("regno"));
		   
		    RegisterInterface ri=new RegisterImpl();
		    int i=ri.delete(regno);
		    PrintWriter pw=response.getWriter();

			if(i>0)
			{
			    pw.println("Record Deleted!!!!!...");
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
