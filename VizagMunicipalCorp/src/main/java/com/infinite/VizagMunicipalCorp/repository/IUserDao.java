package com.infinite.VizagMunicipalCorp.repository;
import java.util.List;

//Interface to declare necessary methods
import com.infinite.VizagMunicipalCorp.model.User;

public interface IUserDao {

	public void registerUser(User user);
	
	public List<String> loginUser(User user);
}
