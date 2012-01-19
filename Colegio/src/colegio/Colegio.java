/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;
import java.io.*;

/**
 *
 * @author rcerrato
 */
public class Colegio {

    /**Matricular un alumno: en la clase puede haber 25 alumnos máximo. 
     * Si todavía no está llena se piden los datos del alumno (sin las notas) y se almacena.
Poner las notas de una asignatura (para toda la clase)
Mostrar un listado de toda la clase ordenado por nota media
Mostrar un listado de toda la clase ordenado alfabéticamente.
Mostrar las notas de un alumno: pedir su DNI y mostrar sus notas
Anular matrícula: se pide DNI y se borra la información el alumno
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in) );
        // TODO code application logic here
      Alumno clase[]=new Alumno[25]; 
      int op;
      String listaAsig[]={"programacion", "marcas", "entornos","sistemas","bbdd","fol"};
      do{
          System.out.println("1.Matricular");
          System.out.println("2.Poner notas asignaturas");
          System.out.println("3.Listado por nota media");
          System.out.println("4.Listado alfabetico");
          System.out.println("5.Consultar alumnos");
          System.out.println("6.Anular matricula alumno");
          System.out.println("7.Salir");
          op=Integer.parseInt(br.readLine().trim());
          switch(op){
              case 1:
                  int contAlumno=Alumno.getTotalAlumnos();
                  if(contAlumno<25){
                      System.out.println("Introduce nombre");
                      String n=br.readLine();
                      System.out.println("Introduce apellidos");
                      String a=br.readLine();
                      System.out.println("Introduce telefono");
                      String t=br.readLine();
                      while(validarTelefono(t)==false){//hacer funcion
                          System.out.println("Error.Introduce telefono");
                          t=br.readLine();
                      }
                      System.out.println("Dni:");
                      String d=br.readLine();
                      /**while(validarDni==false){//hacer funcion
                          System.out.println("Error.Introduce dni");
                          d=br.readLine();
                      }*/
                      clase[contAlumno]=new Alumno(n,a,t,d);
                      Alumno.setTotalAlumnos();
                  }
                  else
                      System.out.println("No hay plazas");
                  break;
              case 2:
                  System.out.println("Asignatura");
                  String asig=br.readLine();
                  asig.toLowerCase();
                  int pos=buscarAsig(asig,listaAsig);
                  if(pos==-1)
                      System.out.println("Error en la asignatura");
                  else{
                      for(int i=0;i<Alumno.getTotalAlumnos();i++){
                          System.out.println("Alumno:"+clase[i].getNombre()+" "+clase[i].getApellido());
                          System.out.println("Nota:");
                          double nota=Double.parseDouble(br.readLine().trim());
                          clase[i].setNotaAsig(nota, pos);
                      }
                  }
                  break;
          }
      }while(op!=7);
      
    }
    static int buscarAsig(String asig, String listaAsig[]){
        for(int i=0;i<6;i++){
            if(asig.equals(listaAsig[i]))
                return i;
        }
        return -1;
    }
    //teléfono (validar que sea correcto, comienza por 9 o 6, con 
 // longitud de 9)
    static boolean validarTelefono(String d){
        if(d.length()<9 && d.length()>9){
            System.out.println("Faltan numeros");
            return false;
        }
        else{
            for(int i=0;i<d.length();i++){
                if(d.charAt(i)<'0' && d.charAt(i)>'9'){
                    System.out.println("Todos no son numeros");
                    return false;
                }
            }
        }    
    return true;
    }
}
