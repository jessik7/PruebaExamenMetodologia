
package pruebaexamenmetodologia;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *Nombre de la clase: PruebaExamenMetologia
 * Fecha: 13-04-2018
 * Version: 1.0
 * CopyRight: Jessica Menjivar
 * @author Jessica Linares
 */
public class PruebaExamenMetodologia {


    public static void main(String[] args) {
        
        int cantidad, n=1;
        
       DecimalFormat df = new DecimalFormat("##.##");
        
        //cantidad de Alumnos a evaluar
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Agregue cantidad de Alumnos: "));
        
        //Declaracion de Vectores
        
        String nombres[] = new String[cantidad];
        String apellido[] = new String[cantidad];
        int anio[] = new int[cantidad];
        int edad[] = new int[cantidad];
        int toMasculino = 0, toFemenino = 0;
        String sexo[] = new String[cantidad];
        double nota1[] = new double[cantidad];
        double nota2[] = new double[cantidad];
        double nota3[] = new double[cantidad];
        double promedio[] = new double[cantidad];
        double suma[] = new double[cantidad];
        double sumapromedio = 0, promedioGeneral;
        
        for(int i=0; i<cantidad; i++)
        {
            JOptionPane.showMessageDialog(null,"Alumno "+ n , "Mensaje",1);
            nombres[i] = JOptionPane.showInputDialog("Ingrese Nombre: " );
            apellido[i] = JOptionPane.showInputDialog("Ingrese Apellido: ");
            anio[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de Nacimiento"));
            //Mensaje de Alerta
            
            JOptionPane.showMessageDialog(null, "Ingrese" + "\n" +
                    "M si es Masculino. " + "\n" +
                    "F si es Femenino. " + "\n" 
                    , "OJO", 2);
            sexo[i] = JOptionPane.showInputDialog("Ingrese Sexo: ");
            nota1[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota 1: "));
            nota2[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota 2: "));
            nota3[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota 3: "));
            
            
            n++;
        }
        
        //Operaciones...
        
        
        
        for(int i=0; i<cantidad; i++)
        {
            edad[i] = 2018 - anio[i];
            suma[i] = nota1[i] + nota2[i] + nota3[i];
            promedio[i] = suma[i]/3;
            
           sumapromedio = promedio[i] + promedio[i];
           
           if("m".equals(sexo[i]) || "M".equals(sexo[i]))
           {
               toMasculino = toMasculino +1;
           }
           else if("f".equals(sexo[i]) || "F".equals(sexo[i]))
           {
               toFemenino = toFemenino +1;
           }         
        }
        
       promedioGeneral = sumapromedio /cantidad;
        
        double numMa = 0, numMe = 0;
        numMe = numMa = promedio[0];
        
    
        for(int i=0; i<cantidad; i++)
        {
           
           
           
            if(promedio[i] > numMa)
            {
               numMa = promedio[i];
            }
            if(promedio[i] < numMe)
            {
                numMe = promedio[i];
            }
            
        }
        
        
 
        
        //Impresiones.
        
        for(int i=0; i<cantidad; i++)
        {
            JOptionPane.showMessageDialog(null, "Alumno: " + "\n\n" +
                    "Nombre: " + nombres[i] + "\n"+
                    "Apellido: " + apellido[i] + "\n" +
                    "Sexo: " + sexo[i] + "\n" + 
                    "Edad: " + edad[i] + "\n" +
                    
                    "Promedio Final: " + df.format(promedio[i]) ,
                    "Datos",1);
        }      
        
        //Impresion General;
        
        JOptionPane.showMessageDialog(null, "Promedio General" + "\n" + df.format(promedioGeneral) + "\n" +
                "Promedio Mayor: " + df.format(numMa) + "\n" +
                "Promedio Menor: " + df.format(numMe) + "\n" +
                "Femenino: " + toFemenino + "\n"  +                
                "Masculino: " + toMasculino + "\n" ,
                "Datos Generales", 1);
        
    }
   
}
