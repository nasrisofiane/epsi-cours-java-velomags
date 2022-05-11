package com.montpellier;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.montpellier.client.VelomagClient;
import com.montpellier.generated.velomag.Vcs;
import com.montpellier.generated.velomag.Vcs.Sl.Si;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws JAXBException, MalformedURLException, IOException
    {
        JAXBContext jc = JAXBContext.newInstance("com.montpellier.generated.velomag");
        Unmarshaller u = jc.createUnmarshaller();
        InputStream inputStream = VelomagClient.getXmlVelomagsFromInternet();

        Vcs vcs = (Vcs)u.unmarshal(inputStream);
        Si stationVelomagAvecLePlusDeVeloDisponible = stationVelomagAvecLePlusDeVeloDisponible(vcs.getSl().getSi());

        System.out.println("Station velomag avec le plus de vélos disponible.");
        System.out.println(stationVelomagAvecLePlusDeVeloDisponible.getNa());
    }

    public static Si stationVelomagAvecLePlusDeVeloDisponible(List<Si> stationsVelomag){
        if(Objects.isNull(stationsVelomag) || stationsVelomag.isEmpty()) return null;
        
        Si stationVelomagResultat = stationsVelomag.get(0);

        for(Si stationVelomag : stationsVelomag){
            if(stationVelomag.getFr() > stationVelomagResultat.getFr()){
                stationVelomagResultat = stationVelomag;
            }
        }

        return stationVelomagResultat;
    }
}
