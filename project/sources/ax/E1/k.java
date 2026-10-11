package ax.E1;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class k extends i {
    public final String b;
    public final String c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.c, kVar.c) && Objects.equals(this.b, kVar.b) && Objects.equals(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // ax.E1.i
    public String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
