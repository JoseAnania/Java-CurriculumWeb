
package Modelo;

public class Nacionalidad {
    
    private int idN;
    private String pais;

    public int getIdN() {
        return idN;
    }

    public void setIdN(int idN) {
        this.idN = idN;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Nacionalidad() {
    }

    public Nacionalidad(int idN, String pais) {
        this.idN = idN;
        this.pais = pais;
    }
    
}
