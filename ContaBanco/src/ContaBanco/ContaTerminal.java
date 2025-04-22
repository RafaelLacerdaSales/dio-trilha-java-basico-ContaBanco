package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite número da conta:");
		String numeroConta = scanner.next();
		
		System.out.println("Digite o número da Agência !:");
		String agenciaCliente = scanner.next();
		
		System.out.println("Digite seu nome:");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite seu saldo:");
		String saldoConta = scanner.next();
		
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaCliente  +  ", conta "+ numeroConta +  " e seu saldo " + saldoConta + " já está disponível para saque");
		
	}
	
}
