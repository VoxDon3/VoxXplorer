package ax.O4;

import java.io.IOException;

/* loaded from: classes.dex */
class b extends g {
    private final String e0;

    b(String str) {
        this.e0 = str;
    }

    public boolean B() {
        return this == g.q || this == g.c0;
    }

    public boolean C() {
        return this == g.q;
    }

    @Override // ax.O4.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.e0.equals(((b) obj).e0);
        }
        return false;
    }

    @Override // ax.O4.g
    public boolean g() {
        return B() ? C() : super.g();
    }

    @Override // ax.O4.g
    public int hashCode() {
        return this.e0.hashCode();
    }

    @Override // ax.O4.g
    public boolean p() {
        return this == g.d0;
    }

    @Override // ax.O4.g
    public String toString() {
        return this.e0;
    }

    @Override // ax.O4.g
    protected void z(h hVar) throws IOException {
        hVar.b(this.e0);
    }
}
