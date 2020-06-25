package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class C01Sessao extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out;
        resp.setContentType("text/html");
        
        out = resp.getWriter();
        HttpSession sessao = req.getSession();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Sessões</title>");
        out.println("</head>");
        out.println("<body>");

        if (sessao.isNew()){
            out.println("<p>Esta é uma nova sessão</p>");
        }
        else{
            out.println("<p>Olá, você voltou!</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}