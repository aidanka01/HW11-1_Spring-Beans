package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.config.AppConfig;
import peaksoft.model.AnimalsCage;
import peaksoft.model.Timer;

/**
 * 1) Dog деген класс тузуп Animal деген класстан наследование кылыныз жана Dog классын компонент кылыныз.
 * 2) Программаны иштетип корунуз. NoUniqueBeanDefinitionException деген исключение тушуш керек.
 * Эки бин бар Animal деген тип менен ошондуктан ушундай исключение тушуп жатат.
 * 3) AnimalsCageти Dog деген бин менен байланыштырыныз Animal деген класс колдонуп.
 * 4) Timer классынын негизинде бин тузунуз жана AnimalsCage менен байланыштырыныз.
 * 5) main методун иштетип текшериниз, таймер жазган убакыт бир болуш керек.
 * 6) Testти комментарийден чыгарып иштетип корунуз.
 */


public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();

            Timer timer = applicationContext.getBean(Timer.class);
            System.out.println(timer);
        }
    }

}
