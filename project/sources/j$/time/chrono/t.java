package j$.time.chrono;

import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t extends AbstractC3794a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n H(int i) {
        if (i == 0) {
            return u.BCE;
        }
        if (i == 1) {
            return u.CE;
        }
        throw new j$.time.a("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final String i() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3795b m(j$.time.temporal.n nVar) {
        return j$.time.f.N(nVar);
    }

    private t() {
    }

    @Override // j$.time.chrono.AbstractC3794a, j$.time.chrono.m
    public final InterfaceC3798e r(LocalDateTime localDateTime) {
        return LocalDateTime.M(localDateTime);
    }

    public static boolean l(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
