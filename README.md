## Système de Suivi du Diabète avec Spring Framework

Ce projet est un système de suivi du diabète développé avec le framework Spring. Il permet aux utilisateurs de gérer efficacement leurs données de santé, y compris les lectures de glycémie, la consommation de nourriture et les blogs informatifs. Les fonctionnalités incluent l'ajout, la visualisation, la mise à jour et la suppression des données de santé.

## <img src="https://raw.githubusercontent.com/spring-projects/spring-framework/main/framework-docs/src/docs/spring-framework.png" width="80" height="80"> Spring Framework

## Table des Matières

- [Fonctionnalités](#fonctionnalités)
- [Technologies Utilisées](#technologies-utilisées)
- [Prérequis](#prérequis)
- [Installation et Configuration](#installation-et-configuration)
- [Structure du Projet](#structure-du-projet)
- [Utilisation](#utilisation)
- [Instructions d'Utilisation](#instructions-dutilisation)
- [Auteur](#auteur)

## Fonctionnalités

- **Visualiser les Lectures de Glycémie :** Affichage d'une liste de toutes les lectures de glycémie dans le système. Chaque entrée montre la date, l'heure et le niveau de glycémie.

- **Ajouter une Nouvelle Lecture de Glycémie :** Formulaire permettant aux utilisateurs d'ajouter une nouvelle lecture de glycémie. Validation des données pour garantir que les champs obligatoires sont remplis et que les formats de données appropriés sont utilisés.

- **Mettre à Jour les Détails d'une Lecture de Glycémie :** Possibilité de modifier les détails d'une lecture de glycémie existante.

- **Supprimer une Lecture de Glycémie :** Option pour supprimer une lecture de glycémie du système.

- **Visualiser les Aliments Consommés :** Affichage d'une liste de tous les aliments consommés. Chaque entrée montre les informations nutritionnelles et l'effet sur la glycémie.

- **Ajouter un Nouvel Aliment :** Formulaire permettant aux utilisateurs d'ajouter un nouvel aliment consommé.

- **Mettre à Jour les Détails d'un Aliment :** Possibilité de modifier les détails d'un aliment existant.

- **Supprimer un Aliment :** Option pour supprimer un aliment du système.

- **Visualiser les Blogs :** Affichage d'une liste de tous les blogs écrits par l'utilisateur.

- **Ajouter un Nouveau Blog :** Formulaire permettant aux utilisateurs d'ajouter un nouveau blog.

- **Mettre à Jour les Détails d'un Blog :** Possibilité de modifier les détails d'un blog existant.

- **Supprimer un Blog :** Option pour supprimer un blog du système.

## Technologies Utilisées

- **Spring Core :** Pour l'injection de dépendances et la gestion des composants d'application.
- **Spring MVC :** Pour construire l'application Web et gérer les requêtes HTTP.
- **Spring DATA JPA :** Pour faciliter l'interaction avec la base de données et la persistance des entités.
- **Hibernate :** ORM (Object-Relational Mapping) pour la gestion de la couche de persistance.
- **MySQL :** Utilisation d'une base de données relationnelle pour stocker les données.
- **Java JDK 17**
- **Apache Tomcat 8.5**

## Prérequis

Avant de commencer, assurez-vous d'avoir installé les éléments suivants :

- Java JDK 17
- Apache Tomcat 8.5 (ou un autre conteneur servlet compatible)
- MySQL Server
- Maven

## Installation et Configuration

1. Clonez ce dépôt sur votre machine locale.
2. Importez le projet dans votre IDE.
3. Configurez votre base de données MySQL en créant une nouvelle base de données nommée `diabetes_tracker_db`.
4. Modifiez le fichier `PersistenceJPAConfig` dans `src/main/java/com/config` pour correspondre à votre configuration MySQL.

### Exemple de configuration :

```properties
dataSource.setUrl("jdbc:mysql://localhost:3306/glycemia_db?createDatabaseIfNotExist=true");
dataSource.setUsername( "votre_nom_utilisateur_mysql" );
dataSource.setPassword( "votre_mot_de_passe_mysql" );
````
Lancez le projet en utilisant votre IDE ou en construisant le projet avec Maven et en le déployant sur un serveur Tomcat 

## Structure du Projet

L'application se compose des éléments suivants :

1. **Classes Principales** :
    - `GlycemiaReading`: Stocke les lectures de glycémie des utilisateurs.
    - `Food`: Stocke les informations nutritionnelles des aliments consommés par les utilisateurs.
    - `Blog`: Stocke les blogs écrits par les utilisateurs.

2. **Utilisation de Spring Data JPA** :
    - Les données sont persistées dans une base de données MySQL à l'aide de Spring Data JPA.

## Utilisation

Une fois le projet déployé, vous pouvez accéder à l'application via un navigateur web. Voici les principales fonctionnalités disponibles :

1. **Gestion des Lectures de Glycémie** :
    - Ajoutez de nouvelles lectures de glycémie en entrant la date, l'heure et le niveau de glucose.
    - Consultez la liste de toutes les lectures de glycémie enregistrées.
    - Mettez à jour ou supprimez des lectures de glycémie existantes.

2. **Gestion de la Consommation Alimentaire** :
    - Ajoutez de nouveaux aliments en saisissant le nom, la quantité de glucides, de protéines et la taille de portion.
    - Consultez la liste de tous les aliments enregistrés.
    - Mettez à jour ou supprimez des aliments existants.

3. **Gestion des Blogs** :
    - Rédigez de nouveaux blogs sur le diabète en fournissant un titre et un contenu.
    - Consultez la liste de tous les blogs publiés.
    - Mettez à jour ou supprimez des blogs existants.

## Instructions d'Utilisation

1. **Ajout d'une Lecture de Glycémie** :
    - Cliquez sur le bouton "Ajouter une Lecture de Glycémie".
    - Remplissez le formulaire avec la date, l'heure et le niveau de glucose.
    - Cliquez sur "Enregistrer" pour ajouter la nouvelle lecture.

2. **Ajout d'un Aliment Consommé** :
    - Cliquez sur le bouton "Ajouter un Aliment Consommé".
    - Saisissez les détails de l'aliment, y compris le nom, les glucides, les protéines et la taille de portion.
    - Cliquez sur "Enregistrer" pour ajouter le nouvel aliment.

3. **Rédaction d'un Nouveau Blog** :
    - Cliquez sur le bouton "Rédiger un Nouveau Blog".
    - Entrez le titre et le contenu de votre blog sur le diabète.
    - Cliquez sur "Publier" pour ajouter le nouveau blog.

4. **Consultation et Gestion des Entrées Existantes** :
    - Consultez la liste des lectures de glycémie, des aliments et des blogs existants sur les pages respectives.
    - Pour mettre à jour une entrée, cliquez sur le bouton "Modifier" correspondant.
    - Pour supprimer une entrée, cliquez sur le bouton "Supprimer" correspondant.


## Auteur

Ce projet a été développé par CHAIMAA LACHHAB pour l'école ENAA Béni Mellal. Contact : [chaimaa.lachhab@outlook.com](mailto:chaimaa.lachhab@outlook.com)

---

## References
### Spring tutorial (Spring Core, Spring MVC, Spring DATA JPA) : [https://www.baeldung.com/spring-tutorial](https://www.baeldung.com/spring-tutorial)

[![Spring Framework](https://img.shields.io/badge/Spring%20Framework-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#) [![Spring Core](https://img.shields.io/badge/Spring%20Core-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#) [![Spring MVC](https://img.shields.io/badge/Spring%20MVC-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#) [![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#) [![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache%20maven&logoColor=white)](#) [![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](#) [![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)](#) [![Java JDK](https://img.shields.io/badge/Java%20JDK-007396?style=for-the-badge&logo=java&logoColor=white)](#) [![Apache Tomcat](https://img.shields.io/badge/Apache%20Tomcat-F8DC75?style=for-the-badge&logo=apache%20tomcat&logoColor=black)](#)

**GitHub Repository:** [https://github.com/ChaimaaLachhab/diabetes-tracker.git]
