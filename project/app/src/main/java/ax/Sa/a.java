/*
 * Decompiled with CFR 0.152.
 */
package ax.Sa;

import ax.Sa.b;
import java.util.ArrayList;
import java.util.List;

public class a {
    protected String a;
    protected String b;

    public a(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public List<b> a() {
        ArrayList<b> arrayList = new ArrayList<b>();
        arrayList.add(new b("User-Agent", "Cloud API Android Client Example/1.0"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OAuth ");
        stringBuilder.append(this.b());
        arrayList.add(new b("Authorization", stringBuilder.toString()));
        return java.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public String b() {
        return this.b;
    }
}

