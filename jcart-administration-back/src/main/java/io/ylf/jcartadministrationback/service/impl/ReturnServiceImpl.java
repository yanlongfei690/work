package io.ylf.jcartadministrationback.service.impl;

import io.ylf.jcartadministrationback.dao.ReturnMapper;
import io.ylf.jcartadministrationback.po.Return;
import io.ylf.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {


    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Integer create(Return ireturn) {

        returnMapper.insertSelective(ireturn);
        Integer returnId = ireturn.getReturnId();
        return returnId;
    }
}
