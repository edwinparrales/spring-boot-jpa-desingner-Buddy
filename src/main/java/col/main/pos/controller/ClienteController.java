package col.main.pos.controller;

import col.main.pos.dto.ClienteDto;
import col.main.pos.entities.Cliente;
import col.main.pos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/cliente")
public class ClienteController {
    @Autowired
    private ClienteService cs;
    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listar(){
        return new ResponseEntity<>(cs.listarTodos(), HttpStatus.OK);
    }

    @GetMapping("/listar/nombre/{nombre}")
    public ResponseEntity<List<Cliente>> listarNombre(@PathVariable(name = "nombre") String nombre){
        return new ResponseEntity<>(cs.listarNombre(nombre), HttpStatus.OK);
    }

    @GetMapping("/listar/documento/{documento}")
    public ResponseEntity<List<Cliente>> listarDocumento(@PathVariable(name = "documento") String numDocumento){
        return new ResponseEntity<>(cs.listarDocumento(numDocumento), HttpStatus.OK);
    }

/*    @GetMapping("/listar/dto")
    public ResponseEntity<List<ClienteDto>> listarDto(){
        return new ResponseEntity<>(cs.listarClienteDto(), HttpStatus.OK);
    }*/
    @PostMapping("/guardar")
    public ResponseEntity<Cliente> guardar(@RequestBody Cliente cliene){
        return new ResponseEntity<>(cs.crearRegistro(cliene),HttpStatus.CREATED);
    }

}
