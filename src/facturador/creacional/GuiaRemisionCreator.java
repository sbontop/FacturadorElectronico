/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.creacional;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Angel Arturo
 */
public class GuiaRemisionCreator extends Creator{

    
    public ComprobanteElectronico factoryMethod(String destino, String placaVehiculo, List<String> listaProductos, String nombreCliente, long codigo, LocalDate fecha) {
        return new GuiaRemision(destino, placaVehiculo, listaProductos, nombreCliente, codigo, fecha); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ComprobanteElectronico factoryMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
