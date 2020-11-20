package br.edu.infnet.contatos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Contato {

    private Integer id;
    @NotEmpty(message = "O campo Nome é obrigatório")
    @Size(min = 1, max = 100, message = "O campo Nome pode ter no máximo 100 caracteres")
    private String nome;
    @NotEmpty(message = "O campo Email é obrigatório")
    @Size(min = 1, max = 150, message = "O campo Email pode ter no máximo 50 caracteres")
    private String email;
    @NotEmpty(message = "O campo Telefone é obrigatório")
    @Size(min = 1, max = 150, message = "O campo Telefone pode ter no máximo 50 caracteres")    
    private String fone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    
}
