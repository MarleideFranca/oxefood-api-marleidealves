package br.com.ifpe.oxefood.api.ordemServico;
   
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.ordemServico.OrdemServico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class OrdemServicoRequest {

   private String numero;
   
   private String pecasUtilizadas;

   private String servicosEfetuados;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataServico;

   private String cliente;

   private Double valorServico;

   public OrdemServico build() {

       return OrdemServico.builder()
           .numero(numero)
           .pecasUtilizadas(pecasUtilizadas)
           .servicosEfetuados(servicosEfetuados)
           .dataServico(dataServico)
           .cliente(cliente)
           .valorServico(valorServico)
           .build();
   }

}

