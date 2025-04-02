package com.pry.lvlprueba.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UsuarioRequest {

    @NotBlank(message = "El nombre no puede estar vacío")
    @JsonProperty("nombUsuario")
    private String nombUsuario;

    @NotBlank(message = "Los apellidos no pueden estar vacío")
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
