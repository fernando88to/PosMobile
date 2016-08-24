/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posmobile;

/**
 *
 * @author fernando
 */
public class PosMobile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {        
        GraficoBarras gb = new GraficoBarras();        
        CarteiraAcoes c = new CarteiraAcoes();
        c.addObservador(gb);        
        Thread.sleep(2000l);//pausa o sistema
        c.adicionaAcoes("Campo 1", 200);
        Thread.sleep(2000l);//pausa o sistema
        c.adicionaAcoes("Campo 2", 400);        
    }
    
}
