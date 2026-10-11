package ax.Lb;

/* loaded from: classes3.dex */
public final class e extends c implements b<Integer> {
    public static final a f0 = new a(null);
    private static final e g0 = new e(1, 0);

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final e a() {
            return e.g0;
        }

        private a() {
        }
    }

    public e(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // ax.Lb.c
    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return k() == eVar.k() && l() == eVar.l();
    }

    @Override // ax.Lb.c
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (k() * 31) + l();
    }

    @Override // ax.Lb.c, ax.Lb.b
    public boolean isEmpty() {
        return k() > l();
    }

    public boolean r(int i) {
        return k() <= i && i <= l();
    }

    @Override // ax.Lb.b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i() {
        return Integer.valueOf(l());
    }

    @Override // ax.Lb.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer g() {
        return Integer.valueOf(k());
    }

    @Override // ax.Lb.c
    public String toString() {
        return k() + ".." + l();
    }
}
