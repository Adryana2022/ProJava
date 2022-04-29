
package com.mycompany.projetoyoutube;

/**
 *
 * @author radri
 */
public class Vizualizacao {
    
    private Gente espectador;
    private Video filme;

    public Vizualizacao(Gente espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
     this.filme.setAvaliacoes(5);
        
    }
   
      public void avaliar(int nota){
     this.filme.setAvaliacoes(nota);
    
        
    }
      public void avaliar(float porc){
     int tot;
          if (porc <= 20){
              tot = 3;
          }else if (porc <=50){
              tot =5;
          }else if (porc <=90){
              tot=8;
          }else{
              tot = 10;
          }
        this.filme.setAvaliacoes(tot);
    }
    
    public Gente getEspectador() {
        return espectador;
    }

    public void setEspectador(Gente espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Vizualizacao{" + "espectador = " + espectador + ", filme = " + filme + '}';
    }



}
