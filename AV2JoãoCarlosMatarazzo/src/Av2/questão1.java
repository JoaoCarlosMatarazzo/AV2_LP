package Av2;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Av2.ManipuladorArquivo;

import java.util.ArrayList;
public class quest�o1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); {
			
			int car, j=1, i=0, t=0, u=0;
			int totalCharacters = 0;
			double valor = 0;
			int ano;
			
			ArrayList cadastro = new ArrayList();
	        
			String marca,modelo;
			do {
			System.out.println("Por favor escolha qual op��o deseja:");
			System.out.println("1-Cadastrar carro.");
			System.out.println("2-Listagem Geral.");
			System.out.println("3-Mostrar Resultados.");
			System.out.println("4-SAIR.");
			i=ler.nextInt();
			switch(i){
			case 1:
				System.out.println("Ano:");
				ano=ler.nextInt();
				if(ano<=2022) 
				{
			/*Cadastrar Carro: o usu�rio dever� entrar com as seguintes informa��es: Marca,
Modelo, Ano e Valor em seguida salvar os dados em um ArrayList. Exemplo de entrada
de dados:

Citro�n - Aircross Live 1.5 Flex 8V 5P Mec. Flex - 2018 - R$60.743,00
Honda - City Sedan Dx 1.5 Flex 16V Aut. Flex - 2017 - R$71.432,00*/
				
				System.out.println("Certo, agora por favor apresente as informa��es a seguir:");
				System.out.println("Marca do carro:");
				marca=ler.next();
				System.out.println("Modelo:");
				modelo=ler.next();
				System.out.println("Valor do carro:");
				valor=ler.nextDouble();
				
				cadastro.add(marca+"\r\n"+modelo+"\r\n"+Integer.toString(ano)+"\r\n"+Double.toString(valor)+"\r\n");
				
				ManipuladorArquivo.escritor(cadastro);
				
				System.out.println(marca+";"+modelo+";"+ano+";R$"+valor);
				t++;
				}
				break;
			
			/*Listagem Geral: Mostrar todos os registros cadastrados no Arraylist.*/
			case 2:
					
				System.out.println(cadastro);
				
			break;		
			/*Mostrar Resultados: O programa dever� contar o n�mero de carros que possuem valor
			acima ou igual a R$ 50.000,00. 
			E calcular a m�dia dos anos de todos os ve�culos
			cadastrados.*/
			case 3:
				if(valor>=50000 )
					System.out.println("");
				else
					System.out.println("Desculpe professora, n�o sei fazer esta quest�o.");			
								
			break;
			
			case 4:		
		        System.out.println("Agrade�o a preferencia, tenha um �timo dia.");
				break;
				
					}
				}while(i!= 4);
			}
		}
}
