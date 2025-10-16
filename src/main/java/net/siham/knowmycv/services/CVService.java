package net.siham.knowmycv.services;

import net.siham.knowmycv.entities.CV;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CVService {
/* upload un cv , remplire le formulaire du cv , modifier le cv , supprimer le cv
* afficher tout les cvs, afficher le cv par l'id, chercher le cv par le nom*/
     CV createCV (CV cv);
     String uploadCV();
     void deleteCV(Long id);
     CV updateCV(Long id, CV cv );
     List<CV> GetAllCVs();
     CV getCVById(Long deleteId);
     List<CV> searchCVBySkill(String skillName);

}
