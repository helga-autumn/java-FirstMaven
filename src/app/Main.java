package msql1.app;

public class Main {
    import org.springframework.context.ConfigurableApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;

    import msql1.dao.BuyerDao;
    import msql1.Buyer;

    public class Main {

        public static void main(String[] args) {

            ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                    "appContext.xml");

            BuyerDao dao = (BuyerDao) context.getBean("buyerDao");
            dao.insertBuyer(new Buyer("Rostislav", "Lviv"));
            dao.insertBuyer(new Buyer("Andriy", "Luck"));
            System.out.println(dao.getAllBuyers());
            context.close();

}
