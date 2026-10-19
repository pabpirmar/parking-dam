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