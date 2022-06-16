package Presentacion;
import Clases.Cliente;
import Logica.LogClienteTxt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * @author Danilo Jaramillo
 * Fecha 15 de junio
 */
public class ArchivoTexto {
    static LogClienteTxt objLogClienteTxt = new LogClienteTxt();
    public static void main(String[] args) throws IOException {
        AgregarClienteTxt();
        ListarClientesTxt();
    }
    void menuArchivoTexto() throws IOException {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op < 4){
            System.out.println("Agregar       1");
            System.out.println("Eliminar      2");
            System.out.println("Listar        3");
            System.out.println("Salir         4");
            op = sc.nextInt();
            switch (op){
                case 1: AgregarClienteTxt(); break;
                case 2: EliminarClienteTxt(); break;
                case 3: ListarClientesTxt(); break;
            }
        }
    }
    private static void AgregarClienteTxt() throws IOException {
        LogClienteTxt objLogClienteTxt = new LogClienteTxt();
        Cliente objCliente = new Cliente();
        objCliente.setId(11);
        objCliente.setNombre("Nivardo");
        objCliente.setFecNac("15062022");
        if (objLogClienteTxt.ValidarId(objCliente)){
            System.out.println("Cliente Agregado");
        } else {
            System.out.printf("Codigo Cliente No Valido");
        }
    }
    private void EliminarClienteTxt() {
    }
    private static void ListarClientesTxt() throws FileNotFoundException {
        ArrayList<Cliente> ArrayClientes = objLogClienteTxt.ListarClientes();
        for (Cliente tmpCliente : ArrayClientes){
            System.out.println(tmpCliente.toString());
        }
    }
}
