package ax.Sc;

import j$.util.Objects;

/* loaded from: classes3.dex */
public class p {
    public static final l a = new l() { // from class: ax.Sc.m
        @Override // ax.Sc.l
        public final boolean a(i iVar) {
            return p.a(iVar);
        }
    };
    public static final l b = new l() { // from class: ax.Sc.n
        @Override // ax.Sc.l
        public final boolean a(i iVar) {
            return Objects.nonNull(iVar);
        }
    };
    public static final l c = new l() { // from class: ax.Sc.o
        @Override // ax.Sc.l
        public final boolean a(i iVar) {
            return p.b(iVar);
        }
    };

    public static /* synthetic */ boolean a(i iVar) {
        return true;
    }

    public static /* synthetic */ boolean b(i iVar) {
        return iVar != null && iVar.g();
    }
}
