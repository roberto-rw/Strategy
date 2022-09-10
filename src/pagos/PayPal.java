
package pagos;

import interfaces.IPago;

public class PayPal implements IPago{

    @Override
    public void pagar() {
        System.out.println("[PAYPAL] Pagado!");
    }  
}
