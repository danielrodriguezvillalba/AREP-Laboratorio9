# AREP-Laboratorio9

## Autores:
* Daniel Felipe Rodriguez Villalba

## Planteamiento de problema

El problema definido para la escalabilidad de esta aplicación sera el ordenamiento de una cadena dada, este problema nos permitira observar que a mayor cantidad de datos que se ingresen este va a poder generar mas instancias del servidor para poder asi tratarlos a todos de manera eficiente.

## Arquitectura de la solucion

La arquitectura presentada para la solucion es presentada en el siguiente diagrama de despliegue:

![Imagenes](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/DiagramaDeDespliegue.PNG)

Sin embargo el ordenamiento de este arreglo de datos dada se realizo con la implementacion del algoritmo burbuja, para poder realizarlo asi de esta manera y que sea menos eficiente el ordenamiento de el arreglo de numeros dados.

## Tutorial

### EC2

Lo primero que debemos hacer para poder cumplir el objetivo de este tutorial es crear nuestro servidor EC2 en Amazon Web Services, por lo cual debemos seguir estos pasos:

Para crear una maquina virtual EC2 en AWS es necesario ingresar a la cuenta de aws educate, al estar ahi en el desplegable de servicios se debe pulsar en la opcion de EC2 que se muestra a continuacion.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/EC1.PNG)

Estando en este menú debe dirigirse a la opcion Launch Intance para asi poder crear la maquina virtual.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/EC2.PNG)

Paso siguiente debe seleccionar el tipo de maquina virtual que desea lanzar (recomendada la que se encuentra subrayada de amarillo) y al boton select sobre la que se quiere elegir.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/EC3.PNG)

Teniendo esto realizado es importante seleccionar la opcion subrayada para que asi no nos genere ningun costo y pulsar el boton de Review and launch.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/EC4.PNG)

Estando en la siguiente pantalla, en la cual se muestra el resumen de como vamos a crear nuestra maquina virtual se debe  pulsar en el boton de Launch.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/EC5.PNG)

Al pulsar el boton Launch, esto nos dirige a la siguiente ventana en la que si se tiene una Key disponible, se puede seleccionar una, sin embargo si no se tiene se debe poner el nombre que se quiera y se debe descargar y guardar en un lugar facil de recordar ya que esta nos servira para lanzar mas instancias de otras maquinas, paso siguiente se habilita la opcion de Launch Instance.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/EC6.PNG)

Listo, nuestra maquina visrtual S2 esta creada y nos saldra este aviso informandonos que quedo bien hecha.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/EC7.PNG)

### Depliegue la solución en AWS en EC2.

Para el despliegue de nuestra solucion en nuestra maquina EC2 ya creada, primero que todo hay que estar en una maquina Linux, estando ahi debemos ejecutar desde un IDE nuestra aplicacion para que esta genere un .jar el cual vamos a subir a nuestra maquina, sin embargo esto lo explicaremos bien en los siguientes pasos.

Ya que tenemos nuestra maquina EC2 corriendo procedemos a seleccionarla y pulsar el boton de connect, lo cual nos desplegara una ventana como la que aparece a continuacion.

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/CON1.PNG)

Al realizar estos pasos debeos tener en cuenta que la llave debe estar ubicada sobre el mismo directorio en el que se encuentra nuestro .jar, asi.

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/CON2.PNG)

Al momento de realizar los pasos que nos indicaron realizamos la conexion y esto debe aparecer en la terminal 

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/CON3.PNG)

Paso seguido debemos conectar via SFTP e ingresar el comando mostrado antes y hacerle put a nuestro jar generado por lo cual se debe hacer de la siguiente forma y nos aparecera como se puede observar.

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/CON4.PNG)

Procedemos a conectarnos por el protocolo SSH para poder probar que nuestra aplicacion esta corriendo en el servidor EC2 por lo cual esto se vera asi:

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/CON5.PNG)

### Cree un AMI a partir de esta máquina.

Para crear el AMI y su grupo de escalabilidad se debe realizar lo siguiente:

Debemos iniciar yendo a la seccion de instances, en Launch templates y pulsamos en Create Launch templates:

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AC2-1.PNG)

Ponemos el respectivo nombre y seleccionamos la opcion de Search for AMI

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AC2-2.PNG)

Nos dirigira a la siguiente pestaña, donde seleccionamos la opcion marcada

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AC2-3.PNG)

Paso siguiente Seleccionamos lo que se muestra en la imagen

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AC2-4.PNG)

A continuacion vamos a crear una interfaz de red por lo que llenamos los campos tal como se muestra a continuacion

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AC2-5.PNG)

Y finalmente pulsamos en Create launch template

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AC2-6.PNG)

Nos aparecera mensaje de confirmacion para confirmar que la template se creo satisfactoriamente

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AC2-7.PNG)

A continuacion pulsamos en donde nos muestra para asignar y crear un grupo de autoescalabilidad

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AC2-8.PNG)

Debemos ir a la seccion de Crear grupo de Autoescaling y pulsar el boton que dice esto

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE1.PNG)

Nos direccionara a la siguiente parte y seleccionaremos en la opcion de configuracion de lanzamiento y damos en crear ua configuracion de lanzamiento nueva

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE2.PNG)

A continuacion seleccionamos la instancia de linux2 que muestra a continuacion

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE3.PNG)

Seleccionamos el t2.micro ya que no nos generara valor a menos que nuestra cuenta tenga mas de 12 meses de antiguedad

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE4.PNG)

Debemos llenar los campos que se encentran subrayados con la informacion requerida para poder seguir.

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE5.PNG)

Y seleccionamos siguiente hasta esta opcion en la que pulsamos el boton de crear configuracion de lanzamiento y seleccionamos una key que hallamos creado anteriormente

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE6.PNG)

Esto automaticamente nos direcciona a la creacion de un grupo de auto escalamiento y llenamos lo requerido y pulsamos en configurar politicas de escalado

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE7.PNG)

Y pulsamos siguiente hasta esta ventana en la que creamos el grupo de autoescalabilidad

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE8.PNG)

Nos saldra un aviso de creacion exitoso como el de a continuacion

![IMAGEN](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/AE9.PNG)

Y listo, tenemos nuestro AMI y grupos de autoescalabilidad configurados, por lo cual lo conectamos a la instancia EC2 ya creada.
