package com.building.team.service.board;

import java.util.ArrayList;
import java.util.List;

import com.building.team.dto.article.ArticleDTO;
import com.building.team.dto.board.BoardDTO;

public interface BoardService {

	ArrayList<BoardDTO> getBoardList() throws Exception;

	void insertBoard(BoardDTO boardDTO) throws Exception;

	void deleteBoard(BoardDTO boardDTO) throws Exception;

}