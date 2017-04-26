/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeexerciciouri;

/**
 *
 * @author 253746
 */
public class TesteExercicioUri {
 public int soma(int numero,int segundo){
     int soma = 0;
        if (numero <= segundo) {
            for (int i = numero; i <= segundo; i++) {
                if (i % 13 != 0) {
                    soma = soma + i;
                }
            }
        } else {
            for (int i = segundo; i <= numero; i++) {
                if (i % 13 != 0) {
                    soma = soma + i;
                }
            }
        }
        return soma;
    }
 
 public int reverterSoma(int numero,int segundo){
      int soma = soma(numero,segundo);
        if (numero <= segundo) {
            for (int i = numero; i <= segundo; i++) {
                if (i % 13 != 0) {
                    soma = soma - i;
                }
            }
        } else {
            for (int i = segundo; i <= numero; i++) {
                if (i % 13 != 0) {
                    soma = soma - i;
                }
            }
        }
        return soma;
 }

    
}
