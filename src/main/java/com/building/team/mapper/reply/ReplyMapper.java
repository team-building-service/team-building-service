package com.building.team.mapper.reply;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.building.team.dto.reply.ReplyDTO;

public interface ReplyMapper {

	List<ReplyDTO> getReplyList(@Param("article_id") long article_id) throws SQLException;
	
	void insertReply(ReplyDTO replyDTO) throws SQLException;
	
	int deleteReply(ReplyDTO replyDTO) throws SQLException;
	
	void deleteReply_transaction(ReplyDTO replyDTO) throws SQLException;

	void selectReply(ReplyDTO replyDTO) throws SQLException;

}