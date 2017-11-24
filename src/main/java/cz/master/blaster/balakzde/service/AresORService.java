package cz.master.blaster.balakzde.service;

import cz.master.blaster.balakzde.exception.NonexistentEntity;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0.VypisOR;

public interface AresORService {

    VypisOR getVypisOR(String ico) throws NonexistentEntity;
}
