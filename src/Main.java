import rmi_servidor_cliente.Observer_RMI_Interface;
import rmi_servidor_cliente.Observer_RMI_class;
import rmi_servidor_cliente.Server_RMI_Interface;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    static Observer_RMI_Interface observer;
    public static void main(String[] args) {
        try{

            //Cria e lanca o servico
            observer = new Observer_RMI_class();

            //Localiza o servico remoto
            Remote remote = Naming.lookup("rmi//127.0.0.1:1099/ServidorRede");
            Server_RMI_Interface getRemoteServidor =(Server_RMI_Interface) remote;

            //adiciona observador no servico remoto
            getRemoteServidor.addObserver(observer);

            System.out.println("<Enter> para terminar...");
            System.out.println();
            System.in.read();

            getRemoteServidor.removeObserver(observer);

        }catch(RemoteException e){
            System.out.println("Erro remoto - " + e);
            System.exit(1);
        }catch(IOException | NotBoundException e){
            System.out.println("Erro - " + e);
            System.exit(1);
        }
    }
}
