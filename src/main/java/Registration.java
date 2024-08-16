
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Registration() {
        super();
        System.out.println("Servlet obj is created internally by container");
        
    }

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("fullname");
		String email=request.getParameter("email");
		
		PrintWriter writer=response.getWriter();
		
		response.sendRedirect("/FourthWebApp/success.jsp");
//		
//		writer.println("<html><head><title> Second App</title></head></html>");
//		writer.println("<body bgcolor='cyan'> <h1><marquee> Welcome to our dynamic app</marquee></h1>"); 
//		writer.println("<table>");
//		writer.println("<tr> <th>NAME</th>  <th>EMAIL</th></tr>");
//		writer.println("<tr> <td>"+name+"</td> <td>"+email+"</td></tr>");
//		writer.println("</table></body>");
//		writer.println("</html>");
		
		
		writer.close();
	}
		

}
