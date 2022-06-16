package Archivos;
import Clases.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author  Danilo Jaramillo
 * Fecha 15 de junio
 */
public class ClienteTxt {
    File f = new File("/home/rogercriollo/Documentos/Programacion/Cliente.txt");

    public boolean  AgregarCliente(Cliente objCliente) throws IOException {

        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(objCliente.getId()  +",");
        bw.append(objCliente.getNombre()+",");
        bw.append(objCliente.getFecNac() + "\n");

        bw.close();
        fw.close();

        return true;
    }
    public ArrayList<Cliente>  LeerCliente() throws FileNotFoundException {
        ArrayList<Cliente> ArrayClientes = new ArrayList<>();
        StringTokenizer st;
        Scanner entrada = new Scanner(System.in);
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                    Cliente Objtmp = new Cliente(Integer.valueOf(st.nextToken()), st.nextToken(), st.nextToken());
                    ArrayClientes.add(Objtmp);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes;
    }
    public void LeerClienteTxt(){

    }
}
