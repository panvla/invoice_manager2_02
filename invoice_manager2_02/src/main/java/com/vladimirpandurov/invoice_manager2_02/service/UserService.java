package com.vladimirpandurov.invoice_manager2_02.service;

import com.vladimirpandurov.invoice_manager2_02.domain.User;
import com.vladimirpandurov.invoice_manager2_02.dto.UserDTO;

public interface UserService {

    UserDTO createUser(User user);

}
