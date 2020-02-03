package bap.jp.ducquy.finalexam.finalexam.Repository;

import bap.jp.ducquy.finalexam.finalexam.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
}
