package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class MissingSwitchDefault_Newline {
    private String monat;

    /**
     * Creates a new instance of {@link MissingSwitchDefault_Newline}.
     *
     * @param month
     *            monat
     */
    public MissingSwitchDefault_Newline(final int month) {

    	
    	
    	
    	
    	
        switch (month) {
        	
        	
        	
        	
        	
            case 1:
                monat = "Januar";
                break;
            case 2:
                monat = "Februar";
                break;
            case 3:
                monat = "März";
                break;
            case 4:
                monat = "April";
                break;
            case 5:
                monat = "Mai";
                break;
            case 6:
                monat = "Juni";
                break;
            case 7:
                monat = "Juli";
                break;
            case 8:
                monat = "August";
                break;
            case 9:
                monat = "September";
                break;
            case 10:
                monat = "Oktober";
                break;
            case 11:
                monat = "November";
                break;
            case 12:
                monat = "Dezember";
                break;
        }
    }

    /**
     * Returns the monat.
     *
     * @return the monat
     */
    public String getMonat() {
        return monat;
    }
}