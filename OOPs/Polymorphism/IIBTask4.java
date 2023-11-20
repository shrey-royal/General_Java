import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class IIBTask4 {
    private ZoneOffset defaultOffset;

    {
        defaultOffset = ZoneOffset.UTC;
    }

    public LocalDateTime convertTime(LocalDateTime dateTime, ZoneId fromZone, ZoneId toZone) {
        return dateTime.atZone(fromZone).withZoneSameInstant(toZone).toLocalDateTime();
    }

    public LocalDateTime convertTimeWithDefaultOffset(LocalDateTime dateTime, ZoneId toZone) {
        ZoneId fromZone = ZoneId.ofOffset("UTC", defaultOffset);
        return convertTime(dateTime, fromZone, toZone);
    }
    
    public static void main(String[] args) {
        IIBTask4 converter = new IIBTask4();

        LocalDateTime currentTime = LocalDateTime.now();
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        LocalDateTime convertedToNewYork = converter.convertTimeWithDefaultOffset(currentTime, newYorkZone);
        LocalDateTime convertedToTokyo = converter.convertTimeWithDefaultOffset(currentTime, tokyoZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current time in UTC: " + formatter.format(currentTime));
        System.out.println("Converted to NewYork: " + formatter.format(convertedToNewYork));
        System.out.println("Converted to Tokyo: " + formatter.format(convertedToTokyo));
    }
}
