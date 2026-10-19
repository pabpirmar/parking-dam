# parking-dam

## Relación entre diagramas y código

### 4.1. Diagrama 1 — Inicio e inicialización
#### Diagrama 1 — Inicio e inicialización

Este diagrama representa el arranque del programa: creación de Scanner, inicialización de variables y lectura del nombre del usuario. En Java se corresponde principalmente con el comienzo de main().

### 4.2. Diagrama 2 — Menú principal
#### Diagrama 2 — Menú principal

Este diagrama representa el menú, la lectura de la opción y la selección del flujo.

- las opciones 1, 2 y 3 vuelven a la comprobación del do-while,
- una opción inválida muestra un aviso y vuelve al menú,
- la opción 4 conduce a la salida y no repite el menú.
En Java esto se resuelve con mostrarMenu(), un switch y un do-while en main().

### 4.3. Diagrama 3 — Opción 1: Registrar vehículos
#### Diagrama 3 — Registrar vehículos

Este diagrama representa la validación de la cantidad, el inicio del for, la condición i <= cantidad, la petición de matrícula y horas, la validación de horas y la actualización de acumuladores.

- primero se valida cantidad > 0,
- después se inicia el bucle con i = 1,
- el for continúa solo mientras i <= cantidad,
- cuando la condición es falsa, se muestra el total registrado y se vuelve al menú.

### 4.4. Diagrama 4 — Opción 2: Calcular tarifa
#### Diagrama 4 — Calcular tarifa

Este diagrama muestra la validación de horas positivas y el cálculo horas × tarifaHora. También debes reconocer que la opción 2:

- incrementa totalCalculosTarifa,
- suma el importe a importeTotalCalculado,
- no modifica totalVehiculos ni totalHorasRegistradas.

### 4.5. Diagrama 5 — Opción 3: Mostrar resumen
#### Diagrama 5 — Mostrar resumen

Este diagrama corresponde al método mostrarResumen(...). Debe enseñar al alumnado a mostrar los datos acumulados de la sesión: usuario, vehículos, horas, cálculos de tarifa e importe total.

### 4.6. Diagrama 6 — Opción 4 y opción inválida
#### Diagrama 6 — Opción 4 y opción inválida

Este diagrama representa dos casos distintos:

- Opción 4: mostrar despedida, cerrar Scanner y finalizar.
- Opción inválida: mostrar aviso y volver al menú.

## 9.2. Trabajo personal

### Desarrollo y explicaciones personales

- **Creación y renombrado de la clase:**
  Empecé creando la clase `Main` en IntelliJ y la renombré a `Parking` haciendo clic derecho, eligiendo *Refactor > Rename*, para que el entorno actualizara todo solo.

- **Relación de los diagramas con el programa:**
    * **Diagrama 1:** El menú principal con el bucle `do-while` y el `switch`.
    * **Diagrama 2 (Opción 1):** El registro de vehículos, pidiendo la cantidad, validando con un `while` y acumulando las horas.
    * **Diagrama 3 (Opción 2):** Pide las horas de parking, las valida, llama al método de cálculo y actualiza el total.
    * **Diagrama 4 y 5 (Opción 3):** Muestra el resumen con el usuario, vehículos, horas, cálculos e importe total.
    * **Diagrama 6 (Opción 4 y Default):** Cierra el `scanner` para salir y avisa si pones una opción no válida.

- **Intercambio de datos entre métodos:**
  Los métodos estáticos reciben los datos, hacen la operación y devuelven un valor que guardo en la variable auxiliar `resultado` para actualizar los totales globales.

- **Especificación de métodos implementados (Firmas reales):**
    * **Método `calcularTarifa`:**
        * **Firma:** `public static float calcularTarifa(int horas, float tarifaHora)`
        * **Entrada:** Horas (entero) y tarifa por hora (decimal).
        * **Salida:** Importe total (decimal `float`).
        * **Finalidad:** Multiplicar el tiempo por el precio para sacar el coste.
    * **Método `sumarHoras`:**
        * **Firma:** `public static float sumarHoras(float acumulado, float nuevasHoras)`
        * **Entrada:** Horas que ya teníamos y las nuevas horas.
        * **Salida:** Suma total (decimal `float`).
        * **Finalidad:** Acumular las horas de los vehículos de forma modular.

