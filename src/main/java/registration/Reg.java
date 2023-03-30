package registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Reg
 */
@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String FisrtName=request.getParameter("fname");
		String LastName=request.getParameter("lname");
		String Address=request.getParameter("address");
		String Pincode=request.getParameter("pincode");
		String City=request.getParameter("city");
		String State=request.getParameter("state");
		String Education=request.getParameter("education");
		String Gender=request.getParameter("gender");
		String PassingYear=request.getParameter("passing");
		String Percentage=request.getParameter("percentage");
		String nationality=request.getParameter("nationality");
		String Age=request.getParameter("age");
		String MobileNumber=request.getParameter("number");
		String Email=request.getParameter("email");
		String UserName=request.getParameter("username");
		String Password=request.getParameter("password");
		
		PrintWriter obj=response.getWriter();
		obj.println(FisrtName);
		obj.println(LastName);
		obj.println(Address);
		obj.println(Pincode);
		obj.println(City);
		obj.println(State);
		obj.println(Education);
		obj.println(Gender);
		obj.println(PassingYear);
		obj.println(Percentage);
		obj.println(nationality);
		obj.println(Age);
		obj.println(MobileNumber);
		obj.println(Email);
		obj.println(UserName);
		obj.println(Password);
		try
		{
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		obj.println("Driver is loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/server","root", "root");
		obj.println("Connection sucess");
		PreparedStatement pt=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		pt.setString(1,FisrtName);
		pt.setString(2,LastName);
		pt.setString(3,Address);
		pt.setString(4,Pincode);
		pt.setString(5,City);
		pt.setString(6,State);
		pt.setString(7,Education);
		pt.setString(8,Gender);
		pt.setString(9,PassingYear);
		pt.setString(10,Percentage);
		pt.setString(11,nationality);
		pt.setString(12,Age);
		pt.setString(13,MobileNumber);
		pt.setString(14,Email);
		pt.setString(15,UserName);
		pt.setString(16,Password);
		pt.executeUpdate();
		pt.close();
		con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
