package ax.k4;

/* loaded from: classes.dex */
public class g {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public g() {
    }

    public void a(Class<?> cls, Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b) && i.c(this.c, gVar.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public g(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public g(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}
