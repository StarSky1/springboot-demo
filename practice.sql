/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : practice

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2018-07-29 18:05:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `Did` int(11) NOT NULL,
  `Dname` varchar(255) COLLATE utf8_bin NOT NULL,
  `Dnumber` int(11) DEFAULT NULL,
  `Mid` int(11) DEFAULT NULL,
  PRIMARY KEY (`Did`),
  KEY `Mid` (`Mid`),
  CONSTRAINT `Mid` FOREIGN KEY (`Mid`) REFERENCES `t_man` (`Mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1', '外语系', '511', '8001');
INSERT INTO `t_dept` VALUES ('2', '会计系', '560', '8002');
INSERT INTO `t_dept` VALUES ('3', '计算机系', '676', '8004');
INSERT INTO `t_dept` VALUES ('4', '建筑系', '333', '8005');
INSERT INTO `t_dept` VALUES ('5', '中文系', '245', '8003');
INSERT INTO `t_dept` VALUES ('6', '机电系', null, null);
INSERT INTO `t_dept` VALUES ('7', 'abc', '100', '8003');

-- ----------------------------
-- Table structure for t_man
-- ----------------------------
DROP TABLE IF EXISTS `t_man`;
CREATE TABLE `t_man` (
  `Mid` int(11) NOT NULL,
  `Mname` varchar(20) DEFAULT NULL,
  `Mphone` varchar(11) DEFAULT NULL,
  `Mage` int(11) DEFAULT NULL,
  `Msex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_man
-- ----------------------------
INSERT INTO `t_man` VALUES ('8001', '周杰伦', '18812345543', '30', '男');
INSERT INTO `t_man` VALUES ('8002', '王力宏', '18854321123', '31', '女');
INSERT INTO `t_man` VALUES ('8003', '吴尊', '18898765123', '32', '男');
INSERT INTO `t_man` VALUES ('8004', '韩庚', '18875315895', '33', '男');
INSERT INTO `t_man` VALUES ('8005', '张韶涵', '15598726793', '29', '女');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `Sid` int(11) NOT NULL,
  `Sname` varchar(10) CHARACTER SET utf8 COLLATE utf8_czech_ci NOT NULL,
  `Ssex` varchar(2) COLLATE utf8_bin DEFAULT NULL,
  `Sage` int(11) DEFAULT NULL,
  `Sclass` int(11) DEFAULT NULL,
  `Did` int(11) DEFAULT NULL,
  `Sbir` date DEFAULT NULL,
  `Sscore` int(11) DEFAULT '0',
  `Sename` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `Sphone` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`Sid`),
  KEY `Did` (`Did`),
  CONSTRAINT `t_student_ibfk_1` FOREIGN KEY (`Did`) REFERENCES `t_dept` (`Did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1203', '余少波', '男', '100', '2', '4', '1991-01-05', '600', 'Orange', '13100888003');
INSERT INTO `t_student` VALUES ('1204', '魏德心', '女', '21', '1', '3', '1993-01-14', '490', 'Tomato', '13100777004');
INSERT INTO `t_student` VALUES ('1205', '董小刚', '女', '20', '1', '1', '1996-09-30', '210', 'Beer\\\\', '13100990005');
INSERT INTO `t_student` VALUES ('1206', '高雨琪', '男', '17', '1', '1', '1989-03-01', '410', 'Cold9', '15109990011');
INSERT INTO `t_student` VALUES ('1207', '金莹', '女', '21', '1', '2', '1989-03-01', '444', 'Coffee', '15101230012');
INSERT INTO `t_student` VALUES ('1209', '张威', '女', '22', '1', '3', '1990-03-01', '611', 'Ice', '15106670014');
INSERT INTO `t_student` VALUES ('1210', '王宇航', '女', '23', '2', '4', '1993-03-01', '0', 'Rice.', '15112330015');
INSERT INTO `t_student` VALUES ('1211', '陈康平', '男', '19', '3', '4', '1991-03-01', '589', 'Egg ', '18112340111');
INSERT INTO `t_student` VALUES ('1213', '张涵', '女', '19', '2', '1', '1990-03-01', '621', ' Butter', '18103333113');
INSERT INTO `t_student` VALUES ('1216', '张小兰', '女', '21', '1', '4', '1991-03-01', '666', ' Sweet', '13712345678');
INSERT INTO `t_student` VALUES ('1217', '徐娟', '男', '21', '3', '1', '1994-11-11', '589', 'City', '13198736478');
INSERT INTO `t_student` VALUES ('1218', '李轩', '男', '22', '2', '1', '1991-11-05', '487', 'Tree', '15156789345');
INSERT INTO `t_student` VALUES ('1219', '陈杨君子', '女', '19', '3', '1', '1992-05-06', '587', 'Style', '18136482443');
INSERT INTO `t_student` VALUES ('1221', '王丽娜', '女', '25', '2', '4', '2014-07-15', '234', 'Time', '13106666987');
INSERT INTO `t_student` VALUES ('1222', '柳慧敏', '男', '24', '3', '5', '2014-02-19', '387', 'Get', '13106666801');
INSERT INTO `t_student` VALUES ('1223', '龚俊悦', '女', '24', '3', '5', '2014-08-18', '587', 'Post', '13104566001');
INSERT INTO `t_student` VALUES ('1224', '汪鹏青', '女', '27', '1', '4', '2014-05-13', '456', 'Dream', '13134666001');
INSERT INTO `t_student` VALUES ('1225', '董航', '女', '37', '3', '3', '2014-03-12', '365', 'Eat', '13107456001');
INSERT INTO `t_student` VALUES ('1226', '尤枭', '女', '25', '1', '3', '2013-10-15', '476', 'App', '13192566001');
INSERT INTO `t_student` VALUES ('1227', '胡鑫鹏', '女', '29', '2', '4', '2014-01-12', '678', 'Book', '14506666001');
INSERT INTO `t_student` VALUES ('1228', '刘淇', '女', '30', '3', '2', '1988-09-06', '587', 'Pad', '13108236001');
INSERT INTO `t_student` VALUES ('1229', '何梦亭', '女', '19', '3', '2', '1986-02-05', '467', 'Web', '13106687001');
INSERT INTO `t_student` VALUES ('1230', '郑远涛', '女', '26', '1', '4', '1993-12-21', '482', 'Cat', '17656666001');
INSERT INTO `t_student` VALUES ('1231', '徐鑫', '男', '23', '1', '3', '1999-09-09', '467', 'Mat', '13765566001');
INSERT INTO `t_student` VALUES ('1232', '王定椿', '女', '20', '3', '2', '1993-03-06', '432', 'Mate', '13106669875');
INSERT INTO `t_student` VALUES ('1234', '李磊', '女', '18', '2', '3', '1994-09-30', '256', 'Say', '13106667561');
DROP TRIGGER IF EXISTS `t_a`;
DELIMITER ;;
CREATE TRIGGER `t_a` AFTER INSERT ON `t_student` FOR EACH ROW update t_dept set dnum=dnum+1 where did=new.did;
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_afterDeleteFromEmp`;
DELIMITER ;;
CREATE TRIGGER `tri_afterDeleteFromEmp` AFTER DELETE ON `t_student` FOR EACH ROW update t_dept set dnumber = dnumber+1 where did=old.did
;;
DELIMITER ;
