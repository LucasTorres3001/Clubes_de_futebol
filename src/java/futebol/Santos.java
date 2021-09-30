package futebol;


public class Santos extends CopaDoBrasil {
    
    private short copaIntercontinental,recopaDosCampeoesIntercontinentais,recopaSul_americana,copaConmebol;
    private short supercopaSul_americanaDosCampeoesIntercontinentais;

    public short getCopaIntercontinental() {
        return copaIntercontinental;
    }

    public void setCopaIntercontinental(short copaIntercontinental) {
        this.copaIntercontinental = copaIntercontinental;
    }

    public short getRecopaDosCampeoesIntercontinentais() {
        return recopaDosCampeoesIntercontinentais;
    }

    public void setRecopaDosCampeoesIntercontinentais(short recopaDosCampeoesIntercontinentais) {
        this.recopaDosCampeoesIntercontinentais = recopaDosCampeoesIntercontinentais;
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

    public short getSupercopaSul_americanaDosCampeoesIntercontinentais() {
        return supercopaSul_americanaDosCampeoesIntercontinentais;
    }

    public void setSupercopaSul_americanaDosCampeoesIntercontinentais(short supercopaSul_americanaDosCampeoesIntercontinentais) {
        this.supercopaSul_americanaDosCampeoesIntercontinentais = supercopaSul_americanaDosCampeoesIntercontinentais;
    }
    
    @Override
    public String others(){
        
        this.setNome("Santos F.C.");
        this.setAno((short) 1912);
        this.setMes("Abril");
        this.setDia((byte) 14);
        this.setCor("Preto e Branco");
        
        String dados;
        
        dados = super.others();
        
        return dados;
    }
    
    @Override
    public String titulosInternacionais(){
        
        this.setCopaIntercontinental((short) 2);
        this.setRecopaDosCampeoesIntercontinentais((short) 1);
        this.setCopaLibertadoresDaAmerica((short) 3);
        this.setRecopaSul_americana((short) 1);
        this.setCopaConmebol((short) 1);
        this.setSupercopaSul_americanaDosCampeoesIntercontinentais((short) 1);
        
        String dados;
        
        dados = "   <th colspan='2'>TÍTULOS INTERNACIONAIS</th>";
        dados += "  <tr>";
        dados += "      <th>Copa Intercontinental</th>";
        dados += "      <td>" + this.getCopaIntercontinental() + " títulos</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Recopa dos Campeões Intercontinentais</th>";
        dados += "      <td>" + this.getRecopaDosCampeoesIntercontinentais() + " título</td>";
        dados += "  </tr>";
        dados += super.titulosInternacionais();
        dados += "  <tr>";
        dados += "      <th>Recopa Sul-americana</th>";
        dados += "      <td>" + this.getRecopaSul_americana() + " título(s)</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Supercopa Sul-americana dos Campeões Intercontinentais</th>";
        dados += "      <td>" + this.getSupercopaSul_americanaDosCampeoesIntercontinentais() + " título</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Copa Conmebol</th>";
        dados += "      <td>" + this.getCopaConmebol() + " título</td>";
        dados += "  </tr>";
        
        return dados;
    }
    
    @Override
    public String titulosNacionais(){
        
        this.setCampeonatoBrasileiro((short) 8);
        this.setCopaDoBrasil((short) 1);
        
        String dados;
        
        dados = super.titulosNacionais();
        dados += "</table>";
        dados += "<hr/>";
        
        return dados;
    }
}
