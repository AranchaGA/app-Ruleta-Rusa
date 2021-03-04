## EXPLICACIÓN DE LA APP



En esta app llamada appRuletaRusa, podremos interactuar con hasta 10 jugadores.
El juego consiste en disparar dos revolver que hay en juego y ver cuáles de los jugadores quedan vivos o muertos.

Las acciones a realizar con estos jugadores son:
- Avanzar cilindro aleatoriamente
	- Esta acción gira el cilindro del revolver aleatoriamente
- Dispara
	- Esta acción hace que los propios jugadores se peguen un tiro con el revolver seleccionado en la opción 1, y te dirá si ha salido bala y ha matado o si ha tenido suerte y está vivo.
- Pista
	- Esta acción te dice en que posición se encuentra la bala dentro del cilindro del revolver, y cuál es la posición actual a disparar.
- Comprobar jugadores vivos
	- Esta acción mediante un booleano comprueba jugador por jugador cuál está vivo devolviendo true o cuál muerto devolviendo false.
- Fin
	- Esta acción para el juego y sale de la app.
	

	
## Pasos para descargar la app
#### Antes de empezar, comprobaremos la versión de java instalada y el jdk, en caso de no tenerlo sigue estos pasos
1. Abrimos cmd Windows + r 
2. Escribimos cmd intro
3. Escribimos java -versión, con esto comprobamos la versión y si lo tenemos instalado
4. En caso de no tener instalado java 
5. [Descargar Java]

[Descargar Java]:https://www.oracle.com/technetwork/es/java/javase/downloads/index.html


#### Descargar archivos de GitHub
1. Primero descargaremos los tres archivos de GitHub
2. Los guardaremos en nuestro escritorio o lugar seleccionado
3. Abrimos consola pulsando tecla Windows+R y escribimos cmd
4. Buscamos donde están alojados nuestros documentos, con el comando dir mostrará el contenido, seguido de cd (espacio) el nombre de la ubicación de nuestro archivo, por ejemplo cd Desktop.
5. Visualizamos nuestros archivo.java y escribimos javac el nombre de nuestro archivo.java
![Ejemplo imagen](/imagenes/ejemplojavac.png)

6. Se nos creará la class, y la ejecutamos escribiendo java (espacio) el nombre de la class y listo!

![Ejemplo imagen](/imagenes/archivos.png)

7. Estos pasos los repetimos con los tres archivos, dejando appRuletaRusa el último en compilar.
8. Una vez tenemos los tres archivos.class ejecutamos la app escribiendo java appRuletaRusa
![Ejemplo imagen](/imagenes/appRuleta.png)
9. Y A JUGAR! c:
