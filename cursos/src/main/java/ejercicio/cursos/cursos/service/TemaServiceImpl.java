package ejercicio.cursos.cursos.service;

import ejercicio.cursos.cursos.model.Tema;
import ejercicio.cursos.cursos.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaServiceImpl implements ITemaService{

    @Autowired
    ITemaRepository temaRepo;

    @Override
    public void saveTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public Tema getTema(Long id) {
        return temaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Tema> getAllTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void editTema(Long id, String nuevoNombre, String nuevaDescrip) {
        Tema tema = this.getTema(id);
        tema.setNombre(nuevoNombre);
        tema.setDescripcion(nuevaDescrip);
        temaRepo.save(tema);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepo.deleteById(id);
    }
}
