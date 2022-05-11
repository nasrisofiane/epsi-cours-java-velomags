package com.montpellier.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class VelomagClient {
    public static InputStream getXmlVelomagsFromInternet() throws MalformedURLException, IOException{
        return new URL("https://data.montpellier3m.fr/sites/default/files/ressources/TAM_MMM_VELOMAG.xml").openStream();
    }
}
