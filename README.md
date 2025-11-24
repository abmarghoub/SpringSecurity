# TP 8 : Authentification en mémoire avec Spring Security

---

### Réalisé par

**Abla MARGHOUB**

### Encadré par

**Pr. Mohamed LACHGAR**

### Module

**Techniques de Programmation Avancée**

### Établissement

**École Normale Supérieure - Université Cadi Ayyad**

---

## 1. Objectif du TP

* L'authentification des utilisateurs avec gestion des rôles.
* La protection des routes selon le rôle de l'utilisateur (ex: utilisateur, administrateur).
* La mise en place d'une page de login sécurisée.
* L'utilisation de Thymeleaf pour le rendu des vues HTML.

---

## 2. Architecture du TP

### 2.1 Stack technologique

| Technologie               | Rôle dans le projet                        |
| ------------------------- | ------------------------------------------ |
| **Java 21**               | Langage de programmation                   |
| **Spring Boot**     | Framework principal pour l'application web |
| **Spring Security** | Sécurisation de l'application              |
| **Thymeleaf**       | Moteur de template pour le front-end       |
| **Maven**                 | Gestion des dépendances                    |
| **Tomcat**             | Serveur web intégré                        |
| **IntelliJ IDEA**         | Environnement de développement             |

---

### 2.2 Structure du projet

<img width="513" height="951" alt="image" src="https://github.com/user-attachments/assets/d828a959-04d4-475c-a9bc-4d02f8d39168" />

## 3. Résultat attendu

### Comptes de test
| Utilisateur | Mot de passe | Rôle  |
| ----------- | ------------ | ----- |
| admin       | 1234      | ADMIN |
| user        | 1111      | USER  | 

### Fonctionnalités principales

1. Page de login sécurisée accessible via `/login`.
2. Redirection automatique vers la page d'accueil après authentification.
3. Gestion des rôles pour accéder à certaines pages.
4. Affichage du nom de l'utilisateur connecté sur la page d'accueil.

### Prise d'écran

**login :**

<img width="399" height="287" alt="image" src="https://github.com/user-attachments/assets/3c46acc8-8c59-4c30-ab34-0968e6a8631c" />


**Ecran d'accueil après connexion (Admin) :**

<img width="431" height="164" alt="image" src="https://github.com/user-attachments/assets/57113b31-2dee-4e67-9633-36c877e43d9f" />

**Ecran d'accueil après connexion (User) :**

<img width="650" height="216" alt="image" src="https://github.com/user-attachments/assets/a7d08e8b-28fd-48ae-a06f-62a191ae267a" />

