package futebol;


public class CopaDoBrasil extends Soccer {
    
    private short copaDoBrasil;

    public short getCopaDoBrasil() {
        return copaDoBrasil;
    }

    public void setCopaDoBrasil(short copaDoBrasil) {
        this.copaDoBrasil = copaDoBrasil;
    }
    
    @Override
    public String titulosNacionais(){
        
        String dados;
        
        dados = super.titulosNacionais();
        dados += "  <tr>";
        dados += "      <th>Copa do Brasil</th>";
        dados += "      <td>" + this.getCopaDoBrasil() + " título(s)</td>";
        dados += "  </tr>";
        
        return dados;
        
    }
}
