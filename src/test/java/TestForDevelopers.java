import cz.master.blaster.balakzde.exception.NonexistentEntity;
import cz.master.blaster.balakzde.service.AresORService;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ares.xml"})
public class TestForDevelopers {


    @Autowired
    private AresORService aresORService;

    @org.junit.Test
    public void test() {
        try {
            final VypisOR vypisOR = aresORService.getVypisOR("09928651");
            final StatutarniOrgan statutarniOrgan = vypisOR.getStatutarniOrgan();
            System.out.println(statutarniOrgan);
            final ZakladniUdajeOR zakladniUdaje = vypisOR.getZakladniUdaje();
            if (zakladniUdaje != null) {
                final ObchodniFirma obchodniFirma = getFirst(zakladniUdaje.getObchodniFirma());
                if (obchodniFirma != null) {
                    System.out.println(obchodniFirma.getValue());
                }
                final XMLGregorianCalendar datumVznikuOR = zakladniUdaje.getDatumVznikuOR();
                if (datumVznikuOR != null) {
                    System.out.println(datumVznikuOR.toGregorianCalendar().getTime());
                } else {
                    final XMLGregorianCalendar datumZapisuOR = zakladniUdaje.getDatumZapisuOR();
                    if (datumZapisuOR != null) {
                        System.out.println(datumZapisuOR.toGregorianCalendar().getTime());
                    }
                }

                final AdresaARES adresaARES = getFirst(zakladniUdaje.getSidlo());
                if (adresaARES != null) {
                    System.out.println(adresaARES.getNazevStatu());
                    System.out.println(adresaARES.getNazevOkresu());
                    System.out.println(adresaARES.getNazevObce());
                    System.out.println(adresaARES.getNazevMestskeCasti());
                    System.out.println(adresaARES.getNazevUlice());
                    System.out.println(adresaARES.getCisloDomovni() != null ? adresaARES.getCisloDomovni().toString() : null);
                    System.out.println(adresaARES.getCisloOrientacni());
                    System.out.println(adresaARES.getPSC());
                }
                final PravniForma pravniForma = getFirst(zakladniUdaje.getPravniFormaOR());
                if (pravniForma != null) {
                    System.out.println(pravniForma.getNazevPF());
                }
            }
            final Registrace registrace = vypisOR.getRegistrace();
            if (registrace != null) {
                final SpisovaZnacka spisovaZnacka = getFirst(registrace.getSpisovaZnacka());
                if (spisovaZnacka != null) {
                    System.out.println(spisovaZnacka.getOddilVlozka());
                    final Soud soud = spisovaZnacka.getSoud();
                    if (soud != null) {
                        System.out.println(soud.getText());
                    }
                }
            }

        } catch (NonexistentEntity nonexistentEntity) {
            nonexistentEntity.printStackTrace();
        }
    }
    private <T> T getFirst(List<T> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }
}
