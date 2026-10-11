package ax.J7;

import java.io.File;

/* renamed from: ax.J7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0757b extends AbstractC0775u {
    private final ax.L7.F a;
    private final String b;
    private final File c;

    C0757b(ax.L7.F f, String str, File file) {
        if (f == null) {
            throw new NullPointerException("Null report");
        }
        this.a = f;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.c = file;
    }

    @Override // ax.J7.AbstractC0775u
    public ax.L7.F b() {
        return this.a;
    }

    @Override // ax.J7.AbstractC0775u
    public File c() {
        return this.c;
    }

    @Override // ax.J7.AbstractC0775u
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0775u) {
            AbstractC0775u abstractC0775u = (AbstractC0775u) obj;
            if (this.a.equals(abstractC0775u.b()) && this.b.equals(abstractC0775u.d()) && this.c.equals(abstractC0775u.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
