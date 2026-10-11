package ax.M3;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements h {
    private final ax.B.a<i<?>, Object> b = new ax.B.a<>();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(i<T> iVar, Object obj, MessageDigest messageDigest) {
        iVar.g(obj, messageDigest);
    }

    @Override // ax.M3.h
    public void a(MessageDigest messageDigest) {
        for (Map.Entry<i<?>, Object> entry : this.b.entrySet()) {
            f(entry.getKey(), entry.getValue(), messageDigest);
        }
    }

    public <T> T c(i<T> iVar) {
        return this.b.containsKey(iVar) ? (T) this.b.get(iVar) : iVar.c();
    }

    public void d(j jVar) {
        this.b.g(jVar.b);
    }

    public <T> j e(i<T> iVar, T t) {
        this.b.put(iVar, t);
        return this;
    }

    @Override // ax.M3.h
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.b.equals(((j) obj).b);
        }
        return false;
    }

    @Override // ax.M3.h
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.b + '}';
    }
}
