import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context=new Context();
        /*context.setStrategy(new StrategyImpl3());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setStrategy(new DefaultStrategyImpl());
        context.effectuerOperation();*/
        Scanner scanner=new Scanner(System.in);
        Strategy strategy;
        Map<String,Strategy> strategyMap=new HashMap<>();
        while(true){
            System.out.println("Quelle est votre strategie?");
            String str=scanner.nextLine();
            strategy=strategyMap.get(str);
            if(strategy==null){
                System.out.println("Création d'un nouvel objet de stratégie");
                strategy=(Strategy) Class.forName("org.example.StrategyImpl"+str).newInstance();
                strategyMap.put(str,strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}