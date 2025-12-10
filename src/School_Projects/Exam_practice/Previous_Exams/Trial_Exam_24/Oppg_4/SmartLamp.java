package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24.Oppg_4;

public class SmartLamp {
    public SmartLight installedBulb;
    public String wifiName;

    public SmartLamp(SmartLight installedBulb, String wifiName) {
        this.installedBulb = installedBulb;
        this.wifiName = wifiName;
    }

    public SmartLight getInstalledBulb() {
        return installedBulb;
    }

    public void setInstalledBulb(SmartLight installedBulb) {
        this.installedBulb = installedBulb;
    }

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }
}
