package com.col.service;

import com.col.data.entity.DataEntity;
import com.col.data.repository.DataRepository;
import com.col.web.dto.DataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhirayrg on 5/2/2017.
 */
@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataRepository dataRepository;


    @Override
    public void insertData(DataDto dataDto) {
        DataEntity data = new DataEntity();
        data.setArticleCategory(dataDto.getArticleCategory());
        data.setArticleTitle(dataDto.getArticleTitle());
        data.setEdid(dataDto.getEdid());
        data.setFbid(dataDto.getFbid());

        dataRepository.save(data);
    }
}
