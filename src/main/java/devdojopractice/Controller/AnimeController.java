package devdojopractice.Controller;


import devdojopractice.Entities.Anime;
import devdojopractice.util.DataUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("anime")
@Slf4j
@RequiredArgsConstructor
public class AnimeController {


    private final DataUtil dataUtil;

    @GetMapping(path = "/list")
    public List<Anime> listAll(){
        log.info("Date formatted {}", dataUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return Arrays.asList(new Anime("DBZ"), new Anime("Yu yu hakusho"));
    }

}
