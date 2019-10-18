public class Main {
    public static int dayOfYear(int month, int dayOfMonth, int year) {
        /**
         * Returns the day of year when take in the date (month, day of the month and the year)
         * @param month - integer greater than 0
         * @param dayOfMonth - integer greater than 0
         * @param year - integer greater than 0
         */
        int[] num = {0,31,59,90,120,151,181,212,243,273,304,334};
        dayOfMonth+=num[month-1];
        if (year%4==0 && month>2){
            dayOfMonth++;
        }
        return dayOfMonth;
    }


    public static void main(String[] args) {
        System.out.println(dayOfYear(2,1,2020));
        System.out.println(dayOfYear(3,1,2019));
        System.out.println(dayOfYear(3,1,2020));
    }
}
