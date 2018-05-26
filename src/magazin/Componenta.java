/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazin;
import DataBase.*;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author AndreiZanfir
 */

public class Componenta {
    private static Connection con;
    private static int contorComponenta;
    private int id;
    private String nume;

    public Componenta(){
        id = 0 ;
        nume=" ";
        try {
            con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
        } catch (SQLException ex) {
            Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Componenta(int id, String nume) {
        this.id = id;
        this.nume = nume;
        try {
            con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
        } catch (SQLException ex) {
            Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getCon() {
        return con;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    
    //citire din fisier
    public void readFromFile() {
        contorComponenta = 0;
        FileReader file = null;

       try {
            String sql_insert ;
            PreparedStatement pstm ;


            file = new FileReader ("componente.txt");
            Scanner sc = new Scanner( file );
            
            while(sc.hasNextLine())
            {
                contorComponenta++;
                sql_insert = "insert into componenta values (?,?)";
                con.setAutoCommit(false);
                pstm = con.prepareStatement(sql_insert);
                
                pstm.setInt(1 , contorComponenta );
                pstm.setString(2 , sc.nextLine());
                pstm.execute() ;
                con.commit();    
            }

       } catch (FileNotFoundException | SQLException ex) {
            Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
            try {
            file.close();
            } catch (IOException ex) {
                Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
            }
       }   
    }
    
    public int getLastId(){
        try {
            String sql =  "select max(id) from componenta";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
                
                return rs.getInt(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }
    //citire de la tasatura / gui aplicatie
    public void readFromKey(Componenta c){
        try {
            String sql_insert ;
            PreparedStatement pstm ;
           
            contorComponenta = getLastId();
            if(contorComponenta <= 0) 
                contorComponenta = 1 ;
            else
                contorComponenta++;
            
            sql_insert = "insert into componenta values (?,?)";
            con.setAutoCommit(false);
            pstm = con.prepareStatement(sql_insert);
           
            pstm.setInt(1 , contorComponenta  );
            pstm.setString(2 , c.nume );
            pstm.execute();
            con.commit(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    //iti returneaza id-ul unei anumite categori
    public int  getIdByName(String nume) {
        try {
            String sql= "select Id from componenta where Nume = ? ";
            con.setAutoCommit(false);
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1 , nume );
            ResultSet rs = pstm.executeQuery();
            
            if(rs.next())
                return rs.getInt(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
    
}
