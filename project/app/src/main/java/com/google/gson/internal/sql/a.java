/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import ax.r8.w;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

public final class a {
    public static final boolean a;
    public static final DefaultDateTypeAdapter.b<? extends Date> b;
    public static final DefaultDateTypeAdapter.b<? extends Date> c;
    public static final w d;
    public static final w e;
    public static final w f;

    static {
        boolean bl;
        try {
            Class.forName("java.sql.Date");
            bl = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            bl = false;
        }
        a = bl;
        if (bl) {
            b = new DefaultDateTypeAdapter.b<java.sql.Date>(java.sql.Date.class){

                protected java.sql.Date e(Date date) {
                    return new java.sql.Date(date.getTime());
                }
            };
            c = new DefaultDateTypeAdapter.b<Timestamp>(Timestamp.class){

                protected Timestamp e(Date date) {
                    return new Timestamp(date.getTime());
                }
            };
            d = SqlDateTypeAdapter.b;
            e = SqlTimeTypeAdapter.b;
            f = SqlTimestampTypeAdapter.b;
        } else {
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
        }
    }
}

