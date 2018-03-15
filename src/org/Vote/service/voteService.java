package org.Vote.service;

import java.util.List;

import org.Vote.pojo.Subject;

public interface voteService {
	/**
	 * 发起投票
	 * @param subject
	 */
	public void faqitoupiao(Subject subject);
	/**
	 * 查询所有投票
	 * @return
	 */
	public List<Subject> selectSubjects();
}
