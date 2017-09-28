/*
Navicat MySQL Data Transfer

Source Server         : ASUS_Pro
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : spring_demo_1

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2017-09-27 22:01:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for man
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `username` varchar(255) default NULL,
  `money` float(255,0) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of man
-- ----------------------------
INSERT INTO `account` VALUES ('张三', '9600');
INSERT INTO `account` VALUES ('李四', '970');
