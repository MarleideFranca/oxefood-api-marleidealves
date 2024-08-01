package br.com.ifpe.oxefood.modelo.ordemServico;

import java.time.LocalDate;
import org.hibernate.annotations.SQLRestriction;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OrdemServico")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrdemServico extends EntidadeAuditavel  {
  
    @Column
    private String numero;
 
    @Column
    private String pecasUtilizadas;
 
    @Column
    private String servicosEfetuados;

    @Column
    private LocalDate dataServico;
 
    @Column
    private String cliente;

    @Column
    private Double valorServico;
 

}



