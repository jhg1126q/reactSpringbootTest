package com.react.test.web;

import com.react.test.dto.TemplateDto;
import com.react.test.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class BoardRestController {

    private final BoardService boardService;

    public BoardRestController(BoardService bs) {
        this.boardService = bs;
    }

    @GetMapping("/findAllBoardList")
    public ResponseEntity<List<TemplateDto>> findAllBoardList() {
        List<TemplateDto> resultList = boardService.findAllBoardList();
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @GetMapping("/findBoardById/{id}")
    public ResponseEntity<TemplateDto> findBoardById(@PathVariable("id") Integer id) {
        TemplateDto result = boardService.findBoardById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/insertBoard")
    public ResponseEntity<Integer> insertBoard(@Valid @RequestBody TemplateDto templateDto) {
        Integer result = boardService.insertBoard(templateDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/updateBoard")
    public ResponseEntity<Integer> updateBoard(@Valid @RequestBody TemplateDto templateDto) {
        Integer result = boardService.updateBoard(templateDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("/deleteBoard")
    public ResponseEntity<Integer> deleteBoard(@Valid @RequestBody TemplateDto templateDto) {
        Integer result = boardService.deleteBoardById(templateDto.getId());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
