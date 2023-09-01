package tn.dksoft.ebuilding;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import tn.dksoft.ebuilding.business.AddressService;
import tn.dksoft.ebuilding.business.CustomerService;
import tn.dksoft.ebuilding.business.ProviderService;
import tn.dksoft.ebuilding.dtos.AdressDto;
import tn.dksoft.ebuilding.dtos.CustomerDTO;
import tn.dksoft.ebuilding.dtos.ProviderDTO;
import tn.dksoft.ebuilding.entities.Customer;
import tn.dksoft.ebuilding.entities.Provider;
import tn.dksoft.ebuilding.entities.TAddress;
import tn.dksoft.ebuilding.entities.Tuser;

import java.util.stream.Stream;

@SpringBootApplication
public class EBuildingApplication {

	public static void main(String[] args) {

		SpringApplication.run(EBuildingApplication.class, args);
	}
@Bean
CommandLineRunner start(AddressService addressService, CustomerService customerService, ProviderService providerService) {
		return args -> {
			Stream.of("Tunisie", "France", "Italie")
					.forEach((name) -> {
						AdressDto c = new AdressDto();
						c.setCountry(name);
						try {
							addressService.create(c);
						} catch (Exception e) {
							throw new RuntimeException(e);
						}
					});
            addressService.deleteOne(1L);
			addressService.getAll().forEach(System.out::println);
			System.out.println(addressService.getOneById(new TAddress(),2L));
			AdressDto oneById = addressService.getOneById(new TAddress(),2L);
			oneById.setCountry("ALGERIE");
			oneById.setAddressLigne1("route wahran km 13");
			AdressDto update = addressService.update(oneById);
			System.out.println(update);
			Stream.of("Tunisie", "France", "Italie")
					.forEach((name) -> {
						CustomerDTO c = new CustomerDTO();
						ProviderDTO d= new ProviderDTO();
						c.setNameE(name);
						d.setNameE(name+" provider");
						try {
							customerService.create(c);
							providerService.create(d);
						} catch (Exception e) {
							throw new RuntimeException(e);
						}
					});
			customerService.deleteOne(53L);
			providerService.deleteOne(54L);
			customerService.getAll().forEach(System.out::println);
			providerService.getAll().forEach(System.out::println);
			System.out.println(customerService.getOneById(new Customer(),55L));
			System.out.println(providerService.getOneById(new Provider(),56L));
			CustomerDTO oneById2 = customerService.getOneById(new Customer(),55L);
			oneById2.setNameE("ALGERIE");
			oneById2.setEmailE("route wahran km 13");
			CustomerDTO update1 = customerService.update(oneById2);
			System.out.println(update1);
			ProviderDTO oneById1 = providerService.getOneById(new Provider(),56L);
			oneById1.setNameE("ALGERIE Provider");
			oneById1.setEmailE("route wahran km 13333333333");
			ProviderDTO update2 = providerService.update(oneById1);
			System.out.println(update2);
			ProviderDTO d1=new ProviderDTO();
			d1.setNameE("providerC");
			providerService.create(d1);
		};

	}
}
