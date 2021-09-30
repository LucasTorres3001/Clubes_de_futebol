package futebol;


public class Palmeiras extends CopaDoBrasil {
    
    private short copaRio,copaMercosul,copaDosCampeoes;

    public short getCopaRio() {
        return copaRio;
    }

    public void setCopaRio(short copaRio) {
        this.copaRio = copaRio;
    }

    public short getCopaMercosul() {
        return copaMercosul;
    }

    public void setCopaMercosul(short copaMercosul) {
        this.copaMercosul = copaMercosul;
    }

    public short getCopaDosCampeoes() {
        return copaDosCampeoes;
    }

    public void setCopaDosCampeoes(short copaDosCampeoes) {
        this.copaDosCampeoes = copaDosCampeoes;
    }
    
    @Override
    public String others(){
        
        this.setNome("S.E. Palmeiras");
        this.setAno((short) 1916);
        this.setMes("Agosto");
        this.setDia((byte) 26);
        this.setCor("Verde e Branco");
        
        String dados;
        
        dados = super.others();
        
        return dados;
    }
    
    @Override
    public String titulosInternacionais(){
        
        this.setCopaRio((short) 1);
        this.setCopaLibertadoresDaAmerica((short) 2);
        this.setCopaMercosul((short) 1);
        
        String dados;
        
        dados = "   <th colspan='2'>TÍTULOS INTERNACIONAIS</th>";
        dados += "  <tr>";
        dados += "      <th>Copa Rio</th>";
        dados += "      <td>" + this.getCopaRio() + " título</td>";
        dados += "  </tr>";
        dados += super.titulosInternacionais();
        dados += "  <tr>";
        dados += "      <th>Copa Mercosul</th>";
        dados += "      <td>" + this.getCopaMercosul() + " título</td>";
        dados += "  </tr>";
        
        return dados;
    }
    
    @Override
    public String titulosNacionais(){
        
        this.setCampeonatoBrasileiro((short) 10);
        this.setCopaDoBrasil((short) 4);
        this.setCopaDosCampeoes((short) 1);
        
        String dados;
        
        dados = super.titulosNacionais();
        dados += "  <tr>";
        dados += "      <th>Copa dos Campeões</th>";
        dados += "      <td>" + this.getCopaDosCampeoes() + " título</td>";
        dados += "  </tr>";
        dados += "</table>";
        dados += "<hr/>";
        
        return dados;
    }
}
