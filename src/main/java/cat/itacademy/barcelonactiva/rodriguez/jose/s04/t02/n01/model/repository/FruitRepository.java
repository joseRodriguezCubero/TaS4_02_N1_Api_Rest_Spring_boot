package cat.itacademy.barcelonactiva.rodriguez.jose.s04.t02.n01.model.repository;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.rodriguez.jose.s04.t02.n01.model.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {
    List<Fruit> findByEatable(boolean eatable);

    List<Fruit> findAllByOrderById();


    Optional<Fruit> findByNameIgnoreCase (String name);

    List<Fruit> findByNameContainingIgnoreCaseOrderById(String name);
}