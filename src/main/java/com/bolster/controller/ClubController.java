package com.bolster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bolster.model.Club;
import com.bolster.service.ClubService;

@RestController
public class ClubController {

	@Autowired
	ClubService clubService;
	
	@RequestMapping(value = "/club/", method = RequestMethod.GET)
	public ResponseEntity<List<Club>> getAllClubInfo(){
		List<Club> clubs = clubService.getAllClubInfo();
		
		if(clubs.isEmpty()){
			return new ResponseEntity<List<Club>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Club>>(clubs, HttpStatus.OK);
	}
	
	@RequestMapping(value="/club/", method = RequestMethod.POST)
	public ResponseEntity<Void> addClub(@RequestBody Club club, UriComponentsBuilder ucBuilder){
		
		System.out.println("####### ClubName:"+club.getClubName());
		System.out.println("####### Club Street Name:"+club.getAddress().getStreetName());
		clubService.addClub(club);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/club/{id}").buildAndExpand(club.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
}
