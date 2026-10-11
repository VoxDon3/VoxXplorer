package ax.P3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
final class b implements ax.M3.h {
    private final ax.M3.h b;
    private final ax.M3.h c;

    public b(ax.M3.h hVar, ax.M3.h hVar2) {
        this.b = hVar;
        this.c = hVar2;
    }

    @Override // ax.M3.h
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // ax.M3.h
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.b.equals(bVar.b) && this.c.equals(bVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.M3.h
    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
