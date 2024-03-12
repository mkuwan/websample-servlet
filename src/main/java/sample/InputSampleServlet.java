package sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InputSampleServlet")
public class InputSampleServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String contact = request.getParameter("contact");

        System.out.println("name:=" + name + ", age:=" + age + ", contact:=" + contact);

        String errorMessage = "";

        if(age < 0 || age > 50){
            errorMessage += "年齢がおかしいよ";
        }

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.write("あなたは" + name + "さん" + age + "歳の方で、連絡先は" + contact + "ですね");

        if(errorMessage.length() > 0)
            out.println("\n" + errorMessage);
        else
            out.println("\n" + "問題ありません！");
    }
}
