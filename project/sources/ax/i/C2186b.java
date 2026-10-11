package ax.i;

/* renamed from: ax.i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2186b {
    public static final a e = new a(null);
    private final float a;
    private final float b;
    private final float c;
    private final int d;

    /* renamed from: ax.i.b$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C2186b(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final float a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2186b(android.window.BackEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "backEvent"
            ax.Gb.l.f(r5, r0)
            ax.i.a r0 = ax.i.C2185a.a
            float r1 = r0.d(r5)
            float r2 = r0.e(r5)
            float r3 = r0.b(r5)
            int r5 = r0.c(r5)
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.i.C2186b.<init>(android.window.BackEvent):void");
    }
}
