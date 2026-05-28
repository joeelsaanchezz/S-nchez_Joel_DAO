package examen.sanchez.joel.dao;
import java.util.ArrayList;
import examen.sanchez.joel.motores.MotorSQL;

public abstract class AbstractDAO<T> {

    protected MotorSQL motorSQL;

    public AbstractDAO(MotorSQL motorSQL) {
        this.motorSQL = motorSQL;
    }

    // Operaciones CRUD comunes a cualquier tabla
    public abstract void add(T obj);
    public abstract T find(String id);
    public abstract ArrayList<T> findAll();
    public abstract void update(String id, T obj);
    public abstract void delete(String id);

    // Método de verificación de conexión
    public void check() {
        motorSQL.connect();
        System.out.println("Check OK");
        motorSQL.close();
    }
}
