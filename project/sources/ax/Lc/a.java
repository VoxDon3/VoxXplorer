package ax.Lc;

import ax.m.j;
import j$.util.Objects;
import java.util.Locale;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'n0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class a {
    public static final a n0;
    public static final a o0;
    public static final a p0;
    public static final a q0;
    private static final boolean r0;
    private static final boolean s0;
    private static final boolean t0;
    private static final a u0;
    private static final /* synthetic */ a[] v0;
    private final boolean c0;
    private final boolean d0;
    private final int[] e0;
    private final int f0;
    private final int g0;
    private final String[] h0;
    private final boolean i0;
    private final boolean j0;
    private final char k0;
    private final char l0;
    private final b m0;
    private final int q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class b {
        public static final b q = new C0144a("BYTES", 0);
        public static final b c0 = new C0145b("UTF16_CODE_UNITS", 1);
        private static final /* synthetic */ b[] d0 = d();

        /* renamed from: ax.Lc.a$b$a, reason: collision with other inner class name */
        enum C0144a extends b {
            C0144a(String str, int i) {
                super(str, i);
            }
        }

        /* renamed from: ax.Lc.a$b$b, reason: collision with other inner class name */
        enum C0145b extends b {
            C0145b(String str, int i) {
                super(str, i);
            }
        }

        private b(String str, int i) {
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d0.clone();
        }
    }

    static {
        b bVar = b.q;
        n0 = new a("GENERIC", 0, 4096, false, false, 1020, 1048576, new int[]{0}, new String[0], false, false, '/', bVar);
        o0 = new a("LINUX", 1, 8192, true, true, 255, 4096, new int[]{0, 47}, new String[0], false, false, '/', bVar);
        p0 = new a("MAC_OSX", 2, 4096, true, true, 255, 1024, new int[]{0, 47, 58}, new String[0], false, false, '/', bVar);
        q0 = new a("WINDOWS", 3, 4096, false, true, 255, 32767, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 34, 42, 47, 58, 60, 62, 63, 92, j.K0}, new String[]{"AUX", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "COM²", "COM³", "COM¹", "CON", "CONIN$", "CONOUT$", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9", "LPT²", "LPT³", "LPT¹", "NUL", "PRN"}, true, true, '\\', b.c0);
        v0 = d();
        r0 = l("Linux");
        s0 = l("Mac");
        t0 = l("Windows");
        u0 = h();
    }

    private a(String str, int i, int i2, boolean z, boolean z2, int i3, int i4, int[] iArr, String[] strArr, boolean z3, boolean z4, char c, b bVar) {
        this.q = i2;
        this.f0 = i3;
        this.g0 = i4;
        Objects.requireNonNull(iArr, "illegalFileNameChars");
        this.e0 = iArr;
        Objects.requireNonNull(strArr, "reservedFileNames");
        this.h0 = strArr;
        this.i0 = z3;
        this.d0 = z;
        this.c0 = z2;
        this.j0 = z4;
        this.k0 = c;
        this.l0 = ax.Lc.b.a(c);
        this.m0 = bVar;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{n0, o0, p0, q0};
    }

    private static a h() {
        return r0 ? o0 : s0 ? p0 : t0 ? q0 : n0;
    }

    public static a j() {
        return u0;
    }

    private static boolean l(String str) {
        return q(n("os.name"), str);
    }

    private static String n(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            System.err.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    private static boolean q(String str, String str2) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str.toUpperCase(locale).startsWith(str2.toUpperCase(locale));
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) v0.clone();
    }

    public boolean p() {
        return this.d0;
    }
}
