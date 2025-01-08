@Controller
public class PortfolioController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}

