<img src='http://rudraholidays.in/images/Parking.png' height='150px' width='150px'></img>


It's a homework for "programming" subject.


Gregorio Fernandez, Valladolid, Spain

Teacher: Macarena Cuenca.

Students:

-Santiago Hoyos Zea

-Jesús Rodríguez Fernandez


:)

Description in spanish only,we are sorry:


---

> PRÁCTICA 2

Fecha de entrega: 20 de marzo de 2015

Realizar un programa que simule una máquina de un parking. La máquina debe
permitir al usuario estacionar un coche en el parking y sacarlo.
El parking tiene una capacidad para 60 coches, distribuidos en 3 plantas de 20
plazas cada una.

Cuando un coche llega al parking, la máquina expide un ticket, suponiendo que el
parking no está completo, sino, no se permitirá la entrada de más coches hasta que
haya plazas disponibles.

Para sacar el coche del parking, previamente se abonará la cantidad de dinero
correspondiente al tiempo estacionado. El precio por minuto de estacionamiento es
de 0,50€, y el tiempo de estacionamiento se computa por minutos completos, de
tal forma que 1 min. 01 seg. se computa como 2 min.

La máquina admite monedas de los siguientes tipos: 1€ 2€ 0,50€ 0,20€ 0,10€ y
0,05 €. Si se introduce una cantidad de dinero superior a la cantidad a pagar, la
máquina dará la vuelta en el tipo de moneda más grande posible.



> DISEÑO


Implementa las clases necesarias para crear un diseño orientado a objetos de
acuerdo con las siguientes indicaciones:

1- Una clase PRINCIPAL será la encargada de crear una instancia de la
MAQUINA del parking, pasándola el precio/minuto como un double.


2- Una vez creada la MAQUINA se creará el TERMINAL, a través del cual el
usuario podrá utilizar la máquina, y se conectará a la misma. Es decir, a
través del TERMINAL se permitirá realizar las acciones de estacionar y
sacar el coche del parking.

3- El TICKET de entrada que se genera al estacionar un coche en el parking
contendrá la siguiente información: un identificador único, matrícula del
coche, fecha/hora de entrada y UBICACIÓN (planta/plaza) asignada.


La MAQUINA tendrá los siguientes componentes:

1- El TERMINAL, a través del cual se podrá controlar el funcionamiento de la
máquina.

2- Un DEPOSITO de monedas que llevará el control de la cantidad de
monedas de cada tipo disponibles en la máquina. Para ello utiliza un Map.
Inicialmente tendrá 100 monedas de cada tipo.

3- Una lista (ArrayList) con los tickets generados.

4- El plano de plazas del parking, modelado a través de una matriz, a través
del cual se podrá controlar la disponibilidad de sitio.

INTERFAZ


El usuario utilizará la máquina a través de una consola que se mostrará en el
TERMINAL, la cual dará opción al usuario de estacionar y sacar un coche.
A continuación se muestra un ejemplo de ejecución, en el que se puede observar la
funcionalidad requerida en ambas operaciones.



 Ejemplo de ejecución:


<img src='https://parkingjavaapp.googlecode.com/svn/trunk/ejemploejecucuoin1.png'></img>