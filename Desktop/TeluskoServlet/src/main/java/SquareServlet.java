import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "square", value = "/square")

public class SquareServlet extends HttpServlet {
     public  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         HttpSession session = request.getSession();
         int k = (Integer) session.getAttribute("k");
        int z = (k * k);
         PrintWriter out = response.getWriter();
         out.println(z);
         System.out.println("seen");
     }
}
