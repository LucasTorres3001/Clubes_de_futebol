package futebol;


public class Corinthians extends CopaDoBrasil {
    
    private short copaDoMundoDeClubesDaFIFA,recopaSul_americana,supercopaDoBrasil;

    public short getCopaDoMundoDeClubesDaFIFA() {
        return copaDoMundoDeClubesDaFIFA;
    }

    public void setCopaDoMundoDeClubesDaFIFA(short copaDoMundoDeClubesDaFIFA) {
        this.copaDoMundoDeClubesDaFIFA = copaDoMundoDeClubesDaFIFA;
    }

    public short getRecopaSul_americana() {
        return recopaSul_americana;
    }

    public void setRecopaSul_americana(short recopaSul_americana) {
        this.recopaSul_americana = recopaSul_americana;
    }

    public short getSupercopaDoBrasil() {
        return supercopaDoBrasil;
    }

    public void setSupercopaDoBrasil(short supercopaDoBrasil) {
        this.supercopaDoBrasil = supercopaDoBrasil;
    }
    
    @Override
    public String others(){
        
        this.setNome("S. C. Corinthians P.");
        this.setAno((short) 1910);
        this.setMes("Setembro");
        this.setDia((byte) 1);
        this.setCor("Preto e Branco");
        
        String dados;
        
        dados = super.others();
        
        return dados;
    }
    
    @Override
    public String titulosInternacionais(){
        
        this.setCopaDoMundoDeClubesDaFIFA((short) 2);
        this.setCopaLibertadoresDaAmerica((short) 1);
        this.setRecopaSul_americana((short) 1);
        
        String dados;
        
        dados = "   <th colspan='2'>TÍTLOS INTERNACIONAIS</th>";
        dados += "  <tr>";
        dados += "      <th>Copa do Mundo de Clubes daFIFA</th>";
        dados += "      <td>" + this.getCopaDoMundoDeClubesDaFIFA() + " título(s)</td>";
        dados += "  </tr>";
        dados += super.titulosInternacionais();
        dados += "  <tr>";
        dados += "      <th>Recopa Sul-americana</th>";
        dados += "      <td>" + this.getRecopaSul_americana() + " título(s)</td>";
        dados += "  </tr>";
        
        return dados;
    }
    
    @Override
    public String titulosNacionais(){
        
        this.setCampeonatoBrasileiro((short) 7);
        this.setCopaDoBrasil((short) 3);
        this.setSupercopaDoBrasil((short) 1);
        
        String dados;
        
        dados = super.titulosNacionais();
        dados += "  <tr>";
        dados += "      <th>Supercopa do Brasil</th>";
        dados += "      <td>" + this.getSupercopaDoBrasil() + " título(s)</td>";
        dados += "  </tr>";
        dados += "</table>";
        dados += "<br/>";
        
        return dados;
    }
}
