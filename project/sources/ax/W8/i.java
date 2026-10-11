package ax.W8;

import ax.Y8.c;
import ax.Z8.a;
import j$.util.Objects;

/* loaded from: classes3.dex */
public class i {
    private b a;
    private c b;
    private int c;
    private a d;

    public enum a implements ax.Y8.c<a> {
        NTLMSSP_REVISION_W2K3(15);

        private long q;

        a(int i) {
            this.q = i;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public enum b implements ax.Y8.c<b> {
        WINDOWS_MAJOR_VERSION_5(5),
        WINDOWS_MAJOR_VERSION_6(6),
        WINDOWS_MAJOR_VERSION_10(10);

        private long q;

        b(int i) {
            this.q = i;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public enum c implements ax.Y8.c<c> {
        WINDOWS_MINOR_VERSION_0(0),
        WINDOWS_MINOR_VERSION_1(1),
        WINDOWS_MINOR_VERSION_2(2),
        WINDOWS_MINOR_VERSION_3(3);

        private long q;

        c(int i) {
            this.q = i;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public i(b bVar, c cVar, int i, a aVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = i;
        this.d = aVar;
    }

    public a a() {
        return this.d;
    }

    i b(a.c cVar) throws a.b {
        this.a = (b) c.a.f(cVar.z(), b.class, null);
        this.b = (c) c.a.f(cVar.z(), c.class, null);
        this.c = cVar.J();
        cVar.U(3);
        this.d = (a) c.a.f(cVar.z(), a.class, null);
        return this;
    }

    void c(a.c cVar) {
        cVar.j((byte) this.a.q);
        cVar.j((byte) this.b.q);
        cVar.s(this.c);
        cVar.o(new byte[]{0, 0, 0});
        cVar.j((byte) this.d.getValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i iVar = (i) obj;
            if (this.c == iVar.c && this.a == iVar.a && this.b == iVar.b && this.d == iVar.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), this.d);
    }

    public String toString() {
        return String.format("WindowsVersion[%s, %s, %d, %s]", this.a, this.b, Integer.valueOf(this.c), this.d);
    }

    i() {
    }
}
