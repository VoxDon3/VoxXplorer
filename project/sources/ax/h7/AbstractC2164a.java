package ax.h7;

import ax.g7.AbstractC2127a;
import ax.i7.r;
import ax.i7.w;
import ax.l7.AbstractC2475c;
import ax.l7.C2477e;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ax.h7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2164a extends AbstractC2127a {

    /* renamed from: ax.h7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0324a extends AbstractC2127a.AbstractC0315a {
        protected AbstractC0324a(w wVar, AbstractC2475c abstractC2475c, String str, String str2, r rVar, boolean z) {
            super(wVar, str, str2, new C2477e.a(abstractC2475c).b(z ? Arrays.asList("data", "error") : Collections.EMPTY_SET).a(), rVar);
        }

        public AbstractC0324a e(String str) {
            return (AbstractC0324a) super.a(str);
        }

        @Override // ax.g7.AbstractC2127a.AbstractC0315a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC0324a c(String str) {
            return (AbstractC0324a) super.c(str);
        }

        @Override // ax.g7.AbstractC2127a.AbstractC0315a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC0324a d(String str) {
            return (AbstractC0324a) super.d(str);
        }
    }

    protected AbstractC2164a(AbstractC0324a abstractC0324a) {
        super(abstractC0324a);
    }

    public final AbstractC2475c k() {
        return d().b();
    }

    @Override // ax.g7.AbstractC2127a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C2477e d() {
        return (C2477e) super.d();
    }
}
