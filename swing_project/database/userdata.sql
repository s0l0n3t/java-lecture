
-- localhost: 127.0.0.1
-- Creating Time: 07 Aug 2024, 15:17:49
-- Server Version: 10.4.32-MariaDB
-- PHP version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `userdata`
--

-- --------------------------------------------------------

--
-- Table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `type` enum('PERSON','COMPANY') NOT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `mail` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Table `customer`
--

INSERT INTO `customer` (`id`, `name`, `type`, `phone`, `mail`, `address`) VALUES
(1, 'EdictDATA', 'COMPANY', '5393845742', 'editdata@business.com', 'İstanbul/Pendik'),
(2, 'OzerCast', 'COMPANY', '5393845742', '1', '1'),
(9, 'Zeki TOKGÖZ', 'PERSON', '5313123232', 'zeki@info.com', 'Kocaeli/izmit'),
(10, 'GoingMerry', 'COMPANY', '5312234232', 'info@goingmerry.com', 'İstabul/Ümraniye');

-- --------------------------------------------------------

--
-- Table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `code` varchar(100) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Table `product`
--

INSERT INTO `product` (`id`, `name`, `code`, `price`, `stock`) VALUES
(1, 'Bread', '000001', 150, 10),
(2, 'Pasta', '000010', 15000, 100),
(6, 'Book', '134', 15, 23),
(5, 'Pill', '365', 151, 10),
(7, 'Key', '929', 155, 13),
(8, 'Glass', '1582', 15, 100);

-- --------------------------------------------------------

--
-- Table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Table `user`
--

INSERT INTO `user` (`id`, `name`, `mail`, `password`) VALUES
(1, 'furkan', 'furkantokgz@gmail.com', '123');


--
-- Indexes for Table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for Table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for Table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);



--
-- AUTO_INCREMENT for Table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for Table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for Table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
