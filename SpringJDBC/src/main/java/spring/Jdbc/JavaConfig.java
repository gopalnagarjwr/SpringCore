package spring.Jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import spring.Jdbc.dao.EmpDaoImpl;

@Configuration
public class JavaConfig {
	@Bean("ds")
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.cj.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/test");
		data.setUsername("root");
		data.setPassword("12345678");
		return data;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDriverManagerDataSource());
		return jdbcTemplate;
	}

	@Bean("empdao")
	public EmpDaoImpl getDao() {
		EmpDaoImpl edi = new EmpDaoImpl();
		edi.setJdbcTemplate(getTemplate());
		return edi;
	}
}
