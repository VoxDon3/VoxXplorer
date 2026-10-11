package ax.R3;

import android.annotation.SuppressLint;
import ax.P3.s;
import ax.R3.h;

/* loaded from: classes.dex */
public class g extends ax.k4.e<ax.M3.h, s<?>> implements h {
    private h.a e;

    public g(int i) {
        super(i);
    }

    @Override // ax.R3.h
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20) {
            m(h() / 2);
        }
    }

    @Override // ax.R3.h
    public void c(h.a aVar) {
        this.e = aVar;
    }

    @Override // ax.R3.h
    public /* bridge */ /* synthetic */ s d(ax.M3.h hVar) {
        return (s) super.l(hVar);
    }

    @Override // ax.R3.h
    public /* bridge */ /* synthetic */ s e(ax.M3.h hVar, s sVar) {
        return (s) super.k(hVar, sVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.k4.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(s<?> sVar) {
        return sVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.k4.e
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(ax.M3.h hVar, s<?> sVar) {
        h.a aVar = this.e;
        if (aVar != null) {
            aVar.c(sVar);
        }
    }
}
