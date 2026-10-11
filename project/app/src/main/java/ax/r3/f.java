/*
 * Decompiled with CFR 0.152.
 */
package ax.r3;

import android.graphics.Bitmap;
import ax.Z9.a;
import ax.aa.b;
import ax.c3.K;
import ax.ka.e;
import java.util.Collection;

public class f
implements a {
    a a;

    public f(int n8) {
        this.a = new ax.aa.a(new b(n8), e.a());
    }

    @Override
    public Collection<String> a() {
        return this.a.a();
    }

    @Override
    public Bitmap b(String string) {
        return this.a.b(string);
    }

    @Override
    public boolean c(String string, Bitmap bitmap) {
        return this.a.c(string, bitmap);
    }

    public Bitmap d(String string) {
        if (string != null) {
            for (String string2 : this.a()) {
                if (!string2.startsWith(string) || !string.equals(string2.substring(0, string2.lastIndexOf("_")))) continue;
                return this.i(string2);
            }
        }
        return null;
    }

    public void e(K object) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(((K)object).d().K());
        charSequence.append("://");
        charSequence.append(((K)object).b());
        charSequence = charSequence.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((K)object).d().t());
        stringBuilder.append("://");
        stringBuilder.append(((K)object).b());
        object = stringBuilder.toString();
        for (String string : this.a()) {
            if (!string.startsWith((String)charSequence) && !string.startsWith((String)object)) continue;
            this.b(string);
        }
    }

    public void f(String string) {
        for (String string2 : this.a()) {
            if (!string2.startsWith(string)) continue;
            this.b(string2);
        }
    }

    @Override
    public Bitmap i(String string) {
        return this.a.i(string);
    }
}

