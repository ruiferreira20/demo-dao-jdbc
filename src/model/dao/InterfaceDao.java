package model.dao;

import java.util.List;

import model.entities.Department;

public interface InterfaceDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Department obj);
	Department findById(Integer id);
	List<Department> findAll();
	
}
