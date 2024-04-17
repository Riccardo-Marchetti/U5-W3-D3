package riccardo.U5W3D3.Esercizio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W3D3Application.class, args);
		Info info = new Info();
		info.setNome("Aldo");
		info.setCognome("Baglio");
		info.setDataDiNascita(LocalDate.of(2000, 2, 12));

		InfoAdapter infoAdapter = new InfoAdapter(info);
		UserData userData = new UserData();
		userData.getData(infoAdapter);
	}

}
