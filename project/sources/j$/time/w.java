package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class w extends v {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String a;
    public final transient j$.time.zone.f b;

    public static w P(String str) {
        j$.time.zone.f fVar;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                    throw new a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVar = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g unused) {
                fVar = null;
            }
            return new w(str, fVar);
        }
        throw new a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public w(String str, j$.time.zone.f fVar) {
        this.a = str;
        this.b = fVar;
    }

    @Override // j$.time.v
    public final String i() {
        return this.a;
    }

    @Override // j$.time.v
    public final j$.time.zone.f L() {
        j$.time.zone.f fVar = this.b;
        return fVar != null ? fVar : j$.time.zone.i.a(this.a);
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.v
    public final void O(ObjectOutput objectOutput) {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.a);
    }
}
