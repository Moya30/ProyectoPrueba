package com.pry.lvlprueba.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioResponse implements Serializable {

    @JsonProperty("idUsuario")
    private Integer idUsuario;

    @JsonProperty("nombUsuario")
    private String nombUsuario;

    @JsonProperty("apeUsuario")
    private String apeUsuario;

    @JsonProperty("cargEmp")
    private String cargEmp;

    @JsonProperty("nombEmp")
    private String nombEmp;

    @JsonProperty("telfUsua")
    private String telfUsua;

    @Email(message = "Debe ser un correo válido")
    @JsonProperty("correoUsua")
    private String correoUsua;

    @JsonProperty("password")
    private String password;

    public @Email(message = "Debe ser un correo válido") String getCorreoUsua() {
        return correoUsua;
    }
}
