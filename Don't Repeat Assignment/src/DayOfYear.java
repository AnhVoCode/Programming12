public class DayOfYear {
    /**
     * Take in a day of a month and add it to the number with the index position of [month number -1]
     * in the list {0,31,59,90,120,151,181,212,243,273,304,33}, since the list's index starts at 0, while the months starts at 1.
     * The list created by adding the previous number to the number of days of months in ascending order.
     * @param month - integer greater than 0
     * @param dayOfMonth - integer greater than 0
     * @param year - integer greater than 0; requires four-digit number
     * @return the day of year - integer greater than 0
     */
    public int dayOfYear(int month, int dayOfMonth, int year) {
        if (month<0||dayOfMonth<0||year<0 && year<1000){
            System.out.println("Invalid Parameter");
        }
        int[] num = {0,31,59,90,120,151,181,212,243,273,304,334};
        dayOfMonth+=num[month-1];
        if (year%4==0 && month>2){
            dayOfMonth++;
        }
        return dayOfMonth;
    }
}
