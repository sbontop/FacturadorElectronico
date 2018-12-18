/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.creacional;

import java.time.LocalDate;

/**
 *
 * @author Angel Arturo
 */
public class NotaCreditoCreator extends Creator{

    @Override
    public ComprobanteElectronico factoryMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ComprobanteElectronico factoryMethod(String detalleModificacion, double valorAPagar, String nombreCliente, long codigo, LocalDate fecha) {
        return new NotaCredito(detalleModificacion, valorAPagar, nombreCliente, codigo, fecha);
    }
    
}
