package VARIOSDATOS;

public class VariosDatos {

    public static void main(String[] args) {
        Estudiante[] grupo4a = new Estudiante[20];

        //crear POJO
        Estudiante mariel = new Estudiante();
        mariel.setNombre("Mariel");
        mariel.setCarrera("TIADSM");
        mariel.setCuatrimestre(4);
        mariel.setGrupo('a');
        mariel.setPromedio(8.75);

        //guardar el POJO en el arreglo
        grupo4a[0] = mariel;

        Estudiante karen = new Estudiante();
        karen.setNombre("Ana Karen");
        karen.setCarrera("TIADSM");
        karen.setCuatrimestre(4);
        karen.setGrupo('a');
        karen.setPromedio(7.8);
        grupo4a[0] = karen;

        Estudiante erick = new Estudiante();
        erick.setNombre("Sergio Erick");
        erick.setCarrera("TIADSM");
        erick.setCuatrimestre(4);
        erick.setGrupo('b');
        erick.setPromedio(9.74);
        grupo4a[0] = erick;

        for ( Estudiante unEstudiante : grupo4a ){
            System.out.println(unEstudiante.getNombre() + " - " + unEstudiante.getPromedio());
        }

    }

}
