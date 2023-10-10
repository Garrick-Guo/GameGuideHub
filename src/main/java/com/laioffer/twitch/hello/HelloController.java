package com.laioffer.twitch.hello;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {
    @GetMapping("/hello") //handle HTTP GET requests to the "/hello" endpoint.
    public Person sayHello(@RequestParam(required = false) String locale) {
        if (locale == null) {
            //sets a default value for the locale parameter to "en_US" if it's not provided.
            locale = "en_US";
        }
        Faker faker = new Faker(new Locale(locale));
        String name = faker.name().fullName();
        String company = faker.company().name();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String bookTitle = faker.book().title();
        String bookAuthor = faker.book().author();
        return new Person(name, company, new Address(street, city, state), new Book(bookTitle, bookAuthor));
    }

}
