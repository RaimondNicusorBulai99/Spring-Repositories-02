package API.Spring.Repositories2.repository;

import API.Spring.Repositories2.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("This is the description of my programming language repository"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
