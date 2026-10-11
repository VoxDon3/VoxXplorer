package ax.Ja;

/* loaded from: classes3.dex */
public class a extends Exception {
    private int c0;
    private String q;

    public a(String str, int i, String str2) {
        super(str);
        this.c0 = i;
        this.q = str2;
    }

    public String a() {
        return this.q;
    }

    public int b() {
        return this.c0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return String.format("%s (%d %s)", super.getMessage(), Integer.valueOf(this.c0), a());
    }

    public a(Throwable th, int i, String str) {
        super(th);
        this.c0 = i;
        this.q = str;
    }

    public a(Throwable th) {
        super(th);
    }

    public a(String str) {
        super(str);
    }
}
