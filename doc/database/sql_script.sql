-- trade order
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_id`        VARCHAR(32) NOT NULL
  COMMENT 'id',
  `trade_date`      DATE          DEFAULT NULL
  COMMENT '日期',
  `stock_id`        VARCHAR(32) NOT NULL
  COMMENT '股票代码',
  `end_price`       DECIMAL(7, 2) DEFAULT NULL
  COMMENT '收盘价',
  `top_price`       DECIMAL(7, 2) DEFAULT NULL
  COMMENT '最高价',
  `begin_price`     DECIMAL(7, 2) DEFAULT NULL
  COMMENT '开盘价',
  `previous_price`  DECIMAL(7, 2) DEFAULT NULL
  COMMENT '前收盘',
  `shake_price`     DECIMAL(7, 2) DEFAULT NULL
  COMMENT '涨跌额',
  `shake_rate`      INT(4)        DEFAULT NULL
  COMMENT '涨跌幅',
  `turn_rate`       DECIMAL(7, 2) DEFAULT NULL
  COMMENT '涨跌幅',
  `trade_quote`     BIGINT        DEFAULT NULL
  COMMENT '成交量',
  `trade_amount`    BIGINT        DEFAULT NULL
  COMMENT '成交金额',
  `total_amount`    BIGINT        DEFAULT NULL
  COMMENT '总市值',
  `unfrozen_amount` BIGINT        DEFAULT NULL
  COMMENT '流通市值',
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `order_id_uindex` (`order_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  COMMENT = 'order';


DROP TABLE IF EXISTS `stock_info`;
CREATE TABLE `stock_info` (
  `stock_id`   VARCHAR(32) NOT NULL
  COMMENT 'id',
  `stock_name` VARCHAR(64) NOT NULL
  COMMENT 'stock_name',
  PRIMARY KEY (`stock_id`),
  UNIQUE KEY `order_id_uindex` (`stock_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  COMMENT = 'stock_info';