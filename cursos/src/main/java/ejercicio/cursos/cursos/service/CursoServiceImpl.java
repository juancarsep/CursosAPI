package ejercicio.cursos.cursos.service;

import ejercicio.cursos.cursos.model.Curso;
import ejercicio.cursos.cursos.model.Tema;
import ejercicio.cursos.cursos.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService{

    @Autowired
    ICursoRepository repoCurso;

    @Override
    public Curso getCurso(Long id) {
        return repoCurso.findById(id).orElse(null);
    }

    @Override
    public List<Curso> getAllCursos() {
        return repoCurso.findAll();
    }

    @Override
    public void saveCurso(Curso curso) {
        repoCurso.save(curso);
    }

    @Override
    public Curso editCurso(Long id, String nuevoNombre, String nuevaModalidad, List<Tema> nuevaListaTemas) {
        Curso curso = repoCurso.findById(id).orElse(null);
        if(curso != null){
            curso.setNombre(nuevoNombre);
            curso.setModalidad(nuevaModalidad);
            curso.setListaDeTemas(nuevaListaTemas);
            repoCurso.save(curso);
        }

        return curso;
    }

    @Override
    public void deleteCurso(Long id) {
        repoCurso.deleteById(id);
    }



}
