/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;

import java.util.StringTokenizer;

/**
 *
 * @author O. Apolinar
 */
public class Respuestas {
    String[] Resp = {
        "intensiva y no depende de la cantidad de masa presente","Sólido","El producto de su longitud y frecuencia",
        "El numero de ondas que pasan por un punto particular en un segundo","Hertz","66","Electrones que ocupan el nivel de energia externa",
        "Kernel","Cesio","Helio"
    };
    String[] Opciones = {
        "propia de los liquidos,intensiva y no depende de la cantidad de masa presente,extensiva y no depende de la cantidad de masa presente,intensiva y depende de la cantidad de masa presente",
        "Liquido,Sólido,Plasma,Gaseoso",
        "El cociente de su longitud y frecuencia,El cociente de su longitud y masa,El producto de su longitud y frecuencia,El producto de su longitud y masa",
        "El numero de veces que se repite en el vacio,El numero pi,El numero de veces que se repite una onda en una hora,El numero de ondas que pasan por un punto particular en un segundo",
        "Metros por segundo,Hertz,Voltios,Ampers","66,100,56,99",
        "Electrones que ocupan el nivel de energia interna,Protones que ocupan el nivel de energia interna,Electrones que ocupan el nivel de energia externa,Protones que ocupan el nivel de energia externa",
        "Kernel,Carnet,Octavas,Neutrones","Helio,Galio,Cloro,Cesio","Helio,Galio,Cloro,Cesio"
    };
    public String getRespuesta(int lugar ){
        return Resp[lugar];
    }
        
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        String[] a = new String[9];
        int i = 0;
        
        while (token.hasMoreTokens()){
            a [i] = token.nextToken();
            i++;
        }
        return a;    
    }
    
    public String[] setRespuestas(int lugar){
        String P1 = Opciones[lugar];
        String[] S1 = separar(P1,",");
        return S1;
    }
}
