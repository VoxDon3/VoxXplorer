package ax.E1;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends i {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    private final i[] g;

    public c(String str, int i, int i2, long j, long j2, i[] iVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Objects.equals(this.b, cVar.b) && Arrays.equals(this.g, cVar.g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
