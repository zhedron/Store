package zhedron.petproject.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zhedron.petproject.store.models.Store;

public interface StoreRepository extends JpaRepository<Store, Integer> {
}
