
package strategy;

import interfaces.IPago;
import pagos.ApplePay;
import pagos.PayPal;
import pagos.Stripe;


public class Main {

    public static void main(String[] args) {
        IPago primerPago = new ApplePay();
        IPago segundoPago = new PayPal();
        IPago tercerPago = new Stripe();
        
        realizarTransaccion(primerPago);
        realizarTransaccion(segundoPago);
        realizarTransaccion(tercerPago);
        
    }
    
    static void realizarTransaccion(IPago pago){
        pago.pagar();
    }
    
}
