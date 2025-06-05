package servlets;

import dto.ProductDto;
import service.ProductService;
import service.ProductServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns ="/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productid=req.getParameter("productid");
        String productname=req.getParameter("productname");
        String productprice=req.getParameter("productprice");
        String quantity=req.getParameter("quantity");
        String category=req.getParameter("category");
        ProductDto productDto=new ProductDto();
        productDto.setProductid(productid);
        productDto.setProductname(productname);
        productDto.setProductprice(productprice);
        productDto.setQuantity(quantity);
        productDto.setCategory(category);

        System.out.println("Data is pushed to DTO"+productDto);
        ProductService productService=new ProductServiceImplementation();
        boolean save=productService.save(productDto);

        if(save){
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("productsuccess.jsp");
            req.setAttribute("message","Product data is valid and Saved Successfully");
            req.setAttribute("productdto",productDto);
            requestDispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("productfail.jsp");
            req.setAttribute("message","Product is invalid Please check console for More Details");
            requestDispatcher.forward(req,resp);
        }

    }
}
