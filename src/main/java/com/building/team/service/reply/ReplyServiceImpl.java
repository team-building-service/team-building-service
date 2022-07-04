package com.building.team.service.reply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.building.team.dto.article.ArticleDTO;
import com.building.team.dto.reply.ReplyDTO;
import com.building.team.mapper.reply.ReplyMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyMapper replyMapper;

	@Override
	public List<ReplyDTO> getReplyList(long article_id) throws Exception {

		log.info(article_id);

		return replyMapper.getReplyList(article_id);
	}

	@Override
	public void insertReply(ReplyDTO replyDTO) throws Exception {
		replyMapper.insertReply(replyDTO);
	}

	@Override
	public void deleteReply(ReplyDTO replyDTO) throws Exception {
		replyMapper.deleteReply(replyDTO);
	}

	@Override
	public void deleteReply_transaction(ReplyDTO replyDTO) throws Exception {
		replyMapper.deleteReply_transaction(replyDTO);
	}

	@Override
	public void selectReply(ReplyDTO replyDTO) throws Exception {
		replyMapper.selectReply(replyDTO);
	}
}