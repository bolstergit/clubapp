package com.bolster.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolster.dao.ClubDao;
import com.bolster.model.Club;

@Service("clubService")
@Transactional
public class ClubService {

	@Autowired
	ClubDao clubDao;
	
	public List<Club> getAllClubInfo(){
		
		List<Club> clubs = clubDao.getClubs();
		
		return clubs;
	}
	
	public void addClub(Club club){
		clubDao.addClub(club);
	}
}
