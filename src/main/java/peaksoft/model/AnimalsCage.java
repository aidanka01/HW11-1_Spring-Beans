package peaksoft.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class AnimalsCage {


    private Animal animal;
    private Timer timer;


    public AnimalsCage(@Autowired @Qualifier("dog") Animal animal,
                       @Autowired @Qualifier("timer") Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
