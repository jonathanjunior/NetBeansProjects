package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();

    public void cadastrarFuncionario(FuncionarioDTO objfuncionariodto) {
        String sql = "insert into funcionario (nome_funcionario, endereco_funcionario, cod_cargo) values (?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
            pstm.setInt(3, objfuncionariodto.getCod_cargo());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Cadastrar: " + erro);
        }
    }

    public ArrayList<FuncionarioDTO> PesquisarFuncionario() { //ResultSet percorre a tabela do banco
        
        String sql = "select * from funcionario";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FuncionarioDTO objfuncionarioDTO = new FuncionarioDTO();
                objfuncionarioDTO.setId_funcionario(rs.getInt("id_funcionario"));
                objfuncionarioDTO.setNome_funcionario(rs.getString("nome_funcionario"));
                objfuncionarioDTO.setEndereco_funcionario(rs.getString("endereco_funcionario"));

                lista.add(objfuncionarioDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Pesquisar: " + erro);
        }

        return lista;
    }
    
    public void alterarFuncionario(FuncionarioDTO objfuncionariodto){
        String sql = "UPDATE funcionario SET nome_funcionario = ?, endereco_funcionario = ? WHERE id_funcionario = ?";
        
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
            pstm.setInt(3, objfuncionariodto.getId_funcionario());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Alterar: " + erro);
        }
    }
    
    public void excluirFuncionario(FuncionarioDTO objfuncionariodto){
        String sql = "DELETE FROM funcionario WHERE id_funcionario = ?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);            
            pstm.setInt(1, objfuncionariodto.getId_funcionario());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Excluir: " + erro);
        }
        
    }
    
    public ResultSet listarCargo(){
        conn = new ConexaoDAO().conectaBD();
        String sql = "SELECT * FROM cargo ORDER BY descricao_cargo;";        

        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO listarCargo: " + erro.getMessage());
            return null;
        }
        
    }
}
