package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public q() {
    }

    public q(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                f fVar = (f) obj;
                objectOutput.writeInt(fVar.a);
                objectOutput.writeByte(fVar.b);
                objectOutput.writeByte(fVar.c);
                return;
            case 4:
                ((i) obj).a0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                f fVar2 = localDateTime.a;
                objectOutput.writeInt(fVar2.a);
                objectOutput.writeByte(fVar2.b);
                objectOutput.writeByte(fVar2.c);
                localDateTime.b.a0(objectOutput);
                return;
            case 6:
                y yVar = (y) obj;
                LocalDateTime localDateTime2 = yVar.a;
                f fVar3 = localDateTime2.a;
                objectOutput.writeInt(fVar3.a);
                objectOutput.writeByte(fVar3.b);
                objectOutput.writeByte(fVar3.c);
                localDateTime2.b.a0(objectOutput);
                yVar.b.U(objectOutput);
                yVar.c.O(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((w) obj).a);
                return;
            case 8:
                ((ZoneOffset) obj).U(objectOutput);
                return;
            case 9:
                o oVar = (o) obj;
                oVar.a.a0(objectOutput);
                oVar.b.U(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                f fVar4 = localDateTime3.a;
                objectOutput.writeInt(fVar4.a);
                objectOutput.writeByte(fVar4.b);
                objectOutput.writeByte(fVar4.c);
                localDateTime3.b.a0(objectOutput);
                offsetDateTime.b.U(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((s) obj).a);
                return;
            case 12:
                u uVar = (u) obj;
                objectOutput.writeInt(uVar.a);
                objectOutput.writeByte(uVar.b);
                return;
            case 13:
                m mVar = (m) obj;
                objectOutput.writeByte(mVar.a);
                objectOutput.writeByte(mVar.b);
                return;
            case 14:
                p pVar = (p) obj;
                objectOutput.writeInt(pVar.a);
                objectOutput.writeInt(pVar.b);
                objectOutput.writeInt(pVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    public static Serializable a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.ZERO;
                long readLong = objectInput.readLong();
                long readInt = objectInput.readInt();
                return Duration.j(j$.com.android.tools.r8.a.X(readLong, j$.com.android.tools.r8.a.N(readInt, 1000000000L)), (int) j$.com.android.tools.r8.a.W(readInt, 1000000000L));
            case 2:
                Instant instant = Instant.c;
                return Instant.M(objectInput.readLong(), objectInput.readInt());
            case 3:
                f fVar = f.d;
                return f.T(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return i.V(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                f fVar2 = f.d;
                return LocalDateTime.O(f.T(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.V(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                f fVar3 = f.d;
                LocalDateTime O = LocalDateTime.O(f.T(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.V(objectInput));
                ZoneOffset T = ZoneOffset.T(objectInput);
                v vVar = (v) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(O, "localDateTime");
                Objects.requireNonNull(T, "offset");
                Objects.requireNonNull(vVar, "zone");
                if (!(vVar instanceof ZoneOffset) || T.equals(vVar)) {
                    return new y(O, vVar, T);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = w.c;
                String readUTF = objectInput.readUTF();
                Objects.requireNonNull(readUTF, "zoneId");
                return (readUTF.length() <= 1 || readUTF.startsWith("+") || readUTF.startsWith("-")) ? ZoneOffset.P(readUTF) : (readUTF.startsWith("UTC") || readUTF.startsWith("GMT")) ? v.N(readUTF, 3) : readUTF.startsWith("UT") ? v.N(readUTF, 2) : w.P(readUTF);
            case 8:
                return ZoneOffset.T(objectInput);
            case 9:
                int i2 = o.c;
                return new o(i.V(objectInput), ZoneOffset.T(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                f fVar4 = f.d;
                return new OffsetDateTime(LocalDateTime.O(f.T(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.V(objectInput)), ZoneOffset.T(objectInput));
            case 11:
                int i4 = s.b;
                return s.L(objectInput.readInt());
            case 12:
                int i5 = u.c;
                int readInt2 = objectInput.readInt();
                byte readByte = objectInput.readByte();
                j$.time.temporal.a.YEAR.J(readInt2);
                j$.time.temporal.a.MONTH_OF_YEAR.J(readByte);
                return new u(readInt2, readByte);
            case 13:
                int i6 = m.c;
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                k O2 = k.O(readByte2);
                Objects.requireNonNull(O2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.J(readByte3);
                if (readByte3 <= O2.N()) {
                    return new m(O2.getValue(), readByte3);
                }
                throw new a("Illegal value for DayOfMonth field, value " + ((int) readByte3) + " is not valid for month " + O2.name());
            case 14:
                p pVar = p.d;
                int readInt3 = objectInput.readInt();
                int readInt4 = objectInput.readInt();
                int readInt5 = objectInput.readInt();
                return ((readInt3 | readInt4) | readInt5) == 0 ? p.d : new p(readInt3, readInt4, readInt5);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
