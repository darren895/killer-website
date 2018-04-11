package com.da.killerwebsite.controller;

import com.da.killerwebsite.entity.Script;
import com.da.killerwebsite.service.ScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/script")
public class ScriptController {

    @Autowired
    private ScriptService scriptService;

    @GetMapping("")
    public List<Script> scriptList(){
        return scriptService.findScript(0);
    }
}
