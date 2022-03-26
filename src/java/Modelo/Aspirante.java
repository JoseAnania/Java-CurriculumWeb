
package Modelo;

public class Aspirante {
    
    private int idA;
    private String nombreA;
    private int idP;
    private int antiguedad;
    private float salario;
    private int idN;

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getIdN() {
        return idN;
    }

    public void setIdN(int idN) {
        this.idN = idN;
    }

    public Aspirante() {
    }

    public Aspirante(int idA, String nombreA, int idP, int antiguedad, float salario, int idN) {
        this.idA = idA;
        this.nombreA = nombreA;
        this.idP = idP;
        this.antiguedad = antiguedad;
        this.salario = salario;
        this.idN = idN;
    }
    
}
