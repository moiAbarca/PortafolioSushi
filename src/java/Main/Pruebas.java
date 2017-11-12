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
import CapaDTO.Cliente;
import CapaNegocio.OracleCliente;
import Clasesinterface.ClienteDao;
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
     
        List<Cliente> acceso;
        ClienteDao dao = new OracleCliente();      
        acceso = dao.obtenerCliente();        
        
        System.out.println("El total del registro es: " + acceso.size());
        
        for(int i = 0; i< acceso.size(); i++)
        {
            System.out.println("USUARIO_ID : " + acceso.get(i).getUsuarioId());
            System.out.println("COMUNA_ID : " + acceso.get(i).getComuna());
            System.out.println("RUT : " + acceso.get(i).getRut());
            System.out.println("NOMBRE : " + acceso.get(i).getNombre());
            System.out.println("APELLIDO : " + acceso.get(i).getApellido());
            System.out.println("DIRECCION : " + acceso.get(i).getDireccion());
            System.out.println("FECHA_NACIMIENTO : " + acceso.get(i).getFechaNacimiento());
            System.out.println("SEXO : " + acceso.get(i).getSexo());
            System.out.println("EMAIL : " + acceso.get(i).getEmail());
            System.out.println("TELEFONO : " + acceso.get(i).getTelefono());            
            System.out.println("-------------------");
        }

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
        List<Cliente> acceso;
        ClienteDao dao = new OracleCliente();
        
        acceso = dao.buscarCliente(2);        
        
        System.out.println("El total del registro es: " + acceso.size());
        
        for(int i = 0; i< acceso.size(); i++)
        {
            System.out.println("USUARIO_ID : " + acceso.get(i).getUsuarioId());
            System.out.println("COMUNA_ID : " + acceso.get(i).getComunaId());
            System.out.println("RUT : " + acceso.get(i).getRut());
            System.out.println("NOMBRE : " + acceso.get(i).getNombre());
            System.out.println("APELLIDO : " + acceso.get(i).getApellido());
            System.out.println("DIRECCION : " + acceso.get(i).getDireccion());
            System.out.println("FECHA_NACIMIENTO : " + acceso.get(i).getFechaNacimiento());
            System.out.println("SEXO : " + acceso.get(i).getSexo());
            System.out.println("EMAIL : " + acceso.get(i).getEmail());
            System.out.println("TELEFONO : " + acceso.get(i).getTelefono());            
            System.out.println("-------------------");
        }//fin buscar por Id/*
        
        /*
        CLIENTE_ID ,
            USUARIO_ID ,
            COMUNA_ID ,
            RUT ,
            NOMBRE ,
            APELLIDO ,
            DIRECCION ,
            FECHA_NACIMIENTO ,
            SEXO ,
            EMAIL ,
            TELEFONO 
        */

    }
    
}
