/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.util.Pair;
import ax.b1.n;
import java.util.Map;

public final class V {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static long a(Map<String, String> object, String string) {
        if (object == null) return -9223372036854775807L;
        try {
            object = (String)object.get(string);
            if (object == null) return -9223372036854775807L;
        }
        catch (NumberFormatException numberFormatException) {
            return -9223372036854775807L;
        }
        return Long.parseLong((String)object);
    }

    public static Pair<Long, Long> b(n object) {
        if ((object = object.e()) == null) {
            return null;
        }
        return new Pair((Object)V.a((Map<String, String>)object, "LicenseDurationRemaining"), (Object)V.a((Map<String, String>)object, "PlaybackDurationRemaining"));
    }
}

