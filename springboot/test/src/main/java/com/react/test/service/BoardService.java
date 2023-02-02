package com.react.test.service;

import com.react.test.dto.TemplateDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BoardService {

    List<TemplateDto> findAllBoardList();

    TemplateDto findBoardById(Integer boardId);

    int insertBoard(TemplateDto boardDto);

    int updateBoard(TemplateDto boardDto);

    int deleteBoardById(Integer boardId);
}
