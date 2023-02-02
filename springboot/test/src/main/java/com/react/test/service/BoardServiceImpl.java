package com.react.test.service;

import com.react.test.dto.TemplateDto;
import com.react.test.mapper.TemplateMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.compiler.Javac;
import org.apache.ibatis.session.SqlSession;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    private final SqlSession sqlSession;

    public BoardServiceImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<TemplateDto> findAllBoardList() {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.selectTempList();
    }

    @Override
    public TemplateDto findBoardById(Integer boardId) {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.selectTempById(boardId);
    }

    @Override
    public int insertBoard(TemplateDto boardDto) {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.insertTemp(boardDto);
    }

    @Override
    public int updateBoard(TemplateDto boardDto) {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.updateTemp(boardDto);
    }

    @Override
    public int deleteBoardById(Integer boardId) {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.deleteTempById(boardId);
    }
}
