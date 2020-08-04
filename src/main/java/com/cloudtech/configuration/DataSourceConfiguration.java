package com.cloudtech.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {
    @Bean
    @Primary
    public DynamicDataSource dataSource(
            @Value("${spring.datasource.djej.url}") String djej_primaryUrl,
            @Value("${spring.datasource.djej.username}") String djej_primaryUsername,
            @Value("${spring.datasource.djej.password}") String djej_primaryPassword,
            @Value("${spring.datasource.test.url}") String test_primaryUrl,
            @Value("${spring.datasource.test.username}") String test_primaryUsername,
            @Value("${spring.datasource.test.password}") String test_primaryPassword) {

        //数据源-1
        DruidDataSource djej_primaryDataSource = getDruidDataSource();
        djej_primaryDataSource.setUrl(djej_primaryUrl);
        djej_primaryDataSource.setUsername(djej_primaryUsername);
        djej_primaryDataSource.setPassword(djej_primaryPassword);


        //数据源-2
        DruidDataSource test_primaryDataSource = getDruidDataSource();
        test_primaryDataSource.setUrl(test_primaryUrl);
        test_primaryDataSource.setUsername(test_primaryUsername);
        test_primaryDataSource.setPassword(test_primaryPassword);


        Map<Object, Object> mapDataSources = new HashMap<>();
        mapDataSources.put(DatabaseType.hs_djej, djej_primaryDataSource);
        mapDataSources.put(DatabaseType.test_02, test_primaryDataSource);

        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(mapDataSources);
        //设置默认的数据源
        dataSource.setDefaultTargetDataSource(djej_primaryDataSource);
        return dataSource;
    }

    //配置事务管理器
    @Bean("txManager")
    public DataSourceTransactionManager transactionManager(DynamicDataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }


    @Value("${spring.datasource.initialSize}")
    private Integer initialSize;

    @Value("${spring.datasource.minIdle}")
    private Integer minIdle;

    @Value("${spring.datasource.maxActive}")
    private Integer maxActive;

    @Value("${spring.datasource.maxWait}")
    private Integer maxWait;

    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    private Long timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    private Long minEvictableIdleTimeMillis;

    @Value("${spring.datasource.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.testWhileIdle}")
    private Boolean testWhileIdle;

    @Value("${spring.datasource.testOnBorrow}")
    private Boolean testOnBorrow;

    @Value("${spring.datasource.testOnReturn}")
    private Boolean testOnReturn;

    @Value("${spring.datasource.poolPreparedStatements}")
    private Boolean poolPreparedStatements;

    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private Integer maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.filters}")
    private String filters;

    @Value("${spring.datasource.connectionProperties}")
    private String connectionProperties;

    @Value("${spring.datasource.useGlobalDataSourceStat}")
    private Boolean useGlobalDataSourceStat;

    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    private DruidDataSource getDruidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setInitialSize(initialSize);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setMaxWait(maxWait);
        druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        druidDataSource.setValidationQuery(validationQuery);
        druidDataSource.setTestWhileIdle(testWhileIdle);
        druidDataSource.setTestOnBorrow(testOnBorrow);
        druidDataSource.setTestOnReturn(testOnReturn);
        druidDataSource.setPoolPreparedStatements(poolPreparedStatements);
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            druidDataSource.setFilters(filters);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        druidDataSource.setConnectionProperties(connectionProperties);
        druidDataSource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);
        druidDataSource.setDriverClassName(driverClassName);
        return druidDataSource;
    }
}