### Registro de comprobaciones

- **Fase 0:**
    * **Fecha:** 18/10/2026
    * **Prueba realizada:** Crear el proyecto y la clase `Parking` con las variables globales.
    * **Resultado real:** Compila sin fallos.
    * **Commit GitHub:** `git commit -m "Fase 0: Estructura inicial y variables globales"`

- **Fase A:**
    * **Fecha:** 18/10/2026
    * **Prueba realizada:** Montar el menú con `do-while` y el `switch`.
    * **Resultado real:** El menú funciona y deja salir bien.
    * **Commit GitHub:** `git commit -m "Fase A: Implementacion del menu interactivo"`

- **Fase B:**
    * **Fecha:** 19/10/2026
    * **Prueba realizada:** Hacer el Caso 1 para registrar vehículos y validar con `while`.
    * **Resultado real:** Pide matrículas y horas bloqueando los números negativos o ceros.
    * **Commit GitHub:** `git commit -m "Fase B: Desarrollo del Caso 1 y validaciones"`

- **Fase C:**
    * **Fecha:** 19/10/2026
    * **Prueba realizada:** Programar el Caso 2 usando el método estático y la variable `resultado`.
    * **Resultado real:** Calcula bien el precio y suma los importes.
    * **Commit GitHub:** `git commit -m "Fase C: Incorporacion de metodos estaticos y Caso 2"`

- **Fase D:**
    * **Fecha:** 19/10/2026
    * **Prueba realizada:** Terminar el Caso 3 (resumen) y el Caso 4 (cerrar el `scanner`).
    * **Resultado real:** Todo el programa conecta y rinde de forma fluida.
    * **Commit GitHub:** `git commit -m "Fase D: Finalizacion de resumen, opcion salir y pruebas integrales"`

### Pruebas (Tabla de 12 pruebas)

| Nº Prueba | Qué tienes que probar | Resultado esperado | Resultado observado | ¿Falló? | Corrección aplicada |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **1** | Escribir un nombre | El menú saluda o identifica correctamente al usuario | Identificó al usuario correctamente | No | Ninguna |
| **2** | Elegir 9 | Error y regreso al menú | Mostró error y volvió al menú | No | Ninguna |
| **3** | Introducir 0 como cantidad de vehículos, después 2 | Rechaza 0 y acepta 2 | Rechazó el 0 y aceptó el 2 | No | Ninguna |
| **4** | Registrar 2 vehículos de 2 y 3 horas | Vehículos = 2; horas registradas = 5 | Se registraron 2 vehículos y 5 horas | No | Ninguna |
| **5** | En registro, introducir horas -2, después 4 | Repite la pregunta hasta un valor positivo | Repitió hasta recibir un valor positivo | No | Ninguna |
| **6** | Calcular tarifa de 2 horas | 3,00 € | Mostró 3,00 € correctamente | No | Ninguna |
| **7** | Calcular tarifa de 5 horas | 7,50 € | Mostró 7,50 € correctamente | No | Ninguna |
| **8** | En tarifa, introducir horas 0 y luego 3 | Rechaza 0; importe 4,50 € | Rechazó el 0 y dio 4,50 € | No | Ninguna |
| **9** | Calcular dos tarifas positivas | Contador de cálculos = 2 | El contador marcó 2 correctamente | No | Ninguna |
| **10** | Registrar vehículos y luego calcular una tarifa | La opción 2 no altera vehículos ni horas registradas | Los vehículos y horas se mantuvieron intactos | No | Ninguna |
| **11** | Elegir opción 3 después de varias operaciones | Muestra todos los acumulados correctos | Mostró todos los acumulados bien | No | Ninguna |
| **12** | Elegir opción 4 | Despedida y fin sin repetir menú | Mensaje de despedida y cierre limpio | No | Ninguna |

### Dificultades y soluciones

- **Dificultad:** Al guardar el resultado de sumar las horas en la variable `resultado`, Java se quejaba porque mezclaba números enteros y decimales.
- **Solución:** Cambié el tipo del método de suma a decimal (`float`) para que funcionara sin error.