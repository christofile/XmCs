

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormRegist
 */
@WebServlet("/FormRegist")
public class FormRegist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormRegist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name =new String(request.getParameter("fullname"));
		String age =new String(request.getParameter("age"));
		String gender =new String(request.getParameter("gender"));
		String email =new String(request.getParameter("email"));
		String password =new String(request.getParameter("password"));
		String address =new String(request.getParameter("address"));
		if((name == null) || (name.equals("")) || (age == null) || (age.equals(""))||(gender== null) || (gender.equals("")) || (email == null) || (email.equals(""))||(password == null) || (password.equals("")) || (address == null) || (address.equals("")))
			out.println("Please fill in all the fields and try again!");
		else
			out.println("Registration form submitted Successfully.");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
