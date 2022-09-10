
package pagos;

import interfaces.IPago;

public class ApplePay implements IPago{

    @Override
    public void pagar() {
        System.out.println("[APPLE PAY] Pagado!");
    }   
}
