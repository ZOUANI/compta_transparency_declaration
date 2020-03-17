-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 17 mars 2020 à 18:43
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.1

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `compta_transparency_declaration`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie_service`
--

CREATE TABLE `categorie_service` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `demande`
--

CREATE TABLE `demande` (
  `id` bigint(20) NOT NULL,
  `date_affectation_comptable` datetime DEFAULT NULL,
  `date_finalisation` datetime DEFAULT NULL,
  `date_saisie` datetime DEFAULT NULL,
  `date_soumission` datetime DEFAULT NULL,
  `date_validation` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `montant_paye` decimal(16,4) DEFAULT NULL,
  `montant_restant` decimal(16,4) DEFAULT NULL,
  `montant_total` decimal(16,4) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `reference_comptable_createur` varchar(255) DEFAULT NULL,
  `reference_comptable_validateur` varchar(255) DEFAULT NULL,
  `reference_societe` varchar(255) DEFAULT NULL,
  `refrence_societe` varchar(255) DEFAULT NULL,
  `etat_demande` bigint(20) DEFAULT NULL,
  `service` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `document`
--

CREATE TABLE `document` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `nombre` int(11) NOT NULL,
  `ordre` int(11) NOT NULL,
  `service` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `document_demande`
--

CREATE TABLE `document_demande` (
  `id` bigint(20) NOT NULL,
  `nombre_document_fournis` int(11) NOT NULL,
  `nombre_document_restant` int(11) NOT NULL,
  `demande` bigint(20) DEFAULT NULL,
  `document` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `etat_demande`
--

CREATE TABLE `etat_demande` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `service`
--

CREATE TABLE `service` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `lien` varchar(255) DEFAULT NULL,
  `prix` decimal(16,4) DEFAULT NULL,
  `categorie_service` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `categorie_service`
--
ALTER TABLE `categorie_service`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `demande`
--
ALTER TABLE `demande`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKitfwi36k9h4k8eleltehhh68n` (`etat_demande`),
  ADD KEY `FKss60472otr7j77fi997leuqlp` (`service`);

--
-- Index pour la table `document`
--
ALTER TABLE `document`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6y8od1ve7fenosqsumljit5g7` (`service`);

--
-- Index pour la table `document_demande`
--
ALTER TABLE `document_demande`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKe40os1h3edpuef48ecfm654nl` (`demande`),
  ADD KEY `FKq9jer8vt56ys6e3ks48l6grry` (`document`);

--
-- Index pour la table `etat_demande`
--
ALTER TABLE `etat_demande`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKs9rbqj71hvn26mu4a739eqynw` (`categorie_service`);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
