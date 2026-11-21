public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2.1, 3.9, 6.2, 7.8, 10.1};

        double[] res = RegresionLineal.calcularMinimosCuadrados(x, y);
        double prediccion = RegresionLineal.predecir(res[0], res[1], 6);
        System.out.printf("Prediccion para X=6: %.4f%n", prediccion);
    
}
