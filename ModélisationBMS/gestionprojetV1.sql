-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  jeu. 17 août 2023 à 09:34
-- Version du serveur :  8.0.17
-- Version de PHP :  7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestionprojet`
--

-- --------------------------------------------------------

--
-- Structure de la table `affectationrh`
--

CREATE TABLE `affectationrh` (
  `nbre_days_per_man` int(11) DEFAULT NULL,
  `nbre_interveners_max` int(11) DEFAULT NULL,
  `nbre_interveners_min` int(11) DEFAULT NULL,
  `nbre_interveners_op` int(11) DEFAULT NULL,
  `codearh` bigint(20) NOT NULL,
  `task_code_task` bigint(20) DEFAULT NULL,
  `tresource_code_resource` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `deliverynote`
--

CREATE TABLE `deliverynote` (
  `date_valid_bl` datetime(6) DEFAULT NULL,
  `devis_num_devis` bigint(20) DEFAULT NULL,
  `invoice_invoice_id` bigint(20) DEFAULT NULL,
  `num_bl` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `destock`
--

CREATE TABLE `destock` (
  `quantity_exit` int(11) DEFAULT NULL,
  `transfert` bit(1) NOT NULL,
  `unit_amount` double NOT NULL,
  `codeds` bigint(20) NOT NULL,
  `date` datetime(6) DEFAULT NULL,
  `stock_stock_id` bigint(20) DEFAULT NULL,
  `tresource_code_resource` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `devis`
--

CREATE TABLE `devis` (
  `customer_codee` bigint(20) DEFAULT NULL,
  `date_devis` datetime(6) DEFAULT NULL,
  `num_devis` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `document`
--

CREATE TABLE `document` (
  `date_of_issue` datetime(6) DEFAULT NULL,
  `indice` bigint(20) NOT NULL,
  `task_code_task` bigint(20) DEFAULT NULL,
  `validity_date` datetime(6) DEFAULT NULL,
  `doc_type` varchar(255) DEFAULT NULL,
  `document_wording` varchar(255) DEFAULT NULL,
  `path_document` varchar(255) DEFAULT NULL,
  `presentation` varchar(255) DEFAULT NULL,
  `value_type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `entrance_note`
--

