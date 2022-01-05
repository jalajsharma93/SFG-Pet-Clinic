package spring.sfgpetclinic.services.map;

import com.amazonaws.services.dynamodbv2.xspec.L;
import spring.sfgpetclinic.model.Pet;
import spring.sfgpetclinic.services.CurdService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CurdService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
