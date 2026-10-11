/*
 * Decompiled with CFR 0.152.
 */
package ax.p7;

import ax.l7.b;
import ax.m7.g;
import ax.m7.n;
import ax.p7.c;
import java.util.List;

public final class d
extends b {
    @n
    private List<c> files;
    @n
    private Boolean incompleteSearch;
    @n
    private String kind;
    @n
    private String nextPageToken;

    static {
        g.j(c.class);
    }

    public d m() {
        return (d)super.i();
    }

    public List<c> n() {
        return this.files;
    }

    public String o() {
        return this.nextPageToken;
    }

    public d r(String string, Object object) {
        return (d)super.j(string, object);
    }
}

