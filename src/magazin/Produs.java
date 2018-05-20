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
public class Produs {
    private static int contorProdus;
    private int codProdus;
    private String producator;
    private String model;
    private double pretProdus;
    private int anFabricatie;
    private String garantie;
    private String taraProvenienta;
    private int stoc;
    private int tip;

    public int getCodProdus() {
        return codProdus;
    }

    public void setCodProdus(int codProdus) {
        this.codProdus = codProdus;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(double pretProdus) {
        this.pretProdus = pretProdus;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getGarantie() {
        return garantie;
    }

    public void setGarantie(String garantie) {
        this.garantie = garantie;
    }

    public String getTaraProvenienta() {
        return taraProvenienta;
    }

    public void setTaraProvenienta(String taraProvenienta) {
        this.taraProvenienta = taraProvenienta;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
    
    public Produs() {
        this.codProdus = 0 ;
        this.producator = " ";
        this.model = " ";
        this.pretProdus = 0;
        this.anFabricatie = 0;
        this.garantie = " ";
        this.taraProvenienta = " ";
        this.stoc = 0;
        this.tip = 0;
    }
    
    public Produs(int codProdus, String producator, String model, double pretProdus, int anFabricatie, String garantie, String taraProvenienta, int stoc, int tip) {
        this.codProdus = codProdus;
        this.producator = producator;
        this.model = model;
        this.pretProdus = pretProdus;
        this.anFabricatie = anFabricatie;
        this.garantie = garantie;
        this.taraProvenienta = taraProvenienta;
        this.stoc = stoc;
        this.tip = tip;
    }
    
    public void readFromFile(){
        contorProdus = 0;
        FileReader file = null;

       try {
            Connection con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
            String sql ;
            PreparedStatement pstm ;

            file = new FileReader ("Produse.txt");
            Scanner sc = new Scanner( file );
            
            while(sc.hasNextLine())
            {
                contorProdus++;
                sql = "insert into produs values (?,?,?,?,?,?,?,?,?)";
                con.setAutoCommit(false);
                pstm = con.prepareStatement(sql);
                
                pstm.setInt(1 , contorProdus );
                pstm.setString(2 , sc.next());
                pstm.setString(3 , sc.next());
                pstm.setDouble(4 , sc.nextDouble());
                pstm.setInt(5 , sc.nextInt());
                pstm.setString(6 , sc.nextInt() + " " + sc.next());
                pstm.setString(7 , sc.next());
                pstm.setInt(8 , sc.nextInt());
                pstm.setInt(9 , sc.nextInt());
                
                pstm.execute();
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
            Connection con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
            String sql =  "select max(codprodus) from produs";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
                
                return rs.getInt(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }
    
    public void readFromKey(Produs p){
        try {
            Connection con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
            String sql ;
            PreparedStatement pstm ;
           
            contorProdus = getLastId();
            if(contorProdus <= 0) 
                contorProdus = 1 ;
            else
                contorProdus++;
            
            sql = "insert into produs values (?,?,?,?,?,?,?,?,?)";
            con.setAutoCommit(false);
            pstm = con.prepareStatement(sql);

            pstm.setInt(1 , 4 );
            pstm.setString(2 , p.producator );
            pstm.setString(3 , p.model);
            pstm.setDouble(4 , p.pretProdus);
            pstm.setInt(5 , p.anFabricatie);
            pstm.setString(6 , p.garantie );
            pstm.setString(7 , p.taraProvenienta );
            pstm.setInt(8 , p.stoc );
            pstm.setInt(9 , p.tip );
            pstm.execute();
            con.commit(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(Componenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void sellProdus(int cod){
        try {
            int stoc ;
            Connection con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
            PreparedStatement pstm;
            String sql_1= "select stoc from produs where codprodus = ? ";
            con.setAutoCommit(false);
            pstm = con.prepareStatement(sql_1);
            
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            con.commit();
            
            if(rs.next()){
                stoc = rs.getInt(1);
                stoc -= 1;
                String sql_2 = "update produs set `stoc` = ? where codprodus = ? ";
                pstm = con.prepareStatement(sql_2);
            
                pstm.setInt(1, stoc);
                pstm.setInt(2, cod);
                int resultUpdate = pstm.executeUpdate();
                con.commit();
                
                if (resultUpdate > 0)
                    System.out.println("Successfully Updated");
                else
                    System.out.println("Update Failed");    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Produs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteProdus(int cod){
        try {
            Connection con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
            String sql ;
            PreparedStatement pstm ;
            sql = "delete from produs  where codprodus = ? ";
            con.setAutoCommit(false);
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, cod);
            int resultDelete = pstm.executeUpdate();
            con.commit();
            
            if (resultDelete > 0)
                System.out.println("Successfully Deleted");
            else
                System.out.println("Delete Failed");  
            
        } catch (SQLException ex) {
            Logger.getLogger(Produs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void incarcareStoc(int cod){
        try {
            Connection con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
            PreparedStatement pstm;
            String sql = "update produs set `stoc` = ? where codprodus = ? ";
            con.setAutoCommit(false);
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, 10);
            pstm.setInt(2, cod);
            int resultUpdate = pstm.executeUpdate();
            con.commit();
            
            if (resultUpdate > 0)
                System.out.println("Stoc efacut");
            else
                System.out.println("Nu s-a putut reface stocul");
            
        } catch (SQLException ex) {
            Logger.getLogger(Produs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public Double pretTotalPerCategorie( int tip ){
        Double pret = 0.0;
        try {
            
            Connection con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
            PreparedStatement pstm;
            String sql= "select pretprodus , stoc from produs where tip = ? ";
            con.setAutoCommit(false);
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, tip);
            ResultSet rs = pstm.executeQuery();
            con.commit();
            
            while(rs.next()){
                pret += rs.getDouble("pretprodus") * rs.getInt("stoc");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Produs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pret;
    }
    public void showPretByProducator(String producator){
        try {
            Connection con = (Connection) DBUtil.getConnection(DBType.MYSQLDB);
            PreparedStatement pstm;
            String sql= "select producator, model, pretprodus from produs where producator = ? ";
            con.setAutoCommit(false);
            pstm = con.prepareStatement(sql);
            pstm.setString(1, producator);
            ResultSet rs = pstm.executeQuery();
            con.commit();
            while(rs.next()){
                System.out.println(rs.getString("producator") + " " 
                    + rs.getString("model") + " " + rs.getDouble("pretprodus"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Produs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        
    }
    
}
