package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.k;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final k a;
    public final byte b;
    public final j$.time.c c;
    public final j$.time.i d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(k kVar, int i, j$.time.c cVar, j$.time.i iVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = kVar;
        this.b = (byte) i;
        this.c = cVar;
        this.d = iVar;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        j$.time.i iVar = this.d;
        boolean z = this.e;
        int X = z ? 86400 : iVar.X();
        ZoneOffset zoneOffset = this.g;
        int i = this.h.a;
        int i2 = zoneOffset.a;
        int i3 = i - i2;
        int i4 = this.i.a;
        int i5 = i4 - i2;
        byte b = X % 3600 == 0 ? z ? (byte) 24 : iVar.a : (byte) 31;
        int i6 = i2 % 900 == 0 ? (i2 / 900) + 128 : 255;
        int i7 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        int i8 = (i5 == 0 || i5 == 1800 || i5 == 3600) ? i5 / 1800 : 3;
        j$.time.c cVar = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i6 << 4) + (i7 << 2) + i8);
        if (b == 31) {
            objectOutput.writeInt(X);
        }
        if (i6 == 255) {
            objectOutput.writeInt(i2);
        }
        if (i7 == 3) {
            objectOutput.writeInt(i);
        }
        if (i8 == 3) {
            objectOutput.writeInt(i4);
        }
    }

    public static e a(ObjectInput objectInput) {
        int i;
        d dVar;
        j$.time.i iVar;
        int readInt = objectInput.readInt();
        k O = k.O(readInt >>> 28);
        int i2 = ((264241152 & readInt) >>> 22) - 32;
        int i3 = (3670016 & readInt) >>> 19;
        j$.time.c L = i3 == 0 ? null : j$.time.c.L(i3);
        int i4 = (507904 & readInt) >>> 14;
        d dVar2 = d.values()[(readInt & 12288) >>> 12];
        int i5 = (readInt & 4080) >>> 4;
        int i6 = (readInt & 12) >>> 2;
        int i7 = readInt & 3;
        if (i4 == 31) {
            long readInt2 = objectInput.readInt();
            j$.time.i iVar2 = j$.time.i.e;
            j$.time.temporal.a.SECOND_OF_DAY.J(readInt2);
            int i8 = (int) (readInt2 / 3600);
            i = i7;
            long j = readInt2 - (i8 * 3600);
            dVar = dVar2;
            iVar = j$.time.i.M(i8, (int) (j / 60), (int) (j - (r1 * 60)), 0);
        } else {
            i = i7;
            dVar = dVar2;
            int i9 = i4 % 24;
            j$.time.i iVar3 = j$.time.i.e;
            j$.time.temporal.a.HOUR_OF_DAY.J(i9);
            iVar = j$.time.i.h[i9];
        }
        ZoneOffset R = i5 == 255 ? ZoneOffset.R(objectInput.readInt()) : ZoneOffset.R((i5 - 128) * 900);
        int i10 = R.a;
        ZoneOffset R2 = ZoneOffset.R(i6 == 3 ? objectInput.readInt() : (i6 * 1800) + i10);
        int i11 = i;
        ZoneOffset R3 = i11 == 3 ? ZoneOffset.R(objectInput.readInt()) : ZoneOffset.R((i11 * 1800) + i10);
        boolean z = i4 == 24;
        Objects.requireNonNull(O, "month");
        Objects.requireNonNull(iVar, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(R, "standardOffset");
        Objects.requireNonNull(R2, "offsetBefore");
        Objects.requireNonNull(R3, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !iVar.equals(j$.time.i.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (iVar.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(O, i2, L, iVar, z, dVar3, R, R2, R3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int X = ((this.d.X() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.c cVar = this.c;
        return ((this.g.a ^ (this.f.ordinal() + (X + ((cVar == null ? 7 : cVar.ordinal()) << 2)))) ^ this.h.a) ^ this.i.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset2.a - zoneOffset.a > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        k kVar = this.a;
        byte b = this.b;
        j$.time.c cVar = this.c;
        if (cVar == null) {
            sb.append(kVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(cVar.name());
            sb.append(" on or before last day of ");
            sb.append(kVar.name());
        } else if (b < 0) {
            sb.append(cVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(kVar.name());
        } else {
            sb.append(cVar.name());
            sb.append(" on or after ");
            sb.append(kVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
