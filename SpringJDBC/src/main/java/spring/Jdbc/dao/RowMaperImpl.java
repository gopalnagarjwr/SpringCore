package spring.Jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spring.Jdbc.Entity.Emp;

public class RowMaperImpl implements RowMapper<Emp> {

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emp em = new Emp();
		em.setId(rs.getInt(1));
		em.setName(rs.getString(2));
		em.setCity(rs.getString(3));

		return em;
	}

}
