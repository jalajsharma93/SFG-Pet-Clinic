package spring.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.sfgpetclinic.model.Owner;
import spring.sfgpetclinic.model.Vet;
import spring.sfgpetclinic.services.OwnerService;
import spring.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Atul");
        owner1.setLastName("Avijeet");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Chintan");
        owner2.setLastName("Modi");

        ownerService.save(owner2);

        System.out.println("..............Loaded Owners...............");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("Ganesh");
        vet1.setLastName(" Bhai");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2l);
        vet2.setFirstName("Alish");
        vet2.setLastName(" Bhai");

        vetService.save(vet2);
        System.out.println("..............Loaded Vets...............");

    }
}
