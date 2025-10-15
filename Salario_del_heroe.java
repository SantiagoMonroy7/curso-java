/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario_del_heroe;

/**
 *
 * @author Santiago Monroy
 */
public class Salario_del_heroe {

    /**
     *
     */
    public static void main(String[] args) {
       int salario=2000000;
       double Descuentodesalud=salario*0.04;
       double Descuentodepension=salario*0.05;
       double saldoFinal;
       saldoFinal=Descuentodesalud + Descuentodepension;
       System.out.print("tu saldo final es de" + saldoFinal);
    }
    
    
    
    
}
