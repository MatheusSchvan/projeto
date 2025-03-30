package Pack1;

import java.time.LocalDate;
import java.time.Period;

public class Ex001 {
	public static void main(String[] args) {
		contaTempo(4, 1, 2026);
	}

	public static void contaTempo(int dia, int mes, int ano) {
		// Data atual do sistema
		LocalDate dataAtual = LocalDate.now();
		// Data alvo
		LocalDate dataFutura = LocalDate.of(ano, mes, dia);

		// Verifica se a data futura é posterior à atual
		if (dataFutura.isBefore(dataAtual)) {
			System.out.println("A data informada já passou.");
			return;
		}

		// Calcula a diferença entre as datas
		Period periodo = Period.between(dataAtual, dataFutura);

		// Exibe o tempo restante
		System.out.printf("Faltam %d ano(s), %d mês(es) e %d dia(s) para essa data em %d.%n", periodo.getYears(),
				periodo.getMonths(), periodo.getDays(), ano);
	}
}
