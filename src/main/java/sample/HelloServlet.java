package sample;

import java.io.IOException;
import java.io.PrintWriter;

// import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// javaxを使用した場合はTomcatは9にする必要があります
// jakartaはTomcat10で使用します

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    /**
     * コンストラクタ
     */
    public HelloServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.getWriter().append("Hello, HttpServletRequest").append(request.getContextPath());
    
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello Servlet!</h1>");
        out.println("<a href='/websample/next'>next page</a>");
        out.println("</body>");
        out.println("</html>");

        // String path = "/WEB-INF/jsp/next.jsp";
        // RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        // dispatcher.forward(request, response);

    }
    
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
