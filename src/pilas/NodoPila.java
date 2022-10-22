/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author Tony
 */
public class NodoPila {//clase donde trabajaremos los nodos de nuestra pila
    
    int dato; // instanciamos una variable de tipo entero para almacenar un valor numerico
    
    NodoPila siguiente; //instanciamos nuestro nodo
    
    public NodoPila(int d){ //creamos nuestro constructor que resiva como parametros un dato de tipo entero 
        dato=d; //inicializamos nuestra valriable dato;
        siguiente=null;//inicializamos nuestro nodo de manera que sea vacio inicialmente
    }
    
}
