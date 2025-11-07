import javax.print.DocFlavor.STRING;

public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minToAdd = Integer.parseInt(args[1]);
        int hour = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3,5));
        int totalMin = (hour * 60) + minutes + minToAdd;
        int newHour = (totalMin / 60) % 24;
        int newMin = totalMin % 60;
        String newMinStr = String.format("%02d", newMin);
        String newHourStr = String.format("%02d", newHour);
        System.out.println(newHourStr + ":" + newMinStr);
    }
}
