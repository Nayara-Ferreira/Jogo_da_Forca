import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Jogo_da_Forca {

	public static void main(String[] args)throws IOException, InterruptedException{
		
		int numeroErros=0;
		
		System.out.println("Bem-vindo ao jogo da velha");
		System.out.println();
		
		System.out.println("	D I C A");
		System.out.println("     === Pais ===");
		System.out.println();
		System.out.println("  Será sorteado um pais aleatorio");
		System.out.println("  Voce devera digitar as letras para tentar acertar a palavra");
		System.out.println("  O numero de tracos representa a quantidade de letras da palavra");
		System.out.println("  Se voce acertar todas as letras, voce ganha, se errar e GAME OVER!!!");
		System.out.println();
		System.out.println("       BOA SORTE!");
		System.out.println();
		
		
		String[] words = { "SICILIA", "BRASIL", "ALEMANHA", "CHINA", "CHINA", "JAPAO", "EGITO", "FRANCA", "CANADA","INGLATERRA"};

		Random gerador = new Random();
		int contador = gerador.nextInt(10);
		
		String palavraAleatoria = words[contador];
		
		char[] acertos = new char[palavraAleatoria.length()];
		for (int i = 0; i < acertos.length; i++) {
			acertos[i] = 0;
		}
			
		Scanner caractere = new Scanner(System.in);

		String letrasDigitadas = ""; 
		char letra;
		boolean vitoria = true;
			
			System.out.print("\n | |================" + " \n | |		  |" + " \n | |		  +");

			for(int i = 0; i <= 15; i++){
				System.out.print("\n | | ");
			
			}
			for (int i = 0; i < palavraAleatoria.length(); i++) {
			System.out.print(" _ "); 
			}
			Scanner digita = new Scanner(System.in);

			letrasDigitadas = "";
			
		do {
			System.out.print("Digite uma letra: ");
			letra = caractere.next().toUpperCase().charAt(0); 
			letrasDigitadas += " " + letra;
			
			boolean erro = true;
			for (int i = 0; i < acertos.length; i++) {
				if (letra == palavraAleatoria.charAt(i)) {
					acertos[i] = 1;
					erro = false;
						System.out.print("\n | |================" + " \n | |		  |" + " \n | |		  +");

							for(int indice = 0; indice <= 15; indice++){
								System.out.print("\n | | ");	
							}
				}
			}
			

			if (erro) { 
				numeroErros = numeroErros-1;
			}
			if(numeroErros == -1){
				System.out.print("\n | |================" + " \n | |		  |" + " \n | |		  +");

				for(int j = 0; j <= 15; j++){
					System.out.print("\n | | ");
						if(j == 0){
							System.out.print("           (T-T)");	
						}
				}
			
			}
			
			if(numeroErros == -2){
				System.out.print("\n | |================" + " \n | |		  |" + " \n | |		  +");

				for(int j = 0; j <= 14; j++){
					System.out.print("\n | | ");
						if(j == 0){
							System.out.print("           (T-T)");
							System.out.print("\n | |	          |  ");
						}
				}
			}
			if(numeroErros == -3){
				System.out.print("\n | |================" + " \n | |		  |" + " \n | |		  +");

				for(int j = 0; j <= 13; j++){
					System.out.print("\n | | ");
						if(j == 0){
							System.out.print("           (T-T)");
							System.out.print("\n | |	          |  ");
							System.out.print("\n | |   	       I  |  I");
						}
				}
			
			}
			if(numeroErros == -4){
				System.out.print("\n | |================" + " \n | |		  |" + " \n | |		  +");

				for(int j = 0; j <= 12; j++){
					System.out.print("\n | | ");
						if(j == 0){
							System.out.print("           (T-T)");
							System.out.print("\n | |	          |  ");
							System.out.print("\n | |   	       I  |  I");
							System.out.print("\n | |	       	  |  ");
						}
				}
			}
			if(numeroErros == -5){
				System.out.print("\n | |================" + " \n | |		  |" + " \n | |		  +");

				for(int j = 0; j <= 12; j++){
					System.out.print("\n | | ");
						if(j == 0){
							System.out.print("           (T-T)");
							System.out.print("\n | |	          |  ");
							System.out.print("\n | |   	       I  |  I");
							System.out.print("\n | |	       	  |  ");
							System.out.print("\n | |          __// \\__");
							
						}
				}
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.print("\nGAME OVER!!!!");
			}
					vitoria = true;
					for (int i = 0; i < palavraAleatoria.length(); i++) {

						if (acertos[i] == 0) { 
							System.out.print(" _ ");
							vitoria = false;
						
						} 
						else { 
							System.out.print(" " + palavraAleatoria.charAt(i) + " ");
						}
						
					}	
		}while (numeroErros != -5);
				
	}
		
}