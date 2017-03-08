/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciamentoClass;
import java.util.ArrayList;

/**
 *
 * @author hugo
 */
public class Produto {
   long idProdutoUnit;
   String nome;
   float valor_compra; 
   float valor_venda;
   int quantidade;
   int quantidade_min;
   float lucro_produto;
   
   public void registrar(){
       
     }
   
   public int buscarProd(int x){
       
   return x;
   }
   
   public void atualizarProd(){
   
   
   } 
   
   public int notificar_prod_acabando(int x){
   
   return x;
   }

    public long getIdProdutoUnit() {
        return idProdutoUnit;
    }

    public void setIdProdutoUnit(long idProdutoUnit) {
        this.idProdutoUnit = idProdutoUnit;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(float valor_compra) {
        this.valor_compra = valor_compra;
    }

    public float getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade_min() {
        return quantidade_min;
    }

    public void setQuantidade_min(int quantidade_min) {
        this.quantidade_min = quantidade_min;
    }

    public float getLucro_produto() {
        return lucro_produto;
    }

    public void setLucro_produto(float lucro_produto) {
        this.lucro_produto = lucro_produto;
    }
   
   
   
   public static void main(String[] args){
      ArrayList<Produto> prod = new ArrayList<>();
      
      
}
}
