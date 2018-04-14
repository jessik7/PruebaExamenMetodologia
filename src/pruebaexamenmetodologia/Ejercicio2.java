
package pruebaexamenmetodologia;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *Nombre de la clase: Ejercicio2
 * Fecha: 14-04-2018
 * Version: 1.0
 * CopyRight: Jessica Menjivar
 * @Jessica Linares
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
    
        int cantidad, n=1;
        
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Empleados: "));
        
        //Declaracion de Vectores  
        String nombres[] = new String[cantidad];
        String apellidos[] = new String[cantidad];
        int anio[] = new int[cantidad];
        String sexo[] = new String[cantidad];
        double estatura[] = new double[cantidad];
        double peso[] = new double[cantidad];
        double salario[] = new double[cantidad];
        
        DecimalFormat df = new DecimalFormat("##.##");
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        
        //Insercion de datos
        for(int i=0; i<cantidad; i++)
        {
            JOptionPane.showMessageDialog(null, "Empleado " + n , "Mensaje", 1);
             nombres[i] = JOptionPane.showInputDialog("Ingrese Nombre: ");
             apellidos[i] = JOptionPane.showInputDialog("Ingrese Apelido: ");
             anio[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de Nacimiento"));
             JOptionPane.showMessageDialog(null, "Ingrese:" + "\n" + 
                     "F si es Femenino " + "\n" +
                     "M si es Masculino " , "OJO", 1);
             sexo[i] = JOptionPane.showInputDialog("Ingrese Sexo: ");
             estatura[i] =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese Estatura: "));
             peso[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Peso: "));
             salario[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Salario Mensual: "));
             
            
            n++;
        } 
         
        //Operaciones..
        
        int canMasculino = 0, canFemenina = 0;
        
        for(int i=0; i<cantidad; i++)
        {
            if("M".equals(sexo[i]) || "m".equals(sexo[i]))
            {
                canMasculino = canMasculino +1;
            }
            if("F".equals(sexo[i]) || "f".equals(sexo[i]))
            {
                canFemenina = canFemenina +1;
            }
            
            
        } 
         
    }
}
