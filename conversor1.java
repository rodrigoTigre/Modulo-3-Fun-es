package conversor1;

import java.util.Scanner;

public class conversor1 {
	private static Scanner entrada;

	public static void menu(){
		System.out.println("  ============================");            
		System.out.println(" | (1) Binário Em Decimal     |");
		System.out.println(" | (2) Octal Em Decimal       |");
		System.out.println(" | (3) Hexadecimal em Decimal |");
		System.out.println(" | (4) Decimal em Binário     |");
		System.out.println(" | (5) Decimal em Octal       |");
		System.out.println(" | (6) Decimal em Hexadecimal |");
		System.out.println(" | (0) Sair                   |");
		System.out.println("  ============================");
		System.out.println("Escolha a opçao");
    }

    public static void BinDec(){
        System.out.println("Você entrou no método Binário Decimal");
    }
    
    public static void OctDec(){
        System.out.println("Você entrou no método Octal Decimal");
    }
    
    public static void HexDec(){
        System.out.println("Você entrou no método Hexadecimal Decimal");
    }
    
    public static void DecBin(){
        System.out.println("Você entrou no método Decimal Binário");
    }
    public static void DecOct(){
        System.out.println("Você entrou no método Decimal Octal");
    }
    public static void DecHex(){
        System.out.println("Você entrou no método Decimal Hexadecimal");
    }
    public static void Sair(){
        System.out.println("Você voltou ao menu principal");
    }
    
    public static void main(String[] args) {
        int opcao;
        entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                BinDec();
                break;
                
            case 2:
                OctDec();
                break;
                
            case 3:
                HexDec();
                break;
                
            case 4:
                DecBin();
                break;
            case 5:
                DecOct();
                break;
            case 6:
                DecHex();
                break;

            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
		for(int i = 0; i < 100; i++)
		{

		}
    }
}