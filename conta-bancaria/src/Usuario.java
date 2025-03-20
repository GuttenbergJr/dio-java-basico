public class Usuario {
    public static void main(String[] args) throws Exception {
        
        Conta conta = new Conta();
        conta.saldo = 500;

        conta.sacar(342);
        System.out.println("Após o saque, valor restante na conta é de: R$" + conta.saldo);

    }
}
