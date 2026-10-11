package ax.R8;

import ax.Y8.c;
import ax.h9.C2171b;
import java.util.Set;

/* loaded from: classes3.dex */
public class p extends ax.Q8.q {
    private final ax.Q8.i e;
    private final a f;
    private final ax.L8.b g;
    private final ax.L8.d h;
    private final byte[] i;
    private final Set<Object> j;

    public enum a implements ax.Y8.c<a> {
        SMB2_0_INFO_FILE(1),
        SMB2_0_INFO_FILESYSTEM(2),
        SMB2_0_INFO_SECURITY(3),
        SMB2_0_INFO_QUOTA(4);

        private long q;

        a(long j) {
            this.q = j;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public p(ax.Q8.g gVar, long j, long j2, ax.Q8.i iVar, a aVar, ax.L8.b bVar, ax.L8.d dVar, byte[] bArr, Set<Object> set) {
        super(41, gVar, ax.Q8.m.SMB2_QUERY_INFO, j, j2);
        this.f = aVar;
        this.g = bVar;
        this.h = dVar;
        this.i = bArr;
        this.j = set;
        this.e = iVar;
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        c2171b.j((byte) this.f.getValue());
        int ordinal = this.f.ordinal();
        char c = 'h';
        if (ordinal != 0) {
            if (ordinal == 1) {
                c2171b.j((byte) this.h.getValue());
                c2171b.u(65536L);
                c2171b.s(0);
                c2171b.X();
                c2171b.u(0L);
                c2171b.u(0L);
                c2171b.u(0L);
                this.e.b(c2171b);
            } else if (ordinal == 2) {
                c2171b.j((byte) 0);
                c2171b.u(65536L);
                c2171b.s(0);
                c2171b.X();
                c2171b.u(0L);
                c2171b.u(c.a.e(this.j));
                c2171b.u(0L);
                this.e.b(c2171b);
            } else {
                if (ordinal != 3) {
                    throw new IllegalStateException("Unknown SMB2QueryInfoType: " + this.f);
                }
                c2171b.j((byte) 0);
                c2171b.u(65536L);
                c2171b.s(0);
                c2171b.X();
                c2171b.u(this.i.length);
                c2171b.u(0L);
                c2171b.u(0L);
                this.e.b(c2171b);
            }
            c = 0;
        } else {
            c2171b.j((byte) this.g.getValue());
            c2171b.u(65536L);
            if (this.g == ax.L8.b.FileFullEaInformation) {
                c2171b.s(0);
                c2171b.X();
                c2171b.u(this.i.length);
            } else {
                c2171b.s(0);
                c2171b.X();
                c2171b.u(0L);
                c = 0;
            }
            c2171b.u(0L);
            c2171b.u(0L);
            this.e.b(c2171b);
        }
        if (c > 0) {
            c2171b.o(this.i);
        }
    }
}
