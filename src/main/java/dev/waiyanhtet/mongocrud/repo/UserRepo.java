//package dev.waiyanhtet.mongocrud.repo;
//
//import dev.waiyanhtet.mongocrud.model.User;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface UserRepo extends MongoRepository<User, String> {
//    User findByfirstname(@Param("firstname") String firstname);
//
//    @Query("address.city = ?0")
//    List<User> findByAddressCity(String city);
//}
