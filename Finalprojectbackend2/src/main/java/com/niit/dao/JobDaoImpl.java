package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Job;

@Repository
@Transactional
public class JobDaoImpl implements JobDao {
	@Autowired
private SessionFactory sessionFactory;
	public void addJob(Job job) {
		System.out.println("DAO -- addJob");
		Session session=sessionFactory.getCurrentSession();
		session.save(job);//insert a row in Job table

	}
	public List<Job> getAllJobs() {
	  Session session=sessionFactory.getCurrentSession();
	  Query query=session.createQuery("from Job");
	  List<Job> jobs=query.list();
	  return jobs;
	}
}
