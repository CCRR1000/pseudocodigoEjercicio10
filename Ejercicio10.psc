Algoritmo Ejercicio10
	
	Definir sumaNum, multiplo6, menor10 como Entero
	
	Repetir
		Escribir "Ingrese un número:"
		Leer num
		
		sumaNum <- sumaNum + num
		
		Si num MOD 6 = 0 Entonces
			multiplo6 <- multiplo6 + 1
		Fin Si
		
		Si num <=10 Y num > 0 Entonces
			menor10 <- menor10 + 1
		Fin Si
		
	Hasta Que sumaNum >= 1000
	
	Escribir "Múltiplos de 6: " multiplo6
	Escribir "Suma de números entre 1 y 10: " menor10
	
FinAlgoritmo
