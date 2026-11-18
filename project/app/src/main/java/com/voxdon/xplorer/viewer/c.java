/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.viewer;

import com.voxdon.xplorer.file.n;
import java.util.HashMap;
import java.util.List;

public class c {
    static c b;
    HashMap<String, a> a = new HashMap();

    public static c b() {
        if (b == null) {
            b = new c();
        }
        return b;
    }

    public a a(String string) {
        if (string == null) {
            return null;
        }
        return this.a.remove(string);
    }

    public void c(String string, List<n> list, int n8) {
        this.a.put(string, new a(list, n8));
    }

    public static class a {
        List<n> a;
        int b;

        a(List<n> list, int n8) {
            this.a = list;
            this.b = n8;
        }
    }
}

