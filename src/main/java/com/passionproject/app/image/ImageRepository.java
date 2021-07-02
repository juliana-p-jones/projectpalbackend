package com.passionproject.app.image;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
//import com.javainuse.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long>{
    Optional<Image> findByName(String name);
}
