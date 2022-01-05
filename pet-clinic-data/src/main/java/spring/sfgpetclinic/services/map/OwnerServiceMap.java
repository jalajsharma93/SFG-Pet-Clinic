package spring.sfgpetclinic.services.map;

import spring.sfgpetclinic.model.Owner;
import spring.sfgpetclinic.services.CurdService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements CurdService<Owner, Long>{
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
