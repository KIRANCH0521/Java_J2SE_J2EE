package basic;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class hello extends HttpServlet
{
@Override
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
try(PrintWriter pw=res.getWriter())
{
    res.setContentType("text/html");
	pw.println("<html><body>welcome..........</body></html>");
	
}catch(Exception e)
{
e.printStackTrace();
}
}
}
