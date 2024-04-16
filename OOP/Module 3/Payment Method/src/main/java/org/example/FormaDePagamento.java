package org.example;

public class FormaDePagamento {
    public void processarPagamento() {
        System.out.println("A processar o seu pagamento");
    }
}

class CartaoCredito {
    public void processarPagamento() {
        System.out.println("A processar o seu pagamento com o seu cartão de crédito.");
    }
}

class PayPal {
    public void processarPagamento() {
        System.out.println("A processar o seu pagamento através da sua conta PayPal");
    }
}