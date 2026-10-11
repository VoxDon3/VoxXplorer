/*
 * Decompiled with CFR 0.152.
 */
package ax.na;

import ax.na.b;
import ax.s8.a;
import java.util.Date;
import java.util.List;

public class c
extends b {
    @a
    @ax.s8.c(value="path")
    private String c;
    @a
    @ax.s8.c(value="expires")
    private Date d;
    @a
    @ax.s8.c(value="hosts")
    private List<String> e;

    protected c() {
    }

    public Date d() {
        return this.d;
    }

    public List<String> e() {
        return this.e;
    }

    public String f() {
        return this.c;
    }
}

