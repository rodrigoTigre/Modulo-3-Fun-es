package conversor1;

import java.util.Scanner;

public class conversor1 {
	private static Scanner entrada;

	public static void menu(){
		System.out.println("  ============================");            
		System.out.println(" | (1) Bin�rio Em Decimal     |");
		System.out.println(" | (2) Octal Em Decimal       |");
		System.out.println(" | (3) Hexadecimal em Decimal |");
		System.out.println(" | (4) Decimal em Bin�rio     |");
		System.out.println(" | (5) Decimal em Octal       |");
		System.out.println(" | (6) Decimal em Hexadecimal |");
		System.out.println(" | (0) Sair                   |");
		System.out.println("  ============================");
		System.out.println("Escolha a op�ao");
    }

    public static void BinDec(){
        System.out.println("Voc� entrou no m�todo Bin�rio Decimal");
    }
    
    public static void OctDec(){
        System.out.println("Voc� entrou no m�todo Octal Decimal");
    }
    
    public static void HexDec(){
        System.out.println("Voc� entrou no m�todo Hexadecimal Decimal");
    }
    
    public static void DecBin(){
        System.out.println("Voc� entrou no m�todo Decimal Bin�rio");
    }
    public static void DecOct(){
        System.out.println("Voc� entrou no m�todo Decimal Octal");
    }
    public static void DecHex(){
        System.out.println("Voc� entrou no m�todo Decimal Hexadecimal");
    }
    public static void Sair(){
        System.out.println("Voc� voltou ao menu principal");
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
                System.out.println("Op��o inv�lida.");
            }
        } while(opcao != 0);
		for(int i = 0; i < 100; i++)
		{

		}
    }
}