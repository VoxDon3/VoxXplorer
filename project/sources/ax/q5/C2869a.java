package ax.q5;

import ax.q5.f;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* renamed from: ax.q5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2869a extends f {
    private final Iterable<ax.p5.i> a;
    private final byte[] b;

    /* renamed from: ax.q5.a$b */
    static final class b extends f.a {
        private Iterable<ax.p5.i> a;
        private byte[] b;

        b() {
        }

        @Override // ax.q5.f.a
        public f a() {
            Iterable<ax.p5.i> iterable = this.a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (iterable == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " events";
            }
            if (str.isEmpty()) {
                return new C2869a(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.q5.f.a
        public f.a b(Iterable<ax.p5.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.a = iterable;
            return this;
        }

        @Override // ax.q5.f.a
        public f.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // ax.q5.f
    public Iterable<ax.p5.i> b() {
        return this.a;
    }

    @Override // ax.q5.f
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.a.equals(fVar.b())) {
                if (Arrays.equals(this.b, fVar instanceof C2869a ? ((C2869a) fVar).b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    private C2869a(Iterable<ax.p5.i> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
