# Curso de Conduccion

En su labor como programador de software, ha sido elegido para desarrollar una aplicación solicitada por un instructor de una academia de conducción. Este instructor desea poder computar el promedio de los aprendices a través de 3 (tres) evaluaciones distintas durante la duración de un curso de conducción particular. Las evaluaciones comprenden un examen teórico que vale un 20%, una prueba de habilidades de conducción en un circuito cerrado que vale un 30% y finalmente una evaluación de manejo en condiciones de tráfico real que vale un 50%. Cada una de estas pruebas se califica en una escala del 0 al 100. En esta escuela de conducción debe calcular y mostrar el promedio de las puntuaciones de las tres pruebas y ver si el curso tiene un buen o un mal promedio general. Como información básica de cada aprendiz se debe registrar numero de identificación, nombre, tipo de licencia que está aplicando


# Historia de usuario
# Homes Sales Commission Calculator

Este programa calcula la comisión de ventas para un equipo de vendedores de casas. Permite ingresar la cantidad de vendedores, sus datos (ID, nombre) y el número de ventas realizadas. Luego, solicita ingresar el precio de cada inmueble vendido por cada vendedor y calcula la comisión total para el equipo.

## Problema Resuelto

El problema resuelto por este programa es el cálculo de la comisión de ventas para un equipo de vendedores de casas. Al ingresar los datos de los vendedores y los precios de los inmuebles vendidos, el programa calcula la comisión total para el equipo basada en un porcentaje fijo (3%).

## Historia de usuario 
![HU](https://github.com/jhoanjv/proyectoPoo/assets/75825013/e948b3d5-b720-476a-af59-c8861e14cd2b)

## Caso de uso
![Caso de uso](https://github.com/jhoanjv/proyectoPoo/assets/75825013/f45ac259-ea44-41a0-89d9-0714a37f481d)

## DFD
![DFD](https://github.com/jhoanjv/proyectoPoo/assets/75825013/8e4d085e-62ec-402a-94cd-fbf33263be85)

## Pseudocódigo

A continuación se muestra el pseudocódigo del programa:

	Algoritmo calcular_comision
		definir ids,names Como Caracter 
		definir numSolds,sold, sumSolds,numEmpleados,i,j, comision Como Real
		
		sumSolds=0
		
		Imprimir "Digite la cantidad de empleados: "
		Leer numEmpleados
		
		Dimension ids[numEmpleados],names[numEmpleados],numSolds[numEmpleados] 
		
		Para i=1 Hasta numEmpleados Con Paso 1
			Imprimir "Digite el id del vendedor ",i," :"
			Leer ids[i]
			Imprimir "Digite el nombre del vendedor:"
			leer names[i]
			Imprimir "Digite el numero de ventas del vendedor:"
			leer numSolds[i]
			
			Para j=1 Hasta numSolds[i] Con Paso 1
				imprimir "Digite el precio del inmueble ",j," del vendedor ", names[i],": "
				leer sold
				sumSolds= sumSolds + sold
			FinPara
			
		FinPara
		
		comision = sumSolds*0.03
		
		Imprimir "La comision para el equipo es de: ",comision
		
	FinAlgoritmo
