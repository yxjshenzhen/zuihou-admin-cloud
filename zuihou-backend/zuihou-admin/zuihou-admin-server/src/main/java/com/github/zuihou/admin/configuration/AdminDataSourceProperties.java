package com.github.zuihou.admin.configuration;

/**
 * @author tyh
 * @createTime 2018-01-25 22:48
 */

import com.github.zuihou.core.spring.autoconfigure.datasource.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 读取yml配置的信息
 * @author tyh
 */
@ConfigurationProperties(
        prefix = "zuihou.mysql.admin"
)
public class AdminDataSourceProperties extends DataSourceProperties {

}
