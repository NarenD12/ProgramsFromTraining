package com.infinite.VizagMunicipalCorp.service;
import java.util.List;

//Service interface for necessary methods
import com.infinite.VizagMunicipalCorp.model.User;

public interface IUserService {

	public void registerUser(User user);
	
	public List<String> loginUser(User user);
}
