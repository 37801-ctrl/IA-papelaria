public class Papelaria {

    public static void main(String[] args) {
        System.out.println("=== PAPELARIA PONTO FINAL ===\n");

        
        String descricao1 = "Caderno 10 materias";
        double valor1 = 24.90;
        int qtd1 = 1;
        boolean kit1 = false;
        double bruto1 = valor1 * qtd1;
        double abatimento1;
        if (kit1) {
            abatimento1 = bruto1 * 0.15;
        } else if (qtd1 >= 10) {
            abatimento1 = bruto1 * 0.08;
        } else {
            abatimento1 = 0.0;
        }
        double liquido1 = bruto1 - abatimento1;
        System.out.printf("%-20s %3d un | bruto R$ %7.2f | desc R$ %6.2f | R$ %7.2f%n",
                descricao1, qtd1, bruto1, abatimento1, liquido1);

String descricao2 = "Lapis grafite";
        double valor2 = 1.50;
        int qtd2 = 12;
        boolean kit2 = false;
        double bruto2 = valor2 * qtd2;
        double abatimento2;
        if (kit2) {
            abatimento2 = bruto2 * 0.15;
        } else if (qtd2 >= 10) {
            abatimento2 = bruto2 * 0.08;
        } else {
            abatimento2 = 0.0;
        }
        double liquido2 = bruto2 - abatimento2;
        System.out.printf("%-20s %3d un | bruto R$ %7.2f | desc R$ %6.2f | R$ %7.2f%n",
                descricao2, qtd2, bruto2, abatimento2, liquido2);

        
        String descricao3 = "Kit escolar basico";
        double valor3 = 84.00;
        int qtd3 = 1;
        boolean kit3 = true;
        double bruto3 = valor3 * qtd3;
        double abatimento3;
        if (kit3) {
            abatimento3 = bruto3 * 0.15;
        } else if (qtd3 >= 10) {
            abatimento3 = bruto3 * 0.08;
        } else {
            abatimento3 = 0.0;
        }
        double liquido3 = bruto3 - abatimento3;
        System.out.printf("%-20s %3d un | bruto R$ %7.2f | desc R$ %6.2f | R$ %7.2f%n",
                descricao3, qtd3, bruto3, abatimento3, liquido3);

        
        String descricao4 = "Caneta azul";
        double valor4 = 2.80;
        int qtd4 = 10;
        boolean kit4 = false;
        double bruto4 = valor4 * qtd4;
        double abatimento4;
        if (kit4) {
            abatimento4 = bruto4 * 0.15;
        } else if (qtd4 >= 10) {
            abatimento4 = bruto4 * 0.08;
        } else {
            abatimento4 = 0.0;
        }
        double liquido4 = bruto4 - abatimento4;
        System.out.printf("%-20s %3d un | bruto R$ %7.2f | desc R$ %6.2f | R$ %7.2f%n",
                descricao4, qtd4, bruto4, abatimento4, liquido4);

        double soma = liquido1 + liquido2 + liquido3 + liquido4;
        double frete;
        if (soma >= 150.0) {
            frete = 0.0;
        } else {
            frete = 12.90;
        }
        System.out.printf("%nItens:  R$ %.2f%n", soma);
        System.out.printf("Frete:  R$ %.2f%n", frete);
        System.out.printf("Total do pedido: R$ %.2f%n", soma + frete);
    }
}