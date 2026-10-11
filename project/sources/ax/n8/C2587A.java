package ax.n8;

/* renamed from: ax.n8.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2587A {
    private final EnumC2607j a;
    private final C2590D b;
    private final C2599b c;

    public C2587A(EnumC2607j enumC2607j, C2590D c2590d, C2599b c2599b) {
        ax.Gb.l.f(enumC2607j, "eventType");
        ax.Gb.l.f(c2590d, "sessionData");
        ax.Gb.l.f(c2599b, "applicationInfo");
        this.a = enumC2607j;
        this.b = c2590d;
        this.c = c2599b;
    }

    public final C2599b a() {
        return this.c;
    }

    public final EnumC2607j b() {
        return this.a;
    }

    public final C2590D c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2587A)) {
            return false;
        }
        C2587A c2587a = (C2587A) obj;
        return this.a == c2587a.a && ax.Gb.l.a(this.b, c2587a.b) && ax.Gb.l.a(this.c, c2587a.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.a + ", sessionData=" + this.b + ", applicationInfo=" + this.c + ')';
    }
}
