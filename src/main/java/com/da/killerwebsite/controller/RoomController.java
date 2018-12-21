package com.da.killerwebsite.controller;

import com.da.killerwebsite.dto.CreateRoomDTO;
import com.da.killerwebsite.entity.Room;
import com.da.killerwebsite.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("{id}")
    public Room getRoom(@PathVariable("id") long id){
        return roomService.getRoom(id);
    }

    @PostMapping("")
    public Room createRoom(@RequestBody CreateRoomDTO req){
       Room room =  this.roomService.createRoom(req);
       return room;
    }
}
