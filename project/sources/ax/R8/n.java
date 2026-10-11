package ax.R8;

import ax.Y8.c;
import ax.h9.C2171b;
import java.util.Set;

/* loaded from: classes3.dex */
public class n extends ax.Q8.p {
    private ax.L8.b f;
    private final Set<a> g;
    private final long h;
    private final ax.Q8.i i;
    private final String j;

    public enum a implements ax.Y8.c<a> {
        SMB2_RESTART_SCANS(1),
        SMB2_RETURN_SINGLE_ENTRY(2),
        SMB2_INDEX_SPECIFIED(4),
        SMB2_REOPEN(16);

        private long q;

        a(long j) {
            this.q = j;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public n(ax.Q8.g gVar, long j, long j2, ax.Q8.i iVar, ax.L8.b bVar, Set<a> set, long j3, String str, int i) {
        super(33, gVar, ax.Q8.m.SMB2_QUERY_DIRECTORY, j, j2, i);
        this.f = bVar;
        this.g = set;
        this.h = j3;
        this.i = iVar;
        this.j = str == null ? "*" : str;
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        c2171b.j((byte) this.f.getValue());
        c2171b.j((byte) c.a.e(this.g));
        c2171b.u(this.h);
        this.i.b(c2171b);
        c2171b.s(96);
        c2171b.s(this.j.length() * 2);
        c2171b.u(Math.min(f(), d() * 65536));
        c2171b.Z(this.j);
    }
}
