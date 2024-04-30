public class _5kyu_human_readable_time {
    public static void main(String[] args) {
        System.out.println(makeReadable(3618));
        System.out.println("01:00:18");
    }
    public static String makeReadable(int seconds) {
        int hour = 0;
        int min = 0;

        while (seconds > 3599){
            seconds -= 3600;
            hour +=1;
        }

        while (seconds > 59) {
            seconds -= 60;
            min += 1;
        }

        return String.format("%02d:%02d:%02d",hour,min,seconds);
    }
}
