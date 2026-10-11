package ax.m4;

/* renamed from: ax.m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2515a {
    private String a;
    private String b;

    public C2515a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("username and password cannot be null");
        }
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
