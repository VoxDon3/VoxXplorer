package ax.p7;

import ax.l7.C2474b;
import ax.m7.C2532g;
import ax.m7.n;
import java.util.List;

/* renamed from: ax.p7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2780d extends C2474b {

    @n
    private List<C2779c> files;

    @n
    private Boolean incompleteSearch;

    @n
    private String kind;

    @n
    private String nextPageToken;

    static {
        C2532g.j(C2779c.class);
    }

    @Override // ax.l7.C2474b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2780d clone() {
        return (C2780d) super.clone();
    }

    public List<C2779c> n() {
        return this.files;
    }

    public String o() {
        return this.nextPageToken;
    }

    @Override // ax.l7.C2474b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2780d f(String str, Object obj) {
        return (C2780d) super.f(str, obj);
    }
}
