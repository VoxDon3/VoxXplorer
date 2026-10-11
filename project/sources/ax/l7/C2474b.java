package ax.l7;

import ax.m7.C2523B;
import ax.m7.k;
import java.io.IOException;

/* renamed from: ax.l7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2474b extends k implements Cloneable {
    private AbstractC2475c e0;

    @Override // ax.m7.k, java.util.AbstractMap
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C2474b clone() {
        return (C2474b) super.clone();
    }

    @Override // ax.m7.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2474b f(String str, Object obj) {
        return (C2474b) super.f(str, obj);
    }

    public final void k(AbstractC2475c abstractC2475c) {
        this.e0 = abstractC2475c;
    }

    public String l() throws IOException {
        AbstractC2475c abstractC2475c = this.e0;
        return abstractC2475c != null ? abstractC2475c.f(this) : super.toString();
    }

    @Override // ax.m7.k, java.util.AbstractMap
    public String toString() {
        AbstractC2475c abstractC2475c = this.e0;
        if (abstractC2475c == null) {
            return super.toString();
        }
        try {
            return abstractC2475c.g(this);
        } catch (IOException e) {
            throw C2523B.a(e);
        }
    }
}
