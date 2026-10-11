package ax.E1;

import ax.P0.A;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends i {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // ax.E1.i, ax.P0.C.a
    public void b(A.b bVar) {
        bVar.K(this.e, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.b, aVar.b) && Objects.equals(this.c, aVar.c) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (527 + this.d) * 31;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // ax.E1.i
    public String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
