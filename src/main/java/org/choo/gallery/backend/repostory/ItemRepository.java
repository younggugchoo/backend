package org.choo.gallery.backend.repostory;

import org.choo.gallery.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
