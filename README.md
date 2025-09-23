# 🚗 Proyecto POO – Vehículos

![Java](https://img.shields.io/badge/Java-17+-red?logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?logo=uml&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 📌 Descripción

Este proyecto ejemplifica los principios de **Programación Orientada a Objetos (POO)** en **Java**, utilizando una jerarquía de clases que representan diferentes tipos de vehículos.  
Incluye **abstracción, herencia, polimorfismo e interfaces**, aplicados a un caso práctico.

---

## 🚀 Características

- **Clase abstracta `Vehiculo`** con atributos comunes y método abstracto `mover()`.
- **Subclases**: `Carro`, `Moto` y `Camion`, cada una implementando su propia lógica de movimiento.
- **Interfaz `Combustible`** implementada en `Carro` y `Camion`.
- **Arreglo polimórfico** para demostrar el uso de herencia y polimorfismo.
- **Diagrama UML** para la representación visual de la jerarquía.

---

## 📂 Estructura del proyecto

```bash
vehiculosPPOO/
│
├── src/
│   ├── Vehiculo.java
│   ├── Carro.java
│   ├── Moto.java
│   ├── Camion.java
│   ├── Combustible.java
│   └── Main.java
│
└── README.md
```

---

## 🛠️ Requisitos

- **Java JDK 17+**
- **IntelliJ IDEA** o **Eclipse** (opcional)
- Compilar y ejecutar con:

```bash
javac src/*.java
java src.Main
```

---

## ▶️ Ejemplo de salida

```text
El carro Toyota Corolla se mueve por carretera.
La moto Yamaha FZ se mueve sobre dos ruedas.
El camión Volvo FH se mueve transportando carga pesada.
```

---

## 📊 Diagrama UML

![Diagrama UML](diagrama-uml-mermaid.md)

---

## ✨ Conceptos aplicados

- **Abstracción**
- **Herencia**
- **Polimorfismo**
- **Interfaces**

---

## 🤝 Contribución

1. Haga un *fork* del repositorio.
2. Cree una rama con la nueva funcionalidad.
3. Realice los cambios y haga *commit*.
4. Envíe un *Pull Request*.

---

## 📄 Licencia

Este proyecto está bajo la licencia **MIT**.  
Puede utilizarlo con fines educativos y académicos.

---

👨‍💻 Desarrollado con ❤️ en Java – POO
