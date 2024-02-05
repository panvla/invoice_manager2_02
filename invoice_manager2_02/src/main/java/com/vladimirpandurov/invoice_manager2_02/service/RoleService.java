package com.vladimirpandurov.invoice_manager2_02.service;

import com.vladimirpandurov.invoice_manager2_02.domain.Role;

public interface RoleService {

    Role getRoleByUserId(Long userId);
}
