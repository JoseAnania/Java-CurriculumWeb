
package Dto;

public class NacionalidadDto {
    
    private String pais;
    private int cantidad;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public NacionalidadDto() {
    }

    public NacionalidadDto(String pais, int cantidad) {
        this.pais = pais;
        this.cantidad = cantidad;
    }
    
}
