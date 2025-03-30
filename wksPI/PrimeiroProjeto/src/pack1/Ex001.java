package pack1;

public class Ex001 {


		public static void main(String[] args) {
			double faturamentoA = 500000;
			double faturamentoB = 1200000;
			double taxaCrescimentoA = 0.08;
			double taxaCrescimentoB = 0.04;

			int anos = calcularAnos(faturamentoA, faturamentoB, taxaCrescimentoA, taxaCrescimentoB);

			if (anos != -1) {
				System.out.println("A empresa A ultrapassou a empresa B em " + anos + " anos.");
			} else {
				System.out.println("A empresa A não ultrapassou a empresa B em 50 anos.");
			}
		}

		public static int calcularAnos(double faturamentoA, double faturamentoB, double taxaCrescimentoA,
				double taxaCrescimentoB) {
			int anos = 0;

			while (faturamentoA <= faturamentoB && anos < 50) {
				faturamentoA += faturamentoA * taxaCrescimentoA;
				faturamentoB += faturamentoB * taxaCrescimentoB;
				anos++;

				faturamentoAno(anos, faturamentoA, faturamentoB);
			}

			if (faturamentoA > faturamentoB) {
				return anos;
			} else {
				return -1; 
			}
		}

		public static void faturamentoAno(int ano, double faturamentoA, double faturamentoB) {
			System.out.printf("Ano %d: Empresa A - R$ %.2f, Empresa B - R$ %.2f\n", ano, faturamentoA, faturamentoB);
		}
	}

//Duas empresas, Empresa A e Empresa B, possuem faturamentos iniciais e taxas de crescimento anuais distintas:
//Empresa A tem um faturamento de R$ 500.000 e cresce 8% ao ano.
//Empresa B tem um faturamento de R$ 1.200.000 e cresce 4% ao ano.
//Escreva um programa para calcular em quantos anos o faturamento da Empresa A ultrapassará o da Empresa B.
//O faturamento das duas empresas deve ser mostrado ano a ano.
//Além disso, o programa deve parar a simulação caso o número de anos ultrapasse 50 anos e exibir uma mensagem informando se a ultrapassagem ocorreu ou não.