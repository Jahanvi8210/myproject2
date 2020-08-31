package com.niit.ActivityStreamBackend.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.ActivityStreamBackend.dao.WorkspaceDao;
import com.niit.ActivityStreamBackend.model.Workspace;

@Repository(value="workspaceDao")
@Component
@Transactional

public class WorkspaceDaoImpl implements WorkspaceDao{
	 @Autowired  
	    private SessionFactory sessionFactory;  

	public boolean createWorkspace(Workspace workspace) {
		 boolean status=false;  
	        try {  
	            sessionFactory.getCurrentSession().save(workspace);  
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status;  
	}

	public List<Workspace> getWorkspaceByemailId(String emailId) {
		return (List<Workspace>) sessionFactory.getCurrentSession().get(Workspace.class, emailId);
	}

	@Override
	public boolean sendWorkspace(Workspace workspace) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Workspace> getWorskpace(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Workspace> getWorkspaceByAdminEmailId(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
