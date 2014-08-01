package interfaces;

public interface Calculo {

	public Double SomaNumeros(double num1,double num2,double soma);
	public Double SubtraiNumeros(double num1,double num2,double subtracao);
	public Double MultiplicaNumeros(double num1,double num2,double multiplicacao);
	public Double DivideNumeros(double num1,double num2,double divisao);
	public Double calculaConsumoMedio(double distanciaTotal,double combustivel,double consumoMedio);
	public Double calculaSalarioFinalMes(double salarioFixo,double comissao,double valorVendasMes,double salarioFinal,double valorComissao);
	public Double converterCelsiusEmFahrenheit(double temperaturaCelsius,double temperaturaFahrenheit);
	public Double converterDolaresEmReais(double valorDolar,double valorReal,double precoDolar);
	public Double calcularRendimentoPoupanca(double valorDepositado,double valorRendimento,double juro);
	public Double calculaValorPrestacao(double valorCompra,double valorPrestacao,double numeroParcela);
}
