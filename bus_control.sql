-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 10-05-2020 a las 20:23:28
-- Versión del servidor: 10.3.22-MariaDB-0+deb10u1
-- Versión de PHP: 7.3.14-1~deb10u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bus_control`
--
CREATE DATABASE IF NOT EXISTS `bus_control` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bus_control`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora`
--

CREATE TABLE `bitacora` (
  `IdBitacora` int(11) NOT NULL,
  `IdLugarControlBitacora` int(11) NOT NULL,
  `IdBusBitacora` int(11) NOT NULL,
  `FechaBitacora` date NOT NULL,
  `HoraBitacora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bus`
--

CREATE TABLE `bus` (
  `IdBus` int(11) NOT NULL,
  `IdRutaBus` int(11) NOT NULL,
  `IdMotoristaBus` int(11) NOT NULL,
  `IdCobradorBus` int(11) NOT NULL,
  `IdJefeBus` int(11) NOT NULL,
  `PlacaBus` varchar(15) NOT NULL,
  `MarcaBus` varchar(25) NOT NULL,
  `ModeloBus` varchar(25) NOT NULL,
  `SerieBus` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `bus`
--

INSERT INTO `bus` (`IdBus`, `IdRutaBus`, `IdMotoristaBus`, `IdCobradorBus`, `IdJefeBus`, `PlacaBus`, `MarcaBus`, `ModeloBus`, `SerieBus`) VALUES
(1, 1, 5, 3, 1, '121-34', 'Nissan', '212125dds', 'ddsq32343'),
(2, 2, 6, 4, 1, '433-89', 'Toyo', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `castigo`
--

CREATE TABLE `castigo` (
  `IdCastigo` int(11) NOT NULL,
  `IdBusCastigo` int(11) NOT NULL,
  `FechaInicioCastigo` date NOT NULL,
  `FechaFinCastigo` date NOT NULL,
  `EstadoCastigo` enum('Activo','Inactivo') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cobrador`
--

