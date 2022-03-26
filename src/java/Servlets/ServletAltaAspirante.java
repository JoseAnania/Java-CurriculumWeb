
package Servlets;

import Controlador.Conexion;
import Modelo.Aspirante;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAltaAspirante extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Conexion C=new Conexion();
            ArrayList lista=C.comboP();
            request.setAttribute("lista", lista);
            ArrayList lista2=C.comboN();
            request.setAttribute("lista2", lista2);
            
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/altaAspirante.jsp");
            rd.forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreA=request.getParameter("nombreA");
        String idP=request.getParameter("cboPuesto");
        String antiguedad=request.getParameter("antiguedad");
        String salario=request.getParameter("salario");
        String idN=request.getParameter("cboNacionalidad");
        
        Aspirante A=new Aspirante();
        
        A.setNombreA(nombreA);
        A.setIdP(Integer.parseInt(idP));
        A.setAntiguedad(Integer.parseInt(antiguedad));
        A.setSalario(Float.parseFloat(salario));
        A.setIdN(Integer.parseInt(idN));
        
        Conexion C=new Conexion();
        
        C.agregarAspirante(A);
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Curriculum Vitae</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<li><a href=\"index.html\">Volver</a></li>");
            out.println("<h1>Se cargo el Aspirante exitosamente</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
