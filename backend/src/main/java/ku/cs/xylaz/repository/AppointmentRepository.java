package ku.cs.xylaz.repository;

import ku.cs.xylaz.entity.Appointment;
import ku.cs.xylaz.entity.Barber;
import ku.cs.xylaz.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {
    List<Appointment> findByMember(Member member); // เปลี่ยนเป็น List<Appointment>
    List<Appointment> findByBarberAndAppointmentDate(Barber barber, String appointmentDate);

}

