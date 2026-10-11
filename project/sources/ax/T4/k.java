package ax.T4;

/* loaded from: classes.dex */
public class k extends c {
    protected h q;

    protected k(String str, h hVar, Throwable th) {
        super(str, th);
        this.q = hVar;
    }

    public h a() {
        return this.q;
    }

    protected String b() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        h a = a();
        String b = b();
        if (a == null && b == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (b != null) {
            sb.append(b);
        }
        if (a != null) {
            sb.append('\n');
            sb.append(" at ");
            sb.append(a.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected k(String str) {
        super(str);
    }

    protected k(String str, h hVar) {
        this(str, hVar, null);
    }
}
