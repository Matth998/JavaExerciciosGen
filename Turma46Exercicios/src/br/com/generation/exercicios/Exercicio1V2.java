package br.com.generation.exercicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio1V2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		String dataLida, dataFormat;
		Date dataConvertida, atual;
		long diasVivido;
		
		System.out.println("Digite sua data de nascimento: ");
		dataLida = leia.next();
		
		for (int i = 0; i < 5; i++)  
		       System.out.println();  
		
		try {
			
			dataConvertida = data.parse(dataLida);
			
			dataFormat = data.format(dataConvertida);
			
			System.out.println("Essa foi a data informada: " + "\n" + dataFormat);
			
			atual = Calendar.getInstance().getTime();
			
			System.out.println("Estamos na data: " + data.format(atual));
			
			diasVivido = (atual.getTime() - dataConvertida.getTime());
			
			System.out.println("Você viveu: " + diasVivido/ 86400000L + " dias.");
			
			
		}catch(ParseException e){
			
			System.out.println("Data invalida, por favor, verifique e coloque novamente.");
			
		}
		
		leia.close();

	}
}


