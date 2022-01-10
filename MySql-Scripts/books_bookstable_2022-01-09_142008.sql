/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
CREATE DATABASE
/*!32312 IF NOT EXISTS*/
books
/*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE books;
DROP TABLE IF EXISTS bookstable;
CREATE TABLE `bookstable` (
  `titulo` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `autor` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `categoria` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `precio` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `imgUrl` varchar(255)  COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`Titulo`)
) ENGINE = InnoDB DEFAULT CHARSET = latin1 COLLATE = latin1_spanish_ci;
INSERT INTO
  bookstable(Titulo, Autor, Categoria, Precio)
VALUES(
    '50 palos: ... y sigo soñando (No Ficción)',
    'Pau Donés',
    'Biografía',
    '17.95 €'
  ),(
    'C/C++. Curso de programación (Manuales Imprescindibles)',
    'Miguel Angel Acera',
    'Programacion',
    '27.31 €'
  ),(
    'Clean JavaScript: Aprende a aplicar Código Limpio, SOLID y Testing',
    'Miguel A. Gómez ',
    'Programacion',
    '19.97 €'
  ),(
    'Elon Musk: El empresario que anticipa el futuro',
    'Ashlee Vance',
    'Biografía',
    '17.00 €'
  ),(
    'El Libro Negro del Programador https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1398892720l/22027034.jpg',
    'Rafael Gómez Blanes',
    'Programacion',
    '15.77 €'
  ),(
    'Frida Kahlo. Una biografía (Lumen Gráfica)',
    ' María Hesse ',
    'Biografía',
    '20.80 €'
  ),(
    'La práctica del color',
    'Lisa Solomón',
    'Arte',
    '23.65 €'
  ),(
    'Marvel By Design: Graphic Design Strategies of the Worlds Greatest Comic Company',
    ' Liz Gestalten',
    'Arte',
    '48.35 €'
  ),(
    'Por si las voces vuelven (No Ficción)',
    'Ángel Martín',
    'Biografía',
    '17.00 €'
  ),(
    'Programando Videojuegos: JavaScript',
    'Iván Fasheh',
    'Programacion',
    '19.45  €'
  ),(
    'The Artists Way: A Spiritual Path to Higher Creativity',
    'Julia Cameron',
    'Arte',
    '18.95 €'
  );