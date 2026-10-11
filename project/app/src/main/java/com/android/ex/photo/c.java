/*
 * Decompiled with CFR 0.152.
 */
package com.android.ex.photo;

import android.media.MediaMetadataRetriever;
import ax.y0.a;

public class c {
    public boolean a;
    public boolean b;
    public long c = -1L;
    public long d;
    public long e = -1L;
    public String f;
    public Object g;
    public a h;
    public long i;
    public int j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;

    public void a(MediaMetadataRetriever mediaMetadataRetriever) {
        this.a = true;
        this.o = mediaMetadataRetriever.extractMetadata(5);
        this.p = mediaMetadataRetriever.extractMetadata(9);
        this.q = mediaMetadataRetriever.extractMetadata(18);
        this.r = mediaMetadataRetriever.extractMetadata(19);
        this.s = mediaMetadataRetriever.extractMetadata(23);
    }
}

