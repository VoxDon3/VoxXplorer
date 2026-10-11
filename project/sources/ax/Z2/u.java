package ax.Z2;

/* loaded from: classes.dex */
public class u {
    public a a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;

    public enum a {
        PRIMARY,
        SDCARD,
        USB,
        SDCARD_DOCUMENT,
        ODD,
        CHROMEOS,
        IGNORE,
        UNKNOWN_STORAGE,
        UNKNOWN
    }

    public u(a aVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = aVar;
        this.b = str;
        this.g = str2;
        this.c = str3;
        this.d = str4;
        this.f = str5;
        this.e = z;
    }

    public static boolean a(a aVar) {
        return (aVar == a.SDCARD || aVar == a.UNKNOWN) ? false : true;
    }

    public static boolean b(a aVar) {
        return aVar == a.SDCARD;
    }

    public static boolean c(a aVar) {
        return aVar == a.USB;
    }
}
