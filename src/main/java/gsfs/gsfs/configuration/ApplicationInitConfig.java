package gsfs.gsfs.configuration;

import gsfs.gsfs.model.User;
import gsfs.gsfs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ApplicationInitConfig {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    ApplicationRunner applicationRunner(UserRepository userRepository) {
        return args -> {
            boolean adminExists = userRepository.findByAdmin();
            if (!adminExists) {
                var user = new User();
                user.setUsername("admin");
                user.setPassword(passwordEncoder.encode("admin"));
                userRepository.save(user);
            }
        };
    }
}
