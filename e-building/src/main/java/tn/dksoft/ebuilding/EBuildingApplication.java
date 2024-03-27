package tn.dksoft.ebuilding;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import tn.dksoft.ebuilding.business.*;
import tn.dksoft.ebuilding.dtos.*;
import tn.dksoft.ebuilding.entities.*;
import tn.dksoft.ebuilding.enums.Status;
import tn.dksoft.ebuilding.mappers.*;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class EBuildingApplication {

	public static void main(String[] args) {

		SpringApplication.run(EBuildingApplication.class, args);
	}
}
