package cat.itacademy.barcelonactiva.rodriguez.jose.s04.t02.n01.model.repository;

import java.util.List;

import cat.itacademy.barcelonactiva.rodriguez.jose.s04.t02.n01.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IFruitRepository extends JpaRepository<Fruit, Long> {
    List<Fruit> findByEatable(boolean eatable);

    List<Fruit> findByNameContaining(String name);
}