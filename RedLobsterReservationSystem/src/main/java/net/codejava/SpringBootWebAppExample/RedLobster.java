package net.codejava.SpringBootWebAppExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//imported this to access other package
import net.codejava.SpringBootWebAppExample.subpack.Guests;

@SpringBootApplication
public class RedLobster implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RedLobster.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM reservations";
		List<Guests> guest = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Guests.class));

		guest.forEach(System.out::println);

	}

}
