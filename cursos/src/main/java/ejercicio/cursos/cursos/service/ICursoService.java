package ejercicio.cursos.cursos.service;

import ejercicio.cursos.cursos.model.Curso;
import ejercicio.cursos.cursos.model.Tema;

import java.util.List;

public interface ICursoService {
    public Curso getCurso(Long id);
    public List<Curso> getAllCursos();
    public void saveCurso(Curso curso);
    public Curso editCurso(Long id, String nuevoNombre, String nuevaModalidad, List<Tema> nuevaListaTemas);
    public void deleteCurso(Long id);

}
