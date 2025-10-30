package net.siham.knowmycv.web;

import net.siham.knowmycv.dtos.CVDTO;
import net.siham.knowmycv.mappers.CVMapperImpl;
import net.siham.knowmycv.services.CVService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CVRestController {
    private final CVService cvService;
    private CVMapperImpl cvMapper;

    public CVRestController(CVService cvService) {
        this.cvService = cvService;
    }

    @PostMapping("/create")
    public CVDTO createCV(@RequestBody CVDTO CVDTO){
        return cvService.createCV(CVDTO);
    }
   /* @PostMapping("/create")
    public ResponseEntity<String> createCV(@Valid @RequestBody CVRequestDTO cvRequestDTO) {
        // ici vous pouvez sauvegarder le CV
        return ResponseEntity.ok("CV créé avec succès");
    }*/

    @DeleteMapping("/delete")
    public void deleteCV(Long id){
         cvService.deleteCV(id);
    }
}
