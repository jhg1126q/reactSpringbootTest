package com.react.test.web;

import com.react.test.dto.TemplateDto;
import com.react.test.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BoardRestController {

    private final BoardService boardService;

    public BoardRestController(BoardService bs) {
        this.boardService = bs;
    }

    @GetMapping("/api/findAllBoardList")
    public ResponseEntity<List<TemplateDto>> findAllBoardList() {
        List<TemplateDto> resultList = boardService.findAllBoardList();
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @GetMapping("/api/selectTempById")
    public ResponseEntity<TemplateDto> findBoardById(@Validated @RequestBody TemplateDto templateDto) {
        TemplateDto result = boardService.findBoardById(templateDto.getId());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/api/insertBoard")
    public ResponseEntity<Integer> insertBoard(@Validated @RequestBody TemplateDto templateDto) {
        Integer result = boardService.insertBoard(templateDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/api/updateBoard")
    public ResponseEntity<Integer> updateBoard(@Validated @RequestBody TemplateDto templateDto) {
        Integer result = boardService.updateBoard(templateDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("/api/deleteBoard")
    public ResponseEntity<Integer> deleteBoard(@Validated @RequestBody TemplateDto templateDto) {
        Integer result = boardService.deleteBoardById(templateDto.getId());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
