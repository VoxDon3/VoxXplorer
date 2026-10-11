package ax.s;

import android.view.View;
import android.view.animation.Interpolator;
import ax.c0.C1780n0;
import ax.c0.C1784p0;
import ax.c0.InterfaceC1782o0;
import java.util.ArrayList;

/* renamed from: ax.s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3038e {
    private Interpolator c;
    InterfaceC1782o0 d;
    private boolean e;
    private long b = -1;
    private final C1784p0 f = new a();
    final ArrayList<C1780n0> a = new ArrayList<>();

    /* renamed from: ax.s.e$a */
    class a extends C1784p0 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        @Override // ax.c0.InterfaceC1782o0
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == C3038e.this.a.size()) {
                InterfaceC1782o0 interfaceC1782o0 = C3038e.this.d;
                if (interfaceC1782o0 != null) {
                    interfaceC1782o0.b(null);
                }
                d();
            }
        }

        @Override // ax.c0.C1784p0, ax.c0.InterfaceC1782o0
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            InterfaceC1782o0 interfaceC1782o0 = C3038e.this.d;
            if (interfaceC1782o0 != null) {
                interfaceC1782o0.c(null);
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            C3038e.this.b();
        }
    }

    public void a() {
        if (this.e) {
            ArrayList<C1780n0> arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C1780n0 c1780n0 = arrayList.get(i);
                i++;
                c1780n0.c();
            }
            this.e = false;
        }
    }

    void b() {
        this.e = false;
    }

    public C3038e c(C1780n0 c1780n0) {
        if (!this.e) {
            this.a.add(c1780n0);
        }
        return this;
    }

    public C3038e d(C1780n0 c1780n0, C1780n0 c1780n02) {
        this.a.add(c1780n0);
        c1780n02.i(c1780n0.d());
        this.a.add(c1780n02);
        return this;
    }

    public C3038e e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public C3038e f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public C3038e g(InterfaceC1782o0 interfaceC1782o0) {
        if (!this.e) {
            this.d = interfaceC1782o0;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        ArrayList<C1780n0> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1780n0 c1780n0 = arrayList.get(i);
            i++;
            C1780n0 c1780n02 = c1780n0;
            long j = this.b;
            if (j >= 0) {
                c1780n02.e(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                c1780n02.f(interpolator);
            }
            if (this.d != null) {
                c1780n02.g(this.f);
            }
            c1780n02.k();
        }
        this.e = true;
    }
}
