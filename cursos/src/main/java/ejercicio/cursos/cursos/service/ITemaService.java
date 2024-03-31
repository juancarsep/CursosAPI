package ejercicio.cursos.cursos.service;

import ejercicio.cursos.cursos.model.Tema;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITemaService {
    public void saveTema(Tema tema);
    public Tema getTema(Long id);
    public List<Tema> getAllTemas();
    public void editTema(Long id, String nuevoNombre, String nuevaDescrip);
    public void deleteTema(Long id);
}
