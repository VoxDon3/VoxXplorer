package ax.I8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class f {
    private String a;
    private int b;
    private EnumSet<a> c;
    private List<ax.I8.a> d = new ArrayList();

    public enum a implements ax.Y8.c<a> {
        ReferralServers(1),
        StorageServers(2),
        TargetFailback(4);

        private long q;

        a(long j) {
            this.q = j;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public f(String str) {
        this.a = str;
    }

    public List<ax.I8.a> a() {
        return this.d;
    }

    public Set<a> b() {
        return this.c;
    }

    public int c() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.get(0).i();
    }

    public void d(C2171b c2171b) throws a.b {
        this.b = c2171b.J();
        int J = c2171b.J();
        this.c = c.a.d(c2171b.P(), a.class);
        for (int i = 0; i < J; i++) {
            ax.I8.a a2 = ax.I8.a.a(c2171b);
            if (a2.b() == null) {
                a2.m(this.a);
            }
            this.d.add(a2);
        }
    }
}
