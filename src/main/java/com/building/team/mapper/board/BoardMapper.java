package com.building.team.mapper.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.building.team.dto.board.BoardDTO;

public interface BoardMapper {

	ArrayList<BoardDTO> getBoardList() throws SQLException;

	void insertBoard(BoardDTO boardDTO) throws SQLException;

	void deleteBoard(BoardDTO boardDTO) throws SQLException;

}