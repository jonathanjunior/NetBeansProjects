
package DAO;

import DTO.Apartamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ApartamentoConn {
    Connection conn;
    PreparedStatement pstm;  
    ResultSet rs;
   
    
    public void cadastrarApartamento(Apartamento objapartamento, int id_apartamento) {
        //String sql = "insert into apartamento (nome_pac, nome_med, descricao) values (?, ?, ?)";
        String sql = "UPDATE apartamento SET nome_pac = ?, nome_med = ?, descricao = ? WHERE id_apartamento = ?";
       
        conn = new Conexao().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objapartamento.getNome_pac());
            pstm.setString(2, objapartamento.getNome_med());
            pstm.setString(3, objapartamento.getDescricao());
            pstm.setInt(4, id_apartamento);

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ApartamentoConn: " + erro);
        }
    }
    
    public void atualizarApartamento(Apartamento objapartamento){
        conn = new Conexao().conectaBD();
        String sql = "select * from apartamento;";   
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) { 
            objapartamento.setNome_pac(rs.getString("nome_pac"));
            objapartamento.setNome_med(rs.getString("nome_med"));
            objapartamento.setDescricao(rs.getString("descricao"));
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ApartamentoConn atualizarApartamento(): " + erro);
        }
    }
}
