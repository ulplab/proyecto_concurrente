package com.example.admin.pruebatracking.Entidades;

/**
 * Created by Mario on 25/10/2016.
 */
public class Grupo_Cuentas extends DBEntidad{

    public int IdGrupo;

    public int IdCuenta;

    public Grupo_Cuentas(int Id) {
        super(Id);
    }

    public int getIdGrupo() {
        return IdGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        IdGrupo = idGrupo;
    }

    public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        IdCuenta = idCuenta;
    }
}
