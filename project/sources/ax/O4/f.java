package ax.O4;

import java.io.IOException;

/* loaded from: classes.dex */
class f extends g {
    private final String e0;

    f(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.e0 = str;
    }

    @Override // ax.O4.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.e0.equals(((f) obj).e0);
        }
        return false;
    }

    @Override // ax.O4.g
    public int hashCode() {
        return this.e0.hashCode();
    }

    @Override // ax.O4.g
    public String k() {
        return this.e0;
    }

    @Override // ax.O4.g
    public boolean r() {
        return true;
    }

    @Override // ax.O4.g
    protected void z(h hVar) throws IOException {
        hVar.l(this.e0);
    }
}
