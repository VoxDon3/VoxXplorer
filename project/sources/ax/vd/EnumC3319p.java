package ax.vd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ax.vd.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC3319p implements InterfaceC3306c {
    public static final EnumC3319p c0;
    public static final EnumC3319p d0;
    private static final /* synthetic */ EnumC3319p[] e0;
    public static final EnumC3319p q;

    /* renamed from: ax.vd.p$a */
    enum a extends EnumC3319p {
        a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("ASCII", 0);
        q = aVar;
        EnumC3319p enumC3319p = new EnumC3319p("UTF8", 1) { // from class: ax.vd.p.b
            {
                a aVar2 = null;
            }
        };
        c0 = enumC3319p;
        EnumC3319p enumC3319p2 = new EnumC3319p("PKCS12", 2) { // from class: ax.vd.p.c
            {
                a aVar2 = null;
            }
        };
        d0 = enumC3319p2;
        e0 = new EnumC3319p[]{aVar, enumC3319p, enumC3319p2};
    }

    private EnumC3319p(String str, int i) {
    }

    public static EnumC3319p valueOf(String str) {
        return (EnumC3319p) Enum.valueOf(EnumC3319p.class, str);
    }

    public static EnumC3319p[] values() {
        return (EnumC3319p[]) e0.clone();
    }

    /* synthetic */ EnumC3319p(String str, int i, a aVar) {
        this(str, i);
    }
}
