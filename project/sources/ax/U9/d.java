package ax.U9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
abstract class d {
    public static final d q = new a("PHONE", 0);
    public static final d c0 = new d("TABLET", 1) { // from class: ax.U9.d.b
        {
            a aVar = null;
        }

        @Override // ax.U9.d
        public l h() {
            return l.ANDROID_TABLET;
        }
    };
    private static final /* synthetic */ d[] d0 = d();

    enum a extends d {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // ax.U9.d
        public l h() {
            return l.ANDROID_PHONE;
        }
    }

    private d(String str, int i) {
    }

    private static /* synthetic */ d[] d() {
        return new d[]{q, c0};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d0.clone();
    }

    public abstract l h();

    /* synthetic */ d(String str, int i, a aVar) {
        this(str, i);
    }
}
