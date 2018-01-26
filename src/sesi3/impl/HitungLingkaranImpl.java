package sesi3.impl;
import org.springframework.stereotype.Component;
import sesi3.service.HitungServices;

@Component("hitungServices")
public class HitungLingkaranImpl implements HitungServices{
    public double hitungLuas(int param) {
        System.out.println(" masuk lingkaran ");
        return Math.PI*param*param;
    }
}