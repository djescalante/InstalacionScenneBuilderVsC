# InstalacionScenneBuilderVsC
Procedimiento Para Instalar Scene Builer En Visual Studio Code

1.	Instalar scene builder https://gluonhq.com/products/scene-builder/
2.	Crear un nuevo proyecto de java desde la paleta de comandos.
3.	Usar la opción no buidtools.
4.	Seleccionamos la carpeta y colocamos un nombre al proyecto.
5.	Tener instaladas las extensiones javafxsupport y javafxml viewer en vscode.
6.	Seleccionamos la app.java y vamos al menú inferior java Project.
7.	Damos más en el botón para cargar las librerías referenced librarys.
8.	Buscamos la carpeta donde tenemos descomprimidos el javafx sdk.
9.	Seleccionamos todos los archivos de la carpeta lib y le damos aceptar.
10.	En el menú run/ejecutar vamos la opción de configuración y le damos en add configuration después de recuest y antes de mainclass vamos a pegar la siguiente línea de código y para evitar fallas lo mejor es tener los archivos de las librerías javafx sdk en una ruta de directorio que no tenga espacios o en la raíz del disco duro. 
lo siguiente es una ruta ejemplo y la última opción es en caso que me lleven la contraria y usen una ruta con espacios.
 asi 
"vmArgs": "--module-path C:/Users/aquiVaTuNombreDeUsuario/Documents/MisionTicModulo2Java/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml",
o asi 
"vmArgs": "--module-path C:/Users/%username%/Documents/MisionTicModulo2Java/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml",

"vmArgs": "--module-path \"C:/Users/Darkcaos64/Documents/MisionTicModulo2Java/javafx-sdk-11.0.2/lib\" --add-modules javafx.controls,javafx.fxml",

11.	Agregar la ruta del ejecutable en la configuración de la extensión de java fxml viewer 
Ir a la extensión y luego a configuración en el menú extensiones - fxml viewer – ejecutable pegar la ruta del scenne builder en mi caso es 
C:\Users\Darkcaos64\AppData\Local\SceneBuilder\SceneBuilder.exe
Este último paso es con el fin de abrir desde el icono del ojito en VScode el formulario en Scene Builder.
****
