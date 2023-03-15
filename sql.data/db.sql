DROP DATABASE IF EXISTS ma_base;


-- Création de la base de données
CREATE DATABASE ma_base;

-- Sélectionner la base de données
USE ma_base;

-- table Utilisateur
CREATE TABLE User (

    UserID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    UserName varchar(50) NOT NULL,
    UserPassword varchar(50) NOT NULL,
    UserMail varchar(50) NOT NULL,
    PhoneNumber int NOT NULL
);

-- Je rentre une user dans mon tableau User
INSERT INTO User (UserName, UserPassword, UserMail, PhoneNumber) VALUES ('Momo', 'bloop', "mobhosB@GMAIL.com", 656555555);
INSERT INTO User (UserName, UserPassword, UserMail, PhoneNumber) VALUES ('Mimo', 'bloop', "moB@GMAIL.com", 696555555);

SELECT * FROM User;





-- table Catégorie
CREATE TABLE Category (

    CategoryID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    CategoryName varchar(50) NOT NULL
);

INSERT INTO Category (CategoryName) VALUES ('Casual');
INSERT INTO Category (CategoryName) VALUES ('Extravagante');
INSERT INTO Category (CategoryName) VALUES ('Classique');
SELECT * FROM Category;



-- table produits et les éléments qui lui sont liés
CREATE TABLE Products (

    ProductID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ProductName varchar(50) NOT NULL,
    ProductStock int,
    ProductIsDispo boolean,
    ProductPrice int 
);


INSERT INTO Products(ProductName, ProductStock, ProductIsDispo, ProductPrice) VALUES('Collants Colorés', 100, true, 15);
INSERT INTO Products(ProductName, ProductStock, ProductIsDispo, ProductPrice) VALUES('Cyclistes', 100, true, 12);
INSERT INTO Products(ProductName, ProductStock, ProductIsDispo, ProductPrice) VALUES('Collants à motif coeurs', 50, true, 20);

SELECT * FROM Products;


CREATE TABLE LiaisonCategory (

    LiaisonCategoryID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ProductID int NOT NULL,
    CategoryID int NOT NULL,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (CategoryID) REFERENCES Category(CategoryID)
);




CREATE TABLE Color (

    ColorID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ColorName varchar(20) NOT NULL
 
);

INSERT INTO Color (ColorName) VALUES ('Blue');
INSERT INTO Color (ColorName) VALUES ('Pink');
INSERT INTO Color (ColorName) VALUES ('Orange');




CREATE TABLE Size (

    SizeID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    SizeName varchar(3) NOT NULL
);

INSERT INTO Size (SizeName) VALUES ('XXL');
INSERT INTO Size (SizeName) VALUES ('XL');
INSERT INTO Size (SizeName) VALUES ('L');
INSERT INTO Size (SizeName) VALUES ('M');
INSERT INTO Size (SizeName) VALUES ('S');
INSERT INTO Size (SizeName) VALUES ('XS');


CREATE TABLE ProductsPhotos (

    ProductsPhotosID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ProductsPhotosName varchar(50) NOT NULL
 
);

CREATE TABLE liaisonColor (

    liaisonColorID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ProductID int NOT NULL,
    ColorID int NOT NULL,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (ColorID) REFERENCES Color(ColorID)
);

CREATE TABLE LiaisonPhoto (

    LiaisonPhotoID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ProductID int NOT NULL,
    ProductsPhotosID int NOT NULL,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (ProductsPhotosID) REFERENCES ProductsPhotos(ProductsPhotosID)
);

CREATE TABLE LiaisonSize (

    LiaisonSizeID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ProductID int NOT NULL,
    SizeID int NOT NULL,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (SizeID) REFERENCES Size(SizeID)
);





-- Commandes
CREATE TABLE Commands (

    CommandsID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    CommandsDate date NOT NULL,
    CommandsTotal int NOT NULL,
    CommandsNumber float NOT NULL,
    CommandsTime int NOT NULL,
    UserID int, 
    ProductID int,
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);



-- facture
CREATE TABLE Facture (

    FactureID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    FactureName varchar(50) NOT NULL,
    FacturePrenom varchar(50) NOT NULL,
    FactureCodePostal int NOT NULL,
    FactureAdress varchar(100) NOT NULL,
    FactureDate date NOT NULL,
    FacturePhoneNumber int NOT NULL,
    FactureTotal int NOT NULL,
    FactureNumber int NOT NULL,
    UserID int, 
    CommandsID int,
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (CommandsID) REFERENCES Commands(CommandsID)
);





-- Le journal et ses arcticles
CREATE TABLE ArticleDuJournal (

    ArticleDuJournalID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ArticleDuJournalName varchar(100) NOT NULL,
    UserCommentairy varchar(500)
);

INSERT INTO ArticleDuJournal (ArticleDuJournalName ) VALUES ('Libre la séries Arte qui fait jazer');
INSERT INTO ArticleDuJournal (ArticleDuJournalName ) VALUES ('A, O, H, X, Comprendre la forme de son corps pour le mettre en valeur et se sentir bien');


CREATE TABLE Journal (

    JournalName varchar(100) NOT NULL PRIMARY KEY,
    ArticleDuJournalID int NOT NULL
);

INSERT INTO Journal (JournalName, ArticleDuJournalID ) VALUES ('Les Ah-Bas ! ', 1);




CREATE TABLE TextArticle (

    TextArticleID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    TextArticleName varchar(1000) NOT NULL
);



CREATE TABLE PhotosArticle (

    PhotosArticleID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    PhotosArticleName varchar(200) NOT NULL
);



CREATE TABLE liaisonPhotoArticle (

    liaisonPhotoArticleID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ProductID int NOT NULL,
    PhotosArticleID int NOT NULL,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (PhotosArticleID) REFERENCES PhotosArticle(PhotosArticleID)
);

CREATE TABLE liaisonTexteArticle (

    liaisonTexteArticleID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ProductID int NOT NULL,
    TextArticleID int NOT NULL,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (TextArticleID) REFERENCES TextArticle(TextArticleID)
);
