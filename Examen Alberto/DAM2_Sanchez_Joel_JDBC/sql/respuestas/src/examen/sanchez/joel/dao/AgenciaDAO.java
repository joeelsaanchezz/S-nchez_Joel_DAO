package examen.sanchez.joel.dao;

import java.util.ArrayList;

import examen.sanchez.joel.beans.Agencia;
import examen.sanchez.joel.motores.MotorSQL;

// ADAPTAR: sustituye Pelicula por tu Bean en toda la clase
public abstract class AgenciaDAO extends AbstractDAO<Agencia> {

    public AgenciaDAO(MotorSQL motorSQL) {
        super(motorSQL);
    }

    // ADAPTAR: métodos específicos de tu temática
    public abstract ArrayList<Agencia> findByPais(String pais);
    public abstract ArrayList<Agencia> findByfechaFundacion(String fechaFundacion);
}
