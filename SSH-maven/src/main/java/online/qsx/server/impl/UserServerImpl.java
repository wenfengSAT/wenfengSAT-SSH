package online.qsx.server.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.qsx.dao.BaseDAO;
import online.qsx.dao.impl.UserDaoImpl;
import online.qsx.model.UserModel;

@Service
public class UserServerImpl {

	@Autowired
	private UserDaoImpl userDaoImpl;
	
	@Resource
	private BaseDAO<UserModel> baseDAO;

	public List<UserModel> getUsers() {
		//return userDaoImpl.getUsers();
		return baseDAO.find("from UserModel");
	}

	public void deleteUserModel(UserModel userModel) {
		userDaoImpl.deleteUserModel(userModel);
	}

	public UserModel getUser(UserModel userModel) {
		return userDaoImpl.getUser(userModel);
	}

	public void edit(UserModel userModel) {
		userDaoImpl.edit(userModel);
	}
	
}
