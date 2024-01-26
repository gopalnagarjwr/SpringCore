package spring.Jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import spring.Jdbc.Entity.Emp;

public class EmpDaoImpl implements EmpDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int getInsert(Emp em) {

		String query = "insert into Emp (id,name,city)values(?,?,?)";
		int r = this.jdbcTemplate.update(query, em.getId(), em.getName(), em.getCity());
		return r;
	}

	@Override
	public int getUpdate(Emp em) {
		String query = "update Emp set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query, em.getName(), em.getCity(), em.getId());
		return r;
	}

	@Override
	public int getDelete(int id) {
		String query = "delete from Emp where id=?";
		int r = this.jdbcTemplate.update(query, id);
		return r;
	}

	@Override
	public Emp getData(int id) {
		String query = "select*from Emp where id=?";
		RowMapper<Emp> rowmapper = new RowMaperImpl();
		Emp em = this.jdbcTemplate.queryForObject(query, rowmapper, id);
		return em;
	}

	@Override
	public List<Emp> getAllData() {
		String Query = "select * from Emp";
		List<Emp> emp = this.jdbcTemplate.query(Query, new RowMaperImpl());
		return emp;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
