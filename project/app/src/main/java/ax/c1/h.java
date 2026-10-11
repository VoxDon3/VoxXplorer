/*
 * Decompiled with CFR 0.152.
 */
package ax.c1;

import android.text.TextUtils;
import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import java.util.ArrayList;
import java.util.List;

public final class h
implements C.a {
    public final String a;
    public final String b;
    public final List<a> c;

    public h(String string, String string2, List<a> list) {
        this.a = string;
        this.b = string2;
        this.c = java.util.DesugarCollections.unmodifiableList(new ArrayList<a>(list));
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public /* synthetic */ void b(A.b b8) {
        B.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && h.class == object.getClass()) {
            object = (h)object;
            if (TextUtils.equals((CharSequence)this.a, (CharSequence)((h)object).a) && TextUtils.equals((CharSequence)this.b, (CharSequence)((h)object).b) && this.c.equals(((h)object).c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String string = this.a;
        int n8 = 0;
        int n9 = string != null ? string.hashCode() : 0;
        string = this.b;
        if (string != null) {
            n8 = string.hashCode();
        }
        return (n9 * 31 + n8) * 31 + this.c.hashCode();
    }

    public String toString() {
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HlsTrackMetadataEntry");
        if (this.a != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(" [");
            ((StringBuilder)charSequence).append(this.a);
            ((StringBuilder)charSequence).append(", ");
            ((StringBuilder)charSequence).append(this.b);
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }

    public static final class a {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public a(int n8, int n9, String string, String string2, String string3, String string4) {
            this.a = n8;
            this.b = n9;
            this.c = string;
            this.d = string2;
            this.e = string3;
            this.f = string4;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (this.a == ((a)object).a && this.b == ((a)object).b && TextUtils.equals((CharSequence)this.c, (CharSequence)((a)object).c) && TextUtils.equals((CharSequence)this.d, (CharSequence)((a)object).d) && TextUtils.equals((CharSequence)this.e, (CharSequence)((a)object).e) && TextUtils.equals((CharSequence)this.f, (CharSequence)((a)object).f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int n8 = this.a;
            int n9 = this.b;
            String string = this.c;
            int n10 = 0;
            int n11 = string != null ? string.hashCode() : 0;
            string = this.d;
            int n12 = string != null ? string.hashCode() : 0;
            string = this.e;
            int n13 = string != null ? string.hashCode() : 0;
            string = this.f;
            if (string != null) {
                n10 = string.hashCode();
            }
            return ((((n8 * 31 + n9) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n10;
        }
    }
}

