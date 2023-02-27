
package DAO;

import DTO.Apartamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ApartamentoConn {
    Connection conn;
    PreparedStatement pstm;       
   
    
    public void cadastrarApartamento(Apartamento objapartamento) {
        String sql = "insert into apartamento (nome_pac, nome_med, descricao) values (?, ?, ?)";
        conn = new Conexao().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objapartamento.getNome_pac());
            pstm.setString(2, objapartamento.getNome_med());
            pstm.setString(3, objapartamento.getDescricao());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ApartamentoConn: " + erro);
        }
    }
}
