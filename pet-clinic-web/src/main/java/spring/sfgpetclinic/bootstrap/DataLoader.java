package spring.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.sfgpetclinic.model.Owner;
import spring.sfgpetclinic.model.Vet;
import spring.sfgpetclinic.services.OwnerService;
import spring.sfgpetclinic.services.VetService;
import spring.sfgpetclinic.services.map.OwnerServiceMap;
import spring.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirsName("Atul");
        owner1.setLastName("Avijeet");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirsName("Chintan");
        owner2.setLastName("Modi");

        ownerService.save(owner2);

        System.out.println("..............Loaded Owners...............");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirsName("Ganesh");
        vet1.setLastName(" Bhai");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1l);
        vet2.setFirsName("Alish");
        vet2.setLastName(" Bhai");

        vetService.save(vet2);
        System.out.println("..............Loaded Vets...............");

    }
}
