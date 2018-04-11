package com.da.killerwebsite.service;

import com.da.killerwebsite.entity.Script;
import com.da.killerwebsite.repository.ScriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScriptService {

    @Autowired
    private ScriptRepository scriptRepository;

    public List<Script> findScript(int num){
        return scriptRepository.findAll(Sort.by("id"));
    }
}
