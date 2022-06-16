package Logica;
import Archivos.ClienteBin;
import Clases.Cliente;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author   Danilo Jaramillo
 * Fecha 15 de junio
 */
public class LogClienteBin {
    ClienteBin objClienteBin = new ClienteBin();
    public boolean ValidarId(Cliente objCliente) throws IOException, ClassNotFoundException {
        ArrayList<Cliente> ArrayClientes = ListarClientes();
        // Valida si el codigo es correcto
        if (objCliente.getId() > 0){
            // Agregar al archivo texto
            ArrayClientes.add(objCliente);
            return objClienteBin.GrabarClienteBin(objCliente);
        }
        return false;
    }
    public ArrayList<Cliente> ListarClientes() throws IOException, ClassNotFoundException {
       return objClienteBin.ImportarClienteBin();
    }
}
