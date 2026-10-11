package ax.rc;

import ax.sc.EnumC3086c;
import ax.sc.EnumC3087d;
import java.util.List;

/* renamed from: ax.rc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3027b extends i {
    private int b;
    private byte[] c;
    private EnumC3086c d;
    private long e;
    private int i;
    private int j;
    private String k;
    private boolean l;
    private boolean n;
    private h o;
    private C3026a p;
    private boolean q;
    private List<C3029d> r;
    private boolean s;
    private long f = 0;
    private long g = 0;
    private long h = 0;
    private EnumC3087d m = EnumC3087d.NONE;

    public void A(int i) {
        this.j = i;
    }

    public void B(String str) {
        this.k = str;
    }

    public void C(int i) {
        this.i = i;
    }

    public void D(boolean z) {
        this.q = z;
    }

    public void E(byte[] bArr) {
        this.c = bArr;
    }

    public void F(long j) {
        this.e = j;
    }

    public void G(long j) {
        this.h = j;
    }

    public void H(int i) {
        this.b = i;
    }

    public void I(h hVar) {
        this.o = hVar;
    }

    public C3026a b() {
        return this.p;
    }

    public long c() {
        return this.g;
    }

    public EnumC3086c d() {
        return this.d;
    }

    public long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AbstractC3027b)) {
            return i().equals(((AbstractC3027b) obj).i());
        }
        return false;
    }

    public EnumC3087d f() {
        return this.m;
    }

    public List<C3029d> g() {
        return this.r;
    }

    public int h() {
        return this.j;
    }

    public String i() {
        return this.k;
    }

    public byte[] j() {
        return this.c;
    }

    public long k() {
        return this.e;
    }

    public long l() {
        return this.h;
    }

    public h m() {
        return this.o;
    }

    public boolean n() {
        return this.n;
    }

    public boolean o() {
        return this.s;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.q;
    }

    public void r(C3026a c3026a) {
        this.p = c3026a;
    }

    public void s(long j) {
        this.g = j;
    }

    public void t(EnumC3086c enumC3086c) {
        this.d = enumC3086c;
    }

    public void u(long j) {
        this.f = j;
    }

    public void v(boolean z) {
        this.n = z;
    }

    public void w(boolean z) {
        this.s = z;
    }

    public void x(boolean z) {
        this.l = z;
    }

    public void y(EnumC3087d enumC3087d) {
        this.m = enumC3087d;
    }

    public void z(List<C3029d> list) {
        this.r = list;
    }
}
