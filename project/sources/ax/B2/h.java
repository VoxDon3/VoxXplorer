package ax.B2;

/* loaded from: classes.dex */
public abstract class h {

    class a extends h {
        a() {
        }

        @Override // ax.B2.h
        public g a(String str) {
            return null;
        }
    }

    public static h c() {
        return new a();
    }

    public abstract g a(String str);

    public final g b(String str) {
        g a2 = a(str);
        return a2 == null ? g.a(str) : a2;
    }
}
