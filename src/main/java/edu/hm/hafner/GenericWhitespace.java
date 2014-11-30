package edu.hm.hafner;

import java.util.Map;

/**
 * FIXME: Document type GenericWhitespace.
 *
 * @author Christian M&ouml;stl
 */
public class GenericWhitespace {
    private final Map <String, String> map;

    /**
     * Creates a new instance of {@link GenericWhitespace}.
     *
     * @param map
     *            map.
     */
    public GenericWhitespace(final Map<String, String> map) {
        this.map = map;
    }

    /**
     * Returns the map.
     *
     * @return the map
     */
    public Map<String, String> getMap() {
        return map;
    }
}
