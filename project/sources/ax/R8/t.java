package ax.R8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.Set;

/* loaded from: classes3.dex */
public class t extends ax.Q8.q {
    private ax.Q8.g e;
    private byte f;
    private long g;
    private byte[] h;
    private long i;
    private Set<b> j;

    public enum a implements ax.Y8.c<a> {
        SMB2_NEGOTIATE_SIGNING_ENABLED(1),
        SMB2_NEGOTIATE_SIGNING_REQUIRED(2);

        private long q;

        a(long j) {
            this.q = j;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public enum b implements ax.Y8.c<b> {
        SMB2_SESSION_FLAG_IS_GUEST(1),
        SMB2_SESSION_FLAG_IS_NULL(2),
        SMB2_SESSION_FLAG_ENCRYPT_DATA(4);

        private long q;

        b(long j) {
            this.q = j;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public t() {
    }

    private void p(C2171b c2171b) {
        if (!this.e.j() || this.i == 0) {
            c2171b.j((byte) 0);
        } else {
            c2171b.j((byte) 1);
        }
    }

    private byte[] q(C2171b c2171b, int i, int i2) throws a.b {
        if (i2 <= 0) {
            return new byte[0];
        }
        c2171b.T(i);
        return c2171b.G(i2);
    }

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.J();
        this.j = c.a.d(c2171b.J(), b.class);
        this.h = q(c2171b, c2171b.J(), c2171b.J());
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        p(c2171b);
        c2171b.j(this.f);
        c2171b.u(this.g & 255);
        c2171b.Y();
        c2171b.s(88);
        byte[] bArr = this.h;
        c2171b.s(bArr != null ? bArr.length : 0);
        c2171b.w(this.i);
        byte[] bArr2 = this.h;
        if (bArr2 != null) {
            c2171b.o(bArr2);
        }
    }

    public byte[] n() {
        return this.h;
    }

    public Set<b> o() {
        return this.j;
    }

    public void r(byte[] bArr) {
        this.h = bArr;
    }

    public t(ax.Q8.g gVar, Set<a> set, Set<ax.Q8.k> set2) {
        super(25, gVar, ax.Q8.m.SMB2_SESSION_SETUP);
        this.e = gVar;
        this.f = (byte) c.a.e(set);
        this.g = c.a.e(set2);
    }
}
