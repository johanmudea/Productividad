import java.util.Scanner;
public class EjercicioMentoria {

    /**JOHAN MUÑETÓN MUÑETÓN
     * Calcula y retorna el mínimo compun múltipo entre los numeros enviados como parámetros.
     *se apoya en el metodo maximo comun divisor
     * @param num1 
     * @param num2
     * @return mcm
     */

    public static int minimoComunMultiplo(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.max(num1, num2);
        int mcm = ((a/maximoComunDivisor(num1, num2))*b);
        return mcm;
    }

    /**
     * Calcula y retorna el máximo común divisor entre los numeros enviados como parámetros.
     *
     * @param num1
     * @param num2
     * @return mcd
     */

    public static int maximoComunDivisor(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        int mcd = 0;
        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);
        return mcd;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = sn.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sn.nextInt();

        int res1= minimoComunMultiplo(num1, num2);
        int res2 = maximoComunDivisor(num1, num2);

        System.out.println("El mcm es: " + res1 +" y el mcd es: "+ res2);
    }
}
