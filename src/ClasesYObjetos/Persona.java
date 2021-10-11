package ClasesYObjetos;

public class Persona {
    //Atributos

    String nombre;
    int edad;
    String dni;

    /*generar automaticamente el metodo constructor
    click derecho generate
     */
    //Metodos constructores

    //Constructor 1
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //constructor 2

   /* Cuando hay mas de un constructor se conoce como sobrecaga
    de Constructores.   */

    public Persona(String dni) {
        this.dni = dni;
    }
    /* SOBRECARGA DE METODOS */
    //Metodos normales
    public void correr (){
        System.out.println("Soy "+nombre+", tengo "+edad+"años y estoy corriendo una maraton");
    }
    public void correr (int km) {
        System.out.println("He corrido "+km+" kilometros");
    }
    /*Como tenemos dos metodos correr debemos diferenciarlos
    con los valores de los parametros como se ve en el primer
    correr los parentesis estan vacios y en el segundo correr
    especificamos (int km).
    */

}
