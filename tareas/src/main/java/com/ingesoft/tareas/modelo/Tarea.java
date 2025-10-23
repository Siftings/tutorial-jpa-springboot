package com.ingesoft.tareas.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Tarea {

    @Id
    @GeneratedValue
    Long id;
    String descripcion;
    String detalles;
    boolean completada;

}
