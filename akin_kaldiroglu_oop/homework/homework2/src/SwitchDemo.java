public class SwitchDemo {

    private String month;
    private String season;

public SwitchDemo(int month){
    this.month = monthString(month);
    this.season = seasonString(month);
}
private enum SEASON{
    WINTER,
    SPRING,
    SUMMER,
    FALL
}

    private String monthString(int varSelect){
        return switch (varSelect){
            case 1 -> ("January");
            case 2 -> ("February");
            case 3 -> ("March");
            case 4 -> ("April");
            case 5 -> ("May");
            case 6 -> ("June");
            case 7 -> ("July");
            case 8 -> ("August");
            case 9 -> ("September");
            case 10 -> ("October");
            case 11 -> ("November");
            case 12 -> ("December");
            default -> ("Error! Please enter the month number between 1 and 12");
        };
    }

    private String seasonString(int varSelect){
        return switch (varSelect){
            case 12,1,2 -> SEASON.WINTER.name();
            case 3,4,5 -> SEASON.SPRING.name();
            case 6,7,8 -> SEASON.SUMMER.name();
            case 9,10,11 -> SEASON.FALL.name();
            default -> throw new IllegalStateException("Error! Please enter the month number that between 1 and 12");
        };
    }

    public String getMonth() {
        return month;
    }

    public String getSeason() {
        return season;
    }
}
