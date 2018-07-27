import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/display-discount")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount_percent"));
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Product Discount Calculator</h2><br<");
        writer.println("<label></label>Product Description:</label>");
        writer.println("<span>" + description + "</span><br>");
        writer.println("<label>List Price:</label>");
        writer.println("<span>$" + price + "</span><br>");
        writer.println("<label>Discount Percent:</label>");
        writer.println("<span>" + discount_percent + "%</span><br>");

        double discountAmount = price * discount_percent * 0.01;
        double discountPrice = price - discountAmount;
        
        writer.println("<label>Discount Amount:</label>");
        writer.println("<span>$" + discountAmount + "</span><br>");
        writer.println("<label>Discount Price:</label>");
        writer.println("<span>$" + discountPrice + "</span>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
