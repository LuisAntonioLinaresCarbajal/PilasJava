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
import javax.swing.JOptionPane;

public class Pilas { //clase principal

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0, elemento = 0; //inicializamos nuestras variables en 0
        LaPilaa p = new LaPilaa();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento en la pila\n"
                        + "2. Sacar un elemento en la pila\n"
                        + "3. ¿La pila esta vacia?\n"
                        + "4. ¿Que elemento esta en la cima?\n"
                        + "5. ¿cual es el tamaño de la pila?\n"
                        + "6. Vaciar pila\n"
                        + "7. Finalizar\n"
                        + " ¿Que deceas hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE
                ));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemto que se va a agregar en la pila ", "Apilando datos ",
                                JOptionPane.INFORMATION_MESSAGE
                        ));
                        p.push(elemento);
                        break;
                        
                    case 2:
                        if (!p.vacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es " + p.pop(),
                                    "Obteniendo datos de la pila ", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "Pila vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 3:
                        if (p.vacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia",
                                    "La pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!p.vacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la sima es " + p.cima(),
                                    "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es " + p.tamañoPila(),
                                "Tamaño de la pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    case 6:
                        if(!p.vacia()){
                            p.limpiarPila();
                            JOptionPane.showMessageDialog(null, "La pilase ha vaciado" ,
                                "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 7:
                        JOptionPane.showMessageDialog(null, "Apilacion finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null,"Error" + n.getMessage());
            }
        } while (opcion != 7);
    }

}
