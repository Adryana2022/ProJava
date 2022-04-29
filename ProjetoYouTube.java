

package com.mycompany.projetoyoutube;

/**
 *
 * @author radri
 */
public class ProjetoYouTube {

    public static void main(String[] args) {
      Video v[]= new Video [3];
      v[0]= new Video("Aula de JAVA");
      v[1]= new Video("Video PHP");
      v[2]= new Video("Filme");
      
      Gente g[]= new Gente[2];
      g[0] = new Gente("Mere",57,"F", "merita");
      g[1]= new Gente("Beatriz", 12, "F", "belatriz");
      
      Vizualizacao vis[] = new Vizualizacao[5];
      vis[0]= new Vizualizacao(g[1], v[0]);
      vis[0].avaliar();
      
        System.out.println(vis[0].toString());
        
        vis[1]=new Vizualizacao(g[0], v[2]);
        vis[1].avaliar(35.0f);
        
        System.out.println(vis[1].toString());
        vis[1].avaliar(5);
        
          
        System.out.println("VIDEOS\n**************************");      
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString()); 
         System.out.println("GAFANHOTOS\n**************************"); 
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
   
    }
}
