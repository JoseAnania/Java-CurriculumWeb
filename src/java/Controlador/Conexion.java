
package Controlador;

import Dto.AspiranteDto;
import Dto.NacionalidadDto;
import Modelo.Aspirante;
import Modelo.Nacionalidad;
import Modelo.Puesto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {
 
    private Connection C;
    private PreparedStatement PS;
    private Statement S;
    private ResultSet RS;
    
    public void abrirConexion()
    {
        try {
            String url="jdbc:sqlserver://DESKTOP-E8FRIUV\\SQLEXPRESS:1433;databaseName=Curriculum";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            C=DriverManager.getConnection(url, "sa", "giandjoe");
            System.out.println("Conectado a la BD");
        } catch (Exception e) {
            System.out.println("No se pudo conectar a la BD");
        }
    }
    public void cerrarConexion()
    {
        try {
            C.close();
            System.out.println("Desconectado de la BD");
        } catch (Exception e) {
            System.out.println("No se pudo desconectar de la BD");
        }
    }
    public void agregarAspirante(Aspirante nuevoAspirante)
    {
        try {
            abrirConexion();
            PS=C.prepareStatement("INSERT INTO Aspirante (nombreA, idP, antiguedad, salario, idN) VALUES (?,?,?,?,?)");
            
            PS.setString(1, nuevoAspirante.getNombreA());
            PS.setInt(2, nuevoAspirante.getIdP());
            PS.setInt(3, nuevoAspirante.getAntiguedad());
            PS.setFloat(4, nuevoAspirante.getSalario());
            PS.setInt(5, nuevoAspirante.getIdN());
            
            PS.execute();
            PS.close();
            cerrarConexion();
        } catch (Exception e) {
        }
    }
    public ArrayList<Puesto>comboP()
    {
        ArrayList<Puesto>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT * FROM Puesto");
            
            while(RS.next())
            {
                Puesto P=new Puesto();
                
                P.setIdP(RS.getInt(1));
                P.setNombreP(RS.getString(2));
                P.setExperiencia(RS.getString(3));
                
                lista.add(P);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    public ArrayList<Nacionalidad>comboN()
    {
        ArrayList<Nacionalidad>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT * FROM Nacionalidad");
            
            while(RS.next())
            {
                Nacionalidad N=new Nacionalidad();
                
                N.setIdN(RS.getInt(1));
                N.setPais(RS.getString(2));
                
                lista.add(N);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    public ArrayList<AspiranteDto>listado()
    {
        ArrayList<AspiranteDto>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT p.nombreP, p.experiencia, a.nombreA, a.salario, a.antiguedad FROM Puesto p INNER JOIN Aspirante a ON p.idP=a.idP ");
            
            while(RS.next())
            {
                AspiranteDto A=new AspiranteDto();
                
                A.setNombreP(RS.getString(1));
                A.setExperiencia(RS.getString(2));
                A.setNombreA(RS.getString(3));
                A.setSalario(RS.getFloat(4));
                A.setAntiguedad(RS.getInt(5));
                
                lista.add(A);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    public ArrayList<NacionalidadDto>Reporte1()
    {
        ArrayList<NacionalidadDto>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT pais n, COUNT (*) FROM Aspirante a, Nacionalidad n WHERE a.idN=n.idN GROUP BY n.pais");
            
            while(RS.next())
            {
                NacionalidadDto N=new NacionalidadDto();
                
                N.setPais(RS.getString(1));
                N.setCantidad(RS.getInt(2));
                
                lista.add(N);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    public String menorSueldo()
    {
        String menor="";
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT TOP 1 nombreA, MIN(salario) FROM Aspirante GROUP BY nombreA ORDER BY MIN(salario) ASC");
            
            RS.next();
            
            menor=RS.getString(1);
            
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return menor;
    }
    public float Promedio()
    {
        float promedio=0;
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT AVG(a.salario) FROM Aspirante a INNER JOIN Puesto p ON a.idP=p.idP WHERE p.experiencia like 'Senior'");
            
            RS.next();
            
            promedio=RS.getFloat(1);
            
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return promedio;
    }
}
