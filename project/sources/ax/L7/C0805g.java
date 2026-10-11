package ax.L7;

import ax.L7.F;
import java.util.Arrays;

/* renamed from: ax.L7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0805g extends F.d.b {
    private final String a;
    private final byte[] b;

    /* renamed from: ax.L7.g$b */
    static final class b extends F.d.b.a {
        private String a;
        private byte[] b;

        b() {
        }

        @Override // ax.L7.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.a;
            if (str != null && (bArr = this.b) != null) {
                return new C0805g(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" filename");
            }
            if (this.b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.b = bArr;
            return this;
        }

        @Override // ax.L7.F.d.b.a
        public F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.a = str;
            return this;
        }
    }

    @Override // ax.L7.F.d.b
    public byte[] b() {
        return this.b;
    }

    @Override // ax.L7.F.d.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.d.b) {
            F.d.b bVar = (F.d.b) obj;
            if (this.a.equals(bVar.c())) {
                if (Arrays.equals(this.b, bVar instanceof C0805g ? ((C0805g) bVar).b : bVar.b())) {
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
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }

    private C0805g(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}
