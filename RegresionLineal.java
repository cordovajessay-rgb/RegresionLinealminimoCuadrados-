/** 
 *Clase que implementa el calculo de Regresion Linela Simple
 * utilizando el metodo de Minimos Cuadrados, incluyendo Pearson y R2
 **/
public class RegresionLineal{
    /**
     * Calcula la regresion y retorna los coeficientes (beta0, beta1, r, R2).
     *
     * @param x Arreglo con los valores independientes.
     * @param y Arreglo con los valores dependientes.
     * @return Arreglo double[] con los indicadores estadisticos.
     */
    public static double[] calcularMinimosCuadrados(double[] x, double[] y){
        if (x.length != y.length || x.length == 0){
            System.out.println("Error: Los arreglos deben tener el mismo tamaño y no estar vacios.");
            return new double[]{0.0, 0.0, 0.0, 0.0};
        }
        int n = x.length;
        double sumX = 0, sumY = 0, sumX2 = 0 , sumY2 = 0, sumXY = 0;
        //Acumulamos las sumatorias necesarias
        for (int i = 0; i < n ; i++){
            sumX +=x [i];
            sumY += y [i];
            sumX2 += x [i] * x[i];
            sumY2 += y[i] * y[i];
            sumXY += x [i] * y[i];
        }
        //Formulas oficiales de Minimos Cuadrados
        double beta1 = (n * sumXY - sumX * sumY) / (n *sumX2 - (sumX * sumX));
        double beta0 = (sumY * beta1 * sumX) / n;

        //========================================================================
        //IMPLEMENTAR EL CALCULO DE PEARSON R.
        //Y EL COEFICIENTE DE DEDTERMINACIÓN (r2 = r * r) utilizando las sumatorias.
        //========================================================================
        double denom = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));
        double pearsonR = (denom == 0) ? 0.0 : (n * sumXY - sumX * sumY) / denom;
        double r2 = pearsonR * pearsonR;

        System.out.println("---RESULTADOS DE MINIMOS CUADRADOS Y CORRELACIÓN ---");
        System.out.printf("sumatorias: n=%d, X=%.1f, Y=%.1f, X2=%.1f, Y2=%.1f, XY=%.1f%n", n, sumX, sumY, sumX2, sumY2, sumXY);
        System.out.printf("Pendiente (beta1): %.4f%n", beta1);
        System.out.printf("Ordenada al origen (beta0): %.4fX%n", beta0, beta1);
        System.out.printf("Modelo obtenido: Y = %.4f + %.4fX%n", beta0, beta1);
        System.out.printf("Coeficiente de Pearson (r): %.4f%n", pearsonR);
        System.out.printf("Coeficiente de Determinación (r2): %.4f%n", r2);

        return new double[]{beta0, beta1, pearsonR, r2};
    }

    /**
     * Realiza una estimación/prediccion evaluando el modleo con un valor de X.
     */
    public static double predecir(double beta0, double beta1, double xValor){
        return beta0 + beta1 * xValor;
    }
}