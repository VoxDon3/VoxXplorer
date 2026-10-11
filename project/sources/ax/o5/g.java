package ax.o5;

import ax.o5.q;
import java.util.Arrays;

/* loaded from: classes.dex */
final class g extends q {
    private final byte[] a;
    private final byte[] b;

    static final class b extends q.a {
        private byte[] a;
        private byte[] b;

        b() {
        }

        @Override // ax.o5.q.a
        public q a() {
            return new g(this.a, this.b);
        }

        @Override // ax.o5.q.a
        public q.a b(byte[] bArr) {
            this.a = bArr;
            return this;
        }

        @Override // ax.o5.q.a
        public q.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // ax.o5.q
    public byte[] b() {
        return this.a;
    }

    @Override // ax.o5.q
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z = qVar instanceof g;
            if (Arrays.equals(this.a, z ? ((g) qVar).a : qVar.b())) {
                if (Arrays.equals(this.b, z ? ((g) qVar).b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }
}
