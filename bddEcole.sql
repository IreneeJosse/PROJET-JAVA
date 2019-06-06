-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jun 06, 2019 at 05:33 PM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `bbdEcole`
--

-- --------------------------------------------------------

--
-- Table structure for table `anneeScolaire`
--

CREATE TABLE `anneeScolaire` (
  `id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `bulletin`
--

CREATE TABLE `bulletin` (
  `id` varchar(255) NOT NULL,
  `appreciation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `classe`
--

CREATE TABLE `classe` (
  `id` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `detailBulletin`
--

CREATE TABLE `detailBulletin` (
  `id` varchar(255) NOT NULL,
  `appreciation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `discipline`
--

CREATE TABLE `discipline` (
  `id` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ecole`
--

CREATE TABLE `ecole` (
  `id` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `eleve`
--

CREATE TABLE `eleve` (
  `id` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `enseignant`
--

CREATE TABLE `enseignant` (
  `id` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `enseignement`
--

CREATE TABLE `enseignement` (
  `id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `evaluation`
--

CREATE TABLE `evaluation` (
  `id` varchar(255) NOT NULL,
  `note` float NOT NULL,
  `appreciation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `inscription`
--

CREATE TABLE `inscription` (
  `id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `niveau`
--

CREATE TABLE `niveau` (
  `id` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `trimestre`
--

CREATE TABLE `trimestre` (
  `id` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `debut` date NOT NULL,
  `fin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anneeScolaire`
--
ALTER TABLE `anneeScolaire`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bulletin`
--
ALTER TABLE `bulletin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `detailBulletin`
--
ALTER TABLE `detailBulletin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `discipline`
--
ALTER TABLE `discipline`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ecole`
--
ALTER TABLE `ecole`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `eleve`
--
ALTER TABLE `eleve`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `enseignant`
--
ALTER TABLE `enseignant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `enseignement`
--
ALTER TABLE `enseignement`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `evaluation`
--
ALTER TABLE `evaluation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `niveau`
--
ALTER TABLE `niveau`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `trimestre`
--
ALTER TABLE `trimestre`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bulletin`
--
ALTER TABLE `bulletin`
  ADD CONSTRAINT `inscription` FOREIGN KEY (`id`) REFERENCES `inscription` (`id`),
  ADD CONSTRAINT `trimestre` FOREIGN KEY (`id`) REFERENCES `trimestre` (`id`);

--
-- Constraints for table `classe`
--
ALTER TABLE `classe`
  ADD CONSTRAINT `anneescolaire2` FOREIGN KEY (`id`) REFERENCES `anneeScolaire` (`id`),
  ADD CONSTRAINT `ecole` FOREIGN KEY (`id`) REFERENCES `ecole` (`id`),
  ADD CONSTRAINT `niveau` FOREIGN KEY (`id`) REFERENCES `niveau` (`id`);

--
-- Constraints for table `detailBulletin`
--
ALTER TABLE `detailBulletin`
  ADD CONSTRAINT `bulletin` FOREIGN KEY (`id`) REFERENCES `bulletin` (`id`),
  ADD CONSTRAINT `enseignement` FOREIGN KEY (`id`) REFERENCES `enseignement` (`id`);

--
-- Constraints for table `enseignement`
--
ALTER TABLE `enseignement`
  ADD CONSTRAINT `classe` FOREIGN KEY (`id`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `discipline` FOREIGN KEY (`id`) REFERENCES `discipline` (`id`),
  ADD CONSTRAINT `personne` FOREIGN KEY (`id`) REFERENCES `enseignant` (`id`);

--
-- Constraints for table `evaluation`
--
ALTER TABLE `evaluation`
  ADD CONSTRAINT `detailBulletin` FOREIGN KEY (`id`) REFERENCES `detailBulletin` (`id`);

--
-- Constraints for table `inscription`
--
ALTER TABLE `inscription`
  ADD CONSTRAINT `classe2` FOREIGN KEY (`id`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `eleve` FOREIGN KEY (`id`) REFERENCES `eleve` (`id`);

--
-- Constraints for table `trimestre`
--
ALTER TABLE `trimestre`
  ADD CONSTRAINT `anneescolaire` FOREIGN KEY (`id`) REFERENCES `anneeScolaire` (`id`);
