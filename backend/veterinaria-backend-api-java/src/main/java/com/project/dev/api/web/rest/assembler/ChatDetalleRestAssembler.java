/*
 * @fileoverview    {ChatDetalleRestAssembler} se encarga de realizar tareas específicas.
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
package com.project.dev.api.web.rest.assembler;

import com.project.dev.api.dto.ChatDetalleDTO;
import com.project.dev.api.web.rest.ChatDetalleRest;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * TODO: Definición de {@code ChatDetalleRestAssembler}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Component
public class ChatDetalleRestAssembler implements RepresentationModelAssembler<ChatDetalleDTO, EntityModel<ChatDetalleDTO>> {

    /**
     * Convierte un DTO en un modelo.
     *
     * @param entityDTO DTO a convertir.
     * @return el modelo correspondiente al DTO:
     */
    @Override
    public EntityModel<ChatDetalleDTO> toModel(ChatDetalleDTO entityDTO) {
        return new EntityModel<>(entityDTO,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ChatDetalleRest.class).getEntity(String.valueOf(entityDTO.getIntIdChatDetalle()))).withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ChatDetalleRest.class).getAllEntities()).withRel("ChatDetalle"));
    }
}
