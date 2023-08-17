import java.util.Scanner;

public class ContaTerminal {
    private int number;
    private String agency;
    private String clientName;
    private double balance;

    public ContaTerminal(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public void displayWelcomeMessage() {
        System.out.println("Olá " + this.clientName + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + this.agency + ", conta " + this.number + " e seu saldo " + this.balance
                + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência!");
            int number = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência!");
            String agency = scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente!");
            String clientName = scanner.nextLine();

            System.out.println("Por favor, digite o Saldo!");
            double balance = scanner.nextDouble();

            ContaTerminal myAccount = new ContaTerminal(number, agency, clientName, balance);
            myAccount.displayWelcomeMessage();
        }
    }
}
