/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto9;

/**
 *
 * @author sbpinilla
 */
public class Punto9 {
    
    
    
    static public  ProductoDTO calcularTotalProducto(ProductoDTO producto){
        
        producto.setTotal(producto.getValorProducto() * producto.getCantidad());
        
        return producto; 
    }
    
}
