package ax.ec;

import ax.cc.C1857d;
import ax.jc.i;
import ax.kc.C2425g;
import ax.kc.C2427i;
import ax.kc.InterfaceC2421c;

/* renamed from: ax.ec.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1998c {

    /* renamed from: ax.ec.c$a */
    public static class a implements InterfaceC1998c {
        private C1857d.a a;
        private i b;
        private C2425g c;
        private InterfaceC2421c d;

        public static final a a() {
            return new a().f(new i()).g(new C1857d.a()).h(new C2425g()).i(new C2427i());
        }

        public i b() {
            return this.b;
        }

        public C1857d.a c() {
            return this.a;
        }

        public C2425g d() {
            return this.c;
        }

        public InterfaceC2421c e() {
            return this.d;
        }

        public a f(i iVar) {
            this.b = iVar;
            return this;
        }

        public a g(C1857d.a aVar) {
            this.a = aVar;
            return this;
        }

        public a h(C2425g c2425g) {
            this.c = c2425g;
            return this;
        }

        public a i(InterfaceC2421c interfaceC2421c) {
            this.d = interfaceC2421c;
            return this;
        }
    }
}
