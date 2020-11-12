/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tonyj
 */
public class Database {                                             
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://uis6crqqaj0urbniegbm:sngFTm7ezc0s8xF6edxu@bhhcbt2xq7y0jo6-mongodb.services.clever-cloud.com:27017/bhhcbt2xq7y0jo6"));
    DB database = (DB) mongoClient.getDB("bhhcbt2xq7y0jo6");
    DBCollection Clientes= database.getCollection("clientes");
    DBCollection Habitaciones= database.getCollection("habitaciones");
    DBCollection Alquiler= database.getCollection("alquiler");
    //clientes identificación, nombre, apellido, saldo, salario, tipoCliente.
    //alquiler identificación del cliente,número de habitación, cantidad de días y el total cancelado.
    
   public void Cliente(String id,String nom,String ap,String sald,String sala) {
        try {
            //Busca el Objeto segun su _id 
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            DBCursor cursor = Clientes.find(query);
            
            int tipo ; 
            int salario = Integer.parseInt(sala);
            if (salario>=1000000){
                tipo = 3;
            }else {
                if (salario>=500000 && salario<=999999) {
                    tipo = 2;
                }else{
                    tipo = 1;
                }
            }
            
            int v = cursor.count();// si es 1 existe en la base de datos
            if (v==1) {
                Clientes.remove(query);
            }
            
            //se crea el objeto a agregar
            DBObject tra = new BasicDBObject("_id",id)
            .append("nombre",nom)      
            .append("apellido",ap)
            .append("saldo",sald)
            .append("salario",sala)
            .append("tipo",""+tipo);
            
            Clientes.insert(tra);//*se agrega el objeto a la db
            
            if (v==1) {//valida si lo actualiza o lo agrega
              JOptionPane.showMessageDialog(null, "Actualizado");  
            }else{
                JOptionPane.showMessageDialog(null, "Agregado");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
   public boolean ValidarCliente(String id) {
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            DBCursor cursor = Clientes.find(query);//Busca lo datos en la db
            
            BasicDBObject query2 = new BasicDBObject();
            query2.put("id", id); // (1)
            query2.put("estado","1"); 
            DBCursor cursor2 = Alquiler.find(query2);
            if(cursor.count()==1){//retorna 1 si existe, 0 si no existe
                if (cursor2.count()!=1) {
                    return true;
                }else{
                JOptionPane.showMessageDialog(null, "Este ya posee habitacion");  
                 return false;
                }
                
            }else{
                return false;
            }
   }
   public boolean ValidarClienteAl(String id,JLabel total,JLabel hab) {
            
            try {
                BasicDBObject query = new BasicDBObject();
                query.put("id",id);  
                query.put("estado","1"); 
                DBCursor cursor = Alquiler.find(query);//Busca lo datos en la db
                DBCursor cur = Alquiler.find(query);//Busca lo datos en la db
                
                total.setText((String)cur.one().get("total"));
                hab.setText((String)cur.one().get("habitacion"));
                
                if(cursor.count()==1){//retorna 1 si existe, 0 si no existe
                    return true;
                }else{
                    return false;
                }
           
            } catch (Exception e) {
                return false;
            }
            
            
            
   }
     public String ObtenerPrecio(String id) {
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            DBCursor cursor = Habitaciones.find(query);//Busca lo datos en la db
            return (String)cursor.one().get("precio");
            
   }
    public void ActualizarEstado(String id,String estado) {
            BasicDBObject query = new BasicDBObject();
            query.put("_id", id); // (1)
            
            BasicDBObject newDocument = new BasicDBObject();
            newDocument.put("estado", estado);
            
            BasicDBObject updateObject = new BasicDBObject();
            updateObject.put("$set", newDocument); // (3)
            
            Habitaciones.update(query, updateObject); // (4)
            
   }
    public void ActualizarSaldo(String id, String saldo){
    
            BasicDBObject query = new BasicDBObject();
            query.put("_id", id);
            
            BasicDBObject newDocument = new BasicDBObject();
            newDocument.put("saldo", saldo);
            
            BasicDBObject updateObject = new BasicDBObject();
            updateObject.put("$set", newDocument); 
            
            Clientes.update(query, updateObject); 
    }
     
   public void DelCliente(String id) {
        try {
            //Busca el Objeto segun su _id 
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            Clientes.remove(query);
            JOptionPane.showMessageDialog(null, "Eliminado");  
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
    public void tabCliente(JTable tab){
        DBCursor cur = Clientes.find();//obtiene datos de la db 
        DefaultTableModel dt = (DefaultTableModel) tab.getModel();
        while (cur.hasNext()){//recore los datos
            Object[] fila = new Object[6];
            
            //se hace una distribucion de los datos
            String nom,id,apellido,saldo,salario;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            id=(String) datos.get("_id");
            nom=(String) datos.get("nombre");
            apellido=(String) datos.get("apellido");
            saldo=(String) datos.get("saldo");
            salario=(String) datos.get("salario");
            fila[0]=id;
            fila[1]=nom;
            fila[2]= apellido;
            fila[3]= saldo;
            fila[4]= salario;
            dt.addRow(fila);// se agregan a las filas de la tabla
        }
        tab.setModel(dt);//se agregan  a la trabla
        tab.setRowHeight(64);// damaño de separacion de la tabla
    }
     public void EscribirClienteBusqueda(JTable tabla, String bus) {//escribe los clientes a buscar en la tabla
        DBCursor cur = Clientes.find();//obitne datos de la db
        Object[] list = new Object[6];
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (cur.hasNext()){//
            int pas = 0;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            list[0]=(String) datos.get("_id");
            list[1] =(String) datos.get("nombre");
            list[2] =(String) datos.get("apellido");
            list[3] =(String) datos.get("saldo");
            list[4] =(String) datos.get("salario");
            String pal = list[0].toString();
            int largo2 = pal.length();//largo de del _id
            int largo = bus.length();//largo del _id a buscar
            if (largo <= largo2) {//si es menor o igual los compara
                for (int i = 0; i < largo; i++) {//recorre letra por letra
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {//si las letras son iguales suma puntos
                        pas++;
                    }
                }
            }
            if (pas == largo) {//si los puntos es igual al largo se agrega a la tabla
                modelo.addRow(list);
                tabla.setModel(modelo);
            }
        }
    }
     //habitaciones numeroHabitacion, tipoHabitacion, numeroCamas, cantEspacios,precio, estado.
   
    public void Habitacion(String id,String tipoH,String camas,String espacios,String estado) {
        try {
            //Busca el Objeto segun su _id 
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            DBCursor cursor = Habitaciones.find(query);
            
            int precio ; 
            if (tipoH.equals("A")){
                precio = 35000;
            }else {
                if (tipoH.equals("B")) {
                    precio = 25000;
                }else{
                    precio = 15000;
                }
            }
            
            int v = cursor.count();// si es 1 existe en la base de datos
            if (v==1) {
                Habitaciones.remove(query);
            }
            
            //se crea el objeto a agregar
            DBObject tra = new BasicDBObject("_id",id)
            .append("tipo",tipoH)      
            .append("camas",camas)
            .append("espacios",espacios)
            .append("estado",estado)
            .append("precio",""+precio);
            
            Habitaciones.insert(tra);//*se agrega el objeto a la db
            
            if (v==1) {//valida si lo actualiza o lo agrega
              JOptionPane.showMessageDialog(null, "Actualizado");  
            }else{
                JOptionPane.showMessageDialog(null, "Agregado");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
    public void EscribirHabitacionBusqueda(JTable tabla, String bus) {//escribe los clientes a buscar en la tabla
        DBCursor cur = Habitaciones.find();//obitne datos de la db
        Object[] list = new Object[6];
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (cur.hasNext()){//
            int pas = 0;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            list[0]=(String) datos.get("_id");
            list[1] =(String) datos.get("tipo");
            list[2] =(String) datos.get("camas");
            list[3] =(String) datos.get("espacios");
            list[4] =(String) datos.get("estado");
            list[5] =(String) datos.get("precio");
            String pal = list[0].toString();
            int largo2 = pal.length();//largo de del _id
            int largo = bus.length();//largo del _id a buscar
            if (largo <= largo2) {//si es menor o igual los compara
                for (int i = 0; i < largo; i++) {//recorre letra por letra
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {//si las letras son iguales suma puntos
                        pas++;
                    }
                }
            }
            if (pas == largo) {//si los puntos es igual al largo se agrega a la tabla
                modelo.addRow(list);
                tabla.setModel(modelo);
            }
        }
    }
   public void DelHabitacion(String id) {
        try {
            //Busca el Objeto segun su _id 
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            Habitaciones.remove(query);
            JOptionPane.showMessageDialog(null, "Eliminado");  
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
    public void tabHabitacion(JTable tab, String tip){
        BasicDBObject query = new BasicDBObject();
        if(!tip.equals("Todos")){
             query.put("estado",tip);
        }
        DBCursor cur = Habitaciones.find(query);//obtiene datos de la db 
        
        DefaultTableModel dt = (DefaultTableModel) tab.getModel();
        while (cur.hasNext()){//recore los datos
            Object[] fila = new Object[6];
            
            //se hace una distribucion de los datos
            String tipo,id,camas,espacios,estado;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            id=(String) datos.get("_id");
            tipo=(String) datos.get("tipo");
            camas=(String) datos.get("camas");
            espacios=(String) datos.get("espacios");
            estado=(String) datos.get("estado");
            fila[0]=id;
            fila[1]=tipo;
            fila[2]= camas;
            fila[3]= espacios;
            fila[4]= estado;
            dt.addRow(fila);// se agregan a las filas de la tabla
        }
        tab.setModel(dt);//se agregan  a la trabla
        tab.setRowHeight(64);// damaño de separacion de la tabla
        } 
     public void Alquilar(String id,String hab,String dias,String total) {
        try {
            //Busca el Objeto segun su _id 
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            DBCursor cursor = Clientes.find(query);
            
            //se crea el objeto a agregar
            DBObject tra = new BasicDBObject("id",id)
            .append("habitacion",hab)      
            .append("dias",dias)
            .append("total",total)
            .append("estado","1");
            
            Alquiler.insert(tra);//*se agrega el objeto a la db
            
                JOptionPane.showMessageDialog(null, "Agregado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
    public void pagar(String id,String total,String hab) {
            //
            String saldo;
            int t;
            
            
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            DBCursor cursor = Clientes.find(query);//Busca lo datos en la db
            saldo=(String)cursor.one().get("saldo");
            t = Integer.parseInt(saldo)-Integer.parseInt(total);
            
            
            actSaldo(id,t);
            ActualizarEstado(hab,"Disponible");
            actEs(id);
            JOptionPane.showMessageDialog(null, "Listo");
            
   }
    
    
   private void actEs(String id){
       BasicDBObject query = new BasicDBObject();
            query.put("id", id); // (1)
            query.put("estado","1"); 
            
            BasicDBObject newDocument = new BasicDBObject();
            newDocument.put("estado", "0");
            
            BasicDBObject updateObject = new BasicDBObject();
            updateObject.put("$set", newDocument); // (3)
            
            Alquiler.update(query, updateObject); // (4)
   }
   private void actSaldo(String id,int sa){
       BasicDBObject query = new BasicDBObject();
            query.put("_id", id); // (1)
            
            BasicDBObject newDocument = new BasicDBObject();
            newDocument.put("saldo", ""+sa );
            
            BasicDBObject updateObject = new BasicDBObject();
            updateObject.put("$set", newDocument); // (3)
            
            Clientes.update(query, updateObject); // (4)
   }
   
    public static void main(String[] args) {
        Database ok = new Database();
        //ok.Cliente("5","6","7","8","9");
        //ok.DelCliente("2");
        midi ven = new midi();
        ven.setVisible(true);
    }
    
}
