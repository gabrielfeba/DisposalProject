/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disposalproject;

import controller.ManipulaDados;
import java.awt.event.ActionEvent;
import view.TelaPrincipal;

/**
 * @author djairtb
 * @author gabrielfeba  
 */
public class DisposalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        telaPrincipal.getRegistrarInformacoes().doClick();
    }
    
}
