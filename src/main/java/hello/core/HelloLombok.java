package hello.core;

import lombok.*;

@Getter
@Setter
public class HelloLombok {

    private String name;
    private String age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
    }
}
