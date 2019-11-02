# AREP-Laboratorio9

## Planteamiento de problema

El problema definido para la escalabilidad de esta aplicación sera el ordenamiento de una cadena dada, este problema nos permitira observar que a mayor cantidad de datos que se ingresen este va a poder generar mas instancias del servidor para poder asi tratarlos a todos de manera eficiente.

## Arquitectura de la solucion

La arquitectura presentada para la solucion es presentada en el siguiente diagrama de despliegue:

![Imagenes](https://github.com/danielrodriguezvillalba/AREP-Laboratorio9/blob/master/imagenes/DiagramaDeDespliegue.PNG)

Sin embargo el ordenamiento de este arreglo de datos dada se realizo con la implementacion del algoritmo burbuja, para poder realizarlo asi de manera eficiente el ordenamiento de el arreglo de numeros dado.

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
