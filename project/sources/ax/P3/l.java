package ax.P3;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class l implements ax.M3.h {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final ax.M3.h g;
    private final Map<Class<?>, ax.M3.m<?>> h;
    private final ax.M3.j i;
    private int j;

    public l(Object obj, ax.M3.h hVar, int i, int i2, Map<Class<?>, ax.M3.m<?>> map, Class<?> cls, Class<?> cls2, ax.M3.j jVar) {
        this.b = ax.k4.h.d(obj);
        this.g = (ax.M3.h) ax.k4.h.e(hVar, "Signature must not be null");
        this.c = i;
        this.d = i2;
        this.h = (Map) ax.k4.h.d(map);
        this.e = (Class) ax.k4.h.e(cls, "Resource class must not be null");
        this.f = (Class) ax.k4.h.e(cls2, "Transcode class must not be null");
        this.i = (ax.M3.j) ax.k4.h.d(jVar);
    }

    @Override // ax.M3.h
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // ax.M3.h
    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.b.equals(lVar.b) && this.g.equals(lVar.g) && this.d == lVar.d && this.c == lVar.c && this.h.equals(lVar.h) && this.e.equals(lVar.e) && this.f.equals(lVar.f) && this.i.equals(lVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.M3.h
    public int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            this.j = (hashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
