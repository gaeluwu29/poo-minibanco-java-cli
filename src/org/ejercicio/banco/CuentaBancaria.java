package org.ejercicios.banco;

class CuentaBancaria {
     long numero;
     Cliente titular;
     long saldo;
     CuentaBancaria (long num, Cliente clt, long s) {
        this.numero = num; 
        this.titular = clt;  
        this.saldo = s;
     }
 }