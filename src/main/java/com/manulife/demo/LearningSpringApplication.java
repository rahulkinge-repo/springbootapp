package com.manulife.demo;

import com.manulife.demo.data.entity.Guest;
import com.manulife.demo.data.entity.Reservation;
import com.manulife.demo.data.entity.Room;
import com.manulife.demo.data.repository.GuestRepository;
import com.manulife.demo.data.repository.ReservationRepository;
import com.manulife.demo.data.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringApplication.class, args);
    }

    @RestController
    @RequestMapping("/springdemo/rooms1")
    public class RoomController{
        @Autowired
        private RoomRepository roomRepository;

        @GetMapping
        public Iterable<Room> getRooms(){
            return this.roomRepository.findAll();
        }

    }

    @RestController
    @RequestMapping("/springdemo/guestsss")
    public class GuestController{
        @Autowired
        private GuestRepository guestRepository;

        @GetMapping
        public Iterable<Guest> getGuests(){return this.guestRepository.findAll();}
    }

    @RestController
    @RequestMapping("/springdemo/reservations")
    public class ReservationController{
        @Autowired
        private ReservationRepository reservationRepository;

        @GetMapping
        public Iterable<Reservation> getReservations(){return this.reservationRepository.findAll();}
    }

}
