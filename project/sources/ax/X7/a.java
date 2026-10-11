package ax.X7;

import ax.X7.d;
import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
public final class a {
    private int a;
    private d.a b = d.a.DEFAULT;

    /* renamed from: ax.X7.a$a, reason: collision with other inner class name */
    private static final class C0219a implements d {
        private final int a;
        private final d.a b;

        C0219a(int i, d.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.tag() && this.b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // ax.X7.d
        public d.a intEncoding() {
            return this.b;
        }

        @Override // ax.X7.d
        public int tag() {
            return this.a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0219a(this.a, this.b);
    }

    public a c(int i) {
        this.a = i;
        return this;
    }
}
