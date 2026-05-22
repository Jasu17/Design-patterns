# Patrones de Diseño en Java

Ejemplos prácticos de tres patrones de diseño implementados en Java como parte del curso de Principios y Prácticas de Desarrollo de Software Orientado a Objetos — Universidad Industrial de Santander.

## Patrones implementados

**Factory Method** — Creacional  
Sistema de logística que delega la creación del medio de transporte (camión o barco) a subclases especializadas, desacoplando la lógica de creación de la lógica de uso.

**Observer** — Comportamiento  
Sistema de notificaciones para una tienda en línea donde los clientes se suscriben a eventos específicos y reciben alertas por correo o app móvil de forma automática.

**Decorator** — Estructural  
Sistema de procesamiento de archivos que permite aplicar compresión, cifrado y respaldo de forma encadenada, calculando acumulativamente el tamaño y costo resultantes.

## Estructura del proyecto
´´´
├── FactoryMethod/
│   ├── Logistica.java
│   ├── LogisticaTerrestre.java
│   ├── LogisticaMaritima.java
│   ├── Transporte.java
│   ├── Camion.java
│   ├── Barco.java
│   └── Main.java
├── Observer/
│   ├── Store.java
│   ├── NotificationService.java
│   ├── Event.java
│   ├── Listener.java
│   ├── EmailMsgListener.java
│   ├── MobileAppListener.java
│   └── MainApp.java
└── Decorator/
├── FileComponent.java
├── BasicFile.java
├── FileDecorator.java
├── CompressionDecorator.java
├── EncryptionDecorator.java
├── BackupDecorator.java
└── MainDecorator.java
'''


## Tecnologías

- Java 17
- Sin dependencias externas

## Autores
Edgar Santiago Ariza Garcıa - 2211881
Javier Alejandro Silva Murillo - 2211860
Juan David Lopez Ruiz - 2180645
Universidad Industrial de Santander, 2026