CREATE TABLE `cobrador` (
  `IdCobrador` int(11) NOT NULL,
  `NombreCobrador` varchar(100) NOT NULL,
  `ApellidoCobrador` varchar(100) NOT NULL,
  `DuiCobrador` varchar(11) NOT NULL,
  `LicenciaCobrador` enum('Si','No') NOT NULL,
  `TelefonoCobrador` varchar(15) DEFAULT 'NULL',
  `DireccionCobrador` longtext NOT NULL,
  `GeneroCobrador` enum('Masculino','Femenino','Otros') NOT NULL,
  `SueldoCobrador` decimal(6,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cobrador`
--

INSERT INTO `cobrador` (`IdCobrador`, `NombreCobrador`, `ApellidoCobrador`, `DuiCobrador`, `LicenciaCobrador`, `TelefonoCobrador`, `DireccionCobrador`, `GeneroCobrador`, `SueldoCobrador`) VALUES
(3, 'Jose Ramon', 'Reyes', '121212', 'Si', '7908438', 'Santa Rosa de Lima', 'Masculino', '1212.00'),
(4, 'Juan Carlos', 'Mendoza', '2121212', 'Si', 'NULL', 'Santa Rosa de Lima', 'Masculino', '100.45');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destino`
--

CREATE TABLE `destino` (
  `IdDestino` int(11) NOT NULL,
  `IdRutaDestino` int(11) NOT NULL,
  `NombreDestino` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `destino`
--

INSERT INTO `destino` (`IdDestino`, `IdRutaDestino`, `NombreDestino`) VALUES
(1, 1, 'San Miguel'),
(2, 2, 'Usulutan, San Salvador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_egreso`
--

CREATE TABLE `detalle_egreso` (
  `IdDetalleEgreso` int(11) NOT NULL,
  `IdEgreso` int(11) NOT NULL,
  `IdBusDetalleEgreso` int(11) NOT NULL,
  `DescripcionDetalleEgreso` longtext NOT NULL,
  `MontoDetalleEgreso` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ingreso`
--

CREATE TABLE `detalle_ingreso` (
  `IdDetalleIngreso` int(11) NOT NULL,
  `IdIngreso` int(11) NOT NULL,
  `IdBusDetalleIngreso` int(11) NOT NULL,
  `MontoIngreso` decimal(6,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `egreso`
--

CREATE TABLE `egreso` (
  `IdEgreso` int(11) NOT NULL,
  `FechaEgreso` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingreso`
--

CREATE TABLE `ingreso` (
  `IdIngreso` int(11) NOT NULL,
  `FechaIngreso` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jefe`
--

CREATE TABLE `jefe` (
  `IdJefe` int(11) NOT NULL,
  `NombreJefe` varchar(100) NOT NULL,
  `ApellidoJefe` varchar(100) NOT NULL,
  `TelefonoJefe` varchar(15) NOT NULL,
  `DireccionJefe` longtext NOT NULL,
  `DuiJefe` varchar(11) NOT NULL,
  `GeneroJefe` enum('Masculino','Femenino','Otros') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `jefe`
--

INSERT INTO `jefe` (`IdJefe`, `NombreJefe`, `ApellidoJefe`, `TelefonoJefe`, `DireccionJefe`, `DuiJefe`, `GeneroJefe`) VALUES
(1, 'Chepe', 'Zelaya', '89898989', 'en la Casa', '123232', 'Masculino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lugar_control`
--

CREATE TABLE `lugar_control` (
  `IdLugarControl` int(11) NOT NULL,
  `NombreLugarControl` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `lugar_control`
--

INSERT INTO `lugar_control` (`IdLugarControl`, `NombreLugarControl`) VALUES
(1, 'San Salvador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `motorista`
--

CREATE TABLE `motorista` (
  `IdMotorista` int(11) NOT NULL,
  `NombreMotorista` varchar(100) NOT NULL,
  `ApellidoMotorista` varchar(100) NOT NULL,
  `DuiMotorista` varchar(11) NOT NULL,
  `LicenciaMotorista` enum('Si','No') NOT NULL,
  `TelefonoMotorista` varchar(15) DEFAULT 'NULL',
  `DireccionMotorista` longtext NOT NULL,
  `GeneroMotorista` enum('Masculino','Femenino','Otros') NOT NULL,
  `SueldoMotorista` decimal(6,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `motorista`
--

INSERT INTO `motorista` (`IdMotorista`, `NombreMotorista`, `ApellidoMotorista`, `DuiMotorista`, `LicenciaMotorista`, `TelefonoMotorista`, `DireccionMotorista`, `GeneroMotorista`, `SueldoMotorista`) VALUES
(5, 'Daniel Armando', 'Rosas', '7894312', 'Si', '565656', 'San Miguel', 'Masculino', '856.00'),
(6, 'Reynal Armando', 'Aguirre', '567688', 'Si', '7899898', 'San Salvador', 'Masculino', '2121.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `IdRuta` int(11) NOT NULL,
  `NumeroRuta` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ruta`
--

INSERT INTO `ruta` (`IdRuta`, `NumeroRuta`) VALUES
(1, '454-B'),
(2, '306');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bitacora`
--
ALTER TABLE `bitacora`
  ADD PRIMARY KEY (`IdBitacora`),
  ADD KEY `fkIdLugarControlBitacora` (`IdLugarControlBitacora`),
  ADD KEY `fkIdBusBitacora` (`IdBusBitacora`);

--
-- Indices de la tabla `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`IdBus`),
  ADD KEY `fkIdRutaBus` (`IdRutaBus`),
  ADD KEY `fkIdMotoristaBus` (`IdMotoristaBus`),
  ADD KEY `fkIdCobradorBus` (`IdCobradorBus`),
  ADD KEY `fkIdJefeBus` (`IdJefeBus`);

--
-- Indices de la tabla `castigo`
--
ALTER TABLE `castigo`
  ADD PRIMARY KEY (`IdCastigo`),
  ADD KEY `fkBusCastigo` (`IdBusCastigo`);

--
-- Indices de la tabla `cobrador`
--
ALTER TABLE `cobrador`
  ADD PRIMARY KEY (`IdCobrador`);

--
-- Indices de la tabla `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`IdDestino`),
  ADD KEY `fkIdRutaDestino` (`IdRutaDestino`);

--
-- Indices de la tabla `detalle_egreso`
--
ALTER TABLE `detalle_egreso`
  ADD PRIMARY KEY (`IdDetalleEgreso`),
  ADD KEY `fkIdBusDetalleEgreso` (`IdBusDetalleEgreso`) USING BTREE,
  ADD KEY `fkIdEgresoDetalle` (`IdEgreso`) USING BTREE;

--
-- Indices de la tabla `detalle_ingreso`
--
ALTER TABLE `detalle_ingreso`
  ADD PRIMARY KEY (`IdDetalleIngreso`),
  ADD KEY `fkIdIngresoDetalle` (`IdIngreso`),
  ADD KEY `fkIdBusDetalleIngreso` (`IdBusDetalleIngreso`) USING BTREE;

--
-- Indices de la tabla `egreso`
--
ALTER TABLE `egreso`
  ADD PRIMARY KEY (`IdEgreso`);

--
-- Indices de la tabla `ingreso`
--
ALTER TABLE `ingreso`
  ADD PRIMARY KEY (`IdIngreso`);

--
-- Indices de la tabla `jefe`
--
ALTER TABLE `jefe`
  ADD PRIMARY KEY (`IdJefe`);

--
-- Indices de la tabla `lugar_control`
--
ALTER TABLE `lugar_control`
  ADD PRIMARY KEY (`IdLugarControl`);

--
-- Indices de la tabla `motorista`
--
ALTER TABLE `motorista`
  ADD PRIMARY KEY (`IdMotorista`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`IdRuta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bitacora`
--
ALTER TABLE `bitacora`
  MODIFY `IdBitacora` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `bus`
--
ALTER TABLE `bus`
  MODIFY `IdBus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `castigo`
--
ALTER TABLE `castigo`
  MODIFY `IdCastigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cobrador`
--
ALTER TABLE `cobrador`
  MODIFY `IdCobrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `destino`
--
ALTER TABLE `destino`
  MODIFY `IdDestino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `detalle_egreso`
--
ALTER TABLE `detalle_egreso`
  MODIFY `IdDetalleEgreso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_ingreso`
--
ALTER TABLE `detalle_ingreso`
  MODIFY `IdDetalleIngreso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `egreso`
--
ALTER TABLE `egreso`
  MODIFY `IdEgreso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ingreso`
--
ALTER TABLE `ingreso`
  MODIFY `IdIngreso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `jefe`
--
ALTER TABLE `jefe`
  MODIFY `IdJefe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `lugar_control`
--
ALTER TABLE `lugar_control`
  MODIFY `IdLugarControl` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `motorista`
--
ALTER TABLE `motorista`
  MODIFY `IdMotorista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `ruta`
--
ALTER TABLE `ruta`
  MODIFY `IdRuta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bitacora`
--
ALTER TABLE `bitacora`
  ADD CONSTRAINT `fkIdBusBitacora` FOREIGN KEY (`IdBusBitacora`) REFERENCES `bus` (`IdBus`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fkIdLugarControlBitacora` FOREIGN KEY (`IdLugarControlBitacora`) REFERENCES `lugar_control` (`IdLugarControl`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `bus`
--
ALTER TABLE `bus`
  ADD CONSTRAINT `fkIdCobradorBus` FOREIGN KEY (`IdCobradorBus`) REFERENCES `cobrador` (`IdCobrador`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fkIdJefeBus` FOREIGN KEY (`IdJefeBus`) REFERENCES `jefe` (`IdJefe`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fkIdMotoristaBus` FOREIGN KEY (`IdMotoristaBus`) REFERENCES `motorista` (`IdMotorista`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fkIdRutaBus` FOREIGN KEY (`IdRutaBus`) REFERENCES `ruta` (`IdRuta`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `castigo`
--
ALTER TABLE `castigo`
  ADD CONSTRAINT `fkBusCastigo` FOREIGN KEY (`IdBusCastigo`) REFERENCES `bus` (`IdBus`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `destino`
--
ALTER TABLE `destino`
  ADD CONSTRAINT `fkIdRutaDestino` FOREIGN KEY (`IdRutaDestino`) REFERENCES `ruta` (`IdRuta`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_egreso`
--
ALTER TABLE `detalle_egreso`
  ADD CONSTRAINT `fkIdBusDetalleEgreso` FOREIGN KEY (`IdBusDetalleEgreso`) REFERENCES `bus` (`IdBus`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fkIdEgresoDetalle` FOREIGN KEY (`IdEgreso`) REFERENCES `egreso` (`IdEgreso`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_ingreso`
--
ALTER TABLE `detalle_ingreso`
  ADD CONSTRAINT `fkIdBusDetalleIngreso` FOREIGN KEY (`IdBusDetalleIngreso`) REFERENCES `bus` (`IdBus`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fkIdIngresoDetalle` FOREIGN KEY (`IdIngreso`) REFERENCES `ingreso` (`IdIngreso`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
