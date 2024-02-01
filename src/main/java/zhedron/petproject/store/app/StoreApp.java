
package zhedron.petproject.store.app;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import zhedron.petproject.store.models.Store;
import zhedron.petproject.store.repository.StoreRepository;

import java.util.*;

@Component
public class StoreApp implements CommandLineRunner {
    @Autowired
    private final StoreRepository storeRepository;

    public StoreApp(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Store store = new Store();


        store.setName("John");
        store.setProductName("Apple");
        store.setPrice(15000);

        storeRepository.save(store);

        List<Store> storeList = storeRepository.findAll();

        for (Store stores : storeList) {
            System.out.println(stores.toString());
        }

        storeList.sort(Comparator.comparingInt(Store::getPrice));

        for (Store sort: storeList) {
            System.out.println("Sorted ASC price " + sort.toString());
        }

        storeList.sort(Comparator.comparingInt(Store::getPrice).reversed());

        for (Store sort: storeList) {
            System.out.println("Sorted DESC price " + sort.toString());
        }

        Comparator<Store> comparator = Comparator.comparing(Store::getProductName);

        storeList.sort(comparator);

        for (Store stores : storeList) {
            System.out.println("Filtering name " + stores.toString());
        }
    }
}

