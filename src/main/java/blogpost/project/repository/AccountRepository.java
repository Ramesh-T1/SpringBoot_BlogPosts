package blogpost.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import blogpost.project.models.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
