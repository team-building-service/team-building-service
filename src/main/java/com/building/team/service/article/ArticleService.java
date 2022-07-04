package com.building.team.service.article;

import java.util.List;

import com.building.team.dto.article.ArticleDTO;
import com.building.team.dto.board.BoardDTO;

public interface ArticleService {
	// Read Artilce list with Paging method
	long getArticleCount(String board_subject) throws Exception;
	
	List<ArticleDTO> getArticleListPage(String board_subject,long pg) throws Exception;

	// get detail of Article
	ArticleDTO getDetail(long article_id) throws Exception;

	void insertArticle(ArticleDTO articleDTO) throws Exception;

	void deleteArticle(ArticleDTO articleDTO) throws Exception;

	void updateArticle(ArticleDTO articleDTO) throws Exception;


}