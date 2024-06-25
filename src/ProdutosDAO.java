/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class ProdutosDAO {
   private conectaDAO conecta; 
   private Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    
      public ProdutosDAO() {
        this.conecta = new conectaDAO();
        this.conn = this.conecta.connectDB();
    }
    
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
        
        String sql = "INSERT INTO produtos (nome, valor, status) VALUES(?,?,?)";
      try{  
        prep = this.conn.prepareStatement(sql);
        prep.setString(1, produto.getNome());
        prep.setDouble(2, produto.getValor());
        prep.setString(3, produto.getStatus());
        prep.execute();
      }catch (Exception e) {
        System.out.println("Produto inserido com sucesso: " + e.getMessage()); 
      }
       
        //conn = new conectaDAO().connectDB();   
    }
    
    public List<ProdutosDTO> listarProdutos(){
        
        String sql = "SELECT * FROM produtos WHERE nome LIKE ?";
        
         try {
                    
             PreparedStatement stmt = this.conn.prepareStatement(sql);        
            
             ResultSet rs = stmt.executeQuery();
             
             List<ProdutosDTO> listarproduto = new ArrayList<>();  
            while (rs.next()){
             ProdutosDTO produtos = new ProdutosDTO();
               
                produtos.setId(rs.getInt("id"));
                produtos.setNome(rs.getString("nome"));
                produtos.setValor(rs.getInt("valor"));
                produtos.setStatus(rs.getString("status"));
               
           
                listarproduto.add(produtos);
        
            }
        return listarproduto;
    }catch (Exception e) {
        return null; 
        
        
    }
    
    }  
    
        
}

