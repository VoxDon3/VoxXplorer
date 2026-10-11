/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.viewer;

import android.net.Uri;
import java.util.ArrayList;

public class e {
    private static e b;
    ArrayList<a> a;

    public static e b() {
        if (b == null) {
            b = new e();
        }
        return b;
    }

    public void a() {
        this.a = null;
    }

    public ArrayList<a> c() {
        ArrayList<a> arrayList = this.a;
        this.a = null;
        return arrayList;
    }

    public void d(ArrayList<a> arrayList) {
        this.a = arrayList;
    }

    public static class a {
        public Uri a;
        public Uri b;

        public a(Uri uri, Uri uri2) {
            this.a = uri;
            this.b = uri2;
        }
    }
}

