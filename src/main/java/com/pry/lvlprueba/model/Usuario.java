package com.pry.lvlprueba.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario", uniqueConstraints = {@UniqueConstraint(columnNames = "correo_usua")})
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")

    private Integer idUsuario;

    @Column (name = "nomb_usua", length = 100, nullable = false)
    private String nombUsuario;

    @Column (name = "ape_usua", length = 100, nullable = false)
    private String apeUsuario;

    @Column (name = "carg_emp_usua", length = 100)
    private String cargEmp;

    @Column (name = "nomb_emp_usua", length = 100)
    private String nombEmp;

    @Column(name = "telf_usua")
    private String telfUsua;

    @Column (name = "correo_usua", length = 100)
    private String correoUsua;

    @Column(name = "pass_usua")
    private String password;

    public String getApeUsuario() {
        return apeUsuario;
    }

    public String getNombUsuario() {
        return nombUsuario;
    }

    public String getCargEmp() {
        return cargEmp;
    }

    public String getNombEmp() {
        return nombEmp;
    }

    public String getTelfUsua() {
        return telfUsua;
    }

    public String getCorreoUsua() {
        return correoUsua;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorreoUsua(String correoUsua) {
        this.correoUsua = correoUsua;
    }

    public void setTelfUsua(String telfUsua) {
        this.telfUsua = telfUsua;
    }

    public void setNombEmp(String nombEmp) {
        this.nombEmp = nombEmp;
    }

    public void setCargEmp(String cargEmp) {
        this.cargEmp = cargEmp;
    }

    public void setApeUsuario(String apeUsuario) {
        this.apeUsuario = apeUsuario;
    }

    public void setNombUsuario(String nombUsuario) {
        this.nombUsuario = nombUsuario;
    }

    private static final long serialVersionUID = 1L;
}
