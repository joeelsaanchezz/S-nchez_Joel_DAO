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
        motorSQL.prepare("SELECT * FROM AGENCIAS WHERE ID_AGENCIA = ?");
        try {
            motorSQL.getPs().setString(1, idAgencia);
            ResultSet rs = motorSQL.executeQuery();
            if (rs.next()) {
                a = new Agencia();
                a.setIdAgencia(rs.getString("ID_AGENCIA"));
                a.setNombre(rs.getString("NOMBRE"));
                a.setPais(rs.getString("PAIS"));
                a.setFechaFundacion(rs.getString("FECHA_FUNDACION"));
                a.setSanchezJoel(rs.getString("sanchezjoel"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
        return a;
    }

    // ===================== UPDATE =====================
    @Override
    public void update(String idAgencia, Agencia a) {
        motorSQL.connect();
        String sql = "UPDATE AGENCIAS SET NOMBRE=?, PAIS=?,"
                   + " FECHA_FUNDACION=?, sanchezjoel=? WHERE ID_AGENCIA=?";
        motorSQL.prepare(sql);
        try {
            motorSQL.getPs().setString(1, a.getNombre());
            motorSQL.getPs().setString(2, a.getPais());
            motorSQL.getPs().setString(3, a.getFechaFundacion());
            motorSQL.getPs().setString(4, a.getSanchezJoel());
            motorSQL.getPs().setString(5, idAgencia);
            motorSQL.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
    }

    // ===================== DELETE =====================
    @Override
    public void delete(String idAgencia) {
        motorSQL.connect();
        motorSQL.prepare("DELETE FROM AGENCIAS WHERE ID_AGENCIA = ?");
        try {
            motorSQL.getPs().setString(1, idAgencia);
            motorSQL.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            motorSQL.close();
        }
    }

    // ================ FIND BY PAIS ================
    @Override
    public ArrayList<Agencia> findByPais(String pais) {
        motorSQL.connect();
        ArrayList<Agencia> lista = new ArrayList<>();
        // ADAPTAR: nombre de tabla y columna de filtro
        motorSQL.prepare("SELECT * FROM AGENCIAS WHERE PAIS = ?");
        try {
            motorSQL.getPs().setString(1, pais);
            ResultSet rs = motorSQL.executeQuery();
            while (rs.next()) {
                Agencia a = new Agencia();
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

    // ================ FIND BY DIRECTOR ================
    @Override
    public ArrayList<Agencia> findByfechaFundacion(String fechaFundacion) {
        motorSQL.connect();
        ArrayList<Agencia> lista = new ArrayList<>();
        // ADAPTAR: nombre de tabla y columna de filtro
        motorSQL.prepare("SELECT * FROM AGENCIAS WHERE FECHA_FUNDACION = ?");
        try {
            motorSQL.getPs().setString(1, fechaFundacion);
            ResultSet rs = motorSQL.executeQuery();
            while (rs.next()) {
                Agencia a = new Agencia();
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






}
