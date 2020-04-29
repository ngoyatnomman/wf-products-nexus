package com.shy.service;

import com.shy.mapper.QualitiesMapper;
import com.shy.vo.Qualities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 质检一方
 * */
@Service
@Transactional
public class QualitiesServiceImpl implements QualitiesService{

    private QualitiesMapper qualitiesMapper;

    @Autowired
    public QualitiesServiceImpl(QualitiesMapper qualitiesMapper) {
        this.qualitiesMapper = qualitiesMapper;
    }

    @Override
    public int editQualities(Qualities qualities){
        return qualitiesMapper.editQualities(qualities);
    }

}
