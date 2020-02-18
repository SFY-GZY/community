package life.tr.community.controller;

import life.tr.community.dto.FileDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileController {

    @RequestMapping("/file/upload")
    @ResponseBody
    private FileDTO upload(){
        FileDTO fileDTO = new FileDTO();
        fileDTO.setSuccess(1);
        fileDTO.setUrl("/image/1.jpg");
        return fileDTO;
    }
}
