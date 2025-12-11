package School_Projects.Exam_practice.Previous_Exams.Trial_2024_Again;

public class Smart {

    public static class SmartLight {

        private int brightness; // 0–100
        private boolean isOn;

        // Constructor
        public SmartLight(int brightness, boolean isOn) {
            setBrightness(brightness);  // use setter to check bounds
            this.isOn = isOn;
        }

        // Default constructor
        public SmartLight() {
            this(50, false); // default brightness 50, turned off
        }

        // Getter and Setter
        public int getBrightness() {
            return brightness;
        }

        public void setBrightness(int brightness) {
            if (brightness < 0 || brightness > 100) {
                throw new IllegalArgumentException("Brightness must be between 0 and 100.");
            }
            this.brightness = brightness;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            this.isOn = on;
        }

        @Override
        public String toString() {
            return "SmartLight{brightness=" + brightness + ", isOn=" + isOn + "}";
        }
    }

    public static class SmartLamp {

        private SmartLight light;
        private boolean power;

        // Constructor WITH SmartLight
        public SmartLamp(SmartLight light, boolean power) {
            this.light = light;
            this.power = power;
        }

        // Overloaded constructor WITHOUT SmartLight
        public SmartLamp(boolean power) {
            this.light = null;  // no light bulb installed
            this.power = power;
        }

        // Getter and Setter
        public SmartLight getLight() {
            return light;
        }

        public void setLight(SmartLight light) {
            this.light = light;
        }

        public boolean isPower() {
            return power;
        }

        public void setPower(boolean power) {
            this.power = power;
        }

        // Method to set SmartLight brightness through the SmartLamp
        public void setLightBrightness(int brightness) {
            if (light == null) {
                System.out.println("No SmartLight installed in this lamp!");
                return;
            }
            light.setBrightness(brightness);
        }

        @Override
        public String toString() {
            return "SmartLamp{power=" + power + ", light=" + light + "}";
        }
    }
}