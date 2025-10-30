package net.siham.knowmycv.services;

import net.siham.knowmycv.dtos.CVDTO;
import net.siham.knowmycv.entities.CV;
import net.siham.knowmycv.mappers.CVMapperImpl;
import net.siham.knowmycv.repositories.CVRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CVServiceImpl implements CVService{

    private final CVRepository cvRepository;
    private final CVMapperImpl cvMapper;

    public CVServiceImpl (CVRepository cvRepository, CVMapperImpl cvMapper) {
        this.cvRepository = cvRepository;
        this.cvMapper = cvMapper;
    }

    @Override
    public CVDTO createCV(CVDTO CVDTO) {
      CV cv =  cvMapper.fromCVDTOToCV(CVDTO);
       CV savedCv = cvRepository.save(cv);
       return cvMapper.fromCVToCVDTO(savedCv);
    }

    @Override
    public String uploadCV() {
        return "";
    }

    @Override
    public void deleteCV(Long id) {
        cvRepository.deleteById(id);
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
