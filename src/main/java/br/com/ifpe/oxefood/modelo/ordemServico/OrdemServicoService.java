package br.com.ifpe.oxefood.modelo.ordemServico;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
public class OrdemServicoService {

    @Autowired
    private  OrdemServicoRepository repository;

    @Transactional
    public  OrdemServico save( OrdemServico  ordemServico) {

        ordemServico.setHabilitado(Boolean.TRUE);
        ordemServico.setVersao(1L);
        ordemServico.setDataCriacao(LocalDate.now());
        return repository.save(ordemServico);
    }

    public List<OrdemServico> listarTodos() {

        return repository.findAll();
    }

    public OrdemServico obterPorID(Long id) {

        return repository.findById(id).get();
    }

    @Transactional
    public void update(Long id, OrdemServico ordemServicoAlterado) {

        OrdemServico ordemServico = repository.findById(id).get();
        ordemServico.setNumero(ordemServicoAlterado.getNumero());
        ordemServico.setDataServico(ordemServicoAlterado.getDataServico());
        ordemServico.setPecasUtilizadas(ordemServicoAlterado.getPecasUtilizadas());
        ordemServico.setServicosEfetuados(ordemServicoAlterado.getServicosEfetuados());
        ordemServico.setCliente(ordemServicoAlterado.getCliente());

        ordemServico.setVersao(ordemServico.getVersao() + 1);
        repository.save(ordemServico);
    }

    @Transactional
    public void delete(Long id) {

        OrdemServico ordemServico = repository.findById(id).get();
        ordemServico.setHabilitado(Boolean.FALSE);
        ordemServico.setVersao(ordemServico.getVersao() + 1);

        repository.save(ordemServico);
    }

}
