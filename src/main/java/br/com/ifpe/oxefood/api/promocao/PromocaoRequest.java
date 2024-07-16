package br.com.ifpe.oxefood.api.promocao;

import java.time.LocalDate;

import br.com.ifpe.oxefood.modelo.promocao.Promocao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PromocaoRequest {

    private String titulo;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    private String regra;

    private String valorDesconto;

    public Promocao build() {

        return Promocao.builder()
                .titulo(titulo)
                .dataInicio(dataInicio)
                .dataFim(dataFim)
                .regra(regra)
                .valorDesconto(valorDesconto)

                .build();
    }

}