CREATE TABLE `entrance_note` (
  `input_quantity` int(11) DEFAULT NULL,
  `transfert` bit(1) NOT NULL,
  `unit_amount` double NOT NULL,
  `codeen` bigint(20) NOT NULL,
  `date` datetime(6) DEFAULT NULL,
  `stock_stock_id` bigint(20) DEFAULT NULL,
  `tresource_code_resource` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

CREATE TABLE `entreprise` (
  `codee` bigint(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `contacte` varchar(255) DEFAULT NULL,
  `desktop_phonee` varchar(255) DEFAULT NULL,
  `emaile` varchar(255) DEFAULT NULL,
  `faxe` varchar(255) DEFAULT NULL,
  `mobilee` varchar(255) DEFAULT NULL,
  `namee` varchar(255) DEFAULT NULL,
  `site_web_adress` varchar(255) DEFAULT NULL,
  `user_login` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `invoice`
--

CREATE TABLE `invoice` (
  `deadline_invoice` int(11) NOT NULL,
  `total_amount` double NOT NULL,
  `customer_codee` bigint(20) DEFAULT NULL,
  `date_payment` datetime(6) DEFAULT NULL,
  `invoice_date` datetime(6) DEFAULT NULL,
  `invoice_id` bigint(20) NOT NULL,
  `regulation` enum('BANK_TRANSFER','CASH','CHEQUE') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `invoiceitem`
--

CREATE TABLE `invoiceitem` (
  `price` double NOT NULL,
  `qty` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `id` bigint(20) NOT NULL,
  `invoice_invoice_id` bigint(20) DEFAULT NULL,
  `resource_code_resource` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `link`
--

CREATE TABLE `link` (
  `id_link` bigint(20) NOT NULL,
  `task_from_code_task` bigint(20) DEFAULT NULL,
  `task_to_code_task` bigint(20) DEFAULT NULL,
  `type_link` enum('FinishToStart','StartToStart') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `milestone`
--

CREATE TABLE `milestone` (
  `code_milestone` bigint(20) NOT NULL,
  `date` datetime(6) DEFAULT NULL,
  `task_code_task` bigint(20) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `milistone_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `orderitem`
--

CREATE TABLE `orderitem` (
  `price` double NOT NULL,
  `quantity_order` int(11) NOT NULL,
  `order_id` bigint(20) NOT NULL,
  `order_order_id` bigint(20) DEFAULT NULL,
  `resource_code_resource` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `project`
--

CREATE TABLE `project` (
  `estimated_cost` double NOT NULL,
  `address_code_address` bigint(20) DEFAULT NULL,
  `code_project` bigint(20) NOT NULL,
  `customer_codee` bigint(20) DEFAULT NULL,
  `end_expected_dtae` datetime(6) DEFAULT NULL,
  `manager_code_resource` bigint(20) DEFAULT NULL,
  `start_expected_date` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `service_order` varchar(255) DEFAULT NULL,
  `status` enum('COMPLETED','IN_PROGRESS','LATE','NEW','PENDING','TODO') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `qualification`
--

CREATE TABLE `qualification` (
  `tariff_assignment` int(11) NOT NULL,
  `tariff_rate` double NOT NULL,
  `code_qualif` bigint(20) NOT NULL,
  `qualification_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `qualification_human_resources`
--

CREATE TABLE `qualification_human_resources` (
  `human_resources_code_resource` bigint(20) NOT NULL,
  `qualifications_code_qualif` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `stock`
--

CREATE TABLE `stock` (
  `quantity_in_stock` int(11) NOT NULL,
  `stock_amount` double NOT NULL,
  `unit_of_measurement` int(11) NOT NULL,
  `date_stck` datetime(6) DEFAULT NULL,
  `stock_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `taddress`
--

CREATE TABLE `taddress` (
  `latitude` int(11) DEFAULT NULL,
  `longitude` int(11) DEFAULT NULL,
  `postal_code` int(11) DEFAULT NULL,
  `code_address` bigint(20) NOT NULL,
  `entreprise_codee` bigint(20) DEFAULT NULL,
  `address_ligne1` varchar(255) DEFAULT NULL,
  `address_ligne2` varchar(255) DEFAULT NULL,
  `address_ligne3` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `town` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `task`
--

CREATE TABLE `task` (
  `complete` int(11) DEFAULT NULL,
  `estimated_cost` double NOT NULL,
  `expected_duration` int(11) DEFAULT NULL,
  `ordinal` int(11) DEFAULT NULL,
  `code_task` bigint(20) NOT NULL,
  `end_expected_date` datetime(6) DEFAULT NULL,
  `parent_code_task` bigint(20) DEFAULT NULL,
  `priority` datetime(6) DEFAULT NULL,
  `start_expected_date` datetime(6) DEFAULT NULL,
  `billing_status` enum('INVOICED','NO_INVOICE') DEFAULT NULL,
  `constraint_type` varchar(255) DEFAULT NULL,
  `name_task` varchar(255) DEFAULT NULL,
  `payment_status` enum('PAID','UNPAID') DEFAULT NULL,
  `status` enum('COMPLETED','IN_PROGRESS','LATE','NEW','PENDING','TODO') DEFAULT NULL,
  `tschedule_code_schedule` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `torder`
--

CREATE TABLE `torder` (
  `deadline_order` int(11) NOT NULL,
  `human_resource_code_resource` bigint(20) DEFAULT NULL,
  `order_date` datetime(6) DEFAULT NULL,
  `order_id` bigint(20) NOT NULL,
  `status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `tresource`
--

CREATE TABLE `tresource` (
  `deadlines_approvisionnement` int(11) DEFAULT NULL,
  `etat_disposition` bit(1) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `quantity_min` int(11) DEFAULT NULL,
  `unit_cost` double NOT NULL,
  `code_resource` bigint(20) NOT NULL,
  `type` varchar(31) NOT NULL,
  `label_resource` varchar(255) DEFAULT NULL,
  `mark` varchar(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `namerh` varchar(255) DEFAULT NULL,
  `user_login` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `tresource_providers`
--

CREATE TABLE `tresource_providers` (
  `providers_codee` bigint(20) NOT NULL,
  `resources_code_resource` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `trole`
--

CREATE TABLE `trole` (
  `role_id` bigint(20) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `trole_users`
--

CREATE TABLE `trole_users` (
  `roles_role_id` bigint(20) NOT NULL,
  `users_login` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `tschedule`
--

CREATE TABLE `tschedule` (
  `end_date` datetime(6) DEFAULT NULL,
  `project_code_project` bigint(20) DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `code_schedule` varchar(255) NOT NULL,
  `designation` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `tuser`
--

CREATE TABLE `tuser` (
  `email` varchar(255) DEFAULT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `affectationrh`
--
ALTER TABLE `affectationrh`
  ADD PRIMARY KEY (`codearh`),
  ADD KEY `FK3dt4pjtojrr1cb7d0da2rdtet` (`task_code_task`),
  ADD KEY `FKnv1niiei7ppcs7wjboakoycxv` (`tresource_code_resource`);

--
-- Index pour la table `deliverynote`
--
ALTER TABLE `deliverynote`
  ADD PRIMARY KEY (`num_bl`),
  ADD KEY `FK4ix2tdlfkn352xhi7gmpolmbv` (`devis_num_devis`),
  ADD KEY `FKtjwmrisc7ntkom45tpbfyvmkm` (`invoice_invoice_id`);

--
-- Index pour la table `destock`
--
ALTER TABLE `destock`
  ADD PRIMARY KEY (`codeds`),
  ADD KEY `FKbkl8vpa8ngt0has197ymsgcm4` (`stock_stock_id`),
  ADD KEY `FKcmj20y51kf3i862uxu149ob5l` (`tresource_code_resource`);

--
-- Index pour la table `devis`
--
ALTER TABLE `devis`
  ADD PRIMARY KEY (`num_devis`),
  ADD KEY `FKjjppi5opl3ixkpynpklfvo1qt` (`customer_codee`);

--
-- Index pour la table `document`
--
ALTER TABLE `document`
  ADD PRIMARY KEY (`indice`),
  ADD KEY `FK1ylsbwj2mlb0tqucsmsby675f` (`task_code_task`);

--
-- Index pour la table `entrance_note`
--
ALTER TABLE `entrance_note`
  ADD PRIMARY KEY (`codeen`),
  ADD KEY `FKiwgd0lxjxsxhuyiv59npsgmdo` (`stock_stock_id`),
  ADD KEY `FKr9d6kgfxsce9bb0u7b7sobj3t` (`tresource_code_resource`);

--
-- Index pour la table `entreprise`
--
ALTER TABLE `entreprise`
  ADD PRIMARY KEY (`codee`),
  ADD UNIQUE KEY `UK_kvsla35p64586fkw6y05bvqdj` (`user_login`);

--
-- Index pour la table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`invoice_id`),
  ADD KEY `FKas16hufgn80t52ik8452sn9kk` (`customer_codee`);

--
-- Index pour la table `invoiceitem`
--
ALTER TABLE `invoiceitem`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKccbyk637nvu4yby9beaktqj3m` (`invoice_invoice_id`),
  ADD KEY `FK4jbtm1mq3894jxcjy89wiighl` (`resource_code_resource`);

--
-- Index pour la table `link`
--
ALTER TABLE `link`
  ADD PRIMARY KEY (`id_link`),
  ADD KEY `FK1yr3c5jihaqi57nf8b0w289b2` (`task_from_code_task`),
  ADD KEY `FK760nxf5ofah3lat0dwy0kuj5l` (`task_to_code_task`);

--
-- Index pour la table `milestone`
--
ALTER TABLE `milestone`
  ADD PRIMARY KEY (`code_milestone`),
  ADD KEY `FKral12dpie5mmfbj4qrqxs7gfj` (`task_code_task`);

--
-- Index pour la table `orderitem`
--
ALTER TABLE `orderitem`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `FK8xd1m826gedbrl01evmsvplom` (`order_order_id`),
  ADD KEY `FKipsb11c7nbbe49wox3ffs7lt7` (`resource_code_resource`);

--
-- Index pour la table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`code_project`),
  ADD UNIQUE KEY `UK_8t51374w7k5a5v8j2sfiadoah` (`address_code_address`),
  ADD UNIQUE KEY `UK_a4b6446t61tmdd276120y2fxm` (`manager_code_resource`),
  ADD KEY `FKim354ujiir9l55xe1ojf81i3p` (`customer_codee`);

--
-- Index pour la table `qualification`
--
ALTER TABLE `qualification`
  ADD PRIMARY KEY (`code_qualif`);

--
-- Index pour la table `qualification_human_resources`
--
ALTER TABLE `qualification_human_resources`
  ADD KEY `FKdnxcdokp7gsn8hskq862fu4b` (`human_resources_code_resource`),
  ADD KEY `FKb2e6rrovpcr7mx0gf6vvqno4l` (`qualifications_code_qualif`);

--
-- Index pour la table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`stock_id`);

--
-- Index pour la table `taddress`
--
ALTER TABLE `taddress`
  ADD PRIMARY KEY (`code_address`),
  ADD KEY `FKsxl4jjrgxf4taqw4svxlt11q3` (`entreprise_codee`);

--
-- Index pour la table `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`code_task`),
  ADD KEY `FKt22fc1f5ycklp82tyg5owpgqi` (`parent_code_task`),
  ADD KEY `FKnjth0741lvoylqs4w6bjl9lev` (`tschedule_code_schedule`);

--
-- Index pour la table `torder`
--
ALTER TABLE `torder`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `FKqjjtcj6vex7y64u6s3fo9of06` (`human_resource_code_resource`);

--
-- Index pour la table `tresource`
--
ALTER TABLE `tresource`
  ADD PRIMARY KEY (`code_resource`),
  ADD UNIQUE KEY `UK_dt6i1lr6m9k8npiv0c7y6olu3` (`user_login`);

--
-- Index pour la table `tresource_providers`
--
ALTER TABLE `tresource_providers`
  ADD KEY `FKj3amvmaaq0ra8b3r521yqj0nl` (`providers_codee`),
  ADD KEY `FKjavc36d0w44h3a7t13ihcs9ja` (`resources_code_resource`);

--
-- Index pour la table `trole`
--
ALTER TABLE `trole`
  ADD PRIMARY KEY (`role_id`);

--
-- Index pour la table `trole_users`
--
ALTER TABLE `trole_users`
  ADD KEY `FKsfepmw9hjj3xee54gtg3vkirp` (`users_login`),
  ADD KEY `FKc347arh32hc34eg8s4n0vnsyq` (`roles_role_id`);

--
-- Index pour la table `tschedule`
--
ALTER TABLE `tschedule`
  ADD PRIMARY KEY (`code_schedule`),
  ADD KEY `FKktgga903x1wn854oq6kbu55ut` (`project_code_project`);

--
-- Index pour la table `tuser`
--
ALTER TABLE `tuser`
  ADD PRIMARY KEY (`login`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `affectationrh`
--
ALTER TABLE `affectationrh`
  MODIFY `codearh` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `deliverynote`
--
ALTER TABLE `deliverynote`
  MODIFY `num_bl` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `destock`
--
ALTER TABLE `destock`
  MODIFY `codeds` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `devis`
--
ALTER TABLE `devis`
  MODIFY `num_devis` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `document`
--
ALTER TABLE `document`
  MODIFY `indice` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `entrance_note`
--
ALTER TABLE `entrance_note`
  MODIFY `codeen` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `entreprise`
--
ALTER TABLE `entreprise`
  MODIFY `codee` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `invoice_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `invoiceitem`
--
ALTER TABLE `invoiceitem`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `link`
--
ALTER TABLE `link`
  MODIFY `id_link` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `milestone`
--
ALTER TABLE `milestone`
  MODIFY `code_milestone` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `orderitem`
--
ALTER TABLE `orderitem`
  MODIFY `order_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `project`
--
ALTER TABLE `project`
  MODIFY `code_project` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `qualification`
--
ALTER TABLE `qualification`
  MODIFY `code_qualif` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `stock`
--
ALTER TABLE `stock`
  MODIFY `stock_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `taddress`
--
ALTER TABLE `taddress`
  MODIFY `code_address` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `task`
--
ALTER TABLE `task`
  MODIFY `code_task` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `torder`
--
ALTER TABLE `torder`
  MODIFY `order_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `tresource`
--
ALTER TABLE `tresource`
  MODIFY `code_resource` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `trole`
--
ALTER TABLE `trole`
  MODIFY `role_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `affectationrh`
--
ALTER TABLE `affectationrh`
  ADD CONSTRAINT `FK3dt4pjtojrr1cb7d0da2rdtet` FOREIGN KEY (`task_code_task`) REFERENCES `task` (`code_task`),
  ADD CONSTRAINT `FKnv1niiei7ppcs7wjboakoycxv` FOREIGN KEY (`tresource_code_resource`) REFERENCES `tresource` (`code_resource`);

--
-- Contraintes pour la table `deliverynote`
--
ALTER TABLE `deliverynote`
  ADD CONSTRAINT `FK4ix2tdlfkn352xhi7gmpolmbv` FOREIGN KEY (`devis_num_devis`) REFERENCES `devis` (`num_devis`),
  ADD CONSTRAINT `FKtjwmrisc7ntkom45tpbfyvmkm` FOREIGN KEY (`invoice_invoice_id`) REFERENCES `invoice` (`invoice_id`);

--
-- Contraintes pour la table `destock`
--
ALTER TABLE `destock`
  ADD CONSTRAINT `FKbkl8vpa8ngt0has197ymsgcm4` FOREIGN KEY (`stock_stock_id`) REFERENCES `stock` (`stock_id`),
  ADD CONSTRAINT `FKcmj20y51kf3i862uxu149ob5l` FOREIGN KEY (`tresource_code_resource`) REFERENCES `tresource` (`code_resource`);

--
-- Contraintes pour la table `devis`
--
ALTER TABLE `devis`
  ADD CONSTRAINT `FKjjppi5opl3ixkpynpklfvo1qt` FOREIGN KEY (`customer_codee`) REFERENCES `entreprise` (`codee`);

--
-- Contraintes pour la table `document`
--
ALTER TABLE `document`
  ADD CONSTRAINT `FK1ylsbwj2mlb0tqucsmsby675f` FOREIGN KEY (`task_code_task`) REFERENCES `task` (`code_task`);

--
-- Contraintes pour la table `entrance_note`
--
ALTER TABLE `entrance_note`
  ADD CONSTRAINT `FKiwgd0lxjxsxhuyiv59npsgmdo` FOREIGN KEY (`stock_stock_id`) REFERENCES `stock` (`stock_id`),
  ADD CONSTRAINT `FKr9d6kgfxsce9bb0u7b7sobj3t` FOREIGN KEY (`tresource_code_resource`) REFERENCES `tresource` (`code_resource`);

--
-- Contraintes pour la table `entreprise`
--
ALTER TABLE `entreprise`
  ADD CONSTRAINT `FK7jce4hf9er1fieu8lodxlgoln` FOREIGN KEY (`user_login`) REFERENCES `tuser` (`login`);

--
-- Contraintes pour la table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `FKas16hufgn80t52ik8452sn9kk` FOREIGN KEY (`customer_codee`) REFERENCES `entreprise` (`codee`);

--
-- Contraintes pour la table `invoiceitem`
--
ALTER TABLE `invoiceitem`
  ADD CONSTRAINT `FK4jbtm1mq3894jxcjy89wiighl` FOREIGN KEY (`resource_code_resource`) REFERENCES `tresource` (`code_resource`),
  ADD CONSTRAINT `FKccbyk637nvu4yby9beaktqj3m` FOREIGN KEY (`invoice_invoice_id`) REFERENCES `invoice` (`invoice_id`);

--
-- Contraintes pour la table `link`
--
ALTER TABLE `link`
  ADD CONSTRAINT `FK1yr3c5jihaqi57nf8b0w289b2` FOREIGN KEY (`task_from_code_task`) REFERENCES `task` (`code_task`),
  ADD CONSTRAINT `FK760nxf5ofah3lat0dwy0kuj5l` FOREIGN KEY (`task_to_code_task`) REFERENCES `task` (`code_task`);

--
-- Contraintes pour la table `milestone`
--
ALTER TABLE `milestone`
  ADD CONSTRAINT `FKral12dpie5mmfbj4qrqxs7gfj` FOREIGN KEY (`task_code_task`) REFERENCES `task` (`code_task`);

--
-- Contraintes pour la table `orderitem`
--
ALTER TABLE `orderitem`
  ADD CONSTRAINT `FK8xd1m826gedbrl01evmsvplom` FOREIGN KEY (`order_order_id`) REFERENCES `torder` (`order_id`),
  ADD CONSTRAINT `FKipsb11c7nbbe49wox3ffs7lt7` FOREIGN KEY (`resource_code_resource`) REFERENCES `tresource` (`code_resource`);

--
-- Contraintes pour la table `project`
--
ALTER TABLE `project`
  ADD CONSTRAINT `FK49ii8xl1qkdjqtoqccf686qjy` FOREIGN KEY (`manager_code_resource`) REFERENCES `tresource` (`code_resource`),
  ADD CONSTRAINT `FKim354ujiir9l55xe1ojf81i3p` FOREIGN KEY (`customer_codee`) REFERENCES `entreprise` (`codee`),
  ADD CONSTRAINT `FKqfbjmey7porexanpxq9h86luv` FOREIGN KEY (`address_code_address`) REFERENCES `taddress` (`code_address`);

--
-- Contraintes pour la table `qualification_human_resources`
--
ALTER TABLE `qualification_human_resources`
  ADD CONSTRAINT `FKb2e6rrovpcr7mx0gf6vvqno4l` FOREIGN KEY (`qualifications_code_qualif`) REFERENCES `qualification` (`code_qualif`),
  ADD CONSTRAINT `FKdnxcdokp7gsn8hskq862fu4b` FOREIGN KEY (`human_resources_code_resource`) REFERENCES `tresource` (`code_resource`);

--
-- Contraintes pour la table `taddress`
--
ALTER TABLE `taddress`
  ADD CONSTRAINT `FKsxl4jjrgxf4taqw4svxlt11q3` FOREIGN KEY (`entreprise_codee`) REFERENCES `entreprise` (`codee`);

--
-- Contraintes pour la table `task`
--
ALTER TABLE `task`
  ADD CONSTRAINT `FKnjth0741lvoylqs4w6bjl9lev` FOREIGN KEY (`tschedule_code_schedule`) REFERENCES `tschedule` (`code_schedule`),
  ADD CONSTRAINT `FKt22fc1f5ycklp82tyg5owpgqi` FOREIGN KEY (`parent_code_task`) REFERENCES `task` (`code_task`);

--
-- Contraintes pour la table `torder`
--
ALTER TABLE `torder`
  ADD CONSTRAINT `FKqjjtcj6vex7y64u6s3fo9of06` FOREIGN KEY (`human_resource_code_resource`) REFERENCES `tresource` (`code_resource`);

--
-- Contraintes pour la table `tresource`
--
ALTER TABLE `tresource`
  ADD CONSTRAINT `FKfmdwpytkcr0t79b3fibgr4243` FOREIGN KEY (`user_login`) REFERENCES `tuser` (`login`);

--
-- Contraintes pour la table `tresource_providers`
--
ALTER TABLE `tresource_providers`
  ADD CONSTRAINT `FKj3amvmaaq0ra8b3r521yqj0nl` FOREIGN KEY (`providers_codee`) REFERENCES `entreprise` (`codee`),
  ADD CONSTRAINT `FKjavc36d0w44h3a7t13ihcs9ja` FOREIGN KEY (`resources_code_resource`) REFERENCES `tresource` (`code_resource`);

--
-- Contraintes pour la table `trole_users`
--
ALTER TABLE `trole_users`
  ADD CONSTRAINT `FKc347arh32hc34eg8s4n0vnsyq` FOREIGN KEY (`roles_role_id`) REFERENCES `trole` (`role_id`),
  ADD CONSTRAINT `FKsfepmw9hjj3xee54gtg3vkirp` FOREIGN KEY (`users_login`) REFERENCES `tuser` (`login`);

--
-- Contraintes pour la table `tschedule`
--
ALTER TABLE `tschedule`
  ADD CONSTRAINT `FKktgga903x1wn854oq6kbu55ut` FOREIGN KEY (`project_code_project`) REFERENCES `project` (`code_project`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
