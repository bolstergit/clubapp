package com.bolster.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bolster.model.Club;

@Repository("clubDao")
public class ClubDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void addClub(Club club){
		getSession().persist(club);
	}
	
	public List<Club> getClubs(){
		List<Club> clubs = getSession().createCriteria(Club.class).list();
		return clubs;
	}
}
