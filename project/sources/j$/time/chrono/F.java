package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public F() {
    }

    public F(byte b, Object obj) {
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
                objectOutput.writeUTF(((AbstractC3794a) obj).i());
                return;
            case 2:
                C3800g c3800g = (C3800g) obj;
                objectOutput.writeObject(c3800g.a);
                objectOutput.writeObject(c3800g.b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.a);
                objectOutput.writeObject(lVar.b);
                objectOutput.writeObject(lVar.c);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((z) obj).a);
                return;
            case 6:
                r rVar = (r) obj;
                objectOutput.writeObject(rVar.a);
                objectOutput.writeInt(j$.time.temporal.r.a(rVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(rVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(rVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                D d = (D) obj;
                d.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(d, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(d, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(d, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j = (J) obj;
                j.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(j, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(j, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(j, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                C3801h c3801h = (C3801h) obj;
                objectOutput.writeUTF(c3801h.a.i());
                objectOutput.writeInt(c3801h.b);
                objectOutput.writeInt(c3801h.c);
                objectOutput.writeInt(c3801h.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object b0;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC3794a.a;
                b0 = j$.com.android.tools.r8.a.b0(objectInput.readUTF());
                break;
            case 2:
                b0 = ((InterfaceC3795b) objectInput.readObject()).z((j$.time.i) objectInput.readObject());
                break;
            case 3:
                b0 = ((InterfaceC3798e) objectInput.readObject()).s((ZoneOffset) objectInput.readObject()).h((j$.time.v) objectInput.readObject());
                break;
            case 4:
                j$.time.f fVar = y.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                w.c.getClass();
                b0 = new y(j$.time.f.T(readInt, readByte2, readByte3));
                break;
            case 5:
                z zVar = z.d;
                b0 = z.m(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                pVar.getClass();
                b0 = new r(pVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                B.c.getClass();
                b0 = new D(j$.time.f.T(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                H.c.getClass();
                b0 = new J(j$.time.f.T(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i = C3801h.e;
                b0 = new C3801h(j$.com.android.tools.r8.a.b0(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = b0;
    }

    private Object readResolve() {
        return this.b;
    }
}
