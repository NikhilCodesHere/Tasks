package com.syntellect.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntellect.model.IplModel;
import com.syntellect.repository.IplRepo;

@Service
public class IplService {
	
	List <IplModel> iplModels=new ArrayList<>();
	@Autowired
	
	IplRepo iplrepo;
	
	public List<IplModel> getIplModel()
	{
		return iplrepo.findAll();
	}
	
	public void addIplModel(IplModel iplModel) {
		 iplModels.add(iplModel);
		iplrepo.saveAll(iplModels);
	}
	public IplModel updateIplModel(IplModel iplModel) {
		return iplrepo.save(iplModel);
	}
	
	public void deleteIplModel (Integer id) {
		iplrepo.deleteById(id);
	}

}
