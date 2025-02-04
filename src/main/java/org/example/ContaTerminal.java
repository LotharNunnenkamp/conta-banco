package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        Integer numeroDaAgencia = sc.nextInt();
        System.out.println("Por favor, digite o número da conta !");
        String numeroDaConta = sc.next();
        System.out.println("Por favor, digite seu nome !");
        String nomeDoCliente = sc.next();
        System.out.println("Por favor, digite seu saldo !");
        BigDecimal saldo = sc.nextBigDecimal();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque", nomeDoCliente, numeroDaAgencia, numeroDaConta, saldo);

        sc.close();
    }
}