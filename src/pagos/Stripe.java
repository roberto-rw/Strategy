
package pagos;

import interfaces.IPago;

public class Stripe implements IPago{

    @Override
    public void pagar() {
        System.out.println("[STRIPE] Pagado!");
    } 
}
