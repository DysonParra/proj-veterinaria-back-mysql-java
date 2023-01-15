/*
 * @fileoverview    {Chat} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code Chat}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Entity
@Table(name = "\"Chat\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Chat implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdChat;
    private Integer intRemitente;
    private Integer intReceptor;
    @Lob
    @Column(length = 65535, columnDefinition = "TEXT")
    private String txtMensaje;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;
    private Integer intEstado;
    @JoinColumn(name = "intIdChatDetalle", referencedColumnName = "intIdChatDetalle")
    private Long intIdChatDetalle;

}
