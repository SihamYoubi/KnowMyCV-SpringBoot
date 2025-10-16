package net.siham.knowmycv.services;

import net.siham.knowmycv.entities.CV;
import net.siham.knowmycv.repositories.CVRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CVServiceImpl implements CVService{

    private final CVRepository cvRepository;

    public CVServiceImpl (CVRepository cvRepository) {
        this.cvRepository = cvRepository;
    }
    @Override
    public CV createCV(CV cv) {
       return cvRepository.save(cv);
    }

    @Override
    public String uploadCV() {
        return "";
    }

    @Override
    public void deleteCV(Long id) {

    }

    @Override
    public CV updateCV(Long id, CV cv) {
        return null;
    }

    @Override
    public List<CV> GetAllCVs() {
        return List.of();
    }

    @Override
    public CV getCVById(Long deleteId) {
        return null;
    }

    @Override
    public List<CV> searchCVBySkill(String skillName) {
        return List.of();
    }
}
