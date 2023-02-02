package com.react.test.mapper;

import com.react.test.dto.TemplateDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateMapper {
    List<TemplateDto> selectTempList();

    TemplateDto selectTempById(Integer templateId);

    int insertTemp(TemplateDto templateDto);

    int updateTemp(TemplateDto templateDto);

    int deleteTempById(Integer templateId);

}
