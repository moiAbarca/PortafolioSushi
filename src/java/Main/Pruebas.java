/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clasesinterface.AccesoDao;
import CapaDTO.Acceso;
import CapaNegocio.OracleAcceso;
import CapaConexion.Conecta;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author moi
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws SQLException {
        
        //CLASE PARA HACER PRUEBAS
        
        //listar
     /*
        List<Acceso> acceso;
        AccesoDao dao = new OracleAcceso();      
        acceso = dao.obtenerAcceso();        
        
        System.out.println("El total del registro es: " + acceso.size());
        
        for(int i = 0; i< acceso.size(); i++)
        {
            System.out.println("Id Acceso : " + acceso.get(i).getAccesoId());
            System.out.println("Id Página : " + acceso.get(i).getPaginaId());
            System.out.println("Id Perfil : " + acceso.get(i).getPerfilId());
            System.out.println("-------------------");
        }
*/
        //temrino listar
        
        //insertar
 /*
        AccesoDao dao = new OracleAcceso();
        Acceso acceso = new Acceso();
        acceso.setAccesoId(45350);
        acceso.setPaginaId(1);
        acceso.setPerfilId(666);
        dao.agregarAcceso(acceso);
*/
        
        //Update
         /*
        AccesoDao dao = new OracleAcceso();
        Acceso acceso = new Acceso();
        acceso.setPerfilId(5);
        acceso.setPaginaId(1);
        acceso.setAccesoId(4);
        dao.modificarAcceso(acceso);
*/

        //eliminar
        /*
        AccesoDao dao = new OracleAcceso();
        dao.eliminarAcceso(4);
        */
        
        //Buscar por Id
        /*
        Integer Id = 1;
        List<Acceso> acceso;
        AccesoDao dao = new OracleAcceso();
        
        acceso = dao.buscarAcceso(2);        
        
        System.out.println("El total del registro es: " + acceso.size());
        
        for(int i = 0; i< acceso.size(); i++)
        {
            System.out.println("Id Acceso : " + acceso.get(i).getAccesoId());
            System.out.println("Id Página : " + acceso.get(i).getPaginaId());
            System.out.println("Id Perfil : " + acceso.get(i).getPerfilId());
            System.out.println("-------------------");
        }//fin buscar por Id
        */

    }
    
}
