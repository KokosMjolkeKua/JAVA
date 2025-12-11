package School_Projects.Exam_practice.Previous_Exams.Trial_2024_Again;

public class Taxi implements Transport{
    public double taxiCostPerMeter = 0.01;
    public int taxiStart = 50;
    public double meterPerMin = 1000;
    public double minTilNextTaxi = 5;

    @Override
    public double calculateCost(int distance) {
        return distance * (taxiCostPerMeter + taxiStart);
    }

    @Override
    public double calculateTime(int distance, int minutesTilNextTransport) {
        return 0;
    }
}

//Norsk
//Figure 2: Transport interface
//Implementer interfacet Transport (se Figur 2) for klasser Train og Taxi.
//Distance er et heltall i meter.
//• Train koster 0,01 kr per meter.
//• Taxi koster 0,05 kr per meter og har en grunnkostnad p˚a 50 kr.
//• Legg til en ny metode i interfacet, calculateTime(int distance, int minutesTilNextTransport), og implementer det i Train og Taxi.
//• Train bruker 0,5 minutter per 1000 m, og det er 30 minutter til neste tog
//g˚ar.
//• Taxi bruker 1 minutter per 1000 m og har en ventetid p˚a 5 minutter.
//• I en Main-metode, legg de to klassene i et felles array eller en liste, og
//beregn kostnaden og tiden for 1000 m, 5000 m og 50000 m.