package futebol;


public class SaoPaulo extends Soccer {
    
    private short copaDoMundoDeClubesDaFIFA,copaIntercontinental,copaSul_americana,recopaSul_americana,copaConmebol,copaMasterDaConmebol;
    private short supercopaLibertadores;

    public short getCopaDoMundoDeClubesDaFIFA() {
        return copaDoMundoDeClubesDaFIFA;
    }

    public void setCopaDoMundoDeClubesDaFIFA(short copaDoMundoDeClubesDaFIFA) {
        this.copaDoMundoDeClubesDaFIFA = copaDoMundoDeClubesDaFIFA;
    }

    public short getCopaIntercontinental() {
        return copaIntercontinental;
    }

    public void setCopaIntercontinental(short copaIntercontinental) {
        this.copaIntercontinental = copaIntercontinental;
    }

    public short getCopaSul_americana() {
        return copaSul_americana;
    }

    public void setCopaSul_americana(short copaSul_americana) {
        this.copaSul_americana = copaSul_americana;
    }

    public short getRecopaSul_americana() {
        return recopaSul_americana;
    }

    public void setRecopaSul_americana(short recopaSul_americana) {
        this.recopaSul_americana = recopaSul_americana;
    }

    public short getCopaConmebol() {
        return copaConmebol;
    }

    public void setCopaConmebol(short copaConmebol) {
        this.copaConmebol = copaConmebol;
    }

    public short getCopaMasterDaConmebol() {
        return copaMasterDaConmebol;
    }

    public void setCopaMasterDaConmebol(short copaMasterDaConmebol) {
        this.copaMasterDaConmebol = copaMasterDaConmebol;
    }

    public short getSupercopaLibertadores() {
        return supercopaLibertadores;
    }

    public void setSupercopaLibertadores(short supercopaLibertadores) {
        this.supercopaLibertadores = supercopaLibertadores;
    }
    
    @Override
    public String others(){
        
        this.setNome("São Paulo F.C.");
        this.setAno((short) 1930);
        this.setMes("Janeiro");
        this.setDia((byte) 25);
        this.setCor("Preto, Branco e Vermelho");
        
        String dados;
        
        dados = "<br/>";
        dados += super.others();
        
        return dados;
    }
    
    @Override
    public String titulosInternacionais(){
        
        this.setCopaDoMundoDeClubesDaFIFA((short) 1);
        this.setCopaIntercontinental((short) 2);
        this.setCopaLibertadoresDaAmerica((short) 3);
        this.setCopaSul_americana((short) 1);
        this.setRecopaSul_americana((short) 2);
        this.setCopaConmebol((short) 1);
        this.setCopaMasterDaConmebol((short) 1);
        this.setSupercopaLibertadores((short) 1);
        
        String dados;
        
        dados = "  <th colspan = '2'>TÍTULOS INTERNACIONAIS</th>";
        dados += "  <tr>";
        dados += "      <th>Copa do Mundo de Clubes da FIFA</th>";
        dados += "      <td>" + this.getCopaDoMundoDeClubesDaFIFA() + " título(s)</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Copa Intercontinental</th>";
        dados += "      <td>" + this.getCopaIntercontinental() + " título(s)</td>";
        dados += "  </tr>";
        dados += super.titulosInternacionais();
        dados += "  <tr>";
        dados += "      <th>Copa Sul-americana</th>";
        dados += "      <td>" + this.getCopaSul_americana() + " título(s)</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Recopa Sul-americana</th>";
        dados += "      <td>" + this.getRecopaSul_americana() + " título(s)</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Copa Conmebol</th>";
        dados += "      <td>" + this.getCopaConmebol() + " título(s)</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Copa Master da Conmebol</th>";
        dados += "      <td>" + this.getCopaMasterDaConmebol() + " título(s)</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Supercopa Libertadores</th>";
        dados += "      <td>" + this.getSupercopaLibertadores() + " título(s)</td>";
        dados += "  </tr>";
        
        return dados;
    }
    
    @Override
    public String titulosNacionais(){
        
        this.setCampeonatoBrasileiro((short) 6);
        
        String dados;
        
        dados = super.titulosNacionais();
        dados += "</table>";
        dados += "<hr/>";
        
        return dados;
    }
}
