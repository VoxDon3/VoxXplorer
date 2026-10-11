package ax.Lc;

/* loaded from: classes3.dex */
public enum c {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", a.j().p());

    private final transient boolean c0;
    private final String q;

    c(String str, boolean z) {
        this.q = str;
        this.c0 = z;
    }

    public static c l(c cVar, c cVar2) {
        return cVar != null ? cVar : cVar2;
    }

    public int h(String str, int i, String str2) {
        int length;
        if (str == null || str2 == null || (length = str.length() - str2.length()) < i) {
            return -1;
        }
        while (i <= length) {
            if (j(str, i, str2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean j(String str, int i, String str2) {
        return (str == null || str2 == null || !str.regionMatches(this.c0 ^ true, i, str2, 0, str2.length())) ? false : true;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.q;
    }
}
