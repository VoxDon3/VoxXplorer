package ax.N1;

import ax.r7.AbstractC2991z;
import java.util.List;

/* loaded from: classes.dex */
public class e {
    public final AbstractC2991z<ax.R0.a> a;
    public final long b;
    public final long c;
    public final long d;

    public e(List<ax.R0.a> list, long j, long j2) {
        this.a = AbstractC2991z.u(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
