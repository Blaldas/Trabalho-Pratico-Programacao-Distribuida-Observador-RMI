package rmi_servidor_cliente;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Observer_RMI_class extends UnicastRemoteObject implements Observer_RMI_Interface {
    public Observer_RMI_class() throws RemoteException {
    }

    @Override
    public void notificacao(String description) {
        System.out.print(description+"\n");
    }


}
