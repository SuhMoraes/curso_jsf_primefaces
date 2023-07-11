package model;

import jakarta.persistence.*;
import sun.util.resources.Bundles;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name= "ramo_atividade")
public class RamoAtividade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RamoAtividade)) return false;

        RamoAtividade that = (RamoAtividade) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        return getDescricao() != null ? getDescricao().equals(that.getDescricao()) : that.getDescricao() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getDescricao() != null ? getDescricao().hashCode() : 0);
        return result;
    }
}