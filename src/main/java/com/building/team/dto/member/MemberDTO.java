package com.building.team.dto.member;
import lombok.Data;

@Data
public class MemberDTO {

	private long member_id;
	private long kakao_id;
	private String email;
	private String nickname;

}
