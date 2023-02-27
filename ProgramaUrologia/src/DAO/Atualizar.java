
package DAO;

import DTO.Apartamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Atualizar {
   Connection conn;

    public ResultSet Atualizar(Apartamento objapartamento) {
        conn = new Conexao().conectaBD();

        try {
            String sql = "select * from apartamento where nome_pac = ? and nome_med = ? and descricao = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objapartamento.getNome_pac());
            pstm.setString(2, objapartamento.getNome_med());
            pstm.setString(3, objapartamento.getDescricao());
            
            
            ResultSet rs = pstm.executeQuery();
            return rs;          

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Atualizar : " + erro);
            return null;
        }
    } 
}
