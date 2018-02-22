/*
Navicat MySQL Data Transfer

Source Server         : lkh
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : mms

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-02-23 01:19:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mms_group_t
-- ----------------------------
DROP TABLE IF EXISTS `mms_group_t`;
CREATE TABLE `mms_group_t` (
  `group_id` bigint(20) NOT NULL,
  `group_name` varchar(255) NOT NULL,
  `parent_group_id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分组表';

-- ----------------------------
-- Records of mms_group_t
-- ----------------------------

-- ----------------------------
-- Table structure for mms_org_t
-- ----------------------------
DROP TABLE IF EXISTS `mms_org_t`;
CREATE TABLE `mms_org_t` (
  `org_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_org_id` bigint(20) NOT NULL,
  `org_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织表';

-- ----------------------------
-- Records of mms_org_t
-- ----------------------------

-- ----------------------------
-- Table structure for mms_right_t
-- ----------------------------
DROP TABLE IF EXISTS `mms_right_t`;
CREATE TABLE `mms_right_t` (
  `right_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `parent_right_id` bigint(20) NOT NULL COMMENT '父权限',
  `right_name` varchar(255) NOT NULL COMMENT '权限名称',
  `description` varchar(255) DEFAULT NULL COMMENT '权限描述',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`right_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of mms_right_t
-- ----------------------------

-- ----------------------------
-- Table structure for mms_role_t
-- ----------------------------
DROP TABLE IF EXISTS `mms_role_t`;
CREATE TABLE `mms_role_t` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `parent_role_id` bigint(20) NOT NULL COMMENT '父级角色ID',
  `role_name` varchar(255) NOT NULL COMMENT '角色名称',
  `description` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of mms_role_t
-- ----------------------------

-- ----------------------------
-- Table structure for mms_user_t
-- ----------------------------
DROP TABLE IF EXISTS `mms_user_t`;
CREATE TABLE `mms_user_t` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '记录标识',
  `org_id` bigint(20) NOT NULL COMMENT '所属组织',
  `login_name` varchar(64) NOT NULL COMMENT '登录帐号',
  `password` varchar(64) NOT NULL COMMENT '用户密码',
  `vsername` varchar(64) NOT NULL COMMENT '用户姓名',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `email` varchar(128) DEFAULT NULL COMMENT '电子邮箱',
  `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `login_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '登录时间',
  `last_login_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '上次登录时间',
  `login_count` bigint(20) NOT NULL COMMENT '登录次数',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of mms_user_t
-- ----------------------------
