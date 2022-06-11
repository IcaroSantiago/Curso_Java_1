import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Primeira Parte
//		int y = 2;
//		System.out.println(y);
//		double x = 10.35784; 
//		System.out.println(x);
//		System.out.printf("%.2f\n", x);
//		System.out.printf("%.4f%n", x);
//		Locale.setDefault(Locale.US);
//		System.out.printf("%.4f%n", x);
//		System.out.println("");
		
		// Segunda Parte 
//		System.out.println("Resultado = " + x + " Metros");
//		System.out.printf("Resultado = %.2f metros%n", x);
//		System.out.println("");
		
		// Terceira Parte
//		String nome = "Maria";
//		int idade = 31;
//		double renda = 4000.0;
//		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
//		System.out.println("");
		
		// Exercicio de Fixação 
//		String product1 = "Computer";
//		String product2 = "Office Desk";
//		
//		int age = 30;
//		int code = 5290;
//		char gender = 'F';
//		
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;
//		
//		System.out.println("Products: ");
//		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
//		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
//		System.out.println();
//		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
//		System.out.println();
//		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
//		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
//		Locale.setDefault(Locale.US);
//		System.out.printf("US decimal point: %.3f%n", measure);
//		System.out.println("");
		
		// Quarta Parte 
//		int x;
//		double y;
//		
//		x = 5;
//		
//		y = 2 * x;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		// Quinta Parte Double 
//		double b, B, h, area;
//		
//		b = 6.0;
//		B = 8.0;
//		h = 5.0;
//		
//		area = (b + B) / 2.0 * h;
//		
//		System.out.println(area);
		
		// Quinta Parte Float 
//		float b, B, h, area;
//		
//		b = 6f;
//		B = 8f;
//		h = 5f;
//		
//		area = (b + B) / 2f * h;
//		
//		System.out.println(area);
		
		// Sexta Parte 
//		int a, b;
//		double resultado;
//		
//		a = 5;
//		b = 2;
//		
//		resultado =  (double) a / b;
//		
//		System.out.println(resultado);
		
		//
		
//		double a;
//		int b;
//		
//		a = 5.0;
//		b = (int) a ;
//		
//		System.out.println(b);
		
		// Entrada de Dados String
//		Scanner sc = new Scanner (System.in);
//		
//		String x;
//		x = sc.next();
//		// sysout + ctrl + space 
//		System.out.println("Você digitou: " + x); 
//		
//		
//		sc.close();
		
		// Entrada de Dados Numero Inteiro 

//		Scanner sc = new Scanner(System.in);
//		
//		int x;
//		
//		x = sc.nextInt();
//		
//		System.out.println("Você digitu: " + x);
//		
//		sc.close();
		
		// Entrada de Dados Numero com ponto flutuante
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double x;
//		
//		x = sc.nextDouble();
//		
//		System.out.printf("Você digitou: %.2f%n ",  x);
//		
//		sc.close();
		
		// Entrada de Dados Caractere 
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		char x;
//		
//		x = sc.next().charAt(0);
//		
//		System.out.println("Você digitou:  " + x);
//		
//		sc.close();
		
		// Entrada de Dados ler vários dados na mesma linha 
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		String x;
//		int y;
//		double z;
//		
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		
//		System.out.println("Dados digitados: ");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
//		sc.close();
		
		// Entrada de dados  em varias linhas 
//		Scanner sc = new Scanner(System.in);
//		
//		int x;
//		String s1, s2, s3;
//		
//		x = sc.nextInt();
//		s1 = sc.nextLine();
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println("Dados digitados: ");
//		sc.nextLine();
//		System.out.println(x);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		sc.close();
		
		// Expressões Matematicas
//		double x = 3.0;
//		double y = 4.0;
//		double z = -5.0;
//		double A, B, C;
//		
//		A = Math.sqrt(x);
//		B = Math.sqrt(y);
//		C = Math.sqrt(25.0);
//		
//		System.out.println("Raiz quadrada de " + x + " = " + A);
//		System.out.println("Raiz quadrada de " + y + " = " + B);
//		System.out.println("Raiz quadrada de 25 = " + C);
//		
//		A = Math.pow(x, y);
//		B = Math.pow(x, 2.0);
//		C = Math.pow(5.0, 2.0);
//		
//		System.out.println(x + " elevado a " + y + " = " + A);
//		System.out.println(x + " elevado ao quadrado = " + B);
//		System.out.println("5 elevado ao quadrado = " + C);
//		
//		A = Math.abs(y);
//		B = Math.abs(z);
//		
//		System.out.println("Valor absoluto de " + y + " = " + A);
//		System.out.println("Valor absoluto de " + z + " = " + B);
		
		// Exercicios de Logica de Programação 
		/* Questão 1: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		 mensagem explicativa */
		
//		Scanner sc = new Scanner(System.in);
//		
//		int x, y, resultado;
//		
//		System.out.println("Digite os numero da soma: ");
//		
//		x = sc.nextInt();
//		y = sc.nextInt();
//		resultado = x + y;
//			
//		System.out.print("Soma de x + y =  " + resultado);
//		
//		
//		sc.close();
		
		/* Questão 2: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais */
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double a, r, pi = 3.14519;
//		
//		System.out.println("Digite o valor do Raio: ");
//		r = sc.nextDouble();
//		
//		a = pi * r * r;
//		
//		System.out.printf("Area =%.4f%n", a);
//
//		sc.close();
		
		/* Questão 3: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a, b, c,d, diferenca;
//
//	    a = sc.nextInt();
//	    b = sc.nextInt();
//	    c = sc.nextInt();
//	    d = sc.nextInt();
//
//	    diferenca = a * b - c * d;
//
//	    System.out.println("DIFERENCA = " + diferenca);	
//		
//		sc.close();
		
		
		/* Questão 4: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		int numero, horas;
//	    double valorHora, salario;
//	    
//	    System.out.println("Digite o Numero do Funcionario");
//	    numero = sc.nextInt();
//	    System.out.println("Digite Horas trabalhadas pelo funcionário: ");
//	    horas = sc.nextInt();
//	    System.out.println("Digite o valor R$ de cada hora");
//	    valorHora = sc.nextDouble();
//
//	    salario = valorHora * horas;
//
//	    System.out.println("Número do Funcionario = " + numero);
//	    System.out.printf("Salário = R$ %.2f%n", salario);
//		
//		sc.close();
		
		/* Questão 5: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		int cod1, cod2, qte1, qte2;
//	    double preco1, preco2, total;
//
//	    System.out.println("Digite o codigo do primeiro Produto: ");
//	    cod1 = sc.nextInt();
//	    System.out.println("Digite a Quantidade de Produtos: ");
//	    qte1 = sc.nextInt();
//	    System.out.println("Digite o Valor do Produto: ");
//	    preco1 = sc.nextDouble();
//	    
//	    System.out.println("Digite o codigo do Segundo Produto: ");
//	    cod2 = sc.nextInt();
//	    System.out.println("Digite a Quantidade de Produtos: ");
//	    qte2 = sc.nextInt();
//	    System.out.println("Digite o Valor do Produto: ");
//	    preco2 = sc.nextDouble();
//
//	    total = preco1 * qte1 + preco2 * qte2;
//	    
//	    System.out.printf("VALOR Total: R$ %.2f%n", total);
//		
//		sc.close();
		
		/* Questão 6: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();

		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
