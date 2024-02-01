package zhedron.petproject.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zhedron.petproject.store.models.Store;
import zhedron.petproject.store.repository.StoreRepository;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Store store = new Store();
//
//
//		store.setName("Жека");
//		store.setProductName("Банан");
//		store.setPrice(4500);
//
//		storeRepository.save(store);
//
//		for (Store stores : storeRepository.findAll()) {
//			System.out.println(stores.toString());
//		}
//	}
}
