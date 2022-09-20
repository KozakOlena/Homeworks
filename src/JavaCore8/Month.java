package JavaCore8;

public enum Month {
    DECEMBER(Season.WINTER,31),
    JANUARY(Season.WINTER,31),
    FEBRUARY(Season.WINTER,28),
    MARCH(Season.SPRING,31),
    APRIL(Season.SPRING,30),
    MAY(Season.SPRING,31),
    JUNE(Season.SUMMER,30),
    JULY(Season.SUMMER,31),
    AUGUST(Season.SUMMER,31),
    SEPTEMBER(Season.AUTUMN,30),
    OCTOBER(Season.AUTUMN,31),
    NOVEMBER(Season.AUTUMN,30);
    Season season;
    int days;
    Month(Season season,int days){
        this.season=season;
        this.days=days;
    }
    public int getDays() {
        return days;
    }
    public Season getSeason() {
        return season;
    }
}

