package ax.Sa;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a {
    protected String a;
    protected String b;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public List<b> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b("User-Agent", "Cloud API Android Client Example/1.0"));
        arrayList.add(new b("Authorization", "OAuth " + b()));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public String b() {
        return this.b;
    }
}
