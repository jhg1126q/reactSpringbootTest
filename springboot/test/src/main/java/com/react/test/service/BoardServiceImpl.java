package com.react.test.service;

import com.react.test.dto.TemplateDto;
import com.react.test.mapper.TemplateMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.compiler.Javac;
import org.apache.ibatis.session.SqlSession;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final SqlSession sqlSession;
    private final TemplateMapper templateMapper;

    @Override
    public List<TemplateDto> findAllBoardList() {
//        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return templateMapper.selectTempList();
    }

    @Override
    public TemplateDto findBoardById(Integer boardId) {
//        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return templateMapper.selectTempById(boardId);
    }

    @Override
    @Transactional
    public int insertBoard(TemplateDto boardDto) {
//        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return templateMapper.insertTemp(boardDto);
    }

    @Override
    @Transactional
    public int updateBoard(TemplateDto boardDto) {
//        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return templateMapper.updateTemp(boardDto);
    }

    @Override
    @Transactional
    public int deleteBoardById(Integer boardId) {
//        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return templateMapper.deleteTempById(boardId);
    }
}
