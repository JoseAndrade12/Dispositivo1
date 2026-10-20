public class Dispositivo {
    public String nombre;      // public
    String tipo;               // acceso por defecto (sin modificador)
    public boolean activo;     // public

    // Paso 3: método público que muestra la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    // Paso 4: método con acceso por defecto
    void mostrarEstado() {
        if (activo) {
            System.out.println("Estado: " + nombre + " está activo");
        } else {
            System.out.println("Estado: " + nombre + " está inactivo");
        }
    }

    // Desafío adicional: método público para activar el dispositivo
    public void activar() {
        activo = true;
        System.out.println(nombre + " ha sido activado");
    }
}
}
