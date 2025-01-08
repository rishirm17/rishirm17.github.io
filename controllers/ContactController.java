
public class ContactController {
    import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @PostMapping("/api/contact")
    public ResponseEntity<String> handleContactForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        // Handle the form data, e.g., save to the database or send an email
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

        return ResponseEntity.ok("Your message has been received!");
    }
}
}
