package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class i implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i[] h = new i[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            i[] iVarArr = h;
            if (i < iVarArr.length) {
                iVarArr[i] = new i(i, 0, 0, 0);
                i++;
            } else {
                i iVar = iVarArr[0];
                g = iVar;
                i iVar2 = iVarArr[12];
                e = iVar;
                f = new i(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static i P(long j) {
        j$.time.temporal.a.NANO_OF_DAY.J(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return M(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static i N(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        i iVar = (i) nVar.J(j$.time.temporal.r.g);
        if (iVar != null) {
            return iVar;
        }
        throw new a("Unable to obtain LocalTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static i M(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new i(i, i2, i3, i4);
    }

    public i(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).L();
        }
        return qVar != null && qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return O(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return W();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return W() / 1000;
            }
            return O(qVar);
        }
        return qVar.l(this);
    }

    public final int O(j$.time.temporal.q qVar) {
        int i = h.a[((j$.time.temporal.a) qVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (W() / 1000000);
            case 7:
                return this.c;
            case 8:
                return X();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.m
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final i d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (i) qVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.J(j);
        int i = h.a[aVar.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return Z((int) j);
            case 2:
                return P(j);
            case 3:
                return Z(((int) j) * 1000);
            case 4:
                return P(j * 1000);
            case 5:
                return Z(((int) j) * 1000000);
            case 6:
                return P(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.J(i3);
                    return M(b3, b, i3, i2);
                }
                return this;
            case 8:
                return U(j - X());
            case 9:
                int i4 = (int) j;
                if (b != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.J(i4);
                    return M(b3, i4, b2, i2);
                }
                return this;
            case 10:
                return S(j - ((b3 * 60) + b));
            case 11:
                return R(j - (b3 % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return R(j - (b3 % 12));
            case 13:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.J(i5);
                    return M(i5, b, b2, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.J(i6);
                    return M(i6, b, b2, i2);
                }
                return this;
            case 15:
                return R((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    public final i Z(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.J(i);
        return M(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.m
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final i e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (h.b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return T(j);
                case 2:
                    return T((j % 86400000000L) * 1000);
                case 3:
                    return T((j % 86400000) * 1000000);
                case 4:
                    return U(j);
                case 5:
                    return S(j);
                case 6:
                    return R(j);
                case 7:
                    return R((j % 2) * 12);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (i) sVar.j(this, j);
    }

    public final i R(long j) {
        if (j == 0) {
            return this;
        }
        return M(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final i S(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return M(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final i U(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return M(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final i T(long j) {
        if (j != 0) {
            long W = W();
            long j2 = (((j % 86400000000000L) + W) + 86400000000000L) % 86400000000000L;
            if (W != j2) {
                return M((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == j$.time.temporal.r.b || mVar == j$.time.temporal.r.a || mVar == j$.time.temporal.r.e || mVar == j$.time.temporal.r.d) {
            return null;
        }
        if (mVar == j$.time.temporal.r.g) {
            return this;
        }
        if (mVar == j$.time.temporal.r.f) {
            return null;
        }
        if (mVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.NANOS;
        }
        return mVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return mVar.d(W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int X() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long W() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        int compare = Integer.compare(this.a, iVar.a);
        return (compare == 0 && (compare = Integer.compare(this.b, iVar.b)) == 0 && (compare = Integer.compare(this.c, iVar.c)) == 0) ? Integer.compare(this.d, iVar.d) : compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.a == iVar.a && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(f fVar) {
        return (i) j$.com.android.tools.r8.a.a(fVar, this);
    }

    public final int hashCode() {
        long W = W();
        return (int) (W ^ (W >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void a0(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    public static i V(ObjectInput objectInput) {
        int readInt;
        int i;
        int readByte = objectInput.readByte();
        byte b = 0;
        if (readByte >= 0) {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r6 = ~readByte2;
                readInt = 0;
                b = r6;
                i = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    b = readByte2;
                } else {
                    readInt = objectInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
            j$.time.temporal.a.HOUR_OF_DAY.J(readByte);
            j$.time.temporal.a.MINUTE_OF_HOUR.J(b);
            j$.time.temporal.a.SECOND_OF_MINUTE.J(i);
            j$.time.temporal.a.NANO_OF_SECOND.J(readInt);
            return M(readByte, b, i, readInt);
        }
        readByte = ~readByte;
        i = 0;
        readInt = 0;
        j$.time.temporal.a.HOUR_OF_DAY.J(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.J(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.J(i);
        j$.time.temporal.a.NANO_OF_SECOND.J(readInt);
        return M(readByte, b, i, readInt);
    }
}
