package com.da.killerwebsite.controller;

import com.da.killerwebsite.entity.Room;
import com.da.killerwebsite.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/room/{id}")
    public Room getRoom(@PathVariable("id") long id){
        return roomService.getRoom(id);
    }
}
