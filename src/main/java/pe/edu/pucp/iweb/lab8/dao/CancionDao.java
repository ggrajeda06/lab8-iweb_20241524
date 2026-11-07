package pe.edu.pucp.iweb.lab8.dao;

import java.util.ArrayList;

import pe.edu.pucp.iweb.lab8.beans.Cancion;

public class CancionDao extends BaseDao { // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todas las canciones (con el nombre de su género, JOIN),
     * ordenadas por título. Use PreparedStatement.
     */
    public ArrayList<Cancion> listar() {
        // TODO
        Arraylist<Cancion> listaCancion = new Arraylist<>();

        try (Connection conn = this.getConection() ;
            Statement stmt =  connn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cancion"); ){

            while(rs.next()){
                Cancion cancion = new Cancion();
                cancion.set

            }
        }

        return ArrayList<Cancion>;
    }

    /**
     * Ejercicio 2: la canción con ese id, o null si no existe.
     */
    public Cancion buscarPorId(int idCancion) {
        // TODO
        return null;
    }

    /**
     * Ejercicio 2: INSERT de una canción nueva (PreparedStatement).
     */
    public void crear(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 2: UPDATE de una canción existente (PreparedStatement).
     */
    public void actualizar(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 3: DELETE por id (PreparedStatement).
     */
    public void eliminar(int idCancion) {
        // TODO
    }
}
