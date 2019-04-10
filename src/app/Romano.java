package app;

public class Romano {

    private int miles;
    private int centenas;
    private int decenas;
    private int unidades;
    private String numeroRomano;

    public Romano(int numero) {

        this.miles = numero / 1000;
        this.centenas = numero / 100 % 10;
        this.decenas = numero / 10 % 10;
        this.unidades = numero % 10;
        this.numeroRomano = "";

    }

    private String getRomanNumberMiles(int miles) {
        if (miles < 1) return ""; // finaliza la recursividad
        if (miles > 1) return "M" + getRomanNumberMiles(miles - 1);
        return "M"; // Cuando @miles = 1, finaliza la recursividad
    }

    private String getRomanNumberCentenas(int centenas) {
        if (centenas < 1) return ""; // finaliza la recursividad
        if (centenas == 9) return "CM" + getRomanNumberCentenas(centenas - 9);
        if (centenas >= 5) return "D" + getRomanNumberCentenas(centenas - 5);
        if (centenas == 4) return "CD" + getRomanNumberCentenas(centenas - 4);
        if (centenas > 1) return "C" + getRomanNumberCentenas(centenas - 1);
        return "C"; // Cuando @centenas = 1, finaliza la recursividad
    }

    private String getRomanNumberDecenas(int decenas) {
        if (decenas < 1) return ""; // finaliza la recursividad
        if (decenas == 9) return "XC" + getRomanNumberCentenas(decenas - 9);
        if (decenas >= 5) return "L" + getRomanNumberCentenas(decenas - 5);
        if (decenas == 4) return "XL" + getRomanNumberDecenas(decenas - 4);
        if (decenas > 1) return "X" + getRomanNumberDecenas(decenas - 1);
        return "X"; // Cuando @decenas = 1, finaliza la recursividad
    }

    private String getRomanNumberUnidades(int unidades) {
        if (unidades < 1) return ""; // finaliza la recursividad
        if (unidades == 9) return "IX" + getRomanNumberUnidades(unidades - 9);
        if (unidades >= 5) return "V" + getRomanNumberUnidades(unidades - 5);
        if (unidades == 4) return "IV" + getRomanNumberUnidades(unidades - 4);
        if (unidades > 1) return "I"     + getRomanNumberUnidades(unidades - 1);
        return "I"; // Cuando @unidades = 1, finaliza la recursividad
    }

    public String getRomanNumber(){
        String miles = getRomanNumberMiles(this.miles);
        String centenas = getRomanNumberCentenas(this.centenas);
        String decenas = getRomanNumberDecenas(this.decenas);
        String unidades = getRomanNumberUnidades(this.unidades);
        return miles + centenas + decenas + unidades;
    }

}
