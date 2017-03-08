/*
Essa classe deve ser responsável pela decrementação da quantidade em estoque do(s) produto(s) vendidos por cada operação.
Também deverá controlar o lucro e o valor total de cada opeção, . 
*/
package GerenciamentoClass;

import ConexaoBD.ConectaBanco;
import GerenciamentoClass.ControleEstoque;
import GerenciamentoClass.Produto;
import PreenchimentoTabelas.ModeloTabela;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.sql.PreparedStatement;
import javax.swing.JTextField;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import gerenciamentovendas.Tela_venda;
/**
 *
 * @author Murder
 */
public class ControleEstoque {
  private  long id_produto;
  private  int qtd_vendida;
  private  double lucro_produto;

    public long getId_produto() {
        return id_produto;
    }

    public double getLucro_produto() {
        return lucro_produto;
    }

    public void setLucro_produto(double lucro_produto) {
        this.lucro_produto = lucro_produto;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public int getQtd_vendida() {
        return qtd_vendida;
    }

    public void setQtd_vendida(int qtd_vendida) {
        this.qtd_vendida = qtd_vendida;
    }
 
  
    public static void main(String[] args){
    for(int i=0; i<=5; i++){
        System.out.println(" "+i);
    }
    
    
    
}
}
