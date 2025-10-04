# 💻 LapSync — Plataforma Web para la Gestión de Préstamos de Laptops 🎓

*LapSync* es una aplicación web desarrollada con **Spring Boot** y **Thymeleaf** para optimizar el proceso de **préstamo de laptops** dentro de instituciones educativas.  
Está diseñada para estudiantes, administradores y superadministradores, facilitando la gestión de solicitudes, seguimientos, sanciones y control de equipos.

---

## 🛠️ Tecnologías Utilizadas

<p>
  <img src="https://img.shields.io/badge/HTML-%23E34F26.svg?style=flat&logo=html5&logoColor=white" alt="HTML" />
  <img src="https://img.shields.io/badge/CSS-%231572B6.svg?style=flat&logo=css3&logoColor=white" alt="CSS" />
  <img src="https://img.shields.io/badge/JavaScript-%23F7DF1E.svg?style=flat&logo=javascript&logoColor=black" alt="JavaScript" />
  <img src="https://img.shields.io/badge/Bootstrap-%23563D7C.svg?style=flat&logo=bootstrap&logoColor=white" alt="Bootstrap" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=springboot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Thymeleaf-005C0F?style=flat&logo=thymeleaf&logoColor=white" alt="Thymeleaf" />
  <img src="https://img.shields.io/badge/SQL_Server-%23CC2927.svg?style=flat&logo=microsoftsqlserver&logoColor=white" alt="SQL Server" />
</p>

---

## ✨ Características Principales

- 🔐 **Autenticación con Google**: acceso seguro usando correos institucionales.
- 📦 **Gestión de préstamos**: solicitud, seguimiento y estados en tiempo real.
- ⚠️ **Control de sanciones**: registro automático de infracciones y penalizaciones.
- 🧰 **Panel administrativo**: control de laptops, usuarios y sanciones.
- 👑 **Rol Super Admin**: gestión completa del sistema y creación de administradores.
- 📊 **Interfaz moderna y responsiva** gracias a Thymeleaf y Bootstrap.

---

## 👤 Roles de Usuario

- 👨‍🎓 **Estudiante:** Solicita laptops, revisa el estado de sus préstamos y consulta sanciones.
- 👨‍💼 **Administrador:** Gestiona el inventario, solicitudes, devoluciones y sanciones.
- 👑 **Super Administrador:** Control total del sistema y creación de nuevos administradores.

---

## 🖼️ Galería

> Vista rápida de 4 pantallas clave. Abre cada sección para ver más por rol.

**Login**  
<img src="docs/screenshots/estudiantes/login.png" alt="Login" width="720" />

**Panel Estudiante**  
<img src="docs/screenshots/estudiantes/estudiante-home.png" alt="Home estudiante" width="720" />

**Solicitud de préstamo**  
<img src="docs/screenshots/estudiantes/solicitud-prestamo.png" alt="Solicitud de préstamo" width="720" />

**Mis préstamos**  
<img src="docs/screenshots/estudiantes/mis-prestamos.png" alt="Mis préstamos" width="720" />

---

### Estudiante
<details open>
  <summary><strong>Ver todas las pantallas del Estudiante</strong></summary>
  <br/>

  <div align="center">
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/estudiantes/login.png" alt="Login" width="360">
      <figcaption>Login</figcaption>
    </figure>
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/estudiantes/estudiante-home.png" alt="Home estudiante" width="360">
      <figcaption>Inicio / Panel</figcaption>
    </figure>
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/estudiantes/solicitud-prestamo.png" alt="Solicitud de préstamo" width="360">
      <figcaption>Solicitud</figcaption>
    </figure>
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/estudiantes/mis-prestamos.png" alt="Mis préstamos" width="360">
      <figcaption>Mis préstamos</figcaption>
    </figure>
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/estudiantes/mis-sanciones.png" alt="Mis sanciones" width="360">
      <figcaption>Mis sanciones</figcaption>
    </figure>
  </div>
</details>

### Administrador
<details>
  <summary><strong>Ver pantallas del Administrador</strong></summary>
  <br/>
  <div align="center">
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/administrador/prestamosA.png" alt="Préstamos (admin)" width="360">
      <figcaption>Préstamos</figcaption>
    </figure>
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/administrador/laptopsA.png" alt="Inventario de laptops" width="360">
      <figcaption>Inventario</figcaption>
    </figure>
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/administrador/sancionesA.png" alt="Sanciones (admin)" width="360">
      <figcaption>Sanciones</figcaption>
    </figure>
  </div>
</details>

### Super Administrador
<details>
  <summary><strong>Ver pantallas del Super Administrador</strong></summary>
  <br/>
  <div align="center">
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/superadministrador/super-home.png" alt="Home Super Admin" width="360">
      <figcaption>Home</figcaption>
    </figure>
    <figure style="display:inline-block; margin:6px; text-align:center;">
      <img src="docs/screenshots/superadministrador/administradores.png" alt="Gestión de administradores" width="360">
      <figcaption>Administradores</figcaption>
    </figure>
  </div>
</details>

---

## ⚙️ Configuración del Proyecto

### 📦 Requisitos Previos
- ☕ Java 17+
- 🧰 Maven 3.9+
- 🐘 SQL Server instalado
- 🔑 Credenciales de Google OAuth2 configuradas

### ⚙️ Configuración de `application.properties`

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=lapsync
spring.datasource.username=usuario
spring.datasource.password=clave

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.security.oauth2.client.registration.google.client-id=TU_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=TU_CLIENT_SECRET
```

⚠️ **Importante:** Crea la base de datos manualmente antes de ejecutar el proyecto.
```sql
CREATE DATABASE lapsync;
```

---

## 🚀 Ejecución del Proyecto

1. Clonar el repositorio:
```bash
git clone https://github.com/CarlosMartinezDev20/Lapsync.git
cd LapSync
```
2. Ejecutar la aplicación:
```bash
./mvnw spring-boot:run
```
3. Abrir en el navegador:
```
http://localhost:8080/login
```
4. ⚠️ Crear usuario `SUPER_ADMIN` en la base de datos para acceder al panel administrativo:
```sql
INSERT INTO usuarios (nombre, email, rol) 
VALUES ('Administrador Principal', 'admin@tu-dominio.com', 'SUPER_ADMIN');
```

---

## 🧪 Pruebas
```bash
./mvnw test
```

---

## 📍 Roadmap
- 📩 Notificaciones automáticas por correo.
- 📊 Generación de reportes PDF/CSV.
- 📱 PWA / Modo móvil.
- 🧾 Auditoría de acciones administrativas.

---

## 📜 Licencia
Este proyecto está bajo la licencia **MIT**. Puedes usarlo, modificarlo y distribuirlo libremente con fines académicos o personales.


💡 *LapSync busca mejorar el acceso a la tecnología en entornos educativos, simplificando el proceso de préstamos de equipos y creando una experiencia moderna, fluida y segura para todos los usuarios.*
