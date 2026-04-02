package ads.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora) {
        this(hora, 0, 0);
    }

    public Horario(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Horario(int hora, int minuto, int segundo) {
        this();
        if (hora < 24 && minuto < 60 && segundo < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        } else {
            this.hora = 0;
            return false;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto < 60) {
            this.minuto = minuto;
            return true;
        } else {
            this.minuto = 0;
            return false;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo < 60) {
            this.segundo = segundo;
            return true;
        } else {
            this.segundo = 0;
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(hora);
        sb.append(":").append(minuto);
        sb.append(":").append(segundo);
        return sb.toString();
    }

    private String converterParaExterso(int valor) {
        return switch (valor) {
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";
        };
    }

    public String porExtenso() {
        // horas
        int dezH = (this.hora / 10) * 10;
        int uniH = this.hora % 10;
        String hEx = (this.hora == 1) ? "uma"
                : (this.hora == 2) ? "duas"
                : (this.hora <= 20 || this.hora % 10 == 0) ? converterParaExterso(this.hora)
                : converterParaExterso(dezH) + " e " + converterParaExterso(uniH);
        // minutos
        int dezM = (this.minuto / 10) * 10;
        int uniM = this.minuto % 10;
        String mEx = (this.minuto <= 20 || this.minuto % 10 == 0) ? converterParaExterso(this.minuto)
                : converterParaExterso(dezM) + " e " + converterParaExterso(uniM);
        // segundos
        int dezS = (this.segundo / 10) * 10;
        int uniS = this.segundo % 10;
        String sEx = (this.segundo <= 20 || this.segundo % 10 == 0) ? converterParaExterso(this.segundo)
                : converterParaExterso(dezS) + " e " + converterParaExterso(uniS);
        // plural
        String horasLabel = (this.hora == 1) ? "hora" : "horas";
        String minutosLabel = (this.minuto == 1) ? "minuto" : "minutos";
        String segundosLabel = (this.segundo == 1) ? "segundo" : "segundos";

        return hEx + " " + horasLabel + ", " + mEx + " " + minutosLabel + " e " + sEx + " " + segundosLabel;
    }

    public long horaEmSegundos() {
        return this.hora * 3600L + this.minuto * 60L + this.segundo;
    }

    public long diferencaHorarios(Horario h) {
        return horaEmSegundos() - h.horaEmSegundos();
    }
}
