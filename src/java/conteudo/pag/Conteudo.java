package conteudo.pag;

import futebol.Corinthians;
import futebol.Palmeiras;
import futebol.Santos;
import futebol.SaoPaulo;



public class Conteudo {
    
    SaoPaulo spfc = new SaoPaulo();
    Santos sfc = new Santos();
    Palmeiras sep = new Palmeiras();
    Corinthians sccp = new Corinthians();
    
    public String conteudo(){
        
        String msg = "";
        
        msg += spfc.others();
        msg += spfc.titulosInternacionais();
        msg += spfc.titulosNacionais();
        
        msg += sfc.others();
        msg += sfc.titulosInternacionais();
        msg += sfc.titulosNacionais();
        
        msg += sep.others();
        msg += sep.titulosInternacionais();
        msg += sep.titulosNacionais();
        
        msg += sccp.others();
        msg += sccp.titulosInternacionais();
        msg += sccp.titulosNacionais();
        
        return msg;
    }
}
