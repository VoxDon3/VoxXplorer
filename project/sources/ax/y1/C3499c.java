package ax.y1;

import java.util.List;

/* renamed from: ax.y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3499c {
    public final long a;
    public final List<a> b;

    /* renamed from: ax.y1.c$a */
    public static final class a {
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public a(String str, String str2, long j, long j2) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
        }
    }

    public C3499c(long j, List<a> list) {
        this.a = j;
        this.b = list;
    }

    public ax.F1.a a(long j) {
        long j2;
        if (this.b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            a aVar = this.b.get(size);
            boolean equals = "video/mp4".equals(aVar.a) | z;
            if (size == 0) {
                j3 -= aVar.d;
                j2 = 0;
            } else {
                j2 = j3 - aVar.c;
            }
            long j8 = j2;
            long j9 = j3;
            j3 = j8;
            if (!equals || j3 == j9) {
                z = equals;
            } else {
                j7 = j9 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j9;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new ax.F1.a(j4, j5, this.a, j6, j7);
    }
}
