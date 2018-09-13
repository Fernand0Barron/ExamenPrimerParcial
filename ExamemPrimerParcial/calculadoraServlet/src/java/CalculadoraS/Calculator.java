package CalculadoraS;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   Calculator  extends   HttpServlet
{
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double   num1,   result;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    num1   =   Double.parseDouble(req.getParameter("num1"));
    operacion = Integer.parseInt(req.getParameter("operacion"));

    result   =   calcularRes(num1,operacion);

    out.println("<html>");
    out.println("<head><title>Calculadora de Moneda</title></head>");
    out.println("<body>");
    out.println("<h1><center>El resultado es</center></h1>");
    out.println("<h2>   <b><center>"+  result   +"</center></b></h2>");
    out.println("</body>");
    out.println("</html>");
    }

    public   double   calcularRes(double   num1,   int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
            return   num1;
            
        case   2:
            return   num1    / 20;
            
        case   3:
            return   num1   *  20;
        }

    return   result;
    }
}
 