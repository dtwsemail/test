-- trade order
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_id`        VARCHAR(32) NOT NULL
  COMMENT 'id',
  `trade_date`      DATE           DEFAULT NULL
  COMMENT '日期',
  `stock_id`        VARCHAR(32) NOT NULL
  COMMENT '股票代码',
  `end_price`       DECIMAL(18, 6) DEFAULT NULL
  COMMENT '收盘价',
  `top_price`       DECIMAL(18, 6) DEFAULT NULL
  COMMENT '最高价',
  `bottom_price`    DECIMAL(18, 6) DEFAULT NULL
  COMMENT '最低价',
  `begin_price`     DECIMAL(18, 6) DEFAULT NULL
  COMMENT '开盘价',
  `previous_price`  DECIMAL(18, 6) DEFAULT NULL
  COMMENT '前收盘',
  `shake_price`     DECIMAL(18, 6) DEFAULT NULL
  COMMENT '涨跌额',
  `shake_rate`      DECIMAL(18, 6) DEFAULT NULL
  COMMENT '涨跌幅',
  `turn_rate`       DECIMAL(18, 6) DEFAULT NULL
  COMMENT '涨跌幅',
  `trade_quote`     DECIMAL(18, 6) DEFAULT NULL
  COMMENT '成交量',
  `trade_amount`    DECIMAL(24, 4) DEFAULT NULL
  COMMENT '成交金额',
  `total_amount`    DECIMAL(24, 4) DEFAULT NULL
  COMMENT '总市值',
  `unfrozen_amount` DECIMAL(24, 4) DEFAULT NULL
  COMMENT '流通市值',
  `trade_number`    DECIMAL(24, 4) DEFAULT NULL
  COMMENT '成交数量',
  PRIMARY KEY (`order_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = 'order';


DROP TABLE IF EXISTS `stock_info`;
CREATE TABLE `stock_info` (
  `stock_id`   VARCHAR(32) NOT NULL,
  `stock_code` VARCHAR(32)  DEFAULT NULL,
  `stock_name` VARCHAR(64)  DEFAULT NULL
  COMMENT 'stock_name',
  `location`   VARCHAR(8)   DEFAULT NULL
  COMMENT 'location',
  `industry`   VARCHAR(64)  DEFAULT NULL
  COMMENT 'industry',
  `stock_type` VARCHAR(512) DEFAULT NULL
  COMMENT 'stock_type',
  PRIMARY KEY (`stock_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = 'utf8'
  COMMENT = 'stock_info';


DROP TABLE IF EXISTS `crawler_log`;
CREATE TABLE `crawler_log` (
  `id`            VARCHAR(32) NOT NULL,
  `stock_id`      VARCHAR(32)  DEFAULT NULL,
  `crawler_event` VARCHAR(8)   DEFAULT NULL
  COMMENT 'EnumCrawlerEvent : STOCK_CODE , STOCK_HISTORY',
  `request`       VARCHAR(127) DEFAULT NULL,
  `response`      VARCHAR(512) DEFAULT NULL,
  `param`         VARCHAR(127) DEFAULT NULL,
  `create_time`   DATE         DEFAULT NULL,
  `status`        VARCHAR(16)  DEFAULT NULL
  COMMENT 'EnumCrawerLogStatus : SUCCESS : success , TIMEOUT: timeout , F0F: 404 , Exception: parse data Exception , ERROR : UNKNOW ',
  `error_msg`     VARCHAR(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = 'crawler_log';


DROP TABLE IF EXISTS `feature_rule`;
CREATE TABLE `feature_rule` (
  `rule_id`      VARCHAR(32) NOT NULL
  COMMENT '规则id',
  `rule_type`    VARCHAR(32) NOT NULL
  COMMENT '规则类别',
  `bottom_value` DECIMAL(18, 4) DEFAULT NULL
  COMMENT '最小值',
  `top_value`    DECIMAL(18, 4) DEFAULT NULL
  COMMENT '最大值',
  PRIMARY KEY (`rule_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '规则定义';


DROP TABLE IF EXISTS `stock_feature`;
CREATE TABLE `stock_feature` (
  `feature_id`      VARCHAR(32) NOT NULL
  COMMENT '股票特征id',
  `base_feature_id` VARCHAR(32)  DEFAULT NULL
  COMMENT '上期股票特征id',
  `new_rule_id`     VARCHAR(32)  DEFAULT NULL
  COMMENT '新增规则id',
  `desc`            VARCHAR(255) DEFAULT NULL
  COMMENT '特征描述',
  `is_origin`       BOOLEAN      DEFAULT FALSE
  COMMENT '是否原始类型',
  PRIMARY KEY (`feature_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '股票特征';


DROP TABLE IF EXISTS `stock_analyse`;
CREATE TABLE `stock_analyse` (
  `analyse_id`        VARCHAR(32) NOT NULL
  COMMENT '分析id',
  `stock_code`        VARCHAR(32)    DEFAULT NULL
  COMMENT '股票代码',
  `sum_shake_rate`    DECIMAL(18, 4) DEFAULT NULL
  COMMENT '累计涨跌幅',
  `shake_density`     DECIMAL(18, 4) DEFAULT NULL
  COMMENT '振幅密度',
  `execp_shake_rate`  DECIMAL(18, 4) DEFAULT NULL
  COMMENT '振幅期望',
  `feature_id`        VARCHAR(32)    DEFAULT NULL
  COMMENT '特征id',
  `analyse_days`      INTEGER        DEFAULT NULL
  COMMENT '累计分析天数',
  `base_analyse_id`   VARCHAR(32)    DEFAULT NULL
  COMMENT '上期分析id',
  `sample_num`        INTEGER        DEFAULT NULL
  COMMENT '样本数量',
  `analyse_num`       INTEGER        DEFAULT NULL
  COMMENT '当前样例数量',
  `feature_belong_id` VARCHAR(32)    DEFAULT NULL
  COMMENT '归属特征id',
  `begin_order_id`    VARCHAR(32)    DEFAULT NULL
  COMMENT '分析开始节点',
  `begin_trade_date`  DATE           DEFAULT NULL
  COMMENT '开始日期',
  `end_price`         DECIMAL(18, 2) DEFAULT NULL
  COMMENT '收盘价',
  `top_price`         DECIMAL(18, 2) DEFAULT NULL
  COMMENT '最高价',
  `bottom_price`      DECIMAL(18, 2) DEFAULT NULL
  COMMENT '最低价',
  `begin_price`       DECIMAL(18, 2) DEFAULT NULL
  COMMENT '涨跌额',
  `shake_rate`        DECIMAL(18, 4) DEFAULT NULL
  COMMENT '涨跌幅',
  `turn_rate`         DECIMAL(18, 4) DEFAULT NULL
  COMMENT '转手率',
  `trade_quote`       DECIMAL(24, 4) DEFAULT NULL
  COMMENT '成交量',
  `trade_amount`      DECIMAL(24, 4) DEFAULT NULL
  COMMENT '成交金额',
  PRIMARY KEY (`analyse_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '股票分析统计';

