Algoritmo Multiplos_5
	aux <- 0
	multiplo5 <- 0
	Escribir 'Bienvenido mostraremos multiplos de 5 hasta que ingrese la letra S (MAYUSCULA o MINUSCULA)'
	Repetir
		alaux <- Aleatorio(5,10000)
		aux <- alaux MOD 5
		numeroMultiplo <- alaux/5
		Si aux==0 Entonces
			Escribir 'Multiplo de 5 #',numeroMultiplo
			Escribir 'El multiplo Es: ',alaux
			Escribir 'Ingrese la Letra S si desea Salir o Sino ingrese cualquier otra letra '
			Leer op
		FinSi
	Hasta Que op=='S' O op=='s'
	Escribir 'Termino la generacion aleatoria de multiplos de 5 '
FinAlgoritmo
