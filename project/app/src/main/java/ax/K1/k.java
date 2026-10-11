/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.K1.w;
import ax.P0.D;
import ax.P0.v;
import java.util.Iterator;
import java.util.List;

final class k {
    public static String a(v object) {
        object = ((v)object).o;
        if (D.s((String)object)) {
            return "video/mp4";
        }
        if (D.o((String)object)) {
            return "audio/mp4";
        }
        if (D.q((String)object)) {
            if (j.Objects.equals((Object)object, (Object)"image/heic")) {
                return "image/heif";
            }
            if (j.Objects.equals((Object)object, (Object)"image/avif")) {
                return "image/avif";
            }
        }
        return "application/mp4";
    }

    public static String b(List<w> object) {
        Iterator<w> iterator = object.iterator();
        boolean bl = false;
        object = null;
        while (iterator.hasNext()) {
            String string = iterator.next().a.g.o;
            if (D.s(string)) {
                return "video/mp4";
            }
            if (D.o(string)) {
                bl = true;
                continue;
            }
            if (!D.q(string)) continue;
            if (j.Objects.equals((Object)string, (Object)"image/heic")) {
                object = "image/heif";
                continue;
            }
            if (!j.Objects.equals((Object)string, (Object)"image/avif")) continue;
            object = "image/avif";
        }
        if (bl) {
            return "audio/mp4";
        }
        if (object != null) {
            return object;
        }
        return "application/mp4";
    }
}

