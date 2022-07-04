package com.building.team.mapper.member;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.building.team.dto.board.BoardDTO;
import com.building.team.dto.member.MemberDTO;

public interface MemberMapper {

	void insertMember(MemberDTO memberDTO) throws SQLException;

}