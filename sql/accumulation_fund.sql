/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : accumulation_fund

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2019-02-14 18:11:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `agreedtime_type`
-- ----------------------------
DROP TABLE IF EXISTS `agreedtime_type`;
CREATE TABLE `agreedtime_type` (
  `agreedid` int(11) NOT NULL COMMENT '约定提取日期及约定期数',
  `agreedname` int(11) DEFAULT NULL,
  PRIMARY KEY (`agreedid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of agreedtime_type
-- ----------------------------
INSERT INTO `agreedtime_type` VALUES ('1', '12');
INSERT INTO `agreedtime_type` VALUES ('2', '24');
INSERT INTO `agreedtime_type` VALUES ('3', '5');
INSERT INTO `agreedtime_type` VALUES ('4', '10');
INSERT INTO `agreedtime_type` VALUES ('5', '15');
INSERT INTO `agreedtime_type` VALUES ('6', '20');
INSERT INTO `agreedtime_type` VALUES ('7', '25');

-- ----------------------------
-- Table structure for `audit_type`
-- ----------------------------
DROP TABLE IF EXISTS `audit_type`;
CREATE TABLE `audit_type` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of audit_type
-- ----------------------------
INSERT INTO `audit_type` VALUES ('1', '贷款初审');
INSERT INTO `audit_type` VALUES ('2', '贷款终审');
INSERT INTO `audit_type` VALUES ('3', '提取审核');
INSERT INTO `audit_type` VALUES ('4', '开户审核');
INSERT INTO `audit_type` VALUES ('5', '销号审核');
INSERT INTO `audit_type` VALUES ('6', '封存审核');
INSERT INTO `audit_type` VALUES ('7', '启封审核');
INSERT INTO `audit_type` VALUES ('8', '人员转移审核');

-- ----------------------------
-- Table structure for `bank`
-- ----------------------------
DROP TABLE IF EXISTS `bank`;
CREATE TABLE `bank` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank
-- ----------------------------
INSERT INTO `bank` VALUES ('1', '中国工商银行');
INSERT INTO `bank` VALUES ('2', '中国银行');
INSERT INTO `bank` VALUES ('3', '中国建设银行');
INSERT INTO `bank` VALUES ('4', '中国农业银行');
INSERT INTO `bank` VALUES ('5', '中国交通银行');
INSERT INTO `bank` VALUES ('6', '中国邮政银行');
INSERT INTO `bank` VALUES ('7', '中国人民银行');

-- ----------------------------
-- Table structure for `certificate_type`
-- ----------------------------
DROP TABLE IF EXISTS `certificate_type`;
CREATE TABLE `certificate_type` (
  `cetid` int(11) NOT NULL,
  `cetname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cetid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of certificate_type
-- ----------------------------
INSERT INTO `certificate_type` VALUES ('1', '居民身份证');
INSERT INTO `certificate_type` VALUES ('2', '户口本');
INSERT INTO `certificate_type` VALUES ('3', '护照');
INSERT INTO `certificate_type` VALUES ('4', '军官证');

-- ----------------------------
-- Table structure for `company`
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `cid` int(255) NOT NULL AUTO_INCREMENT COMMENT '公司信息表',
  `cno` varchar(255) DEFAULT NULL COMMENT '公司公积金账号',
  `cname` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `csite` varchar(255) DEFAULT NULL COMMENT '地址',
  `ctype` varchar(255) DEFAULT NULL COMMENT '公司类型',
  `cindustry` varchar(255) DEFAULT NULL COMMENT '所属行业',
  `crelation` varchar(255) DEFAULT NULL COMMENT '隶属关系',
  `ceconomic` varchar(255) DEFAULT NULL COMMENT '经济类型',
  `cinstitution` varchar(255) DEFAULT NULL COMMENT '机构代码',
  `cmonth` int(255) DEFAULT NULL COMMENT '月发薪日',
  `clegal` varchar(255) DEFAULT NULL COMMENT '法人代表名字',
  `ccertificate` varchar(255) DEFAULT NULL COMMENT '法人证件类型',
  `cnumber` varchar(255) DEFAULT NULL COMMENT '法人证件号码',
  `coperator` varchar(255) DEFAULT NULL COMMENT '经办人姓名',
  `cphone` varchar(255) DEFAULT NULL COMMENT '经办人电话',
  `ccertificates` varchar(255) DEFAULT NULL COMMENT '经办人证件类型',
  `cnumbers` varchar(255) DEFAULT NULL COMMENT '经办人证件号码',
  `ctime` varchar(255) DEFAULT NULL COMMENT '公司成立日期',
  `cbank` varchar(255) DEFAULT NULL COMMENT '开户银行名字',
  `cdate` varchar(255) DEFAULT NULL COMMENT '开户日期',
  `cbankno` varchar(255) DEFAULT NULL COMMENT '开户银行账号',
  `cdeposit` int(11) DEFAULT NULL COMMENT '单位缴存比例',
  `cdeposits` int(11) DEFAULT NULL COMMENT '个人缴存比例',
  `stateid` int(11) DEFAULT '1' COMMENT '账号开户状态',
  `userid` int(11) DEFAULT NULL COMMENT '业务操作人员',
  `cbanks` varchar(255) DEFAULT NULL COMMENT '受托银行名字',
  `curl` varchar(255) DEFAULT NULL COMMENT '上传营业执照',
  `cbalanc` double(11,0) DEFAULT '0' COMMENT '单位账户余额',
  `cback` varchar(255) DEFAULT NULL COMMENT '驳回理由',
  `cputsno` int(11) DEFAULT '0' COMMENT '缴存人数',
  `cdatetime` varchar(255) DEFAULT NULL COMMENT '缴至日期',
  `cpassword` varchar(255) DEFAULT '123456' COMMENT '登录密码',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('1', '100003', '河南哈哈哈有限公司', '前程路', '1', '1', '3', '1', '2111', '10', '哈哈', '1', '123465789465789123', '呵呵', '16581321', '1', '1561320563', '2019-01-08', '1', '2019-01-08 14:30:51', '54766186', '7', '8', '2', '1', '1', null, '777082', '数据不完整', null, '', '123456');
INSERT INTO `company` VALUES ('2', '100002', '啊哈哈哈', '呵呵呵', '1', '2', '3', '1', '15416', '10', '王哈哈', '1', '165416', '李哈哈', '15646', '1', '186415', '2019-01-03', '1', '2019-01-03 10:57:59', '4486152', '10', '8', '2', '1', '2', null, '6652395', '', null, '', '123456');
INSERT INTO `company` VALUES ('3', '100001', '郑州随便公司', '牛顿国际', '2', '2', '3', '5', '111', '10', '田浩毅', '1', '1642161231', '田', '16546132', '1', '654651065', '2019-01-03', '2', '2019-01-02 20:39:29', '156416815', '7', '8', '1', '1', '3', null, '6687016', '电话上飞机', null, '', '123456');
INSERT INTO `company` VALUES ('4', '100004', '河南方辉有限公司', '牛顿路', '2', '2', '3', '3', '5555', '10', '董方辉', '1', '123123123123123412', '辉方董', '21156165', '1', '563148616', '2019-01-09', '2', '2019-01-08 14:36:31', '65341563', '7', '5', '1', '1', '2', null, '652736', null, null, '', '123456');
INSERT INTO `company` VALUES ('5', '100005', '郑州阿基玛斯有限公司', '杨金路', '1', '1', '2', '4', '1234', '9', '王德发', '1', '444444444444444444', '王尼玛', '11111111111', '1', '444444444444444444', '2019-01-01', '2', '2019-01-21 15:50:52', '22222222222222', '7', '7', '1', '1', null, null, '0', null, '0', '', '123456');
INSERT INTO `company` VALUES ('6', '100006', '河南万亭有限公司', '杨金璐', '2', '2', '1', '4', '1231321', '9', '万亭', '1', '444444444444444444', '万青', '11111111111', '1', '444444444444444444', '2019-01-02', '2', '2019-01-21 16:08:30', '444443', '7', '7', '1', '1', null, null, '500001', null, '0', '', '123456');
INSERT INTO `company` VALUES ('7', '100007', '啊实打实的', '啊实打实的', '2', '2', '1', '5', '54654', '10', '阿斯达', '1', '111111111111111111', '啊实打实的', '11111111111', '1', '111111111111111111', '2019-01-07', '2', '2019-01-21 21:43:32', '1111111111111111111', '7', '7', '1', '1', null, null, '0', null, '0', '', '123456');

-- ----------------------------
-- Table structure for `companys`
-- ----------------------------
DROP TABLE IF EXISTS `companys`;
CREATE TABLE `companys` (
  `cid` int(255) NOT NULL AUTO_INCREMENT COMMENT '公司信息表',
  `cno` varchar(255) DEFAULT NULL COMMENT '公司公积金账号',
  `cname` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `csite` varchar(255) DEFAULT NULL COMMENT '地址',
  `ctype` varchar(255) DEFAULT NULL COMMENT '公司类型',
  `cindustry` varchar(255) DEFAULT NULL COMMENT '所属行业',
  `crelation` varchar(255) DEFAULT NULL COMMENT '隶属关系',
  `ceconomic` varchar(255) DEFAULT NULL COMMENT '经济类型',
  `cinstitution` varchar(255) DEFAULT NULL COMMENT '机构代码',
  `cmonth` int(255) DEFAULT NULL COMMENT '月发薪日',
  `clegal` varchar(255) DEFAULT NULL COMMENT '法人代表名字',
  `ccertificate` varchar(255) DEFAULT NULL COMMENT '法人证件类型',
  `cnumber` varchar(255) DEFAULT NULL COMMENT '法人证件号码',
  `coperator` varchar(255) DEFAULT NULL COMMENT '经办人姓名',
  `cphone` varchar(255) DEFAULT NULL COMMENT '经办人电话',
  `ccertificates` varchar(255) DEFAULT NULL COMMENT '经办人证件类型',
  `cnumbers` varchar(255) DEFAULT NULL COMMENT '经办人证件号码',
  `ctime` varchar(255) DEFAULT NULL COMMENT '公司成立日期',
  `cbank` varchar(255) DEFAULT NULL COMMENT '开户银行名字',
  `cdate` varchar(255) DEFAULT NULL COMMENT '开户日期',
  `cbankno` varchar(255) DEFAULT NULL COMMENT '开户银行账号',
  `cdeposit` int(11) DEFAULT NULL COMMENT '单位缴存比例',
  `cdeposits` int(11) DEFAULT NULL COMMENT '个人缴存比例',
  `stateid` int(11) DEFAULT '1' COMMENT '账号开户状态',
  `userid` int(11) DEFAULT NULL COMMENT '业务操作人员',
  `cbanks` varchar(255) DEFAULT NULL COMMENT '受托银行名字',
  `curl` varchar(255) DEFAULT NULL COMMENT '上传营业执照',
  `cbalanc` double(11,0) DEFAULT '0' COMMENT '单位账户余额',
  `cback` varchar(255) DEFAULT NULL COMMENT '驳回理由',
  `cputsno` int(11) DEFAULT '0' COMMENT '缴存人数',
  `cdatetime` varchar(255) DEFAULT NULL COMMENT '缴至日期',
  `cpassword` varchar(255) DEFAULT '123456' COMMENT '登录密码',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of companys
-- ----------------------------
INSERT INTO `companys` VALUES ('6', '100006', '河南万亭有限公司', '杨金璐', '2', '2', '1', '4', '1231321', '9', '万亭', '1', '444444444444444444', '万青', '11111111111', '1', '444444444444444444', '2019-01-02', '2', '2019-01-21 16:08:30', '444443', '7', '7', '2', '1', null, null, '0', null, '0', '2019-01-21 16:08:30', '123456');
INSERT INTO `companys` VALUES ('7', '100007', '啊实打实的', '啊实打实的', '2', '2', '1', '5', '54654', '10', '阿斯达', '1', '111111111111111111', '啊实打实的', '11111111111', '1', '111111111111111111', '2019-01-07', '2', '2019-01-21 21:43:32', '1111111111111111111', '7', '7', '1', '1', null, null, '0', null, '0', '2019-01-21 21:43:32', '123456');

-- ----------------------------
-- Table structure for `company_detail`
-- ----------------------------
DROP TABLE IF EXISTS `company_detail`;
CREATE TABLE `company_detail` (
  `cdid` int(11) NOT NULL AUTO_INCREMENT COMMENT '明细查询',
  `cdno` int(11) DEFAULT NULL COMMENT '公司账户',
  `cdname` varchar(255) DEFAULT NULL COMMENT '公司名字',
  `cdmuch` int(255) DEFAULT NULL COMMENT '缴纳金额',
  `cdpeople` int(255) DEFAULT NULL COMMENT '缴纳人数',
  `cdtype` varchar(255) DEFAULT NULL COMMENT '业务类型',
  `cdmonth` varchar(255) DEFAULT NULL COMMENT '缴纳月数',
  `cdcount` int(255) DEFAULT NULL COMMENT '单位账户余额',
  `userid` int(255) DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`cdid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company_detail
-- ----------------------------
INSERT INTO `company_detail` VALUES ('2', '100004', '河南方辉有限公司', '1939', '3', '汇缴', '2019-01-21 20:27:59', '658553', '1');
INSERT INTO `company_detail` VALUES ('3', '100003', '河南哈哈哈有限公司', '3420', '3', '汇缴', '2019-01-21 20:40:38', '787343', '1');
INSERT INTO `company_detail` VALUES ('8', '100003', '河南哈哈哈有限公司', '3420', '3', '补缴', '2019-01-21 21:01:16', '780503', '1');
INSERT INTO `company_detail` VALUES ('9', '100004', '河南方辉有限公司', '1939', '3', '汇缴', '2019-01-21 21:35:59', '652736', '1');
INSERT INTO `company_detail` VALUES ('10', '100003', '河南哈哈哈有限公司', '3420', '3', '汇缴', '2019-01-21 21:38:44', '777083', '1');

-- ----------------------------
-- Table structure for `company_type`
-- ----------------------------
DROP TABLE IF EXISTS `company_type`;
CREATE TABLE `company_type` (
  `ctid` int(255) NOT NULL COMMENT '公司类型表',
  `ctname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ctid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company_type
-- ----------------------------
INSERT INTO `company_type` VALUES ('1', '有限责任公司');
INSERT INTO `company_type` VALUES ('2', '股份有限公司');
INSERT INTO `company_type` VALUES ('3', '合伙企业');
INSERT INTO `company_type` VALUES ('4', '全民所有制企业');
INSERT INTO `company_type` VALUES ('5', '集体所有制企业');

-- ----------------------------
-- Table structure for `c_audit_records`
-- ----------------------------
DROP TABLE IF EXISTS `c_audit_records`;
CREATE TABLE `c_audit_records` (
  `aid` int(11) NOT NULL AUTO_INCREMENT COMMENT '单位公积金审核记录表主键',
  `cid` int(11) DEFAULT NULL COMMENT '单位公积金账号',
  `atype` int(11) DEFAULT NULL COMMENT '审核类型',
  `aresult` int(11) DEFAULT NULL COMMENT '审核结果',
  `amsg` int(11) DEFAULT NULL COMMENT '备注',
  `atime` int(11) DEFAULT NULL COMMENT '审核时间',
  `uid` int(11) DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c_audit_records
-- ----------------------------

-- ----------------------------
-- Table structure for `degree_type`
-- ----------------------------
DROP TABLE IF EXISTS `degree_type`;
CREATE TABLE `degree_type` (
  `pdegreeid` int(11) NOT NULL,
  `degreename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pdegreeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of degree_type
-- ----------------------------
INSERT INTO `degree_type` VALUES ('1', '小学');
INSERT INTO `degree_type` VALUES ('2', '初中');
INSERT INTO `degree_type` VALUES ('3', '高中');
INSERT INTO `degree_type` VALUES ('4', '本科');
INSERT INTO `degree_type` VALUES ('5', '专科');
INSERT INTO `degree_type` VALUES ('6', '研究生');

-- ----------------------------
-- Table structure for `economic_type`
-- ----------------------------
DROP TABLE IF EXISTS `economic_type`;
CREATE TABLE `economic_type` (
  `etid` int(11) NOT NULL,
  `etname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`etid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of economic_type
-- ----------------------------
INSERT INTO `economic_type` VALUES ('1', '国有经济');
INSERT INTO `economic_type` VALUES ('2', '集体经济');
INSERT INTO `economic_type` VALUES ('3', '私营经济');
INSERT INTO `economic_type` VALUES ('4', '个体经济');
INSERT INTO `economic_type` VALUES ('5', '联营经济');
INSERT INTO `economic_type` VALUES ('6', '股份制');
INSERT INTO `economic_type` VALUES ('7', '外商投资');

-- ----------------------------
-- Table structure for `industry`
-- ----------------------------
DROP TABLE IF EXISTS `industry`;
CREATE TABLE `industry` (
  `iid` int(11) NOT NULL AUTO_INCREMENT,
  `iname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of industry
-- ----------------------------
INSERT INTO `industry` VALUES ('1', '农、林、牧、渔业');
INSERT INTO `industry` VALUES ('2', '制造业');
INSERT INTO `industry` VALUES ('3', '环境和公共设施管理员');
INSERT INTO `industry` VALUES ('4', '交通运输、仓储业和邮政业');
INSERT INTO `industry` VALUES ('5', '批发和零售业');
INSERT INTO `industry` VALUES ('6', '房地产业');

-- ----------------------------
-- Table structure for `loan`
-- ----------------------------
DROP TABLE IF EXISTS `loan`;
CREATE TABLE `loan` (
  `lid` int(11) NOT NULL AUTO_INCREMENT COMMENT '贷款id',
  `lno` varchar(50) DEFAULT NULL COMMENT '贷款单号',
  `personno` varchar(50) DEFAULT NULL COMMENT '个人账号',
  `lsalay` double(50,2) DEFAULT NULL COMMENT '月收入',
  `ldeposit` double(50,2) DEFAULT NULL COMMENT '存款',
  `lmoney` double(50,2) DEFAULT NULL COMMENT '贷款金额',
  `lperiods` int(50) DEFAULT NULL COMMENT '贷款期数',
  `lction` varchar(50) DEFAULT NULL COMMENT '委托银行',
  `lname` varchar(50) DEFAULT NULL COMMENT '操作人',
  `lrate` double(50,2) DEFAULT NULL COMMENT '贷款利率',
  `lapplydate` datetime DEFAULT NULL COMMENT '申请日期',
  `lrefundtype` varchar(50) DEFAULT NULL COMMENT '还款类型',
  `lopenbank` varchar(50) DEFAULT NULL COMMENT '还款人的开户银行',
  `lpayment` varchar(50) DEFAULT NULL COMMENT '还款人',
  `lcardno` varchar(50) DEFAULT NULL COMMENT '贷款卡号',
  `lunderwriterno` varchar(11) DEFAULT NULL COMMENT '共同借款人账号',
  `lhousetype` varchar(50) DEFAULT NULL COMMENT '房屋类型',
  `laddress` varchar(50) DEFAULT NULL COMMENT '房屋地址',
  `lallarea` varchar(50) DEFAULT NULL COMMENT '房屋面积',
  `lhouseno` varchar(50) DEFAULT NULL COMMENT '证件号码',
  `lbuyname` varchar(50) DEFAULT NULL COMMENT '购房人姓名',
  `lbuycardno` varchar(50) DEFAULT NULL COMMENT '买房的银行账户',
  `lhouseprice` double(10,2) DEFAULT NULL COMMENT '房屋总价',
  `lfirstpay` double(50,0) DEFAULT NULL COMMENT '首付款',
  `lareaprice` double(10,2) DEFAULT NULL COMMENT '面积单价',
  `lcollateraltype` varchar(50) DEFAULT NULL COMMENT '抵押类型',
  `lcollateralname` varchar(50) DEFAULT NULL COMMENT '抵押人姓名',
  `lcollateralnumber` varchar(50) DEFAULT NULL COMMENT '抵押人身份证号码',
  `lcollateraladdress` varchar(50) DEFAULT NULL COMMENT '抵押物地址',
  `lcollateralstate` varchar(11) DEFAULT NULL COMMENT '抵押物状态',
  `lcollateralacount` varchar(50) DEFAULT NULL COMMENT '抵押物金额',
  `lstateid` int(11) NOT NULL DEFAULT '1' COMMENT '贷款状态',
  `lrejecttext` varchar(50) DEFAULT NULL COMMENT '驳回意见',
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loan
-- ----------------------------
INSERT INTO `loan` VALUES ('1', '20190109144206526', '10000002', '8000.00', '10000.00', '500000.00', '60', '中国工商银行', '100', '3.25', '2019-01-09 14:42:12', '等额本金', '中国工商银行', '100', '100', '', '花园式住宅', '郑州请选择1000', '000', '100', '000', '000', '0.00', '0', '0.00', '房屋抵押', '000', '00', '000', '正常', '0.0', '5', '无');
INSERT INTO `loan` VALUES ('2', '20190109144305749', '10000003', '7000.00', '10000.00', '500000.00', '60', '中国工商银行', '111', '3.25', '2019-01-09 14:43:12', '等额本息', '中国工商银行', '111', '111', '', '花园式住宅', '郑州请选择11', '11', '11', '111', '1111', '111.00', '111', '11.00', '房屋抵押', '11', '11', '11', '正常', '11.0', '5', '无');
INSERT INTO `loan` VALUES ('3', '20190119100146828', '10000001', '1111.00', '11111.00', '1111.00', '24', '中国工商银行', '111', '2.75', '2019-01-19 10:01:56', '等额本金', '中国工商银行', '11', '111', '10000009', '花园式住宅', '郑州管城区11', '111', '11', '111', '111', '111.00', '111', '111.00', '房屋抵押', '111', '111', '111', '正常', '11.0', '3', 'aa');
INSERT INTO `loan` VALUES ('4', '20190119140141321', '10000006', '10000.00', '100000.00', '100000.00', '24', '中国工商银行', '哎哎哎', '2.75', '2019-01-19 14:01:48', '等额本金', '中国工商银行', '1000', '100', '', '花园式住宅', '郑州二七区11', '111', '4111', '11', '11', '1111.00', '11', '111.00', '房屋抵押', '11', '11', '111', '正常', '11.0', '5', null);

-- ----------------------------
-- Table structure for `loan_periods`
-- ----------------------------
DROP TABLE IF EXISTS `loan_periods`;
CREATE TABLE `loan_periods` (
  `lpid` int(11) NOT NULL AUTO_INCREMENT,
  `lperiods` int(50) DEFAULT NULL,
  PRIMARY KEY (`lpid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loan_periods
-- ----------------------------
INSERT INTO `loan_periods` VALUES ('1', '12');
INSERT INTO `loan_periods` VALUES ('2', '24');
INSERT INTO `loan_periods` VALUES ('3', '36');
INSERT INTO `loan_periods` VALUES ('4', '48');
INSERT INTO `loan_periods` VALUES ('5', '60');
INSERT INTO `loan_periods` VALUES ('6', '72');
INSERT INTO `loan_periods` VALUES ('7', '84');
INSERT INTO `loan_periods` VALUES ('8', '96');
INSERT INTO `loan_periods` VALUES ('9', '108');
INSERT INTO `loan_periods` VALUES ('10', '120');
INSERT INTO `loan_periods` VALUES ('11', '132');
INSERT INTO `loan_periods` VALUES ('12', '144');
INSERT INTO `loan_periods` VALUES ('13', '156');
INSERT INTO `loan_periods` VALUES ('14', '168');
INSERT INTO `loan_periods` VALUES ('15', '180');
INSERT INTO `loan_periods` VALUES ('16', '192');
INSERT INTO `loan_periods` VALUES ('17', '204');
INSERT INTO `loan_periods` VALUES ('18', '216');
INSERT INTO `loan_periods` VALUES ('19', '228');
INSERT INTO `loan_periods` VALUES ('20', '240');
INSERT INTO `loan_periods` VALUES ('21', '252');
INSERT INTO `loan_periods` VALUES ('22', '264');
INSERT INTO `loan_periods` VALUES ('23', '276');
INSERT INTO `loan_periods` VALUES ('24', '288');
INSERT INTO `loan_periods` VALUES ('25', '300');
INSERT INTO `loan_periods` VALUES ('26', '312');
INSERT INTO `loan_periods` VALUES ('27', '324');
INSERT INTO `loan_periods` VALUES ('28', '336');
INSERT INTO `loan_periods` VALUES ('29', '348');
INSERT INTO `loan_periods` VALUES ('30', '360');

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `mid` int(11) NOT NULL DEFAULT '0',
  `mname` varchar(255) DEFAULT NULL COMMENT '菜单名字',
  `murl` varchar(255) DEFAULT 'null' COMMENT '路径',
  `mfather` int(11) DEFAULT '0' COMMENT '父菜单',
  `icon` varchar(255) DEFAULT NULL COMMENT '图标',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '首页', 'null', '0', 'layui-icon-home');
INSERT INTO `menu` VALUES ('2', '公司业务', 'null', '0', 'layui-icon-user');
INSERT INTO `menu` VALUES ('3', '个人业务', 'null', '0', 'layui-icon-username');
INSERT INTO `menu` VALUES ('4', '公积金提取', 'null', '0', 'layui-icon-rmb');
INSERT INTO `menu` VALUES ('5', '权限管理', 'null', '0', 'layui-icon-diamond');
INSERT INTO `menu` VALUES ('6', '后台审核', 'null', '0', 'layui-icon-auz');
INSERT INTO `menu` VALUES ('7', '个人贷款', 'null', '0', 'layui-icon-friends');
INSERT INTO `menu` VALUES ('8', '还款业务', 'null', '0', 'layui-icon-set');
INSERT INTO `menu` VALUES ('9', '财务管理', 'null', '0', 'layui-icon-rmb');
INSERT INTO `menu` VALUES ('10', '前台管理', 'null', '0', 'layui-icon-chat');
INSERT INTO `menu` VALUES ('11', '账户信息', 'null', '0', 'layui-icon-group');
INSERT INTO `menu` VALUES ('12', '单位开户', '../company/toAddCompany', '2', '');
INSERT INTO `menu` VALUES ('13', '汇缴办理', '../remit/toShowRemit', '2', '');
INSERT INTO `menu` VALUES ('14', '补缴办理', '../remit/toPaymentRemit', '2', '');
INSERT INTO `menu` VALUES ('15', '冲缴办理', '../remit/toShowRushRemit', '2', '');
INSERT INTO `menu` VALUES ('16', '比例变更', '../company/toUpdateRatio', '2', '');
INSERT INTO `menu` VALUES ('17', '基数调整', '../company/toUpdateCardinal', '2', '');
INSERT INTO `menu` VALUES ('18', '明细查询', '../company/toSelectDetail', '2', '');
INSERT INTO `menu` VALUES ('19', '变更记录', '../company/toChangeRatio', '2', '');
INSERT INTO `menu` VALUES ('20', '个人开户', '../personal/toAddPersonal', '3', '');
INSERT INTO `menu` VALUES ('21', '人员转移', '../personal/toPersonTransfer', '3', '');
INSERT INTO `menu` VALUES ('22', '封存 启封 销户', '../personal/toShowSeal', '3', '');
INSERT INTO `menu` VALUES ('23', '明细查询', '../personal/toSearchDetails', '3', '');
INSERT INTO `menu` VALUES ('24', '冲缴记录', '../personal/toPayRecord', '3', '');
INSERT INTO `menu` VALUES ('25', '个人开户记录', '../personal/toPersonalRecord', '3', '');
INSERT INTO `menu` VALUES ('26', '部分提取', '../takeFund/toTakeFund', '4', '');
INSERT INTO `menu` VALUES ('27', '约定提取', '../takeFund/toTakeRepay', '4', '');
INSERT INTO `menu` VALUES ('28', '账户管理', '../user/toShowUser', '5', '');
INSERT INTO `menu` VALUES ('29', '角色管理', '../role/toShowRole', '5', '');
INSERT INTO `menu` VALUES ('30', '贷款初审', '../loan/toCheck', '6', '');
INSERT INTO `menu` VALUES ('31', '贷款终审', '../loan/toLastCheck', '6', '');
INSERT INTO `menu` VALUES ('32', '提取审核', '../audit/toExtractAudit', '6', '');
INSERT INTO `menu` VALUES ('33', '单位开户审核', '../audit/toAuditDepartment', '6', '');
INSERT INTO `menu` VALUES ('34', '个人开户审核', '../audit/toAuditPersonal', '6', '');
INSERT INTO `menu` VALUES ('35', '销号封存启封审核', '../audit/toKeepingSealOrOpenAudit', '6', '');
INSERT INTO `menu` VALUES ('36', '人员转移审核', '../audit/toAuditPersonalByTwo', '6', '');
INSERT INTO `menu` VALUES ('37', '个人抵押贷', '../loan/toAddLoan', '7', '');
INSERT INTO `menu` VALUES ('38', '贷款记录', '../loan/toShowLoan', '7', '');
INSERT INTO `menu` VALUES ('39', '按期还款', '../refund/toMonthRefund', '8', '');
INSERT INTO `menu` VALUES ('40', '提前还款', '../refund/toBeforehandRefund', '8', '');
INSERT INTO `menu` VALUES ('41', '还款结清', '../refund/toSelectRefund', '8', '');
INSERT INTO `menu` VALUES ('42', '归集情况分析', '../CollectionAccount/toCollectionAccount', '9', '');
INSERT INTO `menu` VALUES ('43', '贷款情况分析', '../LoanAccount/toLoanAccount', '9', '');
INSERT INTO `menu` VALUES ('45', '前台信息发布', '../news/toShowNews', '10', '');
INSERT INTO `menu` VALUES ('46', '单位信息', '../information/toCompany', '11', '');
INSERT INTO `menu` VALUES ('47', '个人信息', '../information/toPerson', '11', '');
INSERT INTO `menu` VALUES ('48', '单位开户记录', '../company/toOpenRecord', '2', '');
INSERT INTO `menu` VALUES ('49', '菜单管理', '../menu/toShowMenu', '5', null);
INSERT INTO `menu` VALUES ('50', '单位信息记录', '../information/toCompanyRecords', '11', null);
INSERT INTO `menu` VALUES ('51', '个人信息记录', '../information/toPersonRecords', '11', null);
INSERT INTO `menu` VALUES ('52', '前台新闻记录', '../news/toNewsRecords', '10', null);

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `nid` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻id',
  `ntitle` varchar(255) DEFAULT NULL COMMENT '新闻题目',
  `ncontent` text,
  `nsrc` varchar(255) DEFAULT '../../images/home_bg2.jpg' COMMENT '图片',
  `ntime` date DEFAULT NULL COMMENT '创建时间',
  `ntime2` date DEFAULT NULL COMMENT '发布时间',
  `nstate` int(11) DEFAULT '0' COMMENT '新闻状态',
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('13', '星期一', 'wefsdfsdfsdfsfsfss', 'http://localhost:8081/02b93b18-1502-4cc0-878c-d8ecee74ab54.gif', '2019-01-18', '2019-01-21', '1');
INSERT INTO `news` VALUES ('14', '星期二', '蓦然回首，那人却在灯火阑珊处', 'http://localhost:8081/385fdf7b-9800-4631-ae05-73c1b95d786c.gif', '2019-01-18', '2019-01-18', '0');
INSERT INTO `news` VALUES ('15', '星期三', 'dgsdfgdsgdfgsdgsdf', 'http://localhost:8081/12cba3b3-3bbe-4bf6-8981-b61f8fae0f55.gif', '2019-01-18', '2019-01-18', '1');

-- ----------------------------
-- Table structure for `news_records`
-- ----------------------------
DROP TABLE IF EXISTS `news_records`;
CREATE TABLE `news_records` (
  `nid` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻id',
  `ntitle` varchar(255) DEFAULT NULL COMMENT '新闻题目',
  `ncontent` text,
  `nsrc` varchar(255) DEFAULT NULL COMMENT '图片',
  `ntime` date DEFAULT NULL COMMENT '创建时间',
  `ntime2` date DEFAULT NULL COMMENT '发布时间',
  `ntime3` date DEFAULT NULL COMMENT '删除时间',
  `nstate` int(11) DEFAULT '0' COMMENT '新闻状态',
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_records
-- ----------------------------
INSERT INTO `news_records` VALUES ('13', '星期一', 'wefsdfsdfsdfsfsfss', 'http://localhost:8081/02b93b18-1502-4cc0-878c-d8ecee74ab54.gif', '2019-01-18', '2019-01-21', null, '1');
INSERT INTO `news_records` VALUES ('14', '星期二', '蓦然回首，那人却在灯火阑珊处', 'http://localhost:8081/385fdf7b-9800-4631-ae05-73c1b95d786c.gif', '2019-01-18', '2019-01-18', null, '0');
INSERT INTO `news_records` VALUES ('15', '星期三', 'dgsdfgdsgdfgsdgsdf', 'http://localhost:8081/12cba3b3-3bbe-4bf6-8981-b61f8fae0f55.gif', '2019-01-18', '2019-01-18', null, '1');

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '个人信息表',
  `pname` varchar(255) DEFAULT NULL COMMENT '姓名',
  `pno` int(255) DEFAULT NULL COMMENT '个人公积金账号',
  `pphone` varchar(255) DEFAULT NULL COMMENT '电话',
  `pmail` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `psex` varchar(255) DEFAULT NULL COMMENT '性别',
  `pmarital` varchar(255) DEFAULT NULL COMMENT '婚姻状况',
  `pdegree` varchar(255) DEFAULT NULL COMMENT '受教育程度(学历)',
  `pstateid` int(11) DEFAULT '1' COMMENT '审核状态',
  `acid` int(11) DEFAULT NULL COMMENT '单位id',
  `pcertificate` varchar(255) DEFAULT NULL COMMENT '证件类型',
  `pnumber` varchar(255) DEFAULT NULL COMMENT '证件号',
  `pbasenum` int(11) DEFAULT NULL COMMENT '汇缴基数',
  `pbank` varchar(255) DEFAULT NULL COMMENT '开户银行',
  `pbankno` varchar(255) DEFAULT NULL COMMENT '银行卡号',
  `paddress` varchar(255) DEFAULT NULL COMMENT '家庭地址',
  `pcardt` varchar(255) DEFAULT NULL COMMENT '身份证正',
  `pcardf` varchar(255) DEFAULT NULL COMMENT '身份证反',
  `ptime` date DEFAULT NULL COMMENT '申请时间(now)',
  `pback` varchar(255) DEFAULT NULL COMMENT '驳回意见',
  `pmoney` double(255,0) DEFAULT NULL COMMENT '个人余额',
  `premitdate` date DEFAULT NULL COMMENT '最后一次的汇缴日期',
  `counts` double(255,0) DEFAULT NULL COMMENT '单位缴存金额',
  `countss` double(255,0) DEFAULT NULL COMMENT '个人缴存金额',
  `remitstate` int(255) DEFAULT '11' COMMENT '缴存状态',
  `poperator` int(11) DEFAULT NULL COMMENT '开户操作人',
  `ppassword` varchar(255) DEFAULT '123456' COMMENT '登录密码',
  `changereason` varchar(255) DEFAULT NULL COMMENT '封存 启封 销户理由',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '阿三', '10000001', '16612345235', '123@qq.com', '女', '已婚', '3', '1', '1', '2', '123456789123456789', '8000', '1', '111', '河南郑州市二七区火车站', 'wl2.jpg', '图片2.jpg', '2019-01-07', '分公司的分公司', '8200', '2019-01-21', '560', '640', '11', null, '123456', null);
INSERT INTO `person` VALUES ('2', '祥祥', '10000002', '143566', '6523523', '女', '已婚', '2', '5', '1', '3', '113456', '7500', '2', '11', '河南郑州市二七区火车站', 'wl2.jpg', '图片2.jpg', '2019-01-03', '', '4900', '2019-01-21', '525', '600', '11', null, '123456', '');
INSERT INTO `person` VALUES ('3', 'zzz', '10000003', '124334', '2423', '男', '已婚', '4', '5', '2', '1', '12423532', '9600', '3', '214234', '河南郑州市二七区火车站', 'wl2.jpg', '图片2.jpg', '2019-01-07', '', '8000', '2019-01-21', '960', '768', '11', null, '123456', null);
INSERT INTO `person` VALUES ('4', 'aaa', '10000004', '16612345687', '12423@qq.com', '男', '未婚', '2', '8', '4', '2', '456812379123456789', '8655', '1', '1243454', '河南郑州市二七区火车站', 'wl2.jpg', '图片2.jpg', '2019-01-07', 'sdgfsdgs df', '7800', '2019-01-21', '606', '433', '11', null, '123456', null);
INSERT INTO `person` VALUES ('5', '李欣', '10000005', '12312312311', '234234@qq.com', '女', '未婚', '1', '12', '2', '1', '123123123123123123', '8000', '1', '354325', '河南郑州市二七区火车站', 'wl2.jpg', '图片2.jpg', '2019-01-07', null, '4500', '2019-01-21', '800', '640', '11', null, '123456', null);
INSERT INTO `person` VALUES ('6', 'afdd', '10000006', '18845678524', '234', '男', '已婚', '3', '9', '4', '2', '1434', '7500', '1', '1432', '河南郑州市二七区火车站', 'wuliu011.jpg', 'wuliu012.jpg', '2019-01-08', null, '5600', '2019-01-21', '525', '375', '11', null, '123456', null);
INSERT INTO `person` VALUES ('7', '李逵', '10000007', '143543', '32435', '女', '未婚', '3', '1', '3', '2', '1432423', '5600', '2', '156435435', '河南郑州市二七区火车站', 'wl2.jpg', '图片2.jpg', '2019-01-10', null, '5400', '2019-01-21', '392', '448', '11', null, '123456', null);
INSERT INTO `person` VALUES ('8', '珍珠', '10000008', '15325435', '1423445', '男', '未婚', '4', '0', '1', '2', '1542354356', '7300', '1', '153254356', '河南郑州市二七区火车站', 'wuliu005.jpg', 'wuliu010.jpg', '2019-01-10', null, '4300', '2019-01-21', '511', '584', '11', null, '123456', null);
INSERT INTO `person` VALUES ('9', '小陈', '10000009', '14523532', '2342345', '男', '未婚', '3', '1', '3', '3', '145234', '6800', '3', '2352354', '河南郑州市二七区火车站', 'wl2.jpg', 'wl2.jpg', '2019-01-10', 'sdfgsdgsdf', '0', '2019-01-21', '476', '544', '11', null, '123456', '');
INSERT INTO `person` VALUES ('11', '王振飞', '10000010', '16612341234', '132@qq.com', '男', '未婚', '', '0', '2', '1', '41282519960423671X', '8500', '1', '1234567891234564', '河南郑州市金水区杨金路110号', '109951163709147594.gif', '109951163709148000.gif', '2019-01-19', null, null, '2019-01-21', '850', '680', '11', null, '123456', null);
INSERT INTO `person` VALUES ('12', 'wwzz', '10000001', '15634560430', '12@qq.com', '男', '未婚', '2', '0', '2', '1', '123112345678909876', '12', '2', '14534567890987678', '河南郑州市二七区临机', '0.png', 'wl1.jpg', '2019-01-21', null, null, null, null, null, '11', null, '123456', null);
INSERT INTO `person` VALUES ('13', 'lige', '10000012', '15346534234', '12@qq.com', '男', '已婚', '4', '0', '4', '2', '123454321234342323', '23', '2', '1234567654345654345', '河南郑州市二七区二七广场', 'wl3.jpg', 'wl5.jpg', '2019-01-21', null, null, '2019-01-21', null, null, '11', null, '123456', null);
INSERT INTO `person` VALUES ('14', 'liyang', '10000013', '15034253423', '1543354354@sina.com', '男', '未婚', '4', '0', '5', '1', '410912123243569070', '6000', '1', '7543212345678675895', '河南郑州市中原区东大街', '图片2.jpg', 'wuliu008.jpg', '2019-01-22', null, null, null, null, null, '11', null, '123456', null);

-- ----------------------------
-- Table structure for `person_state`
-- ----------------------------
DROP TABLE IF EXISTS `person_state`;
CREATE TABLE `person_state` (
  `pstateid` int(11) NOT NULL,
  `pstate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pstateid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person_state
-- ----------------------------
INSERT INTO `person_state` VALUES ('0', '个人开户待审核');
INSERT INTO `person_state` VALUES ('1', '正常');
INSERT INTO `person_state` VALUES ('2', '人员转移审核中');
INSERT INTO `person_state` VALUES ('3', '待启封');
INSERT INTO `person_state` VALUES ('4', '待销户');
INSERT INTO `person_state` VALUES ('5', '封存');
INSERT INTO `person_state` VALUES ('6', '已销户');
INSERT INTO `person_state` VALUES ('7', '');
INSERT INTO `person_state` VALUES ('8', '人员转移审核未通过');
INSERT INTO `person_state` VALUES ('9', '人员转移审核通过');
INSERT INTO `person_state` VALUES ('10', '待封存');
INSERT INTO `person_state` VALUES ('11', '提取待审核');
INSERT INTO `person_state` VALUES ('12', '成功提取');
INSERT INTO `person_state` VALUES ('13', '开户审核未通过');

-- ----------------------------
-- Table structure for `p_audit_records`
-- ----------------------------
DROP TABLE IF EXISTS `p_audit_records`;
CREATE TABLE `p_audit_records` (
  `aid` int(11) NOT NULL AUTO_INCREMENT COMMENT '审核记录表主键',
  `pid` int(11) DEFAULT NULL COMMENT '个人公积金信息表主键',
  `atype` int(11) DEFAULT NULL COMMENT '审核类型',
  `aresult` int(11) DEFAULT NULL COMMENT '审核结果',
  `amsg` varchar(255) DEFAULT '无' COMMENT '备注',
  `atime` date DEFAULT NULL COMMENT '审核时间',
  `uid` int(11) DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of p_audit_records
-- ----------------------------

-- ----------------------------
-- Table structure for `records_audit`
-- ----------------------------
DROP TABLE IF EXISTS `records_audit`;
CREATE TABLE `records_audit` (
  `aid` int(11) NOT NULL AUTO_INCREMENT COMMENT '单位公积金审核记录表主键',
  `cid` int(11) DEFAULT NULL COMMENT '单位公积金账号',
  `atype` int(11) DEFAULT NULL COMMENT '审核类型',
  `aresult` int(11) DEFAULT NULL COMMENT '审核结果',
  `amsg` int(11) DEFAULT NULL COMMENT '备注',
  `atime` int(11) DEFAULT NULL COMMENT '审核时间',
  `uid` int(11) DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of records_audit
-- ----------------------------

-- ----------------------------
-- Table structure for `records_company`
-- ----------------------------
DROP TABLE IF EXISTS `records_company`;
CREATE TABLE `records_company` (
  `rcid` int(11) NOT NULL AUTO_INCREMENT COMMENT '单位信息变更记录（id）',
  `cid` int(11) DEFAULT NULL COMMENT '单位账号id',
  `uid` int(11) DEFAULT NULL COMMENT '操作人',
  `rctime` varchar(255) DEFAULT NULL COMMENT '操作时间',
  `rctid` int(11) DEFAULT NULL COMMENT '操作id',
  `rcmsg` varchar(255) DEFAULT '无' COMMENT '其他信息',
  PRIMARY KEY (`rcid`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of records_company
-- ----------------------------
INSERT INTO `records_company` VALUES ('1', '1', '1', '2019-01-11 21:56:36', '3', '无');
INSERT INTO `records_company` VALUES ('2', '2', '1', '2019-01-12 21:37:21', '3', '无');
INSERT INTO `records_company` VALUES ('3', '2', '1', '2019-01-12 21:37:27', '3', '无');
INSERT INTO `records_company` VALUES ('4', '4', '1', '2019-01-12 21:37:34', '3', '无');
INSERT INTO `records_company` VALUES ('5', '3', '1', '2019-01-14 20:24:25', '3', '无');
INSERT INTO `records_company` VALUES ('6', '4', '1', '2019-01-16 16:27:48', '3', '无');
INSERT INTO `records_company` VALUES ('7', '4', '1', '2019-01-16 16:43:01', '3', '无');
INSERT INTO `records_company` VALUES ('8', '4', '1', '2019-01-16 16:49:49', '3', '无');
INSERT INTO `records_company` VALUES ('10', '1', '1', '2019-01-16 19:23:37', '2', '无');
INSERT INTO `records_company` VALUES ('11', '2', '1', '2019-01-16 19:33:27', '2', '通过');
INSERT INTO `records_company` VALUES ('12', '3', '1', '2019-01-16 19:34:33', '2', '驳回');
INSERT INTO `records_company` VALUES ('13', null, null, '2019-01-17 11:01:41', '2', '驳回个人账户申请');
INSERT INTO `records_company` VALUES ('14', null, null, '2019-01-17 11:02:36', '2', '驳回个人账户申请');
INSERT INTO `records_company` VALUES ('15', null, null, '2019-01-17 11:02:36', '2', '驳回个人账户申请');
INSERT INTO `records_company` VALUES ('16', null, null, '2019-01-17 19:19:00', '2', '驳回个人账户申请');
INSERT INTO `records_company` VALUES ('17', null, null, '2019-01-17 20:31:04', '2', '驳回个人账户申请');
INSERT INTO `records_company` VALUES ('18', '4', '1', '2019-01-19 09:54:29', '3', '无');
INSERT INTO `records_company` VALUES ('19', '1', '1', '2019-01-19 10:40:16', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('20', '6', '1', '2019-01-21 16:11:53', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('21', '5', '1', '2019-01-21 16:14:51', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('22', '1', null, '2019-01-21 16:43:34', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('23', '2', null, '2019-01-21 16:43:56', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('24', '3', null, '2019-01-21 16:43:58', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('25', '4', null, '2019-01-21 16:44:43', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('26', '5', null, '2019-01-21 16:44:45', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('27', '6', null, '2019-01-21 16:53:42', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('28', '2', null, '2019-01-21 21:36:26', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('29', '7', '1', '2019-01-21 21:43:45', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('30', null, '1', '2019-01-22 09:01:45', '8', '个人初次审核通过');
INSERT INTO `records_company` VALUES ('31', null, '1', '2019-01-22 09:06:16', '8', '个人初次审核通过');
INSERT INTO `records_company` VALUES ('32', '1', '1', '2019-01-22 09:17:24', '2', '单位账户审核通过');
INSERT INTO `records_company` VALUES ('33', '2', '1', '2019-01-22 09:18:16', '2', '单位账户审核通过');

-- ----------------------------
-- Table structure for `records_company_type`
-- ----------------------------
DROP TABLE IF EXISTS `records_company_type`;
CREATE TABLE `records_company_type` (
  `rcid` int(11) NOT NULL COMMENT '操作id',
  `rcname` varchar(255) DEFAULT NULL COMMENT '操作名',
  PRIMARY KEY (`rcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of records_company_type
-- ----------------------------
INSERT INTO `records_company_type` VALUES ('1', '开户');
INSERT INTO `records_company_type` VALUES ('2', '单位开户审核');
INSERT INTO `records_company_type` VALUES ('3', '基本信息修改');
INSERT INTO `records_company_type` VALUES ('4', '比例变更');
INSERT INTO `records_company_type` VALUES ('5', '基数调整');

-- ----------------------------
-- Table structure for `records_person`
-- ----------------------------
DROP TABLE IF EXISTS `records_person`;
CREATE TABLE `records_person` (
  `rpid` int(11) NOT NULL AUTO_INCREMENT COMMENT '个人信息变更记录表（id）',
  `pid` int(11) DEFAULT NULL COMMENT '个人公积金账号信息表id',
  `uid` int(11) DEFAULT NULL COMMENT '操作人id',
  `rptid` int(11) DEFAULT NULL,
  `rptime` varchar(255) DEFAULT NULL COMMENT '操作时间',
  `rpmsg` varchar(255) DEFAULT '无' COMMENT '描述',
  PRIMARY KEY (`rpid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of records_person
-- ----------------------------
INSERT INTO `records_person` VALUES ('1', '1', '1', '1', '2019-01-12 21:30:59', '无');
INSERT INTO `records_person` VALUES ('2', '4', '1', '3', '2019-01-14 19:58:31', '无');
INSERT INTO `records_person` VALUES ('3', '4', '1', '3', '2019-01-14 19:59:05', '无');
INSERT INTO `records_person` VALUES ('4', '5', '1', '3', '2019-01-14 20:25:06', '无');
INSERT INTO `records_person` VALUES ('5', '5', '1', '3', '2019-01-14 20:25:10', '无');
INSERT INTO `records_person` VALUES ('6', '5', '1', '3', '2019-01-14 20:25:15', '无');
INSERT INTO `records_person` VALUES ('7', '5', '1', '3', '2019-01-14 20:25:20', '无');
INSERT INTO `records_person` VALUES ('8', '1', '1', '3', '2019-01-16 16:56:32', '无');
INSERT INTO `records_person` VALUES ('9', '1', null, '2', '2019-01-17 09:57:00', '无');
INSERT INTO `records_person` VALUES ('10', '2', null, '2', '2019-01-17 09:57:11', '无');
INSERT INTO `records_person` VALUES ('11', '3', null, '2', '2019-01-17 20:30:59', '无');
INSERT INTO `records_person` VALUES ('12', '8', null, '2', '2019-01-18 13:27:50', '无');
INSERT INTO `records_person` VALUES ('13', '8', null, '2', '2019-01-18 13:27:50', '无');
INSERT INTO `records_person` VALUES ('14', '3', null, '2', '2019-01-18 13:50:58', '无');
INSERT INTO `records_person` VALUES ('15', '9', null, '2', '2019-01-18 16:38:11', '无');
INSERT INTO `records_person` VALUES ('16', '5', '1', '2', '2019-01-19 11:20:59', '无');
INSERT INTO `records_person` VALUES ('17', '2', '1', '2', '2019-01-19 13:58:27', '无');
INSERT INTO `records_person` VALUES ('18', '3', '1', '2', '2019-01-19 14:39:39', '无');
INSERT INTO `records_person` VALUES ('19', '6', '1', '2', '2019-01-19 14:39:41', '无');
INSERT INTO `records_person` VALUES ('20', null, null, '9', '2019-01-22 09:10:36', '无');
INSERT INTO `records_person` VALUES ('21', '3', '1', '9', '2019-01-22 09:22:39', '无');

-- ----------------------------
-- Table structure for `records_person_type`
-- ----------------------------
DROP TABLE IF EXISTS `records_person_type`;
CREATE TABLE `records_person_type` (
  `rpid` int(11) NOT NULL COMMENT '个人公积金账号类型id',
  `rpname` varchar(255) DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`rpid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of records_person_type
-- ----------------------------
INSERT INTO `records_person_type` VALUES ('1', '开户');
INSERT INTO `records_person_type` VALUES ('2', '个人开户审核');
INSERT INTO `records_person_type` VALUES ('3', '账号信息变更');
INSERT INTO `records_person_type` VALUES ('4', '人员转移申请');
INSERT INTO `records_person_type` VALUES ('5', '封存账号申请');
INSERT INTO `records_person_type` VALUES ('6', '启封账号申请');
INSERT INTO `records_person_type` VALUES ('7', '销户申请');
INSERT INTO `records_person_type` VALUES ('8', '个人贷款初次审核');
INSERT INTO `records_person_type` VALUES ('9', '个人贷款最终审核');

-- ----------------------------
-- Table structure for `refund`
-- ----------------------------
DROP TABLE IF EXISTS `refund`;
CREATE TABLE `refund` (
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '还款表id',
  `rno` varchar(50) DEFAULT NULL COMMENT '还款编号',
  `rpno` varchar(50) DEFAULT NULL COMMENT '还款表贷款人账号',
  `rallmoney` double(50,2) DEFAULT NULL COMMENT '贷款的总金额',
  `rtype` varchar(50) DEFAULT NULL COMMENT '还款类型',
  `rhavemoney` double(50,2) DEFAULT '0.00' COMMENT '已还贷款',
  `rhavecapital` double(50,2) DEFAULT '0.00' COMMENT '已还本金',
  `rhaveinterest` double(50,2) DEFAULT '0.00' COMMENT '已还利息',
  `rallperiods` int(11) DEFAULT NULL COMMENT '贷款期数',
  `rhaveperiods` int(11) DEFAULT '0' COMMENT '已还期数',
  `rrate` double(20,2) DEFAULT NULL COMMENT '还款利率',
  `rcreatetime` datetime DEFAULT NULL COMMENT '创建时间',
  `rlasttime` datetime DEFAULT NULL COMMENT '上一次还款日期',
  `rmoney` double(20,2) DEFAULT NULL COMMENT '本月要还贷款金额',
  `rcapital` double(50,2) DEFAULT NULL COMMENT '本月要还本金',
  `rinterest` double(50,2) DEFAULT NULL COMMENT '本月要还利息',
  `rtime` date DEFAULT NULL COMMENT '最迟还款日',
  `rstateid` int(11) DEFAULT '6' COMMENT '状态',
  `rdefaultinterest` double(50,2) DEFAULT '0.00' COMMENT '罚息',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of refund
-- ----------------------------
INSERT INTO `refund` VALUES ('1', '20190119140251330', '10000006', '100000.00', '等额本金', '52005.21', '50000.04', '2005.20', '24', '12', '2.75', '2019-01-19 14:02:58', '2019-01-19 14:04:01', '4281.25', '4166.67', '114.58', '2020-02-28', '6', '0.00');
INSERT INTO `refund` VALUES ('2', '20190122091034899', '10000002', '500000.00', '等额本金', '0.00', '0.00', '0.00', '60', '0', '3.25', '2019-01-22 09:10:36', null, '9687.50', '8333.33', '1354.17', '2019-02-28', '6', '0.00');
INSERT INTO `refund` VALUES ('3', '20190122092237486', '10000003', '500000.00', '等额本息', '0.00', '0.00', '0.00', '60', '0', '3.25', '2019-01-22 09:22:39', null, '9040.00', '7685.83', '1354.17', '2019-02-28', '6', '0.00');

-- ----------------------------
-- Table structure for `refund_history`
-- ----------------------------
DROP TABLE IF EXISTS `refund_history`;
CREATE TABLE `refund_history` (
  `hid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `hpno` varchar(50) DEFAULT NULL COMMENT '账号',
  `hname` varchar(50) DEFAULT NULL COMMENT '还款人',
  `htime` datetime DEFAULT NULL COMMENT '还款时间',
  `hmoney` double(50,2) DEFAULT NULL COMMENT '本月还款金额',
  `hcapital` double(50,2) DEFAULT NULL COMMENT '本月还款本金',
  `hinterest` double(50,2) DEFAULT NULL COMMENT '本月还款利息',
  `hperiods` int(50) DEFAULT NULL COMMENT '还款期数',
  `hcreatetime` datetime DEFAULT NULL COMMENT '还款信息时间 作对应',
  `hdefaultinterest` double(50,2) DEFAULT '0.00' COMMENT '罚息',
  `hdate` date DEFAULT NULL COMMENT '最迟还款日',
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of refund_history
-- ----------------------------
INSERT INTO `refund_history` VALUES ('1', '10000006', 'afdd', '2019-01-19 14:03:24', '4395.83', '4166.67', '229.17', '1', '2019-01-19 14:02:58', '0.00', '2019-02-28');
INSERT INTO `refund_history` VALUES ('2', '10000006', 'afdd', '2019-01-19 14:03:27', '4386.28', '4166.67', '219.62', '2', '2019-01-19 14:02:58', '0.00', '2019-03-28');
INSERT INTO `refund_history` VALUES ('3', '10000006', 'afdd', '2019-01-19 14:03:30', '4376.74', '4166.67', '210.07', '3', '2019-01-19 14:02:58', '0.00', '2019-04-28');
INSERT INTO `refund_history` VALUES ('4', '10000006', 'afdd', '2019-01-19 14:03:32', '4367.19', '4166.67', '200.52', '4', '2019-01-19 14:02:58', '0.00', '2019-05-28');
INSERT INTO `refund_history` VALUES ('5', '10000006', 'afdd', '2019-01-19 14:03:34', '4357.64', '4166.67', '190.97', '5', '2019-01-19 14:02:58', '0.00', '2019-06-28');
INSERT INTO `refund_history` VALUES ('6', '10000006', 'afdd', '2019-01-19 14:03:37', '4348.09', '4166.67', '181.42', '6', '2019-01-19 14:02:58', '0.00', '2019-07-28');
INSERT INTO `refund_history` VALUES ('7', '10000006', 'afdd', '2019-01-19 14:03:39', '4338.54', '4166.67', '171.87', '7', '2019-01-19 14:02:58', '0.00', '2019-08-28');
INSERT INTO `refund_history` VALUES ('8', '10000006', 'afdd', '2019-01-19 14:03:41', '4328.99', '4166.67', '162.33', '8', '2019-01-19 14:02:58', '0.00', '2019-09-28');
INSERT INTO `refund_history` VALUES ('9', '10000006', 'afdd', '2019-01-19 14:03:44', '4319.44', '4166.67', '152.78', '9', '2019-01-19 14:02:58', '0.00', '2019-10-28');
INSERT INTO `refund_history` VALUES ('10', '10000006', 'afdd', '2019-01-19 14:03:48', '4309.90', '4166.67', '143.23', '10', '2019-01-19 14:02:58', '0.00', '2019-11-28');
INSERT INTO `refund_history` VALUES ('11', '10000006', 'afdd', '2019-01-19 14:03:50', '4300.35', '4166.67', '133.68', '11', '2019-01-19 14:02:58', '0.00', '2019-12-28');
INSERT INTO `refund_history` VALUES ('12', '10000006', 'afdd', '2019-01-19 14:04:01', '4290.80', '4166.67', '124.13', '12', '2019-01-19 14:02:58', '0.00', '2020-01-28');

-- ----------------------------
-- Table structure for `relation`
-- ----------------------------
DROP TABLE IF EXISTS `relation`;
CREATE TABLE `relation` (
  `reid` int(11) NOT NULL AUTO_INCREMENT,
  `rename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`reid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of relation
-- ----------------------------
INSERT INTO `relation` VALUES ('1', '中央');
INSERT INTO `relation` VALUES ('2', '省');
INSERT INTO `relation` VALUES ('3', '地区');
INSERT INTO `relation` VALUES ('4', '县');
INSERT INTO `relation` VALUES ('5', '街道');
INSERT INTO `relation` VALUES ('6', '乡');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `rname` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `rdesc` varchar(50) DEFAULT NULL COMMENT '角色描述',
  `rstate` int(2) DEFAULT '1' COMMENT '角色状态',
  `rtime` varchar(50) DEFAULT NULL COMMENT '角色创建时间',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '系统管理员', '系统管理', '1', '2018-12-27 19:39:10');
INSERT INTO `role` VALUES ('2', '审核员', '审核业务', '1', '2018-12-27 19:39:42');
INSERT INTO `role` VALUES ('3', '财务经理', '查看财务', '1', '2018-12-27 19:41:46');
INSERT INTO `role` VALUES ('4', '前台贷款员', '个人贷款', '1', '2018-12-27 19:43:26');
INSERT INTO `role` VALUES ('5', '前台柜员', '前台业务办理', '1', '2018-12-27 19:48:49');
INSERT INTO `role` VALUES ('6', '测试', '系统测试', '1', '2019-01-02 20:39:38');

-- ----------------------------
-- Table structure for `role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `rmid` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单-角色对应表主键',
  `rid` int(11) DEFAULT NULL COMMENT '角色id',
  `mid` int(11) DEFAULT NULL COMMENT '菜单id',
  `rmstate` int(1) DEFAULT '1' COMMENT '角色-菜单状态',
  PRIMARY KEY (`rmid`)
) ENGINE=InnoDB AUTO_INCREMENT=415 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('1', '1', '1', '1');
INSERT INTO `role_menu` VALUES ('2', '1', '2', '1');
INSERT INTO `role_menu` VALUES ('3', '1', '3', '1');
INSERT INTO `role_menu` VALUES ('4', '1', '4', '1');
INSERT INTO `role_menu` VALUES ('5', '1', '5', '1');
INSERT INTO `role_menu` VALUES ('6', '1', '6', '1');
INSERT INTO `role_menu` VALUES ('7', '1', '7', '1');
INSERT INTO `role_menu` VALUES ('8', '1', '8', '1');
INSERT INTO `role_menu` VALUES ('9', '1', '9', '1');
INSERT INTO `role_menu` VALUES ('10', '1', '10', '1');
INSERT INTO `role_menu` VALUES ('11', '1', '11', '1');
INSERT INTO `role_menu` VALUES ('12', '1', '12', '1');
INSERT INTO `role_menu` VALUES ('13', '1', '13', '1');
INSERT INTO `role_menu` VALUES ('14', '1', '14', '1');
INSERT INTO `role_menu` VALUES ('15', '1', '15', '1');
INSERT INTO `role_menu` VALUES ('16', '1', '16', '1');
INSERT INTO `role_menu` VALUES ('17', '1', '17', '1');
INSERT INTO `role_menu` VALUES ('18', '1', '18', '1');
INSERT INTO `role_menu` VALUES ('19', '1', '19', '1');
INSERT INTO `role_menu` VALUES ('20', '1', '20', '1');
INSERT INTO `role_menu` VALUES ('21', '1', '21', '1');
INSERT INTO `role_menu` VALUES ('22', '1', '22', '1');
INSERT INTO `role_menu` VALUES ('23', '1', '23', '1');
INSERT INTO `role_menu` VALUES ('24', '1', '24', '1');
INSERT INTO `role_menu` VALUES ('25', '1', '25', '1');
INSERT INTO `role_menu` VALUES ('26', '1', '26', '1');
INSERT INTO `role_menu` VALUES ('27', '1', '27', '1');
INSERT INTO `role_menu` VALUES ('28', '1', '28', '1');
INSERT INTO `role_menu` VALUES ('29', '1', '29', '1');
INSERT INTO `role_menu` VALUES ('30', '1', '30', '1');
INSERT INTO `role_menu` VALUES ('31', '1', '31', '1');
INSERT INTO `role_menu` VALUES ('32', '1', '32', '1');
INSERT INTO `role_menu` VALUES ('33', '1', '33', '1');
INSERT INTO `role_menu` VALUES ('34', '1', '34', '1');
INSERT INTO `role_menu` VALUES ('35', '1', '35', '1');
INSERT INTO `role_menu` VALUES ('36', '1', '36', '1');
INSERT INTO `role_menu` VALUES ('37', '1', '37', '1');
INSERT INTO `role_menu` VALUES ('38', '1', '38', '1');
INSERT INTO `role_menu` VALUES ('39', '1', '39', '1');
INSERT INTO `role_menu` VALUES ('40', '1', '40', '1');
INSERT INTO `role_menu` VALUES ('41', '1', '41', '1');
INSERT INTO `role_menu` VALUES ('42', '1', '42', '1');
INSERT INTO `role_menu` VALUES ('43', '1', '43', '1');
INSERT INTO `role_menu` VALUES ('44', '1', '44', '1');
INSERT INTO `role_menu` VALUES ('45', '1', '45', '1');
INSERT INTO `role_menu` VALUES ('46', '1', '46', '1');
INSERT INTO `role_menu` VALUES ('47', '1', '47', '1');
INSERT INTO `role_menu` VALUES ('48', '1', '48', '1');
INSERT INTO `role_menu` VALUES ('49', '2', '1', '1');
INSERT INTO `role_menu` VALUES ('98', '2', '2', '0');
INSERT INTO `role_menu` VALUES ('99', '2', '3', '0');
INSERT INTO `role_menu` VALUES ('100', '2', '4', '0');
INSERT INTO `role_menu` VALUES ('101', '2', '5', '0');
INSERT INTO `role_menu` VALUES ('102', '2', '6', '1');
INSERT INTO `role_menu` VALUES ('103', '2', '7', '0');
INSERT INTO `role_menu` VALUES ('104', '2', '8', '0');
INSERT INTO `role_menu` VALUES ('105', '2', '9', '0');
INSERT INTO `role_menu` VALUES ('106', '2', '10', '1');
INSERT INTO `role_menu` VALUES ('107', '2', '11', '1');
INSERT INTO `role_menu` VALUES ('108', '2', '12', '0');
INSERT INTO `role_menu` VALUES ('109', '2', '13', '0');
INSERT INTO `role_menu` VALUES ('110', '2', '14', '0');
INSERT INTO `role_menu` VALUES ('111', '2', '15', '0');
INSERT INTO `role_menu` VALUES ('112', '2', '16', '0');
INSERT INTO `role_menu` VALUES ('113', '2', '17', '0');
INSERT INTO `role_menu` VALUES ('114', '2', '18', '0');
INSERT INTO `role_menu` VALUES ('115', '2', '19', '0');
INSERT INTO `role_menu` VALUES ('116', '2', '20', '0');
INSERT INTO `role_menu` VALUES ('117', '2', '21', '0');
INSERT INTO `role_menu` VALUES ('118', '2', '22', '0');
INSERT INTO `role_menu` VALUES ('119', '2', '23', '0');
INSERT INTO `role_menu` VALUES ('120', '2', '24', '0');
INSERT INTO `role_menu` VALUES ('121', '2', '25', '0');
INSERT INTO `role_menu` VALUES ('122', '2', '26', '0');
INSERT INTO `role_menu` VALUES ('123', '2', '27', '0');
INSERT INTO `role_menu` VALUES ('124', '2', '28', '0');
INSERT INTO `role_menu` VALUES ('125', '2', '29', '0');
INSERT INTO `role_menu` VALUES ('126', '2', '30', '1');
INSERT INTO `role_menu` VALUES ('127', '2', '31', '1');
INSERT INTO `role_menu` VALUES ('128', '2', '32', '1');
INSERT INTO `role_menu` VALUES ('129', '2', '33', '1');
INSERT INTO `role_menu` VALUES ('130', '2', '34', '1');
INSERT INTO `role_menu` VALUES ('131', '2', '35', '1');
INSERT INTO `role_menu` VALUES ('132', '2', '36', '1');
INSERT INTO `role_menu` VALUES ('133', '2', '37', '0');
INSERT INTO `role_menu` VALUES ('134', '2', '38', '0');
INSERT INTO `role_menu` VALUES ('135', '2', '39', '0');
INSERT INTO `role_menu` VALUES ('136', '2', '40', '0');
INSERT INTO `role_menu` VALUES ('137', '2', '41', '0');
INSERT INTO `role_menu` VALUES ('138', '2', '42', '0');
INSERT INTO `role_menu` VALUES ('139', '2', '43', '0');
INSERT INTO `role_menu` VALUES ('140', '2', '44', '0');
INSERT INTO `role_menu` VALUES ('141', '2', '45', '1');
INSERT INTO `role_menu` VALUES ('142', '2', '46', '1');
INSERT INTO `role_menu` VALUES ('143', '2', '47', '1');
INSERT INTO `role_menu` VALUES ('144', '2', '48', '0');
INSERT INTO `role_menu` VALUES ('145', '3', '1', '1');
INSERT INTO `role_menu` VALUES ('146', '3', '2', '0');
INSERT INTO `role_menu` VALUES ('147', '3', '3', '0');
INSERT INTO `role_menu` VALUES ('148', '3', '4', '0');
INSERT INTO `role_menu` VALUES ('149', '3', '5', '0');
INSERT INTO `role_menu` VALUES ('150', '3', '6', '0');
INSERT INTO `role_menu` VALUES ('151', '3', '7', '0');
INSERT INTO `role_menu` VALUES ('152', '3', '8', '0');
INSERT INTO `role_menu` VALUES ('153', '3', '9', '1');
INSERT INTO `role_menu` VALUES ('154', '3', '10', '0');
INSERT INTO `role_menu` VALUES ('155', '3', '11', '1');
INSERT INTO `role_menu` VALUES ('156', '3', '12', '0');
INSERT INTO `role_menu` VALUES ('157', '3', '13', '0');
INSERT INTO `role_menu` VALUES ('158', '3', '14', '0');
INSERT INTO `role_menu` VALUES ('159', '3', '15', '0');
INSERT INTO `role_menu` VALUES ('160', '3', '16', '0');
INSERT INTO `role_menu` VALUES ('161', '3', '17', '0');
INSERT INTO `role_menu` VALUES ('162', '3', '18', '0');
INSERT INTO `role_menu` VALUES ('163', '3', '19', '0');
INSERT INTO `role_menu` VALUES ('164', '3', '20', '0');
INSERT INTO `role_menu` VALUES ('165', '3', '21', '0');
INSERT INTO `role_menu` VALUES ('166', '3', '22', '0');
INSERT INTO `role_menu` VALUES ('167', '3', '23', '0');
INSERT INTO `role_menu` VALUES ('168', '3', '24', '0');
INSERT INTO `role_menu` VALUES ('169', '3', '25', '0');
INSERT INTO `role_menu` VALUES ('170', '3', '26', '0');
INSERT INTO `role_menu` VALUES ('171', '3', '27', '0');
INSERT INTO `role_menu` VALUES ('172', '3', '28', '0');
INSERT INTO `role_menu` VALUES ('173', '3', '29', '0');
INSERT INTO `role_menu` VALUES ('174', '3', '30', '0');
INSERT INTO `role_menu` VALUES ('175', '3', '31', '0');
INSERT INTO `role_menu` VALUES ('176', '3', '32', '0');
INSERT INTO `role_menu` VALUES ('177', '3', '33', '0');
INSERT INTO `role_menu` VALUES ('178', '3', '34', '0');
INSERT INTO `role_menu` VALUES ('179', '3', '35', '0');
INSERT INTO `role_menu` VALUES ('180', '3', '36', '0');
INSERT INTO `role_menu` VALUES ('181', '3', '37', '0');
INSERT INTO `role_menu` VALUES ('182', '3', '38', '0');
INSERT INTO `role_menu` VALUES ('183', '3', '39', '0');
INSERT INTO `role_menu` VALUES ('184', '3', '40', '0');
INSERT INTO `role_menu` VALUES ('185', '3', '41', '0');
INSERT INTO `role_menu` VALUES ('186', '3', '42', '1');
INSERT INTO `role_menu` VALUES ('187', '3', '43', '1');
INSERT INTO `role_menu` VALUES ('188', '3', '44', '0');
INSERT INTO `role_menu` VALUES ('189', '3', '45', '0');
INSERT INTO `role_menu` VALUES ('190', '3', '46', '1');
INSERT INTO `role_menu` VALUES ('191', '3', '47', '1');
INSERT INTO `role_menu` VALUES ('192', '3', '48', '0');
INSERT INTO `role_menu` VALUES ('193', '4', '1', '1');
INSERT INTO `role_menu` VALUES ('194', '4', '2', '0');
INSERT INTO `role_menu` VALUES ('195', '4', '3', '0');
INSERT INTO `role_menu` VALUES ('196', '4', '4', '0');
INSERT INTO `role_menu` VALUES ('197', '4', '5', '0');
INSERT INTO `role_menu` VALUES ('198', '4', '6', '0');
INSERT INTO `role_menu` VALUES ('199', '4', '7', '1');
INSERT INTO `role_menu` VALUES ('200', '4', '8', '1');
INSERT INTO `role_menu` VALUES ('201', '4', '9', '0');
INSERT INTO `role_menu` VALUES ('202', '4', '10', '0');
INSERT INTO `role_menu` VALUES ('203', '4', '11', '1');
INSERT INTO `role_menu` VALUES ('204', '4', '12', '0');
INSERT INTO `role_menu` VALUES ('205', '4', '13', '0');
INSERT INTO `role_menu` VALUES ('206', '4', '14', '0');
INSERT INTO `role_menu` VALUES ('207', '4', '15', '0');
INSERT INTO `role_menu` VALUES ('208', '4', '16', '0');
INSERT INTO `role_menu` VALUES ('209', '4', '17', '0');
INSERT INTO `role_menu` VALUES ('210', '4', '18', '0');
INSERT INTO `role_menu` VALUES ('211', '4', '19', '0');
INSERT INTO `role_menu` VALUES ('212', '4', '20', '0');
INSERT INTO `role_menu` VALUES ('213', '4', '21', '0');
INSERT INTO `role_menu` VALUES ('214', '4', '22', '0');
INSERT INTO `role_menu` VALUES ('215', '4', '23', '0');
INSERT INTO `role_menu` VALUES ('216', '4', '24', '0');
INSERT INTO `role_menu` VALUES ('217', '4', '25', '0');
INSERT INTO `role_menu` VALUES ('218', '4', '26', '0');
INSERT INTO `role_menu` VALUES ('219', '4', '27', '0');
INSERT INTO `role_menu` VALUES ('220', '4', '28', '0');
INSERT INTO `role_menu` VALUES ('221', '4', '29', '0');
INSERT INTO `role_menu` VALUES ('222', '4', '30', '0');
INSERT INTO `role_menu` VALUES ('223', '4', '31', '0');
INSERT INTO `role_menu` VALUES ('224', '4', '32', '0');
INSERT INTO `role_menu` VALUES ('225', '4', '33', '0');
INSERT INTO `role_menu` VALUES ('226', '4', '34', '0');
INSERT INTO `role_menu` VALUES ('227', '4', '35', '0');
INSERT INTO `role_menu` VALUES ('228', '4', '36', '0');
INSERT INTO `role_menu` VALUES ('229', '4', '37', '1');
INSERT INTO `role_menu` VALUES ('230', '4', '38', '1');
INSERT INTO `role_menu` VALUES ('231', '4', '39', '1');
INSERT INTO `role_menu` VALUES ('232', '4', '40', '1');
INSERT INTO `role_menu` VALUES ('233', '4', '41', '1');
INSERT INTO `role_menu` VALUES ('234', '4', '42', '0');
INSERT INTO `role_menu` VALUES ('235', '4', '43', '0');
INSERT INTO `role_menu` VALUES ('236', '4', '44', '0');
INSERT INTO `role_menu` VALUES ('237', '4', '45', '0');
INSERT INTO `role_menu` VALUES ('238', '4', '46', '1');
INSERT INTO `role_menu` VALUES ('239', '4', '47', '1');
INSERT INTO `role_menu` VALUES ('240', '4', '48', '0');
INSERT INTO `role_menu` VALUES ('241', '5', '1', '1');
INSERT INTO `role_menu` VALUES ('242', '5', '2', '1');
INSERT INTO `role_menu` VALUES ('243', '5', '3', '1');
INSERT INTO `role_menu` VALUES ('244', '5', '4', '1');
INSERT INTO `role_menu` VALUES ('245', '5', '5', '0');
INSERT INTO `role_menu` VALUES ('246', '5', '6', '0');
INSERT INTO `role_menu` VALUES ('247', '5', '7', '1');
INSERT INTO `role_menu` VALUES ('248', '5', '8', '0');
INSERT INTO `role_menu` VALUES ('249', '5', '9', '0');
INSERT INTO `role_menu` VALUES ('250', '5', '10', '0');
INSERT INTO `role_menu` VALUES ('251', '5', '11', '1');
INSERT INTO `role_menu` VALUES ('252', '5', '12', '1');
INSERT INTO `role_menu` VALUES ('253', '5', '13', '1');
INSERT INTO `role_menu` VALUES ('254', '5', '14', '1');
INSERT INTO `role_menu` VALUES ('255', '5', '15', '1');
INSERT INTO `role_menu` VALUES ('256', '5', '16', '1');
INSERT INTO `role_menu` VALUES ('257', '5', '17', '1');
INSERT INTO `role_menu` VALUES ('258', '5', '18', '1');
INSERT INTO `role_menu` VALUES ('259', '5', '19', '1');
INSERT INTO `role_menu` VALUES ('260', '5', '20', '1');
INSERT INTO `role_menu` VALUES ('261', '5', '21', '1');
INSERT INTO `role_menu` VALUES ('262', '5', '22', '1');
INSERT INTO `role_menu` VALUES ('263', '5', '23', '1');
INSERT INTO `role_menu` VALUES ('264', '5', '24', '1');
INSERT INTO `role_menu` VALUES ('265', '5', '25', '1');
INSERT INTO `role_menu` VALUES ('266', '5', '26', '1');
INSERT INTO `role_menu` VALUES ('267', '5', '27', '1');
INSERT INTO `role_menu` VALUES ('268', '5', '28', '0');
INSERT INTO `role_menu` VALUES ('269', '5', '29', '0');
INSERT INTO `role_menu` VALUES ('270', '5', '30', '0');
INSERT INTO `role_menu` VALUES ('271', '5', '31', '0');
INSERT INTO `role_menu` VALUES ('272', '5', '32', '0');
INSERT INTO `role_menu` VALUES ('273', '5', '33', '0');
INSERT INTO `role_menu` VALUES ('274', '5', '34', '0');
INSERT INTO `role_menu` VALUES ('275', '5', '35', '0');
INSERT INTO `role_menu` VALUES ('276', '5', '36', '0');
INSERT INTO `role_menu` VALUES ('277', '5', '37', '1');
INSERT INTO `role_menu` VALUES ('278', '5', '38', '1');
INSERT INTO `role_menu` VALUES ('279', '5', '39', '0');
INSERT INTO `role_menu` VALUES ('280', '5', '40', '0');
INSERT INTO `role_menu` VALUES ('281', '5', '41', '0');
INSERT INTO `role_menu` VALUES ('282', '5', '42', '0');
INSERT INTO `role_menu` VALUES ('283', '5', '43', '0');
INSERT INTO `role_menu` VALUES ('284', '5', '44', '0');
INSERT INTO `role_menu` VALUES ('285', '5', '45', '0');
INSERT INTO `role_menu` VALUES ('286', '5', '46', '1');
INSERT INTO `role_menu` VALUES ('287', '5', '47', '1');
INSERT INTO `role_menu` VALUES ('288', '5', '48', '1');
INSERT INTO `role_menu` VALUES ('289', '6', '1', '1');
INSERT INTO `role_menu` VALUES ('290', '6', '2', '0');
INSERT INTO `role_menu` VALUES ('291', '6', '3', '0');
INSERT INTO `role_menu` VALUES ('292', '6', '4', '0');
INSERT INTO `role_menu` VALUES ('293', '6', '5', '0');
INSERT INTO `role_menu` VALUES ('294', '6', '6', '0');
INSERT INTO `role_menu` VALUES ('295', '6', '7', '0');
INSERT INTO `role_menu` VALUES ('296', '6', '8', '0');
INSERT INTO `role_menu` VALUES ('297', '6', '9', '0');
INSERT INTO `role_menu` VALUES ('298', '6', '10', '0');
INSERT INTO `role_menu` VALUES ('299', '6', '11', '1');
INSERT INTO `role_menu` VALUES ('300', '6', '12', '0');
INSERT INTO `role_menu` VALUES ('301', '6', '13', '0');
INSERT INTO `role_menu` VALUES ('302', '6', '14', '0');
INSERT INTO `role_menu` VALUES ('303', '6', '15', '0');
INSERT INTO `role_menu` VALUES ('304', '6', '16', '0');
INSERT INTO `role_menu` VALUES ('305', '6', '17', '0');
INSERT INTO `role_menu` VALUES ('306', '6', '18', '0');
INSERT INTO `role_menu` VALUES ('307', '6', '19', '0');
INSERT INTO `role_menu` VALUES ('308', '6', '20', '0');
INSERT INTO `role_menu` VALUES ('309', '6', '21', '0');
INSERT INTO `role_menu` VALUES ('310', '6', '22', '0');
INSERT INTO `role_menu` VALUES ('311', '6', '23', '0');
INSERT INTO `role_menu` VALUES ('312', '6', '24', '0');
INSERT INTO `role_menu` VALUES ('313', '6', '25', '0');
INSERT INTO `role_menu` VALUES ('314', '6', '26', '0');
INSERT INTO `role_menu` VALUES ('315', '6', '27', '0');
INSERT INTO `role_menu` VALUES ('316', '6', '28', '0');
INSERT INTO `role_menu` VALUES ('317', '6', '29', '0');
INSERT INTO `role_menu` VALUES ('318', '6', '30', '0');
INSERT INTO `role_menu` VALUES ('319', '6', '31', '0');
INSERT INTO `role_menu` VALUES ('320', '6', '32', '0');
INSERT INTO `role_menu` VALUES ('321', '6', '33', '0');
INSERT INTO `role_menu` VALUES ('322', '6', '34', '0');
INSERT INTO `role_menu` VALUES ('323', '6', '35', '0');
INSERT INTO `role_menu` VALUES ('324', '6', '36', '0');
INSERT INTO `role_menu` VALUES ('325', '6', '37', '0');
INSERT INTO `role_menu` VALUES ('326', '6', '38', '0');
INSERT INTO `role_menu` VALUES ('327', '6', '39', '0');
INSERT INTO `role_menu` VALUES ('328', '6', '40', '0');
INSERT INTO `role_menu` VALUES ('329', '6', '41', '0');
INSERT INTO `role_menu` VALUES ('330', '6', '42', '0');
INSERT INTO `role_menu` VALUES ('331', '6', '43', '0');
INSERT INTO `role_menu` VALUES ('332', '6', '44', '0');
INSERT INTO `role_menu` VALUES ('333', '6', '45', '0');
INSERT INTO `role_menu` VALUES ('334', '6', '46', '1');
INSERT INTO `role_menu` VALUES ('335', '6', '47', '1');
INSERT INTO `role_menu` VALUES ('336', '6', '48', '0');
INSERT INTO `role_menu` VALUES ('385', '1', '49', '1');
INSERT INTO `role_menu` VALUES ('386', '2', '49', '0');
INSERT INTO `role_menu` VALUES ('387', '3', '49', '0');
INSERT INTO `role_menu` VALUES ('388', '4', '49', '0');
INSERT INTO `role_menu` VALUES ('389', '5', '49', '0');
INSERT INTO `role_menu` VALUES ('390', '6', '49', '0');
INSERT INTO `role_menu` VALUES ('394', '1', '50', '1');
INSERT INTO `role_menu` VALUES ('395', '2', '50', '1');
INSERT INTO `role_menu` VALUES ('396', '3', '50', '1');
INSERT INTO `role_menu` VALUES ('397', '4', '50', '1');
INSERT INTO `role_menu` VALUES ('398', '5', '50', '1');
INSERT INTO `role_menu` VALUES ('399', '6', '50', '1');
INSERT INTO `role_menu` VALUES ('403', '1', '51', '1');
INSERT INTO `role_menu` VALUES ('404', '2', '51', '1');
INSERT INTO `role_menu` VALUES ('405', '3', '51', '1');
INSERT INTO `role_menu` VALUES ('406', '4', '51', '1');
INSERT INTO `role_menu` VALUES ('407', '5', '51', '1');
INSERT INTO `role_menu` VALUES ('408', '6', '51', '1');
INSERT INTO `role_menu` VALUES ('409', '1', '52', '1');
INSERT INTO `role_menu` VALUES ('410', '2', '52', '1');
INSERT INTO `role_menu` VALUES ('411', '3', '52', '0');
INSERT INTO `role_menu` VALUES ('412', '4', '52', '0');
INSERT INTO `role_menu` VALUES ('413', '5', '52', '0');
INSERT INTO `role_menu` VALUES ('414', '6', '52', '0');

-- ----------------------------
-- Table structure for `role_state`
-- ----------------------------
DROP TABLE IF EXISTS `role_state`;
CREATE TABLE `role_state` (
  `rsid` int(11) NOT NULL COMMENT '角色状态id',
  `rstatename` varchar(50) DEFAULT NULL COMMENT '角色状态名',
  PRIMARY KEY (`rsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_state
-- ----------------------------
INSERT INTO `role_state` VALUES ('0', '已禁用');
INSERT INTO `role_state` VALUES ('1', '已启用');

-- ----------------------------
-- Table structure for `state`
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '状态表',
  `sname` varchar(255) DEFAULT NULL COMMENT '状态名称',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of state
-- ----------------------------
INSERT INTO `state` VALUES ('1', '待审核');
INSERT INTO `state` VALUES ('2', '正常');
INSERT INTO `state` VALUES ('3', '初审未通过');
INSERT INTO `state` VALUES ('4', '复审中');
INSERT INTO `state` VALUES ('5', '贷款成功');
INSERT INTO `state` VALUES ('6', '还款中');
INSERT INTO `state` VALUES ('7', '复审未通过');
INSERT INTO `state` VALUES ('11', '未缴存');
INSERT INTO `state` VALUES ('12', '已缴存');
INSERT INTO `state` VALUES ('13', '还款完毕');

-- ----------------------------
-- Table structure for `takefund_record`
-- ----------------------------
DROP TABLE IF EXISTS `takefund_record`;
CREATE TABLE `takefund_record` (
  `fundid` int(11) NOT NULL AUTO_INCREMENT COMMENT '个人公积金提取记录表',
  `perid` int(11) DEFAULT NULL COMMENT '个人账户ID',
  `takefundtype` varchar(255) DEFAULT NULL COMMENT '提取类型(公积金提取方式)',
  `takefundmoney` double DEFAULT NULL COMMENT '实际提取公积金金额',
  `takefundreason` varchar(255) DEFAULT NULL COMMENT '提取公积金原因',
  `reasondetail` varchar(255) DEFAULT NULL COMMENT '提取公积金原因详情',
  `taketime` date DEFAULT NULL COMMENT '提取时间',
  `takebankno` varchar(255) DEFAULT NULL COMMENT '提取到的银行卡号',
  `agreedtime` int(11) DEFAULT NULL COMMENT '约定提取时间',
  `repaymoney` double DEFAULT NULL COMMENT '每月还款金额',
  `agreedcount` int(11) DEFAULT NULL COMMENT '约定期数',
  `loantype` varchar(255) DEFAULT NULL COMMENT '贷款类型',
  PRIMARY KEY (`fundid`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of takefund_record
-- ----------------------------
INSERT INTO `takefund_record` VALUES ('12', '8', '销户提取', '4300', '7', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('13', '4', '部分提取', '2000', '7', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('14', '4', '部分提取', '1000', '7', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('15', '5', '部分提取', '1000', '7', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('22', '6', '部分提取', '5600', '5', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('23', '5', '销户提取', '4500', '5', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('24', '3', '销户提取', '8000', '5', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('28', '5', '销户提取', '4500', '10', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('34', '5', '部分提取', '4500', '2', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('35', '5', '销户提取', '4500', '9', null, '2019-01-16', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('36', '4', '部分提取', '1800', '3', null, '2019-01-17', null, null, null, null, null);
INSERT INTO `takefund_record` VALUES ('37', '7', '部分提取', '100', '1', null, '2019-01-18', '156435435', null, null, null, null);
INSERT INTO `takefund_record` VALUES ('38', '7', '部分提取', '5400', '', null, '2019-01-19', '156435435', null, null, null, null);
INSERT INTO `takefund_record` VALUES ('39', '1', '部分提取', '8200', '', null, '2019-01-19', '111', null, null, null, null);
INSERT INTO `takefund_record` VALUES ('40', '1', '约定提取', null, null, null, '2019-01-21', null, '3', '300', '1', null);
INSERT INTO `takefund_record` VALUES ('41', '1', '约定提取', null, null, null, '2019-01-21', null, '6', '280', '2', '公积金贷款');

-- ----------------------------
-- Table structure for `tfreason_type`
-- ----------------------------
DROP TABLE IF EXISTS `tfreason_type`;
CREATE TABLE `tfreason_type` (
  `tfreasonid` int(11) NOT NULL COMMENT '公积金提取原因(部分提取1-6,销户提取7-11)',
  `tfreasonname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tfreasonid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tfreason_type
-- ----------------------------
INSERT INTO `tfreason_type` VALUES ('1', '购买、建造、翻建、大修自住住房');
INSERT INTO `tfreason_type` VALUES ('2', '偿还购房贷款本息的');
INSERT INTO `tfreason_type` VALUES ('3', '本人、配偶及子女因患重大疾病或遇到突发事件，造成家庭生活严重困难');
INSERT INTO `tfreason_type` VALUES ('4', '法院判决住房公积金作为离婚共同财产分割等涉及提取住房公积金');
INSERT INTO `tfreason_type` VALUES ('5', '房租超出家庭工资收入的规定比例');
INSERT INTO `tfreason_type` VALUES ('6', '享受城镇最低生活保障');
INSERT INTO `tfreason_type` VALUES ('7', '离休、退休');
INSERT INTO `tfreason_type` VALUES ('8', '完全或部分丧失劳动能力，并与单位终止劳动关系');
INSERT INTO `tfreason_type` VALUES ('9', '非本市户籍且户口在农村，与所在单位终止劳动关系回户籍所在地');
INSERT INTO `tfreason_type` VALUES ('10', '与单位终止劳动关系，连续两年以上未再就业，且满足男满50周岁，女满40周岁');
INSERT INTO `tfreason_type` VALUES ('11', '出境定居');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(255) NOT NULL AUTO_INCREMENT COMMENT '后台管理人员',
  `uno` int(11) DEFAULT NULL COMMENT '员工编号',
  `uname` varchar(255) DEFAULT NULL COMMENT '员工姓名',
  `uaddress` varchar(255) DEFAULT NULL COMMENT '家庭地址',
  `uphone` varchar(50) DEFAULT NULL,
  `uemail` varchar(50) DEFAULT NULL,
  `roleid` int(11) DEFAULT '1' COMMENT '角色id',
  `utime` varchar(255) DEFAULT NULL COMMENT '入职时间',
  `upassword` int(255) DEFAULT '123456' COMMENT '登录密码',
  `ustate` int(2) DEFAULT '1' COMMENT '员工状态',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1001', '李逍遥', '金水区152号', '18812345864', '123@qq.com', '1', '2018-12-28 15:06:15', '123456', '1');
INSERT INTO `user` VALUES ('2', '1002', '王昭君', '中原区116号', '16638545865', '123@qq.com', '2', '2018-12-28 20:05:18', '123456', '1');
INSERT INTO `user` VALUES ('3', '1003', '貂蝉', '金水区123号', '16685466854', '123@qq.com', '3', '2018-12-29 08:25:16', '123456', '1');
INSERT INTO `user` VALUES ('4', '1004', '虞姬', '二七区323号', '18813548643', '123@qq.com', '4', '2018-12-29 09:05:36', '123456', '1');
INSERT INTO `user` VALUES ('5', '1005', '甄姬', '中原区11号', '16652131843', '123@qq.com', '3', '2018-12-29 09:06:16', '123456', '1');
INSERT INTO `user` VALUES ('6', '1006', '张无忌', '金水区23号', '15225431568', '123@qq.com', '5', '2018-12-29 09:08:18', '123456', '1');
INSERT INTO `user` VALUES ('7', '1007', '谢逊', '金水区422号', '13715468546', '123@qq.com', '7', '2018-12-29 09:09:35', '123456', '1');
INSERT INTO `user` VALUES ('8', '1008', '王振飞', '二七区110号', '16612345678', '166@qq.com', '5', '2019-01-08 20:05:16', '123456', '1');
INSERT INTO `user` VALUES ('9', '1009', '吕云龙', '二七区8号', '13812546854', '123@qq.com', '2', '2019-01-09 11:01:49', '123456', '1');
INSERT INTO `user` VALUES ('10', '1010', '吕小龙', '金水区15号', '13654564612', '123@qq.com', '2', '2019-01-09 11:03:52', '123456', '1');
INSERT INTO `user` VALUES ('11', '1011', '王振飞', '213', '12365475653', '213@qw.com', '5', '2019-01-10 14:30:55', '123456', '0');
INSERT INTO `user` VALUES ('12', '1012', '胡江鹏', '杨金路112号', '16612341342', '20145@qq.com', '5', '2019-01-19 10:42:12', '123456', '1');

-- ----------------------------
-- Table structure for `user_state`
-- ----------------------------
DROP TABLE IF EXISTS `user_state`;
CREATE TABLE `user_state` (
  `usid` int(1) NOT NULL COMMENT '员工状态id',
  `usname` varchar(10) DEFAULT NULL COMMENT '员工状态名称',
  PRIMARY KEY (`usid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_state
-- ----------------------------
INSERT INTO `user_state` VALUES ('0', '离职');
INSERT INTO `user_state` VALUES ('1', '在职');
