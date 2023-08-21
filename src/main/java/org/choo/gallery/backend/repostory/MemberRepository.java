package org.choo.gallery.backend.repostory;

import org.choo.gallery.backend.entity.Item;
import org.choo.gallery.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByEmailAndPassword(String email, String password);
}
