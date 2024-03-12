package sample;

// import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

import java.text.*;
import java.util.*;

@WebServlet("/next")
public class Nextpage extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.getWriter().append("Hello, HttpServletRequest").append(request.getContextPath());
    
        response.setContentType("text/html; charset=UTF-8");

        Date date = new Date();
        SimpleDateFormat simpleDateFormt = new SimpleDateFormat("yyyy年M月d日(E)");
        String today = simpleDateFormt.format(date);

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Next Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Next Page</h1>");
        out.println("<p>本日は" + today + "です</p>");
        out.println("<a href='/websample/example/test.jsp'>jsp test page</a>");
        out.println("</body>");
        out.println("</html>");

        System.out.println(out.toString());
    
    }
}
