package spring.sfgpetclinic.services;

import spring.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CurdService<Owner, Long> {
    Owner findByLastName(String lastName);
}
