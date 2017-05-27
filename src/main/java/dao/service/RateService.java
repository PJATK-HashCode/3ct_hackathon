package dao.service;

import dao.repository.IRateRepository;
import model.rateSystem.Rate;
import model.rateSystem.Score;

import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public class RateService extends EntityService<Rate> implements IRateRepository {

    @Override
    public List<Rate> withScore(Score score) {
        return super.searchByCriteria("from Rate r where r.score='" + score.name() + "'");

    }
}
