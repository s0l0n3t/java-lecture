-- https://github.com/s0l0n3t/java-lecture/tree/gui/Lecture_Swing
-- Mainmachine: 127.0.0.1
-- Product time: 01 Ara 2024, 12:19:06
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `admin`
--

-- --------------------------------------------------------

--
-- authority table `authority`
--

CREATE TABLE `authority` (
  `name` varchar(100) DEFAULT NULL,
  `writing` tinyint(1) DEFAULT 0,
  `reading` tinyint(1) DEFAULT 0,
  `adding` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Table data structure `authority`
--

INSERT INTO `authority` (`name`, `writing`, `reading`, `adding`) VALUES
('ADMIN', 1, 1, 1),
('MANAGER', 0, 1, 1),
('EMPLOYEE', 0, 1, 0);

-- --------------------------------------------------------

--
-- Employee table structure `employee`
--

CREATE TABLE `employee` (
  `id` int(255) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `surname` varchar(100) DEFAULT NULL,
  `permit` int(10) DEFAULT NULL,
  `type` enum('type1','type2','type3') DEFAULT NULL,
  `experience` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `employee`
--

INSERT INTO `employee` (`id`, `name`, `surname`, `permit`, `type`, `experience`) VALUES
(1, 'furkan', 'tokgöz', 35, 'type1', 1),
(2, 'burak', 'kaplan', 50, 'type1', 4),
(3, 'Elif', 'Tokgöz', 45, 'type1', 3),
(4, 'furkan', 'Tokgöz', 45, 'type1', 3),
(5, 'Test', 'Test', 35, 'type1', 1),
(6, 'Fethane', 'Tokgöz', 70, 'type2', 10),
(9, 'ayşe serra', 'tokgöz', 35, 'type1', 1),
(15, 'tayfun', 'bingöl', 35, 'type2', 3),
(16, 'james', 'hattfield', 35, 'type3', 5);

-- --------------------------------------------------------

--
-- Employee management system user table structure `user`
--

CREATE TABLE `user` (
  `id` int(255) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `type` enum('ADMIN','MANAGER','EMPLOYEE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Management system data structure `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `email`, `type`) VALUES
(2, 'admin', 'admin123', 'admin@swingdev.com', 'ADMIN'),
(3, 'furkant41', 'furkan123', 'furkantokgz@gmail.com', 'MANAGER'),
(4, 'testemployee', 'test123', 'test@gmail.com', 'EMPLOYEE'),
(5, 'test', 'test1', 'test@gmail.com', 'ADMIN'),
(7, 'elif', 'eliftest123', 'elift41@gmail.com', 'MANAGER'),
(8, 'ayse', 'ayse123', 'ayse@gmail.com', 'ADMIN'),
(9, 'asd', 'asd123', 'asd@gmail.com', 'ADMIN'),
(10, 'test1', 'test123', 'test', 'EMPLOYEE');

--
-- table index
--

--
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Table setting up "AUTO_INCREMENT" 
--

--
--
ALTER TABLE `employee`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
--
ALTER TABLE `user`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
