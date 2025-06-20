package org.server.dao.repositories;

import org.server.dao.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsersRepository extends JpaRepository<User, UUID> {
    Optional<User> findUserByUsername(String username);

    Optional<User> findUserByCode (String code);
}
