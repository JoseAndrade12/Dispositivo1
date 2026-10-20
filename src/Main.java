public class Main {

    public static void main(String[] args) {

        // Paso 6: crear dos objetos
        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        // Paso 7: asignar valores diferentes a cada objeto
        dispositivo1.nombre = "Laptop";
        dispositivo1.tipo = "Computadora";
        dispositivo1.activo = true;

        dispositivo2.nombre = "Router";
        dispositivo2.tipo = "Red";
        dispositivo2.activo = false;

        // Paso 8: ejecutar los métodos de ambos objetos
        System.out.println("--- Dispositivo 1 ---");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println();
        System.out.println("--- Dispositivo 2 ---");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        // Paso 9: modificar solo el primer objeto
        dispositivo1.nombre = "Laptop Gamer";
        dispositivo1.activo = false;

        System.out.println();
        System.out.println("=== Después de modificar solo el dispositivo 1 ===");
        System.out.println("--- Dispositivo 1 ---");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println();
        System.out.println("--- Dispositivo 2 ---");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        // Desafío adicional: usar el método activar()
        System.out.println();
        System.out.println("=== Desafío adicional ===");
        dispositivo2.activar();
        dispositivo2.mostrarEstado();
    }
}