package ng.ourChemo.data.repositories;

import ng.ourChemo.data.models.Drug;

import java.util.List;

public interface DispensedDrugsRepository {

    int count();

    void delete(Drug drug);

    void deleteById(int id);

    void deleteAll();

    Drug findById(int id);

    List<Drug> findAllById(int id);


    Drug save(Drug drug);



}
