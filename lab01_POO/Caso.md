# INGENIERÍA DE SOFTWARE II  
## Laboratorio N.° 01: POO – Caso MercaGo

### Contexto general
MercaGo es una empresa retail que está fortaleciendo su canal de ventas digitales. Como parte del equipo de desarrollo, se te ha encargado construir una primera versión del módulo de compras en línea. En esta versión inicial, el sistema deberá permitir registrar productos, diferenciarlos según su tipo, agregarlos a un carrito de compras y simular el proceso de pago.

El objetivo de este laboratorio es aplicar los conceptos fundamentales de **Programación Orientada a Objetos (POO)** en Java, utilizando clases, objetos, herencia, clases abstractas, interfaces, polimorfismo y listas.

---

## Ejercicio 01: Registro básico de productos

### Situación

El equipo de MercaGo necesita comenzar modelando los productos que ofrecerá en su plataforma digital. Para ello, se requiere una clase base que permita almacenar información importante de cada producto y mostrarla en pantalla.

### Tareas

1. Crear una clase llamada `Producto` con los siguientes atributos:
   - `nombre` (`String`)
   - `precio` (`double`)
   - `stock` (`int`)

2. Crear un método `mostrarInfo()` que imprima los datos del producto.

3. Desde el `main`, crear al menos 2 objetos de tipo `Producto` y mostrar su información.

4. Validar que el `precio` y el `stock` no puedan ser negativos.  
   Puedes hacerlo usando condicionales o lanzando una excepción.

---

## Ejercicio 02: Carrito de compras con distintos tipos de productos

### Situación

MercaGo ha ampliado su catálogo. Ahora no solo vende productos físicos, sino también productos digitales, como licencias, cursos o ebooks. Debido a ello, se necesita una solución más flexible que permita trabajar con distintos tipos de productos dentro del mismo carrito de compras.

### Tareas

1. Convertir la clase `Producto` en una **clase abstracta**, manteniendo sus atributos y declarando el método abstracto `mostrarInfo()`.

2. Crear al menos dos subclases que hereden de `Producto`:
   - `ProductoFisico`: con un atributo adicional `peso` (`double`)
   - `ProductoDigital`: con un atributo adicional `urlDescarga` (`String`)

3. Implementar el método `mostrarInfo()` en cada subclase, mostrando la información correspondiente según el tipo de producto.

4. Crear una clase `Carrito`, que contenga una lista de productos (`ArrayList<Producto>`), e implementar los siguientes métodos:
   - `agregarProducto(Producto producto)`: debe verificar que haya stock disponible y descontarlo si corresponde
   - `mostrarResumen()`: debe listar los productos agregados y mostrar el total a pagar

5. Desde el `main`, crear una lista mixta de productos físicos y digitales, permitir que el usuario seleccione cuáles agregar al carrito y, al final, mostrar el resumen de la compra.

---

## Ejercicio 03: Proceso de pago

### Situación

Una vez que el cliente de MercaGo ya agregó sus productos al carrito, el sistema debe permitir simular el pago. Para ello, se desea representar diferentes métodos de pago de forma flexible, de manera que en el futuro se puedan incorporar nuevos métodos sin afectar demasiado el sistema actual.

### Tareas

1. Crear una interfaz llamada `Pago` con el siguiente método:
   - `realizarPago(double monto): boolean`

2. Crear una clase abstracta llamada `MetodoPago` que implemente `Pago` y contenga un atributo:
   - `monto`

3. Crear dos clases concretas:
   - `PagoConTarjeta`: debe verificar si el número de tarjeta tiene 16 dígitos
   - `PagoConTransferencia`: debe simular una verificación simple, por ejemplo, validando si se ingresó un código de confirmación

4. Desde el `main`, permitir al usuario seleccionar el método de pago y mostrar si la operación fue exitosa o no.

---

## Nombres de archivos sugeridos

- `Producto.java`
- `ProductoFisico.java`
- `ProductoDigital.java`
- `Carrito.java`
- `Pago.java`
- `MetodoPago.java`
- `PagoConTarjeta.java`
- `PagoConTransferencia.java`
- `Main.java`

---

## Objetivo del laboratorio

Al finalizar este laboratorio, el estudiante podrá ser capaz de:

- modelar entidades básicas de un sistema usando clases y objetos;
- aplicar herencia y polimorfismo para representar distintos tipos de productos;
- utilizar clases abstractas e interfaces en un caso realista;
- trabajar con listas de objetos en Java;
- simular un flujo simple de compra en línea dentro del contexto de MercaGo.

---

## Nota

No es necesario implementar una interfaz gráfica. El laboratorio puede resolverse completamente desde consola, enfocándose en el modelado correcto de clases y en la lógica del sistema.