package dao.repository;

import model.rateSystem.Rate;
import model.rateSystem.Score;

import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public interface IRateRepository extends IRepository<Rate> {

    List<Rate> withScore(Score score);
}
