package spring.Jdbc.dao;

import java.util.List;

import spring.Jdbc.Entity.Emp;

public interface EmpDao {
	public int getInsert(Emp em);

	public int getUpdate(Emp em);

	public int getDelete(int id);

	public Emp getData(int id);

	public List<Emp> getAllData();

}
