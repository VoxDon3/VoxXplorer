package ax.R8;

import ax.Y8.c;
import ax.h9.C2171b;
import java.util.Set;

/* loaded from: classes3.dex */
public class u extends ax.Q8.q {
    private final ax.Q8.i e;
    private final a f;
    private final ax.L8.b g;
    private final byte[] h;
    private final Set<Object> i;

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

    public u(ax.Q8.g gVar, long j, long j2, a aVar, ax.Q8.i iVar, ax.L8.b bVar, Set<Object> set, byte[] bArr) {
        super(33, gVar, ax.Q8.m.SMB2_SET_INFO, j, j2);
        this.e = iVar;
        this.f = aVar;
        this.g = bVar;
        this.h = bArr == null ? new byte[0] : bArr;
        this.i = set;
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        c2171b.j((byte) this.f.getValue());
        c2171b.j(this.g == null ? (byte) 0 : (byte) r0.getValue());
        c2171b.u(this.h.length);
        c2171b.s(96);
        c2171b.X();
        Set<Object> set = this.i;
        c2171b.u(set == null ? 0L : c.a.e(set));
        this.e.b(c2171b);
        c2171b.o(this.h);
    }
}
