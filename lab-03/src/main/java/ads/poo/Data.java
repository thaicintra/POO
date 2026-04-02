package ads.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    //Ano bissexto
    private boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
    }

    //Validação dos dias do mês
    private int diasNoMes(int mes, int ano) {
        return switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> anoBissexto(ano) ? 29 : 28;
            default -> 0;
        };
    }

    public Data(int dia) {
        this(dia, 1, 1970);
    }

    public Data(int dia, int mes) {
        this(dia, mes, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this();
        if (dia > 1 && dia <= diasNoMes(mes, ano) && mes >= 1 && mes <= 12 && ano > 0) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public boolean setDia(int dia) {
        if (dia >= 1 && dia <= diasNoMes(this.mes, this.ano)) {
            this.dia = dia;
            return true;
        }
        return false;
    }

    public boolean setMes(int mes) {
        if (mes >= 1 && mes <= 12 && this.dia <= diasNoMes(mes, this.ano)) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public boolean setAno(int ano) {
        if (ano > 0 && this.dia <= diasNoMes(this.mes, ano)) {
            this.ano = ano;
            return true;
        }
        return false;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(dia).append("/");
        sb.append(mes).append("/");
        sb.append(ano);
        return sb.toString();
    }

    private String converterParaExtenso(int mes) {
        return switch (mes) {
            case 1 -> "janeiro";
            case 2 -> "fevereiro";
            case 3 -> "março";
            case 4 -> "abril";
            case 5 -> "maio";
            case 6 -> "junho";
            case 7 -> "julho";
            case 8 -> "agosto";
            case 9 -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            case 12 -> "dezembro";
            default -> "";
        };
    }

    public String converterParaExtenso() {
        return this.dia + " de " + converterParaExtenso(this.mes) + " de " + this.ano;
    }

    private long dataEmDias() {
        long dias = this.dia;

        for (int i = 1; i < this.mes; i++) {
            dias += diasNoMes(i, this.ano);
        }

        for (int j = 1; j < this.ano; j++) {
            dias += anoBissexto(j) ? 366 : 365;
        }
        return dias;
    }

    public long diferencaDatas (Data d) {
        return this.dataEmDias() - d.dataEmDias();
    }
}
