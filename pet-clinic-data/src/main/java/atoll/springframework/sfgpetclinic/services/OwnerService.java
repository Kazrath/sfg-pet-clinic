package atoll.springframework.sfgpetclinic.services;

import atoll.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}