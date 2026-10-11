package ax.xa;

import ax.c.C1750a;
import ax.pa.c;
import ax.qa.EnumC2891a;
import ax.qa.InterfaceC2892b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.Objects;
import java.io.IOException;
import okhttp3.HttpUrl;

/* renamed from: ax.xa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3477a implements InterfaceC2892b {
    private String a = HttpUrl.FRAGMENT_ENCODE_SET;
    private int b;
    private int c;

    /* renamed from: ax.xa.a$a, reason: collision with other inner class name */
    public static class C0498a extends AbstractC3477a {
        @Override // ax.xa.AbstractC3477a
        public boolean e() {
            return true;
        }
    }

    private int f(String str, c cVar) throws IOException {
        long h = cVar.h();
        if (h <= 2147483647L) {
            return (int) h;
        }
        throw new C1750a(String.format("%s %d > %d", str, Long.valueOf(h), Integer.valueOf(SubsamplingScaleImageView.TILE_SIZE_AUTO)));
    }

    @Override // ax.qa.InterfaceC2892b
    public void a(c cVar) throws IOException {
        int i;
        boolean z;
        int i2;
        cVar.a(EnumC2891a.TWO);
        cVar.b(this.b * 2);
        if (!e() || (i2 = this.c) <= 0) {
            i = this.c;
            z = false;
        } else {
            z = true;
            i = i2 - 1;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(cVar.d());
        }
        this.a = sb.toString();
        if (z) {
            cVar.b(2);
        }
    }

    @Override // ax.qa.InterfaceC2892b
    public void b(c cVar) throws IOException {
        cVar.a(EnumC2891a.FOUR);
        cVar.b(4);
    }

    @Override // ax.qa.InterfaceC2892b
    public void c(c cVar) throws IOException {
        cVar.a(EnumC2891a.FOUR);
        this.b = f("Offset", cVar);
        this.c = f("ActualCount", cVar);
    }

    public String d() {
        return this.a;
    }

    public abstract boolean e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3477a)) {
            return false;
        }
        AbstractC3477a abstractC3477a = (AbstractC3477a) obj;
        return e() == abstractC3477a.e() && Objects.equals(d(), abstractC3477a.d());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(e()), d());
    }

    public String toString() {
        return d() == null ? "null" : String.format("\"%s\"", d());
    }
}
