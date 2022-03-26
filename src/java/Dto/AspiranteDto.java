
package Dto;

public class AspiranteDto {
    
    private String nombreP;
    private String experiencia;
    private String nombreA;
    private float salario;
    private int antiguedad;

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public AspiranteDto() {
    }

    public AspiranteDto(String nombreP, String experiencia, String nombreA, float salario, int antiguedad) {
        this.nombreP = nombreP;
        this.experiencia = experiencia;
        this.nombreA = nombreA;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }
    
}
