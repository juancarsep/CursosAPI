package ejercicio.cursos.cursos.controller;

import ejercicio.cursos.cursos.model.Tema;
import ejercicio.cursos.cursos.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    @Autowired
    ITemaService temaServ;

    @GetMapping("/temas/traer")
    public List<Tema> traerTemas(){
        return temaServ.getAllTemas();
    }

    @GetMapping("/temas/traer/{id}")
    public Tema traerTema(@PathVariable Long id){
        return temaServ.getTema(id);
    }

    @PostMapping("/temas/crear")
    public String crearTema(@RequestBody Tema tema){
        temaServ.saveTema(tema);

        return "Tema creado exitosamente";
    }

    @PutMapping("/temas/editar/{id}")
    public Tema editarTema(@PathVariable Long id,
                           @RequestParam(required = false, name = "nombre")String nuevoNombre,
                           @RequestParam(required = false, name = "descripcion")String nuevaDesc){
        temaServ.editTema(id, nuevoNombre, nuevaDesc);
        return temaServ.getTema(id);
    }

    @DeleteMapping("/temas/eliminar/{id}")
    public String eliminarTema(@PathVariable Long id){
        temaServ.deleteTema(id);
        return "Tema eliminado exitosamente";
    }
}
