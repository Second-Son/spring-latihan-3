package sesi3.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sesi3.service.HitungVolumeServices;

/**
 *
 * @author hari
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcfg.xml");
        HitungVolumeServices hvs = (HitungVolumeServices) context.getBean("hitungVolumeServices");
        System.out.println(" = " + hvs.hitungLuasLingkaran(100, 100));
    }
}
