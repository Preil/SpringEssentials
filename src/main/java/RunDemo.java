import config.AppConfig;
import entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Ilya 17.04.2017.
 */
public class RunDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Game game = context.getBean("game", Game.class);
        System.out.println(game.getAwayTeam().getName() + " VS " + game.getHomeTeam().getName());
        System.out.println(game.playGame() + " wins!");
        System.out.println();
        System.out.println();
        System.out.println("There are \'" + context.getBeanDefinitionCount() + "\' beans");
        // Print Beans names
        System.out.println("Present beans:");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
