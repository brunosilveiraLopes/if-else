import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);

	System.out.println("Digite a quantidade de litros");
	double litros = leitor.nextDouble();

	System.out.println("Qual o tipo de Combustivel: A(álcool) - G(Gasolina) ");
	String tipoCombustivel = leitor.next();

	double precoGasolina = 2.5;
	double precoAlcool = 1.9;

	double percentualDesconto = 0;
	double total = 0;
	double totalDeconto = 0;

	if (tipoCombustivel.equalsIgnoreCase("a")) {
		if (litros > 20) {
			percentualDesconto = 0.03;
		} else {
			percentualDesconto = 0.05;
		}
		total = litros * precoAlcool;
	} else if (tipoCombustivel.equalsIgnoreCase("g")) {
		if (litros > 20) {
			percentualDesconto = 0.04;
		} else {
			percentualDesconto = 0.06;
		}
		total = litros * precoGasolina;
	}
	totalDeconto = total * percentualDesconto;
	
	double precoPAGAR = total - totalDeconto;
	
	System.out.println("Preço FInal R$ " + precoPAGAR);

}
}
