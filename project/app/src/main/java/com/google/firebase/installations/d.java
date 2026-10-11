/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import ax.x7.l;

public class d
extends l {
    private final a q;

    public d(a a8) {
        this.q = a8;
    }

    public d(String string, a a8) {
        super(string);
        this.q = a8;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

