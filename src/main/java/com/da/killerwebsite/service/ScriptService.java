package com.da.killerwebsite.service;

import com.da.killerwebsite.entity.Script;
import com.da.killerwebsite.repository.ScriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScriptService {

    @Autowired
    private ScriptRepository scriptRepository;

    public Page<Script> findScript(int page, int pageSize){
        PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.DESC, "id"));
        return scriptRepository.findAll(pageRequest);
    }

    public Script findScript(Integer id){
        return scriptRepository.getOne(id);
    }

}
