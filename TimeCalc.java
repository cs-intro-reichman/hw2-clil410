public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        // System.out.println(hours + " " + minutes + " " + minutesToAdd);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        String newMinutes1 = String.valueOf(newMinutes);
        String newHours1 = String.valueOf(newHours);
        if (newHours < 10){
            newHours1 = "0" + newHours1;
        }
        if (newMinutes < 10) {
            newMinutes1 = "0" + newMinutes1;
        }
        
        System.out.println(newHours1 + ":" + newMinutes1);
    }
}
