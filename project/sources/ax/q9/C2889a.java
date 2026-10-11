package ax.q9;

import ax.Q8.g;
import ax.Q8.k;
import java.util.Set;
import java.util.UUID;

/* renamed from: ax.q9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2889a {
    private boolean a = false;
    private String b;
    private int c;
    private UUID d;
    private g e;
    private int f;
    private Set<k> g;

    public C2889a(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public Set<k> a() {
        return this.g;
    }

    public g b() {
        return this.e;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.f;
    }

    public UUID e() {
        return this.d;
    }

    public String f() {
        return this.b;
    }

    public void g(UUID uuid, g gVar, int i, Set<k> set) {
        if (this.a) {
            throw new IllegalStateException(String.format("Server object '%s' already initialized", this.b));
        }
        this.a = true;
        this.d = uuid;
        this.e = gVar;
        this.f = i;
        this.g = set;
    }

    public boolean h(C2889a c2889a) {
        return c2889a.e().equals(this.d) && c2889a.b().equals(this.e) && (c2889a.d() == this.f) && c2889a.a().equals(this.g);
    }
}
