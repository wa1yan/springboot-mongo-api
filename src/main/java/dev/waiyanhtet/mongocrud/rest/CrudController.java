//package dev.waiyanhtet.mongocrud.rest;
//
//import dev.waiyanhtet.mongocrud.dto.request.UserDto;
//import dev.waiyanhtet.mongocrud.mapper.UserMapper;
//import dev.waiyanhtet.mongocrud.model.Address;
//import dev.waiyanhtet.mongocrud.model.User;
//import dev.waiyanhtet.mongocrud.repo.AddressRepo;
//import dev.waiyanhtet.mongocrud.repo.UserRepo;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Mono;
//
//import java.util.List;
//
//@RestController("")
//@RequiredArgsConstructor
//public class CrudController {
//
//    private final UserRepo userRepo;
//    private final AddressRepo addressRepo;
//    private final UserMapper userMapper;
//
//    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Mono<ResponseEntity<User>> createSampleDocument(@RequestBody UserDto userDto) {
//        var newUser = userMapper.asUser(userDto);
//        var address = addressRepo.save(newUser.getAddress());
//        var user = userRepo.save(newUser);
//        return Mono.just(ResponseEntity.ok(user));
//    }
//
//    @GetMapping("/getbyfirstname")
//    public Mono<ResponseEntity<User>> getUser(@RequestParam String firstname) {
//        return Mono.just(ResponseEntity.ok(userRepo.findByfirstname(firstname)));
//    }
//
//    @GetMapping("/getbycity")
//    public Mono<ResponseEntity<List<User>>> getUserByCity(@RequestParam String city) {
//        return Mono.just(ResponseEntity.ok(userRepo.findByAddressCity(city)));
//    }
//}
