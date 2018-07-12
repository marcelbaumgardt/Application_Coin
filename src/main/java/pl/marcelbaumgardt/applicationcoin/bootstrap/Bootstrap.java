package pl.marcelbaumgardt.applicationcoin.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.marcelbaumgardt.applicationcoin.model.User;
import pl.marcelbaumgardt.applicationcoin.repository.UserRepository;

@Component
public class Bootstrap implements CommandLineRunner {

    UserRepository userRepository;

    @Autowired
    public Bootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadUser();
    }

    private void loadUser() {
        userRepository.save(User.builder()
                .email("marcelidt1994@gmail.com")
                .username("cosmo123")
                .password("cosmo123")
                .firstName("marcel")
                .lastName("baumgardt")
                .build());
        userRepository.save(User.builder()
                .email("ankawu1994@gmail.com")
                .username("anka123")
                .password("anka123")
                .firstName("anna")
                .lastName("wisniewska")
                .build());
    }
}
