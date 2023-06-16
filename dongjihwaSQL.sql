-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        11.1.0-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- dongji 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `dongji` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `dongji`;

-- 테이블 dongji.notice 구조 내보내기
CREATE TABLE IF NOT EXISTS `notice` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `content` mediumtext NOT NULL,
  `name` varchar(30) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp(),
  `viewCnt` int(11) DEFAULT 0,
  PRIMARY KEY (`no`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

-- 테이블 데이터 dongji.notice:~5 rows (대략적) 내보내기
REPLACE INTO `notice` (`no`, `title`, `content`, `name`, `date`, `viewCnt`) VALUES
	(1, '안녕하세요 동지화 캠핑장입니다.', '안녕하세요\r\n동지화 캠핑장입니다.\r\n저희 캠핑장을 찾아주신 모든 분들께 감사인사드립니다.\r\n무더운 여름이 다가오고 있습니다.\r\n다들 더위 조심하시고 동지화 캠핑장에서 많은 추억을 쌓기를 바라겠습니다.\r\n오시는 모든 분들이 불편하시지 않게 노력하고 발전하는 동지화가 되겠습니다.\r\n감사합니다.', '관리자', '2023-06-03 15:00:00', 10),
	(2, '이용안내', '테스트 글 입니다.', '관리자', '2023-06-04 15:00:00', 6),
	(3, '사이트소개(수정중)', '수정글 테스트 글 입니다.', '관리자1', '2023-06-06 15:00:00', 15),
	(4, '공지사항312421421', '콘츠글 3', '관리자', '2023-06-10 15:00:00', 2),
	(5, '123', '12412412', '관리자', '2023-06-10 03:13:14', 5);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
