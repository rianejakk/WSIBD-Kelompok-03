-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2021 at 07:36 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kostaira`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenis_kamar`
--

CREATE TABLE `jenis_kamar` (
  `Kjenis_Kamar` char(6) NOT NULL,
  `jenis_kamar` varchar(30) NOT NULL,
  `harga` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `kode_kamar` char(6) NOT NULL,
  `lokasi_kamar` varchar(30) NOT NULL,
  `Kjenis_Kamar` char(6) NOT NULL,
  `ukuran` varchar(25) NOT NULL,
  `fasilitas` varchar(30) NOT NULL,
  `status` varchar(20) NOT NULL,
  `penilaian` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `lama_sewa`
--

CREATE TABLE `lama_sewa` (
  `IDlama_sewa` char(6) NOT NULL,
  `Nm_pilihan` varchar(16) NOT NULL,
  `lama_sewa` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `Username` varchar(25) NOT NULL,
  `NoKTP` char(16) NOT NULL,
  `NamaLengkap` varchar(30) NOT NULL,
  `JenisKelamin` varchar(10) NOT NULL,
  `Alamat` varchar(30) NOT NULL,
  `NoHpPribadi` varchar(13) NOT NULL,
  `NoHpDarurat` varchar(13) NOT NULL,
  `Password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`Username`, `NoKTP`, `NamaLengkap`, `JenisKelamin`, `Alamat`, `NoHpPribadi`, `NoHpDarurat`, `Password`) VALUES
('tony', '358761881', 'Alvin Pradana', 'Laki-laki', 'Jember', '10281', '219821981', 'laki'),
('Brian32', '3638910129127812', 'Alvan Brian', 'Laki-laki', 'JEmber', '08017271871', '082180721891', 'laki321'),
('alvin121', '7162712716261', 'Alvin Pradana21', 'Laki-laki', 'Jember', '081298112', '081282191', '6125a');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `IdBooking` char(6) NOT NULL,
  `NoKTPCust` char(16) NOT NULL,
  `KodeKamar` char(6) NOT NULL,
  `IdLamaSewa` char(6) NOT NULL,
  `TglMasuk` datetime NOT NULL,
  `IdPembayaran` char(6) NOT NULL,
  `TotalHarga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jenis_kamar`
--
ALTER TABLE `jenis_kamar`
  ADD PRIMARY KEY (`Kjenis_Kamar`);

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`kode_kamar`),
  ADD KEY `Kjenis_Kamar` (`Kjenis_Kamar`);

--
-- Indexes for table `lama_sewa`
--
ALTER TABLE `lama_sewa`
  ADD PRIMARY KEY (`IDlama_sewa`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`NoKTP`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`IdBooking`),
  ADD KEY `NoKTPCust` (`NoKTPCust`),
  ADD KEY `KodeKamar` (`KodeKamar`),
  ADD KEY `IdLamaSewa` (`IdLamaSewa`),
  ADD KEY `IdPembayaran` (`IdPembayaran`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kamar`
--
ALTER TABLE `kamar`
  ADD CONSTRAINT `kamar_ibfk_1` FOREIGN KEY (`Kjenis_Kamar`) REFERENCES `jenis_kamar` (`Kjenis_Kamar`);

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`KodeKamar`) REFERENCES `kamar` (`kode_kamar`),
  ADD CONSTRAINT `pemesanan_ibfk_2` FOREIGN KEY (`IdLamaSewa`) REFERENCES `lama_sewa` (`IDlama_sewa`),
  ADD CONSTRAINT `pemesanan_ibfk_3` FOREIGN KEY (`NoKTPCust`) REFERENCES `pelanggan` (`NoKTP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
