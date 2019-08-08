package atoll.springframework.sfgpetclinic.services.map;

import atoll.springframework.sfgpetclinic.model.Specialty;
import atoll.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Specialty,Long> implements SpecialityService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findByID(Long id) {
        return  super.findByID(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
