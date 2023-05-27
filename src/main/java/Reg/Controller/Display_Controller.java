package Reg.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class Display_Controller
 */
@WebServlet("/Display_Controller")
public class Display_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Display_Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		RegisterInterface ri=new RegisterImpl();
		List<Register> lstreg= ri.displayall();
	//	PrintWriter pw= response.getWriter();


		//             reg=lstreg.get(0);
		/* TYPE 2::::
		HttpSession session = request.getSession();
		session.setAttribute("data", lstreg);
		response.sendRedirect("Display.jsp");*/

		//TYPE 3:::  
		// REQUEST SCOPE;;;; 
		request.setAttribute("empList", lstreg);   //BLUE ONE IS KEY
		RequestDispatcher view=request.getRequestDispatcher("Display.jsp");
		view.forward(request, response);
	}// forward only next page..

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
