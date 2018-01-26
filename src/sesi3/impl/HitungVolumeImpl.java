/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi3.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import sesi3.service.HitungServices;
import sesi3.service.HitungVolumeServices;

/**
 *
 * @author hari
 */
@Service("hitungVolumeServices")
public class HitungVolumeImpl implements HitungVolumeServices {

    @Autowired //byName
    private HitungServices hitungServices;

    public double hitungLuasLingkaran(int tinggi, int lebar) {
        System.out.println(" masuk hitung volume ");
        return (hitungServices.hitungLuas(lebar))* tinggi;
    }


    

}
