# Líneas Curvas Con OpenGL

La práctica consiste en realizar un programa que muestre líneas rectas pero que en conjunto dan como resultado una línea curva en el exterior.
Para ello primero se explica el código fuente del programa realizado.
En principio se realiza la importación de librerías necesarias para realizar la práctica.

![image](https://user-images.githubusercontent.com/72232712/145736467-3cbf568b-7a2c-4574-af32-90c2feef4af1.png)

El siguiente bloque de código es la declaración de variables necesarias para realizar distintas acciones.

![image](https://user-images.githubusercontent.com/72232712/145736475-0a72c33d-c0eb-4fd9-bd99-b615afe206b1.png)

La función principal es importante debido a que es en esta parte donde empieza a ejecutarse el programa. En este bloque se realizan diversas configuraciones de la ventana para que se muestre al usuario.

![image](https://user-images.githubusercontent.com/72232712/145736485-3b02dd67-2b1b-4a22-8340-5b0fc17c9a7c.png)

La función init es parte de la librería OpenGL y se utiliza para inicializar los componentes del Canvas, este es un componente en el que se va a realizar el pintado del objeto.

![image](https://user-images.githubusercontent.com/72232712/145736495-10a318ef-dda7-4f05-86cb-8be7b8e55201.png)

En la función reshape no se realiza ninguna acción por ahora.

![image](https://user-images.githubusercontent.com/72232712/145736502-ed27252d-49b5-404b-8c11-29686e5ea521.png)

La función display es una de las funciones más importantes porque es aquí donde se programan las instrucciones para que el programa pinte lo que le estamos indicando.
Para esta práctica se asigna un color a las líneas, un ancho en pixeles.
En el método donde se indica que se pintará líneas se indican las coordenadas de las líneas y en el ciclo for también se indica los mismo.

![image](https://user-images.githubusercontent.com/72232712/145736510-bb0e6bde-8132-442d-8ab0-6acdef7d6320.png)

La última función por el momento no se realiza ninguna acción.

![image](https://user-images.githubusercontent.com/72232712/145736514-64300227-5b07-42ec-9f7b-105fa734c364.png)

Ahora que se ha explicado el código fuente, la siguiente parte es mostrar el resultado.
Como resultado hemos obtenido lo que se muestra en la siguiente figura. 

![image](https://user-images.githubusercontent.com/72232712/145736520-7995fba4-59bc-48aa-b3bd-0899e6f1c36a.png)
