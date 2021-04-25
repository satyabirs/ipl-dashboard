package personal.project.ipldashboard.Repository;

import org.springframework.data.repository.CrudRepository;
import personal.project.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team,Long> {

    Team findByTeamName(String teamName);
}
