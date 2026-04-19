public class Main {

    public static void main(String[] args) {

        Company company1 = new Company(
                "BlueSoft",
                40000,
                22000,
                5000,
                3000,
                2000
        );

        Company company2 = new Company(
                "RedTech",
                35000,
                21000,
                6000,
                2500,
                1500
        );

        company1.printSummary();
        company2.printSummary();

        double profit1 = company1.calculateProfit();
        double profit2 = company2.calculateProfit();

        if (profit1 > profit2) {
            System.out.println(company1.getName() + " is more profitable.");
        } else if (profit2 > profit1) {
            System.out.println(company2.getName() + " is more profitable.");
        } else {
            System.out.println("Both companies have equal profit.");
        }
    }
}