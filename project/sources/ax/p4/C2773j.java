package ax.p4;

/* renamed from: ax.p4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2773j extends Exception {
    private final String q;

    public C2773j(String str, String str2) {
        super(str2);
        this.q = str;
    }

    public C2773j(String str, Throwable th) {
        this(null, str, th);
    }

    public C2773j(String str, String str2, Throwable th) {
        super(str2, th);
        this.q = str;
    }
}
