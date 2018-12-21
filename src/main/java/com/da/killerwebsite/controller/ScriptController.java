package com.da.killerwebsite.controller;

import com.da.killerwebsite.dto.PageRequestDTO;
import com.da.killerwebsite.entity.Script;
import com.da.killerwebsite.service.ScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/script")
public class ScriptController {

    @Autowired
    private ScriptService scriptService;

    @PostMapping("")
    public Page<Script> scriptList(@Valid @RequestBody PageRequestDTO param){
        return scriptService.findScript(param.getPage(), param.getPageSize());
    }

    @PostMapping("{id}")
    public Script script(@PathVariable("id") Integer id){
        return scriptService.findScript(id);
    }
}
