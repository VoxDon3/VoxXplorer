package ax.e7;

import ax.l7.C2474b;
import ax.m7.C2532g;
import ax.m7.n;
import java.util.List;

/* renamed from: ax.e7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1983a extends C2474b {

    @n
    private int code;

    @n
    private List<Object> details;

    @n
    private List<C0297a> errors;

    @n
    private String message;

    /* renamed from: ax.e7.a$a, reason: collision with other inner class name */
    public static class C0297a extends C2474b {

        @n
        private String domain;

        @n
        private String location;

        @n
        private String locationType;

        @n
        private String message;

        @n
        private String reason;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C0297a clone() {
            return (C0297a) super.clone();
        }

        public final String n() {
            return this.reason;
        }

        @Override // ax.l7.C2474b
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C0297a f(String str, Object obj) {
            return (C0297a) super.f(str, obj);
        }
    }

    static {
        C2532g.j(C0297a.class);
    }

    @Override // ax.l7.C2474b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1983a clone() {
        return (C1983a) super.clone();
    }

    public final List<C0297a> n() {
        return this.errors;
    }

    @Override // ax.l7.C2474b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C1983a f(String str, Object obj) {
        return (C1983a) super.f(str, obj);
    }
}
