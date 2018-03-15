package org.Vote.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.Vote.dao.OptionDao;
import org.Vote.dao.SubjectDao;
import org.Vote.pojo.Subject;
import org.Vote.service.voteService;
import org.springframework.stereotype.Service;

@Service("voteService")
public class voteServiceimpl implements voteService {

	@Resource
	private SubjectDao subjectDao;
	@Resource
	private OptionDao optionDao;
	
	
	
	public void setSubjectDao(SubjectDao subjectDao) {
		this.subjectDao = subjectDao;
	}

	public void setOptionDao(OptionDao optionDao) {
		this.optionDao = optionDao;
	}

	@Override
	public void faqitoupiao(Subject subject) {
		subjectDao.add(subject);
		optionDao.batchAdd(subject.getOptions());
	}

	@Override
	public List<Subject> selectSubjects() {
		return subjectDao.getAll();
	}

}
