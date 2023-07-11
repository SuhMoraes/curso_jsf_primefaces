package model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="empresa")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="nome_empresa")
    private String nomeFantasia;


    @Column(name = "razaoSocial")
    private String razaoSocial;

    private String Cnpj;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="data_fundacao")
    private Date dataFundacao;

    @ManyToOne
    @JoinColumn(name = "ramo_atividade_id")
    private RamoAtividade ramoAtividade;

    @Enumerated(EnumType.STRING)
    private TipoEmpresa tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public RamoAtividade getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(RamoAtividade ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa)) return false;

        Empresa empresa = (Empresa) o;

        if (!getId().equals(empresa.getId())) return false;
        if (getNomeFantasia() != null ? !getNomeFantasia().equals(empresa.getNomeFantasia()) : empresa.getNomeFantasia() != null)
            return false;
        if (getRazaoSocial() != null ? !getRazaoSocial().equals(empresa.getRazaoSocial()) : empresa.getRazaoSocial() != null)
            return false;
        if (getCnpj() != null ? !getCnpj().equals(empresa.getCnpj()) : empresa.getCnpj() != null) return false;
        if (getDataFundacao() != null ? !getDataFundacao().equals(empresa.getDataFundacao()) : empresa.getDataFundacao() != null)
            return false;
        return getRamoAtividade() != null ? getRamoAtividade().equals(empresa.getRamoAtividade()) : empresa.getRamoAtividade() == null;
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
