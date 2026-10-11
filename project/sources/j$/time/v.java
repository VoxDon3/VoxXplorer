package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class v implements Serializable {
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f L();

    public abstract void O(ObjectOutput objectOutput);

    public abstract String i();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.P("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.P("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.P("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.P("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.P("AST", "America/Anchorage"), j$.com.android.tools.r8.a.P("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.P("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.P("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.P("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.P("CST", "America/Chicago"), j$.com.android.tools.r8.a.P("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.P("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.P("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.P("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.P("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.P("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.P("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.P("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.P("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.P("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.P("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.P("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.P("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.P("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.P("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.P("EST", "-05:00"), j$.com.android.tools.r8.a.P("MST", "-07:00"), j$.com.android.tools.r8.a.P("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        Collections.unmodifiableMap(hashMap);
    }

    public static v M(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.a != 0) {
            str = str.concat(zoneOffset.b);
        }
        return new w(str, zoneOffset.L());
    }

    public static v N(String str, int i) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return M(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return w.P(str);
        }
        try {
            ZoneOffset P = ZoneOffset.P(str.substring(i));
            if (P == ZoneOffset.UTC) {
                return M(substring, P);
            }
            return M(substring, P);
        } catch (a e) {
            throw new a("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public v() {
        if (getClass() != ZoneOffset.class && getClass() != w.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return i().equals(((v) obj).i());
        }
        return false;
    }

    public int hashCode() {
        return i().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return i();
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }
}
