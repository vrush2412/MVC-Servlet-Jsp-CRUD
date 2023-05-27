package Reg.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Reg.Dao.RegisterImpl;
import Reg.Dao.RegisterInterface;
import Reg.model.Login;
import Reg.model.Register;

/**
 * Servlet implementation class Login_Controller
 */
@WebServlet("/Login_Controller")
public class Login_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String uname=request.getParameter("uname");
		  String pass=request.getParameter("pass");
		 
		  Login l=new Login(uname, pass);
		  l.setUname(uname);
		  l.setPass(pass);
		  
		  RegisterInterface ri=new RegisterImpl();
		  String str;
		  str=ri.validate(l);
		  
//		  boolean b=ri.validate(l);
		  HttpSession sesssion=request.getSession();
		  
//		  if(b)
		  if(str.equals("valid"))
		  {
			  sesssion.setAttribute("msg",l);
			  response.sendRedirect("DashBoard.jsp");
		  }
		  else
		  {    
			  sesssion.setAttribute("msg", str);
			  response.sendRedirect("Login.jsp");
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
