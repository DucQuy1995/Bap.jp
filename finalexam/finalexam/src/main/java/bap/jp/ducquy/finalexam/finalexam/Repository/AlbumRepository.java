package bap.jp.ducquy.finalexam.finalexam.Repository;

import bap.jp.ducquy.finalexam.finalexam.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
