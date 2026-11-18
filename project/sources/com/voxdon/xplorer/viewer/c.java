package com.voxdon.xplorer.viewer;

import com.voxdon.xplorer.file.AbstractC3595n;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    static c b;
    HashMap<String, a> a = new HashMap<>();

    public static class a {
        List<AbstractC3595n> a;
        int b;

        a(List<AbstractC3595n> list, int i) {
            this.a = list;
            this.b = i;
        }
    }

    public static c b() {
        if (b == null) {
            b = new c();
        }
        return b;
    }

    public a a(String str) {
        if (str == null) {
            return null;
        }
        return this.a.remove(str);
    }

    public void c(String str, List<AbstractC3595n> list, int i) {
        this.a.put(str, new a(list, i));
    }
}
