/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_has_a;

/**
 *
 * @author invitado
 */
public class Eva2_7_has_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion direc = new Direccion("5ta","55", "valles", "35478", "cdmx", "cdmx")
        persona perso = new persona( "juan", "perrez", 50, direc ) 
                System.out.println(perso);
    }
    
}
