package org.ejercicios.banco;
public class Main{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Guwu21",100000);
        CuentaBancaria cuenta1 = new CuentaBancaria(10000000, cliente1, 500000);

        Cliente cliente2 = new Cliente("Galelito1",100000);
        CuentaBancaria cuenta2 = new CuentaBancaria(123456, cliente2, 23446);
    }
}