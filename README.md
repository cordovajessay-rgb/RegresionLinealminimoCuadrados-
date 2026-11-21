# RegresionLinealminimoCuadrados-
*Este trabajo implementa el modelo matemático de regresión lineal por mínimo cuadrados (MCO). Para cálculos de la ecuación de la recta para evaluar la calidad y la fuerza del programa mediante el Coeficiente de correlación de Pearson (r) y el Coeficiente de determinación .
# CLASE PRINCIPAL ( regresion lineal.java)
*En esta clase se nos indica  completar el codigo asignado por el docente.

#1. EL cálculo de regresión lineal por el método de mínimo cuadrados la cual se nos da la formula:

*double beta1 = (n * sumXY - sumX * sumY) / (n *sumX2 - (sumX * sumX));
*double beta0 = (sumY - beta1 * sumX) / n;  

#2. El calculo de la correlacion de Pearson (r) mediante la formula
* double pearsonR = (denom == 0) ? 0.0 : (n * sumXY - sumX * sumY) / denom;
 
#3. El coeficiente  determinacion  (r2)
 * double r2 = pearsonR * pearsonR;
   
#EJECUCCION (MAIN.JAVA)

*Donde se ingresaron valores desde consola: la cual se pueden modificar

* double[] x = {2, 4, 3, 4, 5};
  double[] y = {3.1, 5.9, 7.2, 3.8, 7.1};
  *la cual llama a las funciones desde la clase principal e imprimiendo los resultados
  
#RESULTADOS:

*Modelo obtenido: Y = 85.1774 + 0.8731X
Coeficiente de Pearson (r): 0.5278
Coeficiente de Determinación (r2): 0.2786
Prediccion para X=6: 90.4158

