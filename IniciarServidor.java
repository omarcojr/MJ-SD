package servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class IniciarServidor {
    public static void main(String[] args) {
         try {

            System.out.println("Iniciando Servidor");
            LocateRegistry.createRegistry(1099);

            Produto objetoProduto = new Produto();
            Naming.rebind("rmi://localhost:1099/produto", (Remote) objetoProduto);

        } catch (RemoteException re) {
            System.out.println("Erro remoto: " + re.toString());
        } catch (MalformedURLException e) {
            System.out.println("Erro local: " + e.toString());
        }
    }

}
    

