package likelionlmsjpa.jpalms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeworkController {
    @RequestMapping("/*이 부분을 채워주세요*/")
    public String home(){
        return "/*이 부분을 채워주세요 */";
    }
}