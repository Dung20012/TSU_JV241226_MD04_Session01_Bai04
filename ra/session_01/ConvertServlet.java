package ra.session_01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ConvertServlet", value = "/convert")
public class ConvertServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            double rate = Double.parseDouble(request.getParameter("rate"));
            double usd = Double.parseDouble(request.getParameter("usd"));
            double vnd = rate * usd;

            request.setAttribute("rate", rate);
            request.setAttribute("usd", usd);
            request.setAttribute("vnd", vnd);
        }catch (Exception e){
            request.setAttribute("rate", 0);
            request.setAttribute("usd", 0);
            request.setAttribute("vnd", 0);
        }

        request.getRequestDispatcher("convert.jsp").forward(request, response);

    }
}
