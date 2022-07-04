package com.building.team.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.building.team.dto.member.MemberDTO;
import com.building.team.mapper.member.MemberMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public void insertMember(MemberDTO memberDTO) throws Exception {
		memberMapper.insertMember(memberDTO);
	}

}