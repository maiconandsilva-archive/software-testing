package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author fabricio, Maicon
 */
@WebServlet({"/raizNesima.action"})
public class RaizNesimaController extends HttpServlet {

   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res){
       Calculadora calculadora = new Calculadora();
       ServletContext sc = req.getServletContext();

       double indice = Double.parseDouble(req.getParameter("indice"));
       double radicando = Double.parseDouble(req.getParameter("radicando"));
       double raiz = calculadora.raizNesima(radicando, indice);

       try {
            req.setCharacterEncoding("UTF-8");
            res.setContentType("text/html");
            res.setCharacterEncoding("UTF-8");
            req.setAttribute("indice", String.valueOf(indice));
            req.setAttribute("radicando", String.valueOf(radicando));
            req.setAttribute("raizNesima", String.valueOf(raiz));
            sc.getRequestDispatcher("/jsp/resultado.jsp").forward(req, res);
       } catch (Exception e) {}
   }
}
