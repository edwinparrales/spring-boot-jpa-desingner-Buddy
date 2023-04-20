package col.main.pos.service;

import col.main.pos.dto.ClienteDto;
import col.main.pos.entities.Cliente;
import col.main.pos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository cr;

    public List<Cliente> listarTodos(){
        return cr.findAll();
    }

    public List<Cliente> listarNombre(String nombre){
        return cr.findClienteByNombreIsLikeIgnoreCase("%"+nombre+"%");

    }
    public List<Cliente> listarDocumento(String numDocumento){
        return cr.findClienteByNumeroDocumento(numDocumento);

    }

    public Cliente crearRegistro(Cliente cl){
        return cr.save(cl);
    }

    public void eliminar(Integer id){
        Long cantidad =  0L;
        cantidad = contarCliente(id);
        if(cantidad>0){
            cr.deleteById(id);
        }



    }

    public Long contarCliente(Integer id){
        return cr.countClienteById(id);
    }

    public Cliente actualizar(Cliente cliente){
        return cr.save(cliente);
    }
 /*   public ClienteDto listarClienteDto(){

        return (ClienteDto) cr.findAll();
    }*/
}
