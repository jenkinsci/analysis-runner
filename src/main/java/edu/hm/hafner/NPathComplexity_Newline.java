package edu.hm.hafner;

import java.util.Date;
import java.util.Map;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class NPathComplexity_Newline {
    private int x;
    private int y;
    private int z;
    private String text;
    private Date date;
    private Map<String, String> map;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((map == null) ? 0 : map.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;
        return result;
    }

    
    
    
    
    @Override
    
    
    
    
    
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        NPathComplexity_Newline other = (NPathComplexity_Newline)obj;
        if (date == null) {
            if (other.date != null) {
                return false;
            }
        }
        else if (!date.equals(other.date)) {
            return false;
        }
        if (map == null) {
            if (other.map != null) {
                return false;
            }
        }
        else if (!map.equals(other.map)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        }
        else if (!text.equals(other.text)) {
            return false;
        }
        if (x != other.x) {
            return false;
        }
        if (y != other.y) {
            return false;
        }
        if (z != other.z) {
            return false;
        }
        return true;
    }
}