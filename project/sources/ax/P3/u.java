package ax.P3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class u implements ax.M3.h {
    private static final ax.k4.e<Class<?>, byte[]> i = new ax.k4.e<>(50);
    private final ax.M3.h b;
    private final ax.M3.h c;
    private final int d;
    private final int e;
    private final Class<?> f;
    private final ax.M3.j g;
    private final ax.M3.m<?> h;

    public u(ax.M3.h hVar, ax.M3.h hVar2, int i2, int i3, ax.M3.m<?> mVar, Class<?> cls, ax.M3.j jVar) {
        this.b = hVar;
        this.c = hVar2;
        this.d = i2;
        this.e = i3;
        this.h = mVar;
        this.f = cls;
        this.g = jVar;
    }

    private byte[] c() {
        ax.k4.e<Class<?>, byte[]> eVar = i;
        byte[] g = eVar.g(this.f);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f.getName().getBytes(ax.M3.h.a);
        eVar.k(this.f, bytes);
        return bytes;
    }

    @Override // ax.M3.h
    public void a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.d).putInt(this.e).array();
        this.c.a(messageDigest);
        this.b.a(messageDigest);
        messageDigest.update(array);
        ax.M3.m<?> mVar = this.h;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.g.a(messageDigest);
        messageDigest.update(c());
    }

    @Override // ax.M3.h
    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.e == uVar.e && this.d == uVar.d && ax.k4.i.c(this.h, uVar.h) && this.f.equals(uVar.f) && this.b.equals(uVar.b) && this.c.equals(uVar.c) && this.g.equals(uVar.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.M3.h
    public int hashCode() {
        int hashCode = (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e;
        ax.M3.m<?> mVar = this.h;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.b + ", signature=" + this.c + ", width=" + this.d + ", height=" + this.e + ", decodedResourceClass=" + this.f + ", transformation='" + this.h + "', options=" + this.g + '}';
    }
}
