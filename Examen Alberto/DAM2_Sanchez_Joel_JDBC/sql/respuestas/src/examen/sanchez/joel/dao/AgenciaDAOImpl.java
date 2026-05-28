package examen.sanchez.joel.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import examen.sanchez.joel.beans.Agencia;
import examen.sanchez.joel.motores.MotorSQL;

public class AgenciaDAOImpl extends AgenciaDAO {

    public AgenciaDAOImpl(MotorSQL motorSQL) {
        super(motorSQL);
    }

    // ===================== ADD =====================
    @Override
    public void add(examen.sanchez.joel.beans.Agencia a) {
        motorSQL.connect();
        String sql = "INSERT INTO AGENCIAS (NOMBRE,PAIS,FECHA_FUNDACION,sanchezjoel)"
                   + " VALUES (?,?,?,?)";
        motorSQL.prepare(sql);
        try {
            motorSQL.getPs().setString(1, a.getNombre());
            motorSQL.getPs().setString(2, a.getPais());
            motorSQL.getPs().setString(3, a.getFechaFundacion());
            motorSQL.getPs().setString(4, a.getSanchezJoel());
            motorSQL.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
    }

    // ===================== FIND ALL =====================
    @Override
    public ArrayList<examen.sanchez.joel.beans.Agencia> findAll() {
        motorSQL.connect();
        ArrayList<examen.sanchez.joel.beans.Agencia> lista = new ArrayList<>();
        motorSQL.prepare("SELECT * FROM AGENCIA");
        try {
            ResultSet rs = motorSQL.executeQuery();
            while (rs.next()) {
                examen.sanchez.joel.beans.Agencia a = new examen.sanchez.joel.beans.Agencia();
                // ADAPTAR: columnas según tu tabla
                a.setIdAgencia(rs.getString("ID_AGENCIA"));
                a.setNombre(rs.getString("NOMBRE"));
                a.setPais(rs.getString("PAIS"));
                a.setFechaFundacion(rs.getString("FECHA_FUNDACION"));
                a.setSanchezJoel(rs.getString("sanchezjoel"));
                lista.add(a);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
        return lista;
    }

    // ===================== FIND BY ID =====================
    @Override
    public Agencia find(String idAgencia) {
        motorSQL.connect();
        Agencia a = null;
        // ADAPTAR: nombre de tabla
        motorSQL.prepare("SELECT * FROM AGENCIAS WHERE ID_AGENCIA = ?");
        try {
            motorSQL.getPs().setString(1, idAgencia);
            ResultSet rs = motorSQL.executeQuery();
            if (rs.next()) {
                a = new Agencia();
                a.setIdAgencia(rs.getString("ID_AGENCIA"));
                a.setTitulo(rs.getString("NOMBRE"));
                a.setDirector(rs.getString("PAIS"));
                a.setGenero(rs.getString("FECHA_FUNDACION"));
                a.setAnyo(rs.getInt("sanchezjoel"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
        return p;
    }

    // ===================== UPDATE =====================
    @Override
    public void update(int id, Pelicula p) {
        motorSQL.connect();
        // ADAPTAR: nombre de tabla y columnas
        String sql = "UPDATE peliculas SET titulo=?, director=?,"
                   + " genero=?, anyo=?, duracion=? WHERE id=?";
        motorSQL.prepare(sql);
        try {
            motorSQL.getPs().setString(1, p.getTitulo());
            motorSQL.getPs().setString(2, p.getDirector());
            motorSQL.getPs().setString(3, p.getGenero());
            motorSQL.getPs().setInt(4, p.getAnyo());
            motorSQL.getPs().setInt(5, p.getDuracion());
            // El id siempre va al final en el UPDATE
            motorSQL.getPs().setInt(6, id);
            motorSQL.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
    }

    // ===================== DELETE =====================
    @Override
    public void delete(int id) {
        motorSQL.connect();
        // ADAPTAR: nombre de tabla
        motorSQL.prepare("DELETE FROM peliculas WHERE id = ?");
        try {
            motorSQL.getPs().setInt(1, id);
            motorSQL.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
    }

    // ================ FIND BY GENERO ================
    @Override
    public ArrayList<Pelicula> findByGenero(String genero) {
        motorSQL.connect();
        ArrayList<Pelicula> lista = new ArrayList<>();
        // ADAPTAR: nombre de tabla y columna de filtro
        motorSQL.prepare("SELECT * FROM peliculas WHERE genero = ?");
        try {
            motorSQL.getPs().setString(1, genero);
            ResultSet rs = motorSQL.executeQuery();
            while (rs.next()) {
                Pelicula p = new Pelicula();
                p.setId(rs.getInt("id"));
                p.setTitulo(rs.getString("titulo"));
                p.setDirector(rs.getString("director"));
                p.setGenero(rs.getString("genero"));
                p.setAnyo(rs.getInt("anyo"));
                p.setDuracion(rs.getInt("duracion"));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
        return lista;
    }

    // ================ FIND BY DIRECTOR ================
    @Override
    public ArrayList<Pelicula> findByDirector(String director) {
        motorSQL.connect();
        ArrayList<Pelicula> lista = new ArrayList<>();
        // ADAPTAR: nombre de tabla y columna de filtro
        motorSQL.prepare("SELECT * FROM peliculas WHERE director = ?");
        try {
            motorSQL.getPs().setString(1, director);
            ResultSet rs = motorSQL.executeQuery();
            while (rs.next()) {
                Pelicula p = new Pelicula();
                p.setId(rs.getInt("id"));
                p.setTitulo(rs.getString("titulo"));
                p.setDirector(rs.getString("director"));
                p.setGenero(rs.getString("genero"));
                p.setAnyo(rs.getInt("anyo"));
                p.setDuracion(rs.getInt("duracion"));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
        return lista;
    }

    @Override
    public ArrayList<Agencia> findByPais(String pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPais'");
    }

    @Override
    public ArrayList<Agencia> findByfechaFundacion(String director) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByfechaFundacion'");
    }

    @Override
    public void update(int id, Agencia obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
