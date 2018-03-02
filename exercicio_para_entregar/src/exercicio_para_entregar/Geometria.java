package exercicio_para_entregar;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Quadrado(2,2));
		figuras.add(new Retangulo(6,2));
		figuras.add(new Losango(4,3));
		figuras.add(new Trapezio(2,2,4));
		figuras.add(new Circulo(2));
		figuras.add(new Triangulo(6,4));
		for(Figura fig:figuras) {
			System.out.println(fig.getName());
			System.out.println("Area: "+fig.area());
			System.out.println("Perimetro: "+fig.perimetro());
			if(fig instanceof Diagonal) {
				System.out.println("Diagonal: "+((Diagonal)fig).calculaDiagonal());
			}
		}
		
		
		Cubo cubo = new Cubo(0, null, null);
		Quadrado quadrado = new Quadrado(0,0);
		quadrado.setAltura(2);
		quadrado.setBase(2);
		cubo.base = quadrado;
		cubo.altura = quadrado;
		cubo.setAltura2(2);
		System.out.println(cubo.getName());
		System.out.println("Area: "+cubo.area());
		System.out.println("Perimetro: "+cubo.perimetro());
		System.out.println("Volume: "+cubo.volume());
		
		Esfera esfera = new Esfera(null);
		Circulo circulo = new Circulo(0);
		circulo.setRaio(2);
		esfera.raio = circulo;
		System.out.println(esfera.getName());
		System.out.println("Area: "+esfera.area());
		System.out.println("Perimetro: "+esfera.perimetro());
		System.out.println("Volume: "+esfera.volume());
		
		Cilindro cilindro = new Cilindro(null,0);
		Circulo circulo2 = new Circulo(0);
		circulo2.setRaio(2);
		cilindro.setAltura(4);
		cilindro.raio = circulo2;
		System.out.println(cilindro.getName());
		System.out.println("Area: "+cilindro.area());
		System.out.println("Volume: "+cilindro.volume());
		
		Piramide piramide = new Piramide(null,null,0);
		Quadrado quadrado2 = new Quadrado(0,0);
		quadrado2.setBase(5);
		quadrado2.setAltura(5);
		piramide.base = quadrado2;
		piramide.altura = quadrado2;
		piramide.setAltura2(5);
		System.out.println(piramide.getName());
		System.out.println("Area: "+piramide.area());
		System.out.println("Perimetro: "+piramide.perimetro());
		System.out.println("Volume: "+piramide.volume());
	}
}
