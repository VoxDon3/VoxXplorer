/*
 * Decompiled with CFR 0.152.
 */
package ax.Hc;

import java.util.LinkedHashMap;

public class c {
    private static final ax.Ec.c a;

    static {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put(".tgz", ".tar");
        linkedHashMap.put(".taz", ".tar");
        linkedHashMap.put(".svgz", ".svg");
        linkedHashMap.put(".cpgz", ".cpio");
        linkedHashMap.put(".wmz", ".wmf");
        linkedHashMap.put(".emz", ".emf");
        linkedHashMap.put(".gz", "");
        linkedHashMap.put(".z", "");
        linkedHashMap.put("-gz", "");
        linkedHashMap.put("-z", "");
        linkedHashMap.put("_z", "");
        a = new ax.Ec.c(linkedHashMap, ".gz");
    }

    public static String a(String string) {
        return a.a(string);
    }
}

