package br.edu.infnet.fornecedores;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Fornecedor {

    //--------------------------------------------------------------------------
    @NotEmpty(message = "O campo Nome de Fantasia é obrigatório")
    @Size(min = 1, max = 20, message = "O campo Nome de Fantasia requer no máximo 20 caracteres")
    private String nomeFantasia;
    //--------------------------------------------------------------------------
    @NotEmpty(message = "O campo Razão Social é obrigatório")
    @Size(min = 1, max = 150, message = "O campo Razão Social requer no máximo 150 caracteres")
    private String razaoSocial;
    //--------------------------------------------------------------------------

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
