package Entities;

public class ArticuloManufacturadoDetalle {
    private Integer cantidad;
    private ArticuloManufacturado articuloManufacturado;
    private ArticuloInsumo articuloInsumo;

    public ArticuloManufacturadoDetalle() {
    }

    public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloManufacturado articuloManufacturado, ArticuloInsumo articuloInsumo) {
        this.cantidad = cantidad;
        this.articuloManufacturado = articuloManufacturado;
        this.articuloInsumo = articuloInsumo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloManufacturado getArticuloManufacturado() {
        return articuloManufacturado;
    }

    public void setArticuloManufacturado(ArticuloManufacturado articuloManufacturado) {
        this.articuloManufacturado = articuloManufacturado;
    }

    public ArticuloInsumo getArticuloInsumo() {
        return articuloInsumo;
    }

    public void setArticuloInsumo(ArticuloInsumo articuloInsumo) {
        this.articuloInsumo = articuloInsumo;
    }
} 