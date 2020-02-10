package ifma.lpweb2.Lab06.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String categoria;

    private int quantidade;
    
    private String descricao;

    public Integer getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
		return descricao;
	}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
}
