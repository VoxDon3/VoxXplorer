package ax.Qb;

/* renamed from: ax.Qb.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0965y {
    public final Object a;
    public final AbstractC0941j b;
    public final ax.Fb.l<Throwable, ax.sb.t> c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0965y(Object obj, AbstractC0941j abstractC0941j, ax.Fb.l<? super Throwable, ax.sb.t> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = abstractC0941j;
        this.c = lVar;
        this.d = obj2;
        this.e = th;
    }

    public static /* synthetic */ C0965y b(C0965y c0965y, Object obj, AbstractC0941j abstractC0941j, ax.Fb.l lVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c0965y.a;
        }
        if ((i & 2) != 0) {
            abstractC0941j = c0965y.b;
        }
        if ((i & 4) != 0) {
            lVar = c0965y.c;
        }
        if ((i & 8) != 0) {
            obj2 = c0965y.d;
        }
        if ((i & 16) != 0) {
            th = c0965y.e;
        }
        Throwable th2 = th;
        ax.Fb.l lVar2 = lVar;
        return c0965y.a(obj, abstractC0941j, lVar2, obj2, th2);
    }

    public final C0965y a(Object obj, AbstractC0941j abstractC0941j, ax.Fb.l<? super Throwable, ax.sb.t> lVar, Object obj2, Throwable th) {
        return new C0965y(obj, abstractC0941j, lVar, obj2, th);
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d(C0947m<?> c0947m, Throwable th) {
        AbstractC0941j abstractC0941j = this.b;
        if (abstractC0941j != null) {
            c0947m.o(abstractC0941j, th);
        }
        ax.Fb.l<Throwable, ax.sb.t> lVar = this.c;
        if (lVar != null) {
            c0947m.p(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0965y)) {
            return false;
        }
        C0965y c0965y = (C0965y) obj;
        return ax.Gb.l.a(this.a, c0965y.a) && ax.Gb.l.a(this.b, c0965y.b) && ax.Gb.l.a(this.c, c0965y.c) && ax.Gb.l.a(this.d, c0965y.d) && ax.Gb.l.a(this.e, c0965y.e);
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0941j abstractC0941j = this.b;
        int hashCode2 = (hashCode + (abstractC0941j == null ? 0 : abstractC0941j.hashCode())) * 31;
        ax.Fb.l<Throwable, ax.sb.t> lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C0965y(Object obj, AbstractC0941j abstractC0941j, ax.Fb.l lVar, Object obj2, Throwable th, int i, ax.Gb.g gVar) {
        this(obj, (i & 2) != 0 ? null : abstractC0941j, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
