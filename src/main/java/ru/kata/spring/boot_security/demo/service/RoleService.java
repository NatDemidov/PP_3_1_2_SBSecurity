package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Collection;

public interface RoleService {
    Collection<Role> listRoles();

    void addRole(Role role);

    void updateRole(Role role);

    void deleteRole(Role role);


}
