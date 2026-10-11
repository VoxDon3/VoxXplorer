/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.M9.f;
import ax.P9.p;
import ax.T9.d;
import java.util.ArrayList;
import java.util.List;

public abstract class c
implements p {
    private final f a;
    private final String b;
    private final List<ax.S9.c> c;
    private final d d;

    public c(String string, f f8, List<ax.S9.c> list) {
        ArrayList<ax.S9.c> arrayList = new ArrayList<ax.S9.c>();
        this.c = arrayList;
        this.b = string;
        this.a = f8;
        this.d = null;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    @Override
    public String d() {
        return this.b;
    }

    @Override
    public f i() {
        return this.a;
    }

    public List<ax.S9.c> o() {
        return java.util.DesugarCollections.unmodifiableList(this.c);
    }

    public String p(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append("/");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

