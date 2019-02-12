package com.ecsdemo.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;
import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.w3c.dom.ranges.RangeException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.ecsdemo")
@PropertySource({"classpath:connection-config.properties"})
public class ECSConfig implements WebMvcConfigurer {
	
	@Autowired
	private Environment  env;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	//creating Datasource for hibernate connection ............
	@Bean
	public DataSource dataSource() {
		
		//creating connection pool
		ComboPooledDataSource myDataSource = new ComboPooledDataSource();
		try {
			myDataSource.setDriverClass("com.mysql.jdbc.Driver");
		}
		catch(PropertyVetoException ex) {
			throw new RuntimeException(ex);
		}
		
		logger.info("JDBC:url"+env.getProperty("JDBC.Url"));
		logger.info("JDBC:User"+env.getProperty("JDBC.User"));
		
		//JDBC connection
		myDataSource.setJdbcUrl(env.getProperty("JDBC.Url"));
		myDataSource.setUser(env.getProperty("JDBC.User"));
		myDataSource.setPassword(env.getProperty("JDBC.Password"));
		// set connection pool props
		myDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
		myDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
		myDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));		
		myDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));

		return myDataSource;
	}
	
	private Properties getHibernateProperties() {
		
		Properties pro = new Properties();
		pro.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		pro.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));

		return pro;
	}
	
	// read environment property and convert to int
	
		private int getIntProperty(String propName) {
			
			String propVal = env.getProperty(propName);
			
			// now convert to int
			int intPropVal = Integer.parseInt(propVal);
			
			return intPropVal;
		}	
		
		@Bean
		public LocalSessionFactoryBean sessionFactory(){
			LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			
			sessionFactory.setDataSource(dataSource());
			sessionFactory.setPackagesToScan(env.getProperty("hibernate.packagesToScan"));
			sessionFactory.setHibernateProperties(getHibernateProperties());
			
			return sessionFactory;
		}
		
		@Bean
		@Autowired
		public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
			
			HibernateTransactionManager txManager = new HibernateTransactionManager();
			txManager.setSessionFactory(sessionFactory);

			return txManager;
		}	

}