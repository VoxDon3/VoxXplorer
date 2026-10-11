package ax.r8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ax.r8.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC3010s {
    public static final EnumC3010s c0;
    private static final /* synthetic */ EnumC3010s[] d0;
    public static final EnumC3010s q;

    /* renamed from: ax.r8.s$a */
    enum a extends EnumC3010s {
        a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        q = aVar;
        EnumC3010s enumC3010s = new EnumC3010s("STRING", 1) { // from class: ax.r8.s.b
            {
                a aVar2 = null;
            }
        };
        c0 = enumC3010s;
        d0 = new EnumC3010s[]{aVar, enumC3010s};
    }

    private EnumC3010s(String str, int i) {
    }

    public static EnumC3010s valueOf(String str) {
        return (EnumC3010s) Enum.valueOf(EnumC3010s.class, str);
    }

    public static EnumC3010s[] values() {
        return (EnumC3010s[]) d0.clone();
    }

    /* synthetic */ EnumC3010s(String str, int i, a aVar) {
        this(str, i);
    }
}
