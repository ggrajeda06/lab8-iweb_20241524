package pe.edu.pucp.iweb.lab8.dao;

import java.util.ArrayList;
import java.sql.*;

import pe.edu.pucp.iweb.lab8.beans.Cancion;

public class CancionDao extends BaseDao { // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todas las canciones (con el nombre de su género, JOIN),
     * ordenadas por título. Use PreparedStatement.
     */
    public ArrayList<Cancion> listar() {
        // TODO
        ArrayList<Cancion> listaCancion = new ArrayList<>();

        try (Connection conn = this.getConnection() ;
            Statement stmt =  conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cancion"); ){

            while(rs.next()){
                Cancion cancion = new Cancion();
                cancion.setIdCancion(rs.getInt(1));
                cancion.setTitulo(rs.getString(2));
                cancion.setArtista(rs.getString(3));
                cancion.setDuracionSeg(rs.getInt(4));

            }
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
        return listaCancion;
    }

    /**
     * Ejercicio 2: la canción con ese id, o null si no existe.
     */
    public Cancion buscarPorId(int idCancion) {
        // TODO
        Cancion cancion = null;
        String sql = "select * from cancion where idCancion = ?";
        try (Connection conn = this.getConnection() ; PreparedStatement preparedStatement = conn.prepareStatement()) {

            preparedStatement.setInt(1, idCancion);

            try ( ResultSet rs = preparedStatement.executeQuery()){

                if(rs.next()){
                    cancion = fetchCancion();
                }
            }
        }

    }

    /**
     * Ejercicio 2: INSERT de una canción nueva (PreparedStatement).
     */
    public void crear(Cancion cancion) {
        // TODO
        String sql = "INSERT INTO cancion (titulo,artista,duracionSeg)" + " VALUES (?,?,?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            set;

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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
