package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3794a implements m {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return i().compareTo(((m) obj).i());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m j(AbstractC3794a abstractC3794a, String str) {
        String v;
        m mVar = (m) a.putIfAbsent(str, abstractC3794a);
        if (mVar == null && (v = abstractC3794a.v()) != null) {
            b.putIfAbsent(v, abstractC3794a);
        }
        return mVar;
    }

    @Override // j$.time.chrono.m
    public InterfaceC3798e r(LocalDateTime localDateTime) {
        try {
            return m(localDateTime).z(j$.time.i.N(localDateTime));
        } catch (j$.time.a e) {
            throw new j$.time.a("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC3794a) && i().compareTo(((AbstractC3794a) obj).i()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ i().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return i();
    }
}
