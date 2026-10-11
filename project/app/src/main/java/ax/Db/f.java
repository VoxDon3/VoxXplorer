/*
 * Decompiled with CFR 0.152.
 */
package ax.Db;

import ax.Db.e;
import ax.Gb.l;
import ax.Ob.h;
import java.io.File;

class f
extends e {
    public static String a(File object) {
        l.f(object, "<this>");
        object = ((File)object).getName();
        l.e(object, "getName(...)");
        return h.y0((String)object, '.', "");
    }
}

