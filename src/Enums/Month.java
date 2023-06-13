package Enums;

public enum Month {
    January(1, 31, Season.Winter),
    February(2, 28, Season.Winter),
    March(3, 31, Season.Spring),
    April(4, 30, Season.Spring),
    May(5, 31, Season.Spring),
    June(6, 30, Season.Summer),
    July(7, 31, Season.Summer),
    August(8, 31, Season.Summer),
    September(9, 30, Season.Autumn),
    October(10, 31, Season.Autumn),
    November(11, 30, Season.Autumn),
    December(12, 31, Season.Winter);

    private final int number;
    private final int dayCount;
    final Season season;


    Month(int number, int dayCount, Season season) {
        this.number = number;
        this.dayCount = dayCount;
        this.season = season;
    }

    public int getNumber() {
        return number;
    }

    public int getDayCount() {
        return dayCount;
    }

    public Season getSeasons() {
        return season;
    }
}
