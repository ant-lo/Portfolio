package net.codejava.SpringBootWebAppExample.subpack;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guests, Long> {

}
