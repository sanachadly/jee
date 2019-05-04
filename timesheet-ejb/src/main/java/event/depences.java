package event;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class depences
 */
@Stateless
@LocalBean
public class depences implements depencesRemote, depencesLocal {

    /**
     * Default constructor. 
     */
    public depences() {
    }

}
