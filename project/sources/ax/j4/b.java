package ax.j4;

import ax.M3.h;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class b implements h {
    private final Object b;

    public b(Object obj) {
        this.b = ax.k4.h.d(obj);
    }

    @Override // ax.M3.h
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(h.a));
    }

    @Override // ax.M3.h
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    @Override // ax.M3.h
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
