package ejercicio.cursos.cursos.controller;

import ejercicio.cursos.cursos.model.Curso;
import ejercicio.cursos.cursos.model.Tema;
import ejercicio.cursos.cursos.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    ICursoService cursoServ;

    @GetMapping("cursos/traer")
    public List<Curso> traerCursos(){
        return cursoServ.getAllCursos();
    }

    @GetMapping("/cursos/traer/{id}")
    public Curso traerCurso(@PathVariable Long id){
        return cursoServ.getCurso(id);
    }

    @PostMapping("/cursos/crear")
    public String crearcurso(@RequestBody Curso curso){
        cursoServ.saveCurso(curso);
        return "Curso creado exitosamente";
    }

    @PutMapping("/cursos/editar/{id}")
    public Curso editarCurso(@PathVariable Long id,
                             @RequestParam(required = false, name = "nombre") String nuevoNombre,
                             @RequestParam(required = false, name = "modalidad") String nuevaModalidad,
                             @RequestBody List<Tema> temas){
        cursoServ.editCurso(id, nuevoNombre,nuevaModalidad,temas);

        return cursoServ.getCurso(id);

    }

    @DeleteMapping("/cursos/borrar/{id}")
    public String borrarCurso(@PathVariable Long id){
        cursoServ.deleteCurso(id);
        return "Curso borrado exitosamente";
    }

    @GetMapping("cursos/traertemas/{id}")
    public List<Tema> temasDelCurso(@PathVariable Long id){
        Curso curso = cursoServ.getCurso(id);
        List<Tema> temas = curso.getListaDeTemas();

        return temas;
    }
}
