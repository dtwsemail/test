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
  COMMENT '最di价',
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
  `trade_amount`    DECIMAL(18, 6) DEFAULT NULL
  COMMENT '成交金额',
  `total_amount`    DECIMAL(18, 6) DEFAULT NULL
  COMMENT '总市值',
  `unfrozen_amount` DECIMAL(18, 6) DEFAULT NULL
  COMMENT '流通市值',
  `trade_number` DECIMAL(18, 6) DEFAULT NULL
  COMMENT '成交number',
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `order_id_uindex` (`order_id`)
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


