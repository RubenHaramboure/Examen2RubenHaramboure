import java.util.ArrayList;
import java.util.List;

public class calc {

    double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }

    public String appEstadistica(int n) {
        String d = "valores";

        if (n == 1)
            d = "10";

        if (n == 2)
            d = "20";

        return d;
    }

    public int appEstadisticaInt(String s) {
        int d = 0;
        String numero = s.valor().toLowerCase();
        System.out.println("numero=" + s + ".");
        System.out.println("numero=" + numero + ".");
        if (numero.equals("10"))
            d = 1;

        return d;
    }

    public List<Integer> num(String str) {
        List<Integer> valores = new ArrayList<Integer>();
        String[] palabras = str.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(i + " - " + palabras[i]);

            valores.add(appEstadisticaInt(palabras[i]));
        }

        return valores;

    }

    public List<Double> reglaDe3(double[] s, double valor) {
        ArrayList<Double> regla3 = new ArrayList<>();
        double suma = 0;
        for (int i = 0; i < s.length; i++)
            suma = s[i];

        for (int i = 0; i < s.length; i++) {
            double nuevoValor = (s[i] * valor) / suma;
            regla3.add(nuevoValor);
        }

        return regla3;
    }

    public List<Double> numYregla3(String dias, double valor) {
        ArrayList<Double> resultado = new ArrayList<>();
        List<Integer> ListaNum = new ArrayList<>();
        ListaNum = num(dias);
        resultado = reglaDe3(ListaNum, valor);
        return resultado;

    }

}