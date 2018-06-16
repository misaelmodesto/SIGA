-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Tempo de geração: 01/12/2017 às 15:15
-- Versão do servidor: 5.5.58-0+deb8u1
-- Versão do PHP: 5.6.30-0+deb8u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de dados: `siga`
--
CREATE DATABASE IF NOT EXISTS `siga` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `siga`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `avaliacaoAntropometrica`
--

DROP TABLE IF EXISTS `avaliacaoAntropometrica`;
CREATE TABLE IF NOT EXISTS `avaliacaoAntropometrica` (
`id_Avali` int(11) NOT NULL,
  `subescapular_Avali` double NOT NULL,
  `triceps_Avali` double NOT NULL,
  `bicepes_Avali` double NOT NULL,
  `peitoral_Avali` double NOT NULL,
  `axilarMedio_Avali` double NOT NULL,
  `supraIliaca_Avali` double NOT NULL,
  `abdominalVertical_Avali` double NOT NULL,
  `coxaSuperior_Avali` double NOT NULL,
  `coxaMedial_Avali` double NOT NULL,
  `panturilhaMedial_Avali` double NOT NULL,
  `antebraco_Avali` double NOT NULL,
  `bracoRelaxado_Avali` double NOT NULL,
  `bracoContraido_Avali` double NOT NULL,
  `ombro_Avali` double NOT NULL,
  `torax_Avali` double NOT NULL,
  `cintura_Avali` double NOT NULL,
  `abdomen_Avali` double NOT NULL,
  `quadril_Avali` double NOT NULL,
  `perna_Avali` double NOT NULL,
  `massaCorporal_Avali` double NOT NULL,
  `biestiloideRadial_Avali` double NOT NULL,
  `BiepicondiloFemural_Avali` double NOT NULL,
  `genero_Avali` varchar(10) NOT NULL,
  `etinia_Avali` varchar(16) NOT NULL,
  `idade_Avali` int(11) NOT NULL,
  `estatura_Avali` double NOT NULL,
  `idPac_Avali` int(11) NOT NULL,
  `result_ProtocoloGuedes` double DEFAULT NULL,
  `result_ProtocoloPetroski` double DEFAULT NULL,
  `result_ProtocoloJacksonEPollock` double DEFAULT NULL,
  `result_ProtocoloJacksonPollockEWard` double DEFAULT NULL,
  `result_ProtocoloSeri` double DEFAULT NULL,
  `result_MassaCorporalGorda` double DEFAULT NULL,
  `result_MassaCorporalmagra` double DEFAULT NULL,
  `result_MassaOssea` double DEFAULT NULL,
  `result_MassaMuscular` double DEFAULT NULL,
  `data_Avali` varchar(10) DEFAULT NULL,
  `result_IMC` varchar(30) DEFAULT NULL,
  `result_RCQ` varchar(30) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `avaliacaoAntropometrica`
--

INSERT INTO `avaliacaoAntropometrica` (`id_Avali`, `subescapular_Avali`, `triceps_Avali`, `bicepes_Avali`, `peitoral_Avali`, `axilarMedio_Avali`, `supraIliaca_Avali`, `abdominalVertical_Avali`, `coxaSuperior_Avali`, `coxaMedial_Avali`, `panturilhaMedial_Avali`, `antebraco_Avali`, `bracoRelaxado_Avali`, `bracoContraido_Avali`, `ombro_Avali`, `torax_Avali`, `cintura_Avali`, `abdomen_Avali`, `quadril_Avali`, `perna_Avali`, `massaCorporal_Avali`, `biestiloideRadial_Avali`, `BiepicondiloFemural_Avali`, `genero_Avali`, `etinia_Avali`, `idade_Avali`, `estatura_Avali`, `idPac_Avali`, `result_ProtocoloGuedes`, `result_ProtocoloPetroski`, `result_ProtocoloJacksonEPollock`, `result_ProtocoloJacksonPollockEWard`, `result_ProtocoloSeri`, `result_MassaCorporalGorda`, `result_MassaCorporalmagra`, `result_MassaOssea`, `result_MassaMuscular`, `data_Avali`, `result_IMC`, `result_RCQ`) VALUES
(1, 0.1, 0.2, 0.3, 0.5, 0.6, 0.7, 0.8, 0.9, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 0.1, 0.2, 60.77, 5.6, 3.23, 'Masculino', 'Parda', 20, 1.24, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, 1.4, 1, 1.2, 1.3, 0.6, 0.7, 0.8, 0.9, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 0.1, 0.2, 60.77, 5.6, 3.23, 'Masculino', 'Parda', 20, 1.24, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 0.1, 0.2, 0.3, 0.5, 0.6, 0.7, 0.8, 0.9, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 0.1, 0.2, 60.77, 5.6, 3.23, 'Masculino', 'Parda', 20, 1.24, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, 76, 76, 76, 8, 68, 76, 76, 76, 87, 9, 9, 98, 86, 89, 6, 9, 6, 9, 7, 45, 78, 8, 'Masculino', 'Negro', 20, 676, 14, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, 0.4, 0.33, 0.5, 0.45, 0.44, 0.4, 0.3, 0.4, 0.55, 0.44, 1, 1, 22, 1, 1, 1, 11, 1, 22, 65, 11, 1, 'Masculino', 'Indígena', 20, 1.34, 14, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 33, 1, 1, 'Masculino', 'Cafusos', 55, 44, 14, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 'Masculino', 'Indígena', 22, 1, 14, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, 0, NULL, NULL, NULL),
(8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 'Masculino', 'Negro', 1, 1, 14, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, 0, NULL, NULL, NULL),
(9, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 0, 1.5, 1.5, 'Masculino', 'Mulato', 19, 2, 14, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, 0, NULL, NULL, NULL),
(10, 12, 22, 12, 12, 12, 12, 12, 12, 12, 12, 21, 12, 12, 25, 25, 25, 25, 25, 25, 0, 12, 12, 'Selecione', 'Cafusos', 22, 52, 17, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, 0, '  /  /    ', 'Obesidade Grau 3 (Mórbita)', NULL),
(11, 12, 22, 12, 12, 12, 12, 12, 12, 12, 12, 21, 12, 12, 25, 25, 25, 25, 25, 25, 0, 12, 12, 'Selecione', 'Cafusos', 22, 52, 17, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, 0, '  /  /    ', 'Obesidade Grau 3 (Mórbita)', NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `CadastroDePacientes`
--

DROP TABLE IF EXISTS `CadastroDePacientes`;
CREATE TABLE IF NOT EXISTS `CadastroDePacientes` (
`id_Paci` int(11) NOT NULL,
  `cpf_Paci` varchar(14) NOT NULL,
  `nome_Paci` varchar(20) NOT NULL,
  `sobrenome_Paci` varchar(20) NOT NULL,
  `nacimento_Paci` varchar(10) DEFAULT NULL,
  `nome_Rua_Pac` varchar(30) NOT NULL,
  `numero_Rua_Pac` varchar(3) DEFAULT NULL,
  `bairro_Pac` varchar(30) NOT NULL,
  `cidade_Pac` varchar(30) NOT NULL,
  `uf_Pac` varchar(2) NOT NULL,
  `cep_pac` varchar(10) NOT NULL,
  `telefone_pac` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `imagem_Pac` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `CadastroDePacientes`
--

INSERT INTO `CadastroDePacientes` (`id_Paci`, `cpf_Paci`, `nome_Paci`, `sobrenome_Paci`, `nacimento_Paci`, `nome_Rua_Pac`, `numero_Rua_Pac`, `bairro_Pac`, `cidade_Pac`, `uf_Pac`, `cep_pac`, `telefone_pac`, `celular`, `imagem_Pac`) VALUES
(5, '213.395.860-66', 'Misael', 'Santos', '20/11/1997', 'Avenida Sul', '14', 'Inocoop', 'Olivença', 'BA', '42.801-070', '(71) 3621 - 1258', '(71) 98800-8617', NULL),
(8, '847.388.237-32', 'Mirivaldo', 'Modesto', '20/11/1997', 'Avenida Sul', '14', 'Inocoop', 'Ilhéus', 'BA', '22.222-222', '(22) 2222 - 2222', '(22) 22222-2222', NULL),
(10, '121.212.121-21', 'Isael', 'Modesto', '12/12/1212', 'misa', '14', 'ggggggggg', 'Ilhéus', 'BA', '42.801-070', '(66) 6666 - 6666', '(22) 22222-2222', NULL),
(11, '212.223.242-52', 'maria', 'Conceição', '12/12/1222', 'Avenida sul', '14', 'Dias D''avila', 'Ilhéus', 'BA', '42.801-070', '(11) 1111 - 1111', '(33) 33333-3333', NULL),
(12, '201.720.172-01', 'Ana Paula', 'Ventura', '17/11/1996', 'ifba', '10', 'perigoso', 'Serra Grande', 'BA', '20.202-020', '(11) 4002 - 8922', '(71) 94002-8922', NULL),
(15, '652.148.562-32', 'xxxxxxxxxxxxx', 'xxxxxxxxxxxx', '88/88/8888', 'xcccccccccccccc', '22', 'dddddddddddddd', 'Itacaré', 'BA', '44.444-444', '(44) 4444 - 4444', '(66) 66666-6666', NULL),
(16, '565.123.151-32', 'Misael', 'Modesto', '20/11/1997', 'sdddddddddddd', '55', 'inkd', 'Camaçari', 'BA', '55.555-555', '(  )      -     ', '(  )      -    ', NULL),
(17, '020.020.020-02', 'Larissa', 'Carneiro', '22/05/2020', 'R. via parque', '0', 'Fortaleza', 'Camaçari', 'BA', '45.000-000', '(75) 1234 - 5678', '(71) 99999-9999', NULL),
(18, '789.564.231-11', 'Eu mesmo', 'mesmo', '77/77/7777', 'zxcgjkl', '25', 'kjhgf', 'xghgj', 'AP', '55.555-555', '(55) 5555 - 5555', '(55) 55555-5555', '/home/misael/Downloads/bigstock-doctor-sitting-by-male-patient-92742503-735x460.jpg');

-- --------------------------------------------------------

--
-- Estrutura para tabela `especialista`
--

DROP TABLE IF EXISTS `especialista`;
CREATE TABLE IF NOT EXISTS `especialista` (
`id_Esp` int(11) NOT NULL,
  `nome_Esp` varchar(20) NOT NULL,
  `sobrenome_Esp` varchar(20) NOT NULL,
  `cpf_Esp` varchar(14) NOT NULL,
  `nasc_Esp` varchar(10) NOT NULL,
  `rua_Esp` varchar(40) NOT NULL,
  `numero_Esp` varchar(3) NOT NULL,
  `cidade_Esp` varchar(40) NOT NULL,
  `uf_Esp` varchar(2) NOT NULL,
  `bairro_Esp` varchar(40) NOT NULL,
  `cep_Esp` varchar(10) NOT NULL,
  `tel_Esp` varchar(13) NOT NULL,
  `cel_ESp` varchar(14) NOT NULL,
  `usuario_Esp` varchar(15) NOT NULL,
  `email_Esp` varchar(30) NOT NULL,
  `perfil_Esp` varchar(13) DEFAULT NULL,
  `senha_Esp` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `especialista`
--

INSERT INTO `especialista` (`id_Esp`, `nome_Esp`, `sobrenome_Esp`, `cpf_Esp`, `nasc_Esp`, `rua_Esp`, `numero_Esp`, `cidade_Esp`, `uf_Esp`, `bairro_Esp`, `cep_Esp`, `tel_Esp`, `cel_ESp`, `usuario_Esp`, `email_Esp`, `perfil_Esp`, `senha_Esp`) VALUES
(3, 'xxxxxxxxxxx', 'xxxxxxxxxxxxxxx', '666.666.666-66', '55/55/5555', 'nnnnnnn', '5', 'nnn', 'AC', 'mmmmmm', '55.555-555', '(55)5555-5555', '(55)55555-5555', 'mmodesto', 'kkk', 'Selecione', NULL),
(4, 'xxxxxxxxxxx', 'xxxxxxxxx', '201.720.172-01', '20/11/1997', 'xxxxxx', '1', 'xxxxxx', 'AC', 'xxxxxxxx', '11.111-111', '(11)1111-1111', '(11)11111-1111', 'xxx', 'xxx', 'Administrador', 'Misa@@'),
(5, 'Debora', 'Alencar', '347.432.355-53', '23/06/1995', 'mata', '55', 'Camaçari', 'BA', 'ufba', '55.555-555', '(55)5555-5555', '(55)55555-5555', 'dalencar', 'cccccccc', 'Usuario', NULL),
(6, 'Misael', 'Santos', '076.776.145-66', '20/11/1997', 'Avenisa sul', '14', 'Camaçari', 'BA', 'Inocoop', '42.801-070', '(71)3621-1258', '(71)93621-1258', 'mmodesto', 'misaelmodesto@ifba.edu.br', 'Administrador', 'xxx'),
(7, 'xxxxxxxxxxxxxx', 'xxxxxxxxxxxx', '010.101.010-20', '22/22/2222', 'xx', '11', 'xxxxxx', 'AC', 'ccccccccc', '00.000-000', '(00)0000-0000', '(00)00000-0000', 'xx', 'xx', 'Administrador', NULL),
(8, 'hxxxxxxx', 'xxxxxxxxx', '666.555.444-00', '00/00/0000', 'h', '5', 'bb', 'AC', 'll', '00.000-000', '(00)0000-0000', '(00)00000-0000', 'mm', 'nnn', 'Usuario', NULL),
(9, 'xxx', 'xxx', '000.111.222-33', '00/00/0000', 'nnn', '11', 'mmm', 'AC', 'jjj', '00.000-000', '(00)0000-0000', '(00)00000-0000', 'xxx', 'xxx', 'Administrador', 'CD2EB0837C9B4C962C22D2FF8B5441B7B45805887F051D39BF133B583BAF6860'),
(10, 'xxx', 'xxx', '222.333.444-55', '00/00/0000', 'lll', '11', 'uytr', 'AC', 'kjhg', '00.000-000', '(00)0000-0000', '(00)00000-0000', 'xxx', 'xxx', 'Administrador', 'CD2EB0837C9B4C962C22D2FF8B5441B7B45805887F051D39BF133B583BAF6860'),
(11, 'mmm', 'mmm', '999.666.333-22', '20/11/1997', 'cccccc', '22', '00', 'AC', 'lll', '00.000-000', '(00)0000-0000', '(00)00000-0000', 'mmm', 'xxx', 'Administrador', 'CD2EB0837C9B4C962C22D2FF8B5441B7B45805887F051D39BF133B583BAF6860'),
(13, 'Larissa', 'Carneiro', '123.456.789-10', '22/05/2020', 'R via parque', '0', 'Camaçari', 'BA', 'Camcaçari', '42.800-000', '(71)9999-9999', '(71)99999-9999', 'Lara', 'carneiroln@gmail.com', 'Administrador', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918');

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `avaliacaoAntropometrica`
--
ALTER TABLE `avaliacaoAntropometrica`
 ADD PRIMARY KEY (`id_Avali`);

--
-- Índices de tabela `CadastroDePacientes`
--
ALTER TABLE `CadastroDePacientes`
 ADD PRIMARY KEY (`id_Paci`), ADD UNIQUE KEY `id_Paci` (`id_Paci`), ADD UNIQUE KEY `cpf_Paci` (`cpf_Paci`);

--
-- Índices de tabela `especialista`
--
ALTER TABLE `especialista`
 ADD PRIMARY KEY (`id_Esp`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `avaliacaoAntropometrica`
--
ALTER TABLE `avaliacaoAntropometrica`
MODIFY `id_Avali` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de tabela `CadastroDePacientes`
--
ALTER TABLE `CadastroDePacientes`
MODIFY `id_Paci` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT de tabela `especialista`
--
ALTER TABLE `especialista`
MODIFY `id_Esp` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
