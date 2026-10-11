package ax.w4;

/* renamed from: ax.w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3341a {

    /* renamed from: ax.w4.a$a, reason: collision with other inner class name */
    public static final class C0483a extends AbstractC3341a {
        private StringBuilder a;
        private boolean b = false;

        public C0483a(StringBuilder sb) {
            this.a = sb;
        }

        private void g() {
            if (this.b) {
                this.a.append(", ");
            } else {
                this.b = true;
            }
        }

        @Override // ax.w4.AbstractC3341a
        public AbstractC3341a a(String str) {
            g();
            StringBuilder sb = this.a;
            sb.append(str);
            sb.append('=');
            this.b = false;
            return this;
        }

        @Override // ax.w4.AbstractC3341a
        public AbstractC3341a b() {
            this.a.append(")");
            this.b = true;
            return this;
        }

        @Override // ax.w4.AbstractC3341a
        public AbstractC3341a c(String str) {
            if (str != null) {
                this.a.append(str);
            }
            this.a.append("(");
            this.b = false;
            return this;
        }

        @Override // ax.w4.AbstractC3341a
        public AbstractC3341a f(String str) {
            g();
            this.a.append(str);
            return this;
        }
    }

    public abstract AbstractC3341a a(String str);

    public abstract AbstractC3341a b();

    public abstract AbstractC3341a c(String str);

    public AbstractC3341a d(AbstractC3342b abstractC3342b) {
        if (abstractC3342b == null) {
            f("null");
            return this;
        }
        c(abstractC3342b.b());
        abstractC3342b.a(this);
        b();
        return this;
    }

    public AbstractC3341a e(String str) {
        if (str == null) {
            f("null");
            return this;
        }
        f(C3346f.f(str));
        return this;
    }

    public abstract AbstractC3341a f(String str);
}
