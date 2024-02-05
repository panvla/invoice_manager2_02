package com.vladimirpandurov.invoice_manager2_02.service.implementation;

import com.vladimirpandurov.invoice_manager2_02.domain.Role;
import com.vladimirpandurov.invoice_manager2_02.domain.User;
import com.vladimirpandurov.invoice_manager2_02.dto.UserDTO;
import com.vladimirpandurov.invoice_manager2_02.dtomapper.UserDTOMapper;
import com.vladimirpandurov.invoice_manager2_02.repository.RoleRepository;
import com.vladimirpandurov.invoice_manager2_02.repository.UserRepository;
import com.vladimirpandurov.invoice_manager2_02.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.vladimirpandurov.invoice_manager2_02.dtomapper.UserDTOMapper.fromUser;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository<User> userRepository;
    private final RoleRepository<Role> roleRepository;

    @Override
    public UserDTO createUser(User user) {
        return mapToUserDTO(userRepository.create(user));
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return mapToUserDTO(userRepository.getUserByEmail(email));
    }

    @Override
    public void sendVerificationCode(UserDTO userDTO) {
        this.userRepository.sendVerificationCode(userDTO);
    }

    @Override
    public UserDTO verifyCode(String email, String code) {
        return mapToUserDTO(userRepository.verifyCode(email, code));
    }

    private UserDTO mapToUserDTO (User user){
        return fromUser(user, roleRepository.getRoleByUserId(user.getId()));
    }
}
