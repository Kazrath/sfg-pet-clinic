package atoll.springframework.sfgpetclinic.services.map;

import atoll.springframework.sfgpetclinic.model.PetType;
import atoll.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }



}
