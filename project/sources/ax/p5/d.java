package ax.p5;

import ax.p5.p;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class d extends p {
    private final String a;
    private final byte[] b;
    private final ax.n5.e c;

    static final class b extends p.a {
        private String a;
        private byte[] b;
        private ax.n5.e c;

        b() {
        }

        @Override // ax.p5.p.a
        public p a() {
            String str = this.a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " backendName";
            }
            if (this.c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new d(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // ax.p5.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = str;
            return this;
        }

        @Override // ax.p5.p.a
        public p.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // ax.p5.p.a
        public p.a d(ax.n5.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = eVar;
            return this;
        }
    }

    @Override // ax.p5.p
    public String b() {
        return this.a;
    }

    @Override // ax.p5.p
    public byte[] c() {
        return this.b;
    }

    @Override // ax.p5.p
    public ax.n5.e d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a.equals(pVar.b())) {
                if (Arrays.equals(this.b, pVar instanceof d ? ((d) pVar).b : pVar.c()) && this.c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    private d(String str, byte[] bArr, ax.n5.e eVar) {
        this.a = str;
        this.b = bArr;
        this.c = eVar;
    }
}
