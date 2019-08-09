package atoll.springframework.sfgpetclinic.services.map;

import atoll.springframework.sfgpetclinic.model.Visit;
import atoll.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {

        if(object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null || object.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(object);
    }

    @Override
    public Visit findByID(Long id) {
        return super.findByID(id);
    }
}
