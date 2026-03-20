package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController


public class holaController {
    @GetMapping("/hola")
    public String holaMundo()  {
        return"Hola!";
    }

@PostMapping("/chao")
    public String chaoMundo()  {

        return"Hola!";

    }
}
