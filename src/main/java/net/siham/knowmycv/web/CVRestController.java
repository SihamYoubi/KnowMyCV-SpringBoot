package net.siham.knowmycv.web;

import net.siham.knowmycv.entities.CV;
import net.siham.knowmycv.services.CVService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CVRestController {
    private final CVService cvService;

    public CVRestController(CVService cvService) {
        this.cvService = cvService;
    }

    @PostMapping("/create")
    public CV createCV(@RequestBody CV cv){
        CV CreatedCV = cvService.createCV(cv);
        return CreatedCV;
    }

}
