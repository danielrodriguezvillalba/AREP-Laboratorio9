package edu.eci.arem.lab9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@SpringBootApplication
public class Lab9Application {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\n Ingrese cantidad de Datos a Ingresar : ");
		int canti = Integer.parseInt(in.readLine());
		int arreglo[] = new int[canti];
		for (int i = 0 ; i < arreglo.length;i++){
			arreglo[i] = Integer.parseInt(in.readLine());
		}
		int[] ordenado = ordenamientoBurbuja(arreglo);
		String res = "[";
		for (int i = 0 ; i < ordenado.length;i++) {
			res += ordenado[i] + ", ";
		}
		res = res.substring(0,res.length()-2);
		res+= "]";
		System.out.println(res);
	}

	public static int[] ordenamientoBurbuja(int arreglo[]) {
		for(int i = 0; i < arreglo.length - 1; i++) {
			for(int j = 0; j < arreglo.length - 1; j++) {
				if (arreglo[j] < arreglo[j + 1]){
					int actual = arreglo[j+1];
					arreglo[j+1] = arreglo[j];
					arreglo[j] = actual;
				}
			}
		}
		return arreglo;
	}


}
