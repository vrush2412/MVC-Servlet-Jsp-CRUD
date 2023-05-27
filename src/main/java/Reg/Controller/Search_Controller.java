package Reg.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Reg.Dao.RegisterImpl;
import Reg.Dao.RegisterInterface;
import Reg.model.Register;

/**
 * Servlet implementation class Search_Controller
 */
@WebServlet("/Search_Controller")
public class Search_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		   int regno=Integer.parseInt(request.getParameter("regno"));
		   
		   RegisterInterface ri=new RegisterImpl();
		   List<Register> lstreg= ri.retrive(regno);
		   Register reg=lstreg.get(0);
		   PrintWriter pw=response.getWriter();
		 
//		   pw.println(reg.getRegno()+"\t"+reg.getName()+"\t"+reg.getEmail()+"\t"+reg.getUname()+"\t"+reg.getPass()+"\t"+reg.getAccbal());
		 HttpSession session=request.getSession();
		 session.setAttribute("data", reg);
		 response.sendRedirect("Search.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
