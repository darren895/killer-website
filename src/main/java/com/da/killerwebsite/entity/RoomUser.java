package com.da.killerwebsite.entity;

import javax.persistence.*;

@Entity
@Table(name = "room_user")
public class RoomUser {

    @Id
    private String userId;

    @ManyToOne(cascade= CascadeType.REMOVE)
    @JoinColumn(name = "room_id")
    private Room room;

}
