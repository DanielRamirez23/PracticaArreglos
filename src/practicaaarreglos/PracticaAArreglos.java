
package practicaaarreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class PracticaAArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

     String usuario [][] = {
         
            {"usuario1@email.com","123"},
            {"usuario2@email.com", "456"},
            {"usuario3@email.com", "789"}
              
        };
 
         String email =
           JOptionPane.showInputDialog("ingresa el correo");
        String password =
            JOptionPane.showInputDialog("ingresa la contraseña");
        
            for (int fila =0; fila< usuario.length; fila ++){
                 if (email.equals(usuario[fila][0]) && password.equals(usuario[fila][1])){
                     JOptionPane.showMessageDialog(null, "usuario correcto");
                 }
                 
            }
            
    }
}
            
            
   
    
    
    

    
    
    
    
    
    
    

