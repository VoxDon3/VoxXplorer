package ax.Sc;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class i implements Serializable {
    private int c0;
    private long d0;
    private String e0;
    private String f0;
    private String g0;
    private String h0;
    private String i0;
    private Calendar j0;
    private final boolean[][] k0;
    private int q;

    public i() {
        this.q = 3;
        this.d0 = -1L;
        this.f0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.g0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.k0 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
    }

    public String a() {
        return this.i0;
    }

    public String b() {
        return this.h0;
    }

    public String c() {
        return this.e0;
    }

    public long d() {
        return this.d0;
    }

    public Calendar e() {
        return this.j0;
    }

    public boolean f(int i, int i2) {
        boolean[][] zArr = this.k0;
        if (zArr == null) {
            return false;
        }
        return zArr[i][i2];
    }

    public boolean g() {
        return this.q == 1;
    }

    public boolean h() {
        return this.q == 2;
    }

    public void i(String str) {
        this.g0 = str;
    }

    public void j(int i) {
        this.c0 = i;
    }

    public void k(String str) {
        this.i0 = str;
    }

    public void l(String str) {
        this.h0 = str;
    }

    public void m(int i, int i2, boolean z) {
        this.k0[i][i2] = z;
    }

    public void n(String str) {
        this.e0 = str;
    }

    public void o(long j) {
        this.d0 = j;
    }

    public void p(Calendar calendar) {
        this.j0 = calendar;
    }

    public void q(int i) {
        this.q = i;
    }

    public void r(String str) {
        this.f0 = str;
    }

    public String toString() {
        return c();
    }

    i(String str) {
        this.q = 3;
        this.d0 = -1L;
        this.f0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.g0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.k0 = null;
        this.e0 = str;
    }
}
