//package ng.ourChemo.data.repositories;
//
//import ng.ourChemo.data.models.DispensedDrugs;
//import ng.ourChemo.data.models.Drug;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DispensedDrugsRepositoryImpl implements DispensedDrugsRepository {
//
//    private static List<DispensedDrugs> drugs = new ArrayList<>();
//    private static int idCounter = 1;
//
//    @Override
//    public int count() {
//        return drugs.size();
//    }
//
//    @Override
//    public DispensedDrugs save(DispensedDrugs drug) {
//        if (drug.getId() == 0) {
//            drug.setId(idCounter);
//            idCounter++;
//            drugs.add(drug);
//        } else {
//
//            int index = drugs.indexOf(drug);
//            if (index != -1) {
//                drugs.set(index, drug);
//            } else {
//                drugs.add(drug);
//            }
//        }
//        return drug;
//    }
//
//    @Override
//    public Drug findById(int id) {
//        DispensedDrugs target = new DispensedDrugs();
//        target.setId(id);
//
//        int index = drugs.indexOf(target);
//        if (index != -1) {
//            return drugs.get(index);
//        }
//        return null;
//    }
//
//    @Override
//    public List<DispensedDrugs> findAllById(int id) {
//        return new ArrayList<>(drugs);
//    }
//
//    @Override
//    public void delete(Drug drug) {
////        if (drug != null) {
////            drugs.remove(drug);
////        }
//    }
//
//    @Override
//    public void deleteById(int id) {
////        DispensedDrugs target = new DispensedDrugs();
////        target.setId(id);
////        drugs.remove(target);
//    }
//
////        @Override
////        public boolean existsById(Long id) {
////            Drug target = new Drug();
////            target.setId(id);
////            return database.contains(target);
////        }
//
//    @Override
//    public void deleteAll() {
//        drugs.clear();
//    }
//
//
//
//
//
//}
