public class Calculate {

    public static void main(String[] args) {
       int x = Integer.parseInt(args[1]);
       int y = Integer.parseInt(args[2]);

       if(args[0].equals("somar")) { // Verifica se a operação escolhida é de soma.
           sum(x, y);
       } else if (args[0].equals("subtrair")){ // Verifica se a operação escolhida é de subtração.
           minus(x, y);
       } else if (args[0].equals("multiplicar")) { // Verifica se a operação escolhida é de multiplicação.
           multiply(x, y);
       } else if (args[0].equals("dividir")) { // Verifica se a operação escolhida é de divisão.
           divide(x, y);
       } else { // Caso não seja reconhecida nenhum tipo de operação aparece a mensagem de instrução não definida.
           System.out.println("Nenhuma instrucao definida!");
       }

    }

    // Declaração da operação de soma.
    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    // Declaração da operação de subtração.
    static void minus(int x, int y) {
        System.out.println(x - y);
    }

    // Declaração da operação de multiplicação.
    static void multiply(int x, int y) {
        System.out.println(x * y);
    }

    // Declaração da operação de subtração.
    static void divide(int x, int y) {
        System.out.println(x / y);
    }

}
