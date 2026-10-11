package com.microsoft.graph.generated;

import ax.N9.a1;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.UserActivity;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseActivityHistoryItem extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("status")
    public a1 f;

    @InterfaceC3059a
    @InterfaceC3061c("activeDurationSeconds")
    public Integer g;

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar h;

    @InterfaceC3059a
    @InterfaceC3061c("lastActiveDateTime")
    public Calendar i;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar j;

    @InterfaceC3059a
    @InterfaceC3061c("expirationDateTime")
    public Calendar k;

    @InterfaceC3059a
    @InterfaceC3061c("startedDateTime")
    public Calendar l;

    @InterfaceC3059a
    @InterfaceC3061c("userTimezone")
    public String m;

    @InterfaceC3059a
    @InterfaceC3061c("activity")
    public UserActivity n;
    private transient C3003l o;
    private transient e p;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.p = eVar;
        this.o = c3003l;
    }
}
