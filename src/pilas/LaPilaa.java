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
public class LaPilaa { //clase logica
    
    private NodoPila cima; //encapsulamos nuestro NodoPila 
    
    int tamaño;//instanciamos una variable para el tamaño de nuesatra pila
    
    public LaPilaa(){
        cima=null;
        tamaño=0;
        
    }
    //crear metodo para saber cuando la pila esta vacia
    
    public boolean vacia(){
        return cima==null;
    }
    
    //metodo para insertar elementos en la pila  ==== Metodo (Push)
    public void push(int elemento){
        NodoPila nuevo= new NodoPila(elemento); //para empujar o agregar un dato es necesario crear un nuevo0 NodoPila como objeto
        
        nuevo.siguiente=cima;// se agrega el siguiente metodo a la variable sima
        cima=nuevo; //la variable cima recibe el valor de nuevo
        tamaño++; // el tamaño se va incrementando
        
    }
    public int pop(){//metodo pop para sacar elementos de la pila
        int auxiliar=cima.dato;
        cima=cima.siguiente;
        tamaño--;
        return auxiliar;
    }
    
    //metodo para saber que elemento esta en la sima de la pila
    
    public int cima(){
        return cima.dato;
    }
    
    //metodo para saber el tamaño de la pila
    
    public int tamañoPila(){
        return tamaño;
    }
    //metodo para limpiar la pila 
    
    public void limpiarPila(){
        while (!vacia()){ //mientras la pila no0 este vacia
            pop(); //saca todo
            
        }
    }

}
