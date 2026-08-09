public class Sleep Check 
{

    int mon = 8;
    int tue =7;
    int wed = 9;

    double avg Sleep = (mon + tue + wed) / 3.0;

    String moment;
    if (avg Sleep > 8) {
        comment = "Very Well Rested";
        comment = "okay rest";
    } else { 
        comment = "Sleep Earlier tonight";
    }
    System.out.println("Average Sleep: " + avg Sleep + "hrs");
    System.out.println("Note: " + comment);
    }
}  