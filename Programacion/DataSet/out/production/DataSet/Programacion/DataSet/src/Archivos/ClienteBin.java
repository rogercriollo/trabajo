package Archivos;
import Clases.Cliente;


import java.io.*;
import java.util.ArrayList;

/**
 * 16/04/2021
 * @author djaramillo
 */
public class ClienteBin {
    File fichero =new File("/home/rogercriollo/Documentos/Programacion/Cliente.dat");
    public boolean GrabarClienteBin(Cliente cliente) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Cliente> ArrayClientes = ImportarClienteBin();

        FileOutputStream outputStream = new FileOutputStream(fichero, false);
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.flush();

        ArrayClientes.add(cliente);

        oos.writeObject(ArrayClientes);

        outputStream.close();
        oos.close();  // Se cierra al terminar.
        return true;
    }

    public ArrayList<Cliente> ImportarClienteBin() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream input = new FileInputStream(fichero);
        ObjectInputStream ois = new ObjectInputStream(input);

        ArrayList<Cliente> ArrayClientes  = (ArrayList<Cliente>) ois.readObject();


        ois.close();
        input.close();

        return ArrayClientes;
    }



    public boolean AgregarClientes(ArrayList<Cliente> arrayClientes) {
            return false;
    }
}
