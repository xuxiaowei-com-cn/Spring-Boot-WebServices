/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.15.135_testService
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : 192.168.15.135:1521
 Source Schema         : TESTSERVICE

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 07/12/2019 16:41:52
*/


-- ----------------------------
-- Table structure for TEST_USER1
-- ----------------------------
DROP TABLE "TESTSERVICE"."TEST_USER1";
CREATE TABLE "TESTSERVICE"."TEST_USER1" (
  "ID" NUMBER NOT NULL ,
  "USERNAME" VARCHAR2(255 BYTE) ,
  "PASSWORD" VARCHAR2(255 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;
COMMENT ON COLUMN "TESTSERVICE"."TEST_USER1"."ID" IS '用户 ID';
COMMENT ON COLUMN "TESTSERVICE"."TEST_USER1"."USERNAME" IS '用户名';
COMMENT ON COLUMN "TESTSERVICE"."TEST_USER1"."PASSWORD" IS '密码';
COMMENT ON TABLE "TESTSERVICE"."TEST_USER1" IS '测试 用户';

-- ----------------------------
-- Records of TEST_USER1
-- ----------------------------
INSERT INTO "TESTSERVICE"."TEST_USER1" VALUES ('5', 'xxw5', '123');
INSERT INTO "TESTSERVICE"."TEST_USER1" VALUES ('1', 'xxw1', '123');
INSERT INTO "TESTSERVICE"."TEST_USER1" VALUES ('2', 'xxw2', '123');
INSERT INTO "TESTSERVICE"."TEST_USER1" VALUES ('4', 'xxw4', '123');
INSERT INTO "TESTSERVICE"."TEST_USER1" VALUES ('3', 'xxw3', '123');

-- ----------------------------
-- Primary Key structure for table TEST_USER1
-- ----------------------------
ALTER TABLE "TESTSERVICE"."TEST_USER1" ADD CONSTRAINT "SYS_C0010797" PRIMARY KEY ("ID");
