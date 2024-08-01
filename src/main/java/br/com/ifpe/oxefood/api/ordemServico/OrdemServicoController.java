package br.com.ifpe.oxefood.api.ordemServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import br.com.ifpe.oxefood.modelo.ordemServico.OrdemServico;
import br.com.ifpe.oxefood.modelo.ordemServico.OrdemServicoService;

//ordemServico
//OrdemServico

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/api/ordemServico")
@CrossOrigin

public class OrdemServicoController {

    /*
     * @return
     */

    @Autowired
    private OrdemServicoService ordemServicoService;

    @Operation(
        summary = "Serviço responsável por incluir uma ordem de serviço no sistema.",
        description = "Exemplo de descrição de um endpoint responsável por inserir uma ordem de serviço no sistema."
    )

    @PostMapping
    public ResponseEntity<OrdemServico> save(@RequestBody OrdemServicoRequest request) {

        OrdemServico ordemServico = ordemServicoService.save(request.build());
        return new ResponseEntity<OrdemServico>(ordemServico, HttpStatus.CREATED);
    }

    @Operation(
        summary = "Serviço responsável por listar uma ordem de serviço no sistema.",
        description = "Exemplo de descrição de um endpoint responsável por listar uma ordem de serviço no sistema."
    )
    
  
    @GetMapping
    public List<OrdemServico> listarTodos() {
        return ordemServicoService.listarTodos();
    }

    @GetMapping("/{id}")
    public OrdemServico obterPorID(@PathVariable Long id) {
        return ordemServicoService.obterPorID(id);
    }

    @Operation(
        summary = "Serviço responsável por alterar uma ordem de serviço no sistema.",
        description = "Exemplo de descrição de um endpoint responsável por alterar uma ordem de serviço no sistema."
    )

    @PutMapping("/{id}")
    public ResponseEntity<OrdemServico> update(@PathVariable("id") Long id, @RequestBody OrdemServicoRequest request) {

        ordemServicoService.update(id, request.build());
        return ResponseEntity.ok().build();
    }

    @Operation(
        summary = "Serviço responsável por deletar uma ordem de serviço no sistema.",
        description = "Exemplo de descrição de um endpoint responsável por deletar uma ordem de serviço no sistema."
    )

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        ordemServicoService.delete(id);
        return ResponseEntity.ok().build();
    }

}
