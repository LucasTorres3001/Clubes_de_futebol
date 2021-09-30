package futebol;

import java.util.Calendar;


public abstract class Soccer {
    
    private String nome, cor, mes;
    private short ano, copaLibertadoresDaAmerica, campeonatoBrasileiro;
    private byte dia;
    public short ano_atual = (short) Calendar.getInstance().get(Calendar.YEAR);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public short getCopaLibertadoresDaAmerica() {
        return copaLibertadoresDaAmerica;
    }

    public void setCopaLibertadoresDaAmerica(short copaLibertadoresDaAmerica) {
        this.copaLibertadoresDaAmerica = copaLibertadoresDaAmerica;
    }

    public short getCampeonatoBrasileiro() {
        return campeonatoBrasileiro;
    }

    public void setCampeonatoBrasileiro(short campeonatoBrasileiro) {
        this.campeonatoBrasileiro = campeonatoBrasileiro;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }
    
    public String others(){
        
        String dados = "";
        
        dados += "<table>";
        dados += "  <th colspan = '2'>" + this.getNome() + "</th>";
        dados += "  <tr>";
        dados += "      <th>Data de fundação</th>";
        dados += "      <td>" + this.getDia() + " de " + this.getMes() + " de " + this.getAno() + " (" + (ano_atual - this.getAno()) + " anos)</td>";
        dados += "  </tr>";
        dados += "  <tr>";
        dados += "      <th>Cores</th>";
        dados += "      <td>" + this.getCor() + "</td>";
        dados += "  </tr>";
        
        return dados;
    }
    
    public String titulosInternacionais(){
        
        String dados = "";
        
        dados += "  <tr>";
        dados += "      <th>Copa Libertadores da América</th>";
        dados += "      <td>" + this.getCopaLibertadoresDaAmerica() + " título(s)</td>";
        dados += "  </tr>";
        
        return dados;
    }
    
    public String titulosNacionais(){
        
        String dados = "";
        
        dados += "  <th colspan = '2'>TÍTULOS NACIONAIS</th>";
        dados += "  <tr>";
        dados += "      <th>Campeonato brasileiro</th>";
        dados += "      <td>" + this.getCampeonatoBrasileiro() + " título(s)</td>";
        dados += "  </tr>";
        
        return dados;
    }
}
