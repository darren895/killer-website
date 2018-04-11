package com.da.killerwebsite.service;

import com.da.killerwebsite.entity.Room;
import com.da.killerwebsite.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public Room getRoom(Long id){
        return roomRepository.getOne(id);
    }
}
