/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.a1;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.UserActivity;
import java.util.Calendar;

public class BaseActivityHistoryItem
extends Entity
implements d {
    @a
    @c(value="status")
    public a1 f;
    @a
    @c(value="activeDurationSeconds")
    public Integer g;
    @a
    @c(value="createdDateTime")
    public Calendar h;
    @a
    @c(value="lastActiveDateTime")
    public Calendar i;
    @a
    @c(value="lastModifiedDateTime")
    public Calendar j;
    @a
    @c(value="expirationDateTime")
    public Calendar k;
    @a
    @c(value="startedDateTime")
    public Calendar l;
    @a
    @c(value="userTimezone")
    public String m;
    @a
    @c(value="activity")
    public UserActivity n;
    private transient l o;
    private transient e p;

    @Override
    public void d(e e8, l l8) {
        this.p = e8;
        this.o = l8;
    }
}

