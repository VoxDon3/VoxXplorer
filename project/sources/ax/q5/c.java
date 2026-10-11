package ax.q5;

import android.content.Context;
import ax.z5.InterfaceC3550a;

/* loaded from: classes.dex */
final class c extends h {
    private final Context a;
    private final InterfaceC3550a b;
    private final InterfaceC3550a c;
    private final String d;

    c(Context context, InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (interfaceC3550a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = interfaceC3550a;
        if (interfaceC3550a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = interfaceC3550a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // ax.q5.h
    public Context b() {
        return this.a;
    }

    @Override // ax.q5.h
    public String c() {
        return this.d;
    }

    @Override // ax.q5.h
    public InterfaceC3550a d() {
        return this.c;
    }

    @Override // ax.q5.h
    public InterfaceC3550a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.a.equals(hVar.b()) && this.b.equals(hVar.e()) && this.c.equals(hVar.d()) && this.d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
