import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/aa")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ProductDescription = request.getParameter("ProductDescription");
        double ListPrice = Double.parseDouble(request.getParameter("ListPrice"));
        double DiscountPercent = Double.parseDouble(request.getParameter("DiscountPercent"));

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Product Description: " + ProductDescription + "<br>");
        writer.println("Price" + ListPrice + "<br>");
        writer.println("Discount Percent: " + DiscountPercent + "%" + "<br>");
        if (ListPrice > 0) {
            double DiscountAmount = (ListPrice * DiscountPercent * 0.1);
            double DiscountPrice = (ListPrice - DiscountAmount);
            writer.println(" Discount Amount: " + DiscountAmount + "<br>");
            writer.println("Discount Price: " + DiscountPrice + "<br>");
        } else {
            writer.println("List Price bigger zero");
        }
        writer.println("<html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
