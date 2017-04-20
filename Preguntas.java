/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;

/**@author O. Apolinar
 */
public class Preguntas {
    String[] Preg = {
        "La densidad es una propiedad...", "¿En que estado de la materia, las moleculas se mantienen juntas de manera ordenada?",
        "La velocidad de una onda se define como...","La frecuencia de una onda es...","¿En que unidad se mide la frecuncia?",
        "¿Cuantos elemetos incluyo en la tabala peridica Mendeleev?","¿Que es la capa de valencia?",
        "¿Como se le llama a los electrones que no son de la capa de valencia de un atomo?","¿Cual es el atomo con mayor radio atomico?",
        "¿Cual es el atomo con menor radio atomico?"
    };
    
    public String getPregunta(int lugar){
        return Preg[lugar];
    }
}
