package Reg.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Reg.Dao.RegisterImpl;
import Reg.Dao.RegisterInterface;
import Reg.model.Register;

/**
 * Servlet implementation class Registretion_Form
 */
@WebServlet("/Registretion_Controller")
public class Registretion_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registretion_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int regno =Integer.parseInt(request.getParameter("regno"));
		
		String name=request.getParameter("name");
		
		String email=request.getParameter("email");
		
		String uname=request.getParameter("uname");

		String pass=request.getParameter("pass");

		String accbal=request.getParameter("AccBal");
	
		
		Register r=new Register(regno, name, email, uname, pass, accbal);
		List<Register> lstreg= new ArrayList<Register>();
		lstreg.add(r);
		
		PrintWriter pw=response.getWriter();
		RegisterInterface ri=new RegisterImpl();
		
		int i=ri.create(lstreg);
		
		if(i>0)
		{
		     response.sendRedirect("Regi.jsp");
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
