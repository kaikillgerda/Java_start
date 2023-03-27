ppublic class Render {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void printStatus(Object object) {
        String attribute = "Type is not supported...";
        int points = -1;
        int maxPoints = 1;
        if (object instanceof TirednessPoints) {
        points = ((TirednessPoints) object).getTirednessPoints();
        maxPoints = ((TirednessPoints) object).getMaxTirednessPoints();
        attribute = "Tiredness Level: ";
        } else if (object instanceof HealthPoints) {
            points = ((HealthPoints) object).getHealthPoints();
            maxPoints = ((HealthPoints) object).getMaxHealthPoints();
            attribute = "Health Points: ";
        }
        int pointsLvl = points * 100 / maxPoints;


        System.out.print(attribute);
        if (pointsLvl >= 0 && pointsLvl < 25) {
            System.out.print(ANSI_RED + pointsLvl + "%" + ANSI_RESET);
        } else if (pointsLvl >= 25 && pointsLvl <= 50){
            System.out.print(ANSI_YELLOW + pointsLvl + "%" + ANSI_RESET);
        } else if (pointsLvl > 50 && pointsLvl <= 100){
            System.out.print(ANSI_GREEN + pointsLvl + "%" + ANSI_RESET);
        }
        System.out.println();
    }
}

interface HealthPoints {
    int getHealthPoints();
    int getMaxHealthPoints();
}

interface TirednessPoints {
    int getTirednessPoints();
    int getMaxTirednessPoints();

}