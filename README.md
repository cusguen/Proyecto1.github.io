# Curso de Conduccion

En su labor como programador de software, ha sido elegido para desarrollar una aplicación solicitada por un instructor de una academia de conducción. Este instructor desea poder computar el promedio de los aprendices a través de 3 (tres) evaluaciones distintas durante la duración de un curso de conducción particular. Las evaluaciones comprenden un examen teórico que vale un 20%, una prueba de habilidades de conducción en un circuito cerrado que vale un 30% y finalmente una evaluación de manejo en condiciones de tráfico real que vale un 50%. Cada una de estas pruebas se califica en una escala del 0 al 100. En esta escuela de conducción debe calcular y mostrar el promedio de las puntuaciones de las tres pruebas y ver si el curso tiene un buen o un mal promedio general. Como información básica de cada aprendiz se debe registrar numero de identificación, nombre, tipo de licencia que está aplicando

## Historia de usuario 
![HU](https://github.com/jhoanjv/proyectoPoo/assets/75825013/e948b3d5-b720-476a-af59-c8861e14cd2b)

## Caso de uso
![Caso de uso](https://github.com/jhoanjv/proyectoPoo/assets/75825013/f45ac259-ea44-41a0-89d9-0714a37f481d)

## DFD
![DFD](https://github.com/jhoanjv/proyectoPoo/assets/75825013/8e4d085e-62ec-402a-94cd-fbf33263be85)

## Pseudocódigo

Algoritmo cursoConduccion
	Dimension identificaciones[50],nombres[50],cursos[50],notauno[50],notados[50],notatres[50]
	Definir cedula, nombre, curso Como Cadena
	Definir numeroEstudiantes, i Como Entero
	Definir notaTeoria, notaCircuito, notaCarretera, promedio Como Real
	promedio <- 0
	Escribir 'Digite el número de aprendices:'
	Leer numeroEstudiantes
	Para i<-1 Hasta numeroEstudiantes Con Paso 1 Hacer
		Escribir 'Digite el numero de cedula del estudiante:'
		Leer cedula
		Escribir 'Digite el nombre del aprendiz:'
		Leer nombre
		Escribir 'Digite el tipo de licencia que esta aplicando:'
		Leer curso
		Escribir 'Digite la nota de teoria del aprendiz:'
		Leer notaTeoria
		Escribir 'Digite la nota de circuito del aprendiz:'
		Leer notaCircuito
		Escribir 'Digite la nota de carretera del aprendiz:'
		Leer notaCarretera
		identificaciones[i] <- cedula
		nombres[i] <- nombre
		cursos[i] <- curso
		notauno[i] <- notaTeoria
		notados[i] <- notaCircuito
		notatres[i] <- notaCarretera
	Fin Para
	Para i<-1 Hasta numeroEstudiantes Con Paso 1 Hacer
		promedio <- promedio +(((notauno[i]*0.2)+(notados[i]*0.3)+(notatres[i]*0.5))/3)/numeroEstudiantes
	Fin Para
	
	Escribir 'El promedio es: ', promedio
	
	Si promedio >= 10 Entonces
		Escribir 'El curso tiene un buen promedio'
	SiNo
		Escribir 'El promedio del curso es bastante malo'
	Fin Si
	
FinAlgoritmo
