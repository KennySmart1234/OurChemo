package ng.ourChemo.data.repositories;

import ng.ourChemo.data.models.Drug;

import java.util.ArrayList;
import java.util.List;

public interface DrugRepository {

    Drug save(Drug drug);

    List<Drug> findAll();

    int count();

    void deleteAll();

}
