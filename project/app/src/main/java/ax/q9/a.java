/*
 * Decompiled with CFR 0.152.
 */
package ax.q9;

import ax.Q8.g;
import ax.Q8.k;
import java.util.Set;
import java.util.UUID;

public class a {
    private boolean a;
    private String b;
    private int c;
    private UUID d;
    private g e;
    private int f;
    private Set<k> g;

    public a(String string, int n8) {
        this.b = string;
        this.c = n8;
        this.a = false;
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

    public void g(UUID uUID, g g8, int n8, Set<k> set) {
        if (!this.a) {
            this.a = true;
            this.d = uUID;
            this.e = g8;
            this.f = n8;
            this.g = set;
            return;
        }
        throw new IllegalStateException(String.format("Server object '%s' already initialized", this.b));
    }

    public boolean h(a a8) {
        boolean bl = a8.e().equals(this.d);
        boolean bl2 = ((Object)((Object)a8.b())).equals((Object)this.e);
        boolean bl3 = a8.d() == this.f;
        boolean bl4 = a8.a().equals(this.g);
        return bl && bl2 && bl3 && bl4;
    }
}

