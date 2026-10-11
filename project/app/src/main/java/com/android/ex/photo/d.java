/*
 * Decompiled with CFR 0.152.
 */
package com.android.ex.photo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ax.z3.a;
import java.io.Serializable;

public class d {
    public static b a(Context context, Class<? extends a> clazz) {
        return new b(context, clazz);
    }

    public static class b {
        private final Intent a;
        private Integer b;
        private String c;
        private String d;
        private String e;
        private String[] f;
        private String g;
        private Float h;
        private boolean i;
        private boolean j;
        private int k;
        private int l;
        private int m;
        private int n;
        private boolean o;
        private boolean p;

        private b(Context context, Class<?> clazz) {
            this.a = new Intent(context, clazz);
            this.b();
        }

        private void b() {
            this.j = false;
            this.o = false;
            this.p = false;
        }

        public Intent a() {
            this.a.setAction("android.intent.action.VIEW");
            this.a.setFlags(0x4080000);
            Object object = this.b;
            if (object != null) {
                this.a.putExtra("photo_index", object.intValue());
            }
            if ((object = this.c) != null) {
                this.a.putExtra("initial_photo_uri", (String)object);
            }
            if (this.c != null && this.b != null) {
                throw new IllegalStateException("specified both photo index and photo uri");
            }
            object = this.d;
            if (object != null) {
                this.a.putExtra("photos_uri", (String)object);
                this.a.setData(Uri.parse((String)this.d));
            }
            if ((object = this.e) != null) {
                this.a.putExtra("resolved_photo_uri", (String)object);
            }
            if ((object = this.f) != null) {
                this.a.putExtra("projection", object);
            }
            if ((object = this.g) != null) {
                this.a.putExtra("thumbnail_uri", (String)object);
            }
            if ((object = this.h) != null) {
                this.a.putExtra("max_scale", (Serializable)object);
            }
            this.a.putExtra("watch_network", this.i);
            this.a.putExtra("scale_up_animation", this.j);
            if (this.j) {
                this.a.putExtra("start_x_extra", this.k);
                this.a.putExtra("start_y_extra", this.l);
                this.a.putExtra("start_width_extra", this.m);
                this.a.putExtra("start_height_extra", this.n);
            }
            this.a.putExtra("action_bar_hidden_initially", this.o);
            this.a.putExtra("display_thumbs_fullscreen", this.p);
            return this.a;
        }

        public b c(boolean bl) {
            this.p = bl;
            return this;
        }

        public b d(float f8) {
            this.h = Float.valueOf(f8);
            return this;
        }

        public b e(String string) {
            this.e = string;
            return this;
        }

        public b f(String string) {
            this.g = string;
            return this;
        }
    }
}

