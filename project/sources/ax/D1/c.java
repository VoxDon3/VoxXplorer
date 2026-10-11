package ax.D1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements C.a {
    public final byte[] a;
    public final String b;
    public final String c;

    public c(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // ax.P0.C.a
    public /* synthetic */ C0912v a() {
        return B.b(this);
    }

    @Override // ax.P0.C.a
    public void b(A.b bVar) {
        String str = this.b;
        if (str != null) {
            bVar.p0(str);
        }
    }

    @Override // ax.P0.C.a
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((c) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, Integer.valueOf(this.a.length));
    }
}
