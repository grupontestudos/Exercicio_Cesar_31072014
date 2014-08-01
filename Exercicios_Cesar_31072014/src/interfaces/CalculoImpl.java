package interfaces;

public class CalculoImpl implements Calculo {

	@Override
	public Double SomaNumeros(double num1, double num2, double soma) {
		soma = (num1 + num2);
		System.out.println("A soma é : " + soma);
		return soma;
	}

	@Override
	public Double SubtraiNumeros(double num1, double num2, double subtracao) {
		subtracao = (num1 - num2);
		System.out.println("A subtração é : " + subtracao);
		return subtracao;
	}

	@Override
	public Double MultiplicaNumeros(double num1, double num2,
			double multiplicacao) {
		multiplicacao = (num1 * num2);
		System.out.println("A multiplicacao é : " + multiplicacao);
		return multiplicacao;
	}

	@Override
	public Double DivideNumeros(double num1, double num2, double divisao) {
		divisao = (num1 / num2);
		System.out.println("A divisao é : " + divisao);
		return divisao;
	}

	@Override
	public Double calculaConsumoMedio(double distanciaTotal,
			double combustivel, double consumoMedio) {
		consumoMedio = (distanciaTotal / combustivel);
		System.out.println("O consumo médio foi de: " + consumoMedio
				+ " litros.");
		return consumoMedio;
	}

	@Override
	public Double calculaSalarioFinalMes(double salarioFixo, double comissao,
			double valorVendasMes, double salarioFinal, double valorComissao) {
		comissao = 0.15;
		salarioFinal = (salarioFixo + (comissao * valorVendasMes));
		return salarioFinal;
	}

	@Override
	public Double converterCelsiusEmFahrenheit(double temperaturaCelsius,
			double temperaturaFahrenheit) {
		temperaturaFahrenheit = ((9 * temperaturaCelsius + 160) / 5);
		System.out.println("A temperatura convertida é de: "
				+ temperaturaFahrenheit);
		return temperaturaFahrenheit;
	}

	@Override
	public Double converterDolaresEmReais(double valorDolar, double valorReal,
			double precoDolar) {
		valorReal = (valorDolar / precoDolar);
		System.out.println("O valor em reais convertido é:" + valorReal);
		return valorReal;
	}

	@Override
	public Double calcularRendimentoPoupanca(double valorDepositado,
			double valorRendimento, double juro) {
		juro = 0.07;
		valorRendimento = (valorDepositado + (valorDepositado * juro));
		System.out.println("O valor com rendimento da poupança é: R$ " + valorRendimento);
		return valorRendimento;
	}

	@Override
	public Double calculaValorPrestacao(double valorCompra,
			double valorPrestacao, double numeroParcela) {
		numeroParcela = 5;
		valorPrestacao = (valorCompra / numeroParcela);
		System.out.println("Cada parcela tem valor de: R$ " + valorPrestacao);
		return valorPrestacao;
	}

}
