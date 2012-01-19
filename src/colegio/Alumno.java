/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**5. Aplicación que da de alta alumnos de la clase DAW, para cada alumno almacena 
 * nombre y apellidos, teléfono (validar que sea correcto, comienza por 9 o 6, con 
 * longitud de 9), DNI (validar que sea correcto, 6 u 8 dígitos, y letra) y sus 
 * notas en la primera evaluación en un array, con 6 asignaturas. El programa 
 * tendrá las siguientes opciones:
 *
 * @author rcerrato
 */
public class Alumno {


    /**
     * @return the totalAlumnos
     */
    private String nombre,apellido,telefono,dni;
    private double notas[];
    private double media;
    private static int totalAlumnos=0;
    private static int totalAprobados=0;
        public Alumno() {
        this.nombre = " ";
        this.apellido = " ";
        this.telefono = " ";
        this.dni = " ";
        this.media=0;
        }
    
    public Alumno(String nombre, String apellido, String telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.media=0;
        this.notas=new double[6];
    }
    

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", telefono=" + getTelefono() + ", dni=" + getDni() + ", media=" + getMedia() + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }
        /**
     * @return the totalAlumnos
     */
    public static int getTotalAlumnos() {
        return totalAlumnos;
    }

    /**
     * @return the totalAprobados
     */
    public static int getTotalAprobados() {
        return totalAprobados;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
        /**
     * @param aTotalAlumnos the totalAlumnos to set
     */
    public static void setTotalAlumnos() {
        totalAlumnos++;
    }
    public void setNotaAsig(double n, int pos){
        notas[pos]=n;
    }
    
}
