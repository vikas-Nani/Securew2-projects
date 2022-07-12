package com.vikas.task.service;

import java.util.List;


import com.vikas.task.model.Organizationmodel;

public interface Organizationservice {

	List<Organizationmodel> getallorg();
	void saveorg(Organizationmodel org);
	void updateorg(Organizationmodel org,Long id);
	void deleteorg(Long id);
	Organizationmodel getbyid(Long id);
}
