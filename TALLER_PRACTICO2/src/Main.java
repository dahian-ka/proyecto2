public class Main {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        // Agregar libros
        Libro libro1 = new Libro(1, "1984", "George Orwell", 1949);
        Libro libro2 = new Libro(2, "Cien años de soledad", "Gabriel García Márquez", 1967);

        libroDAO.agregarLibro(libro1);
        libroDAO.agregarLibro(libro2);

        // Obtener todos los libros
        System.out.println("Todos los libros:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }

        // Actualizar libro
        Libro libroActualizado = new Libro(1, "1984 (Edición Revisada)", "George Orwell", 1950);
        libroDAO.actualizarLibro(libroActualizado);

        // Obtener libro por ID
        System.out.println("Libro con ID 1:");
        System.out.println(libroDAO.obtenerLibroPorId(1));

        // Eliminar libro
        libroDAO.eliminarLibro(2);

        // Verificar libros restantes
        System.out.println("Libros restantes después de eliminación:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }
    }
}

