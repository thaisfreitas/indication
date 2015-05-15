package indication;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IndicationController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/indication")
    public Indication indication(@RequestParam(value="name", defaultValue="World") String name) {
        return new Indication(counter.incrementAndGet(),
                String.format(template, name));
    }

}