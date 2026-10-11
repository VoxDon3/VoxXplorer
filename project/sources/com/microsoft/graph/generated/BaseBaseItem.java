package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.ItemReference;
import com.microsoft.graph.extensions.User;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseBaseItem extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("createdBy")
    public IdentitySet f;

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar g;

    @InterfaceC3059a
    @InterfaceC3061c("description")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("eTag")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedBy")
    public IdentitySet j;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar k;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String l;

    @InterfaceC3059a
    @InterfaceC3061c("parentReference")
    public ItemReference m;

    @InterfaceC3059a
    @InterfaceC3061c("webUrl")
    public String n;

    @InterfaceC3059a
    @InterfaceC3061c("createdByUser")
    public User o;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedByUser")
    public User p;
    private transient C3003l q;
    private transient e r;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.r = eVar;
        this.q = c3003l;
    }
}
