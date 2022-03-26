
package Modelo;

public class Puesto {
    
    private int idP;
    private String nombreP;
    private String experiencia;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

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

    public Puesto() {
    }

    public Puesto(int idP, String nombreP, String experiencia) {
        this.idP = idP;
        this.nombreP = nombreP;
        this.experiencia = experiencia;
    }
    
}
