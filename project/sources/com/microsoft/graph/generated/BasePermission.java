package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.ItemReference;
import com.microsoft.graph.extensions.SharingInvitation;
import com.microsoft.graph.extensions.SharingLink;
import java.util.List;

/* loaded from: classes3.dex */
public class BasePermission extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("grantedTo")
    public IdentitySet f;

    @InterfaceC3059a
    @InterfaceC3061c("inheritedFrom")
    public ItemReference g;

    @InterfaceC3059a
    @InterfaceC3061c("invitation")
    public SharingInvitation h;

    @InterfaceC3059a
    @InterfaceC3061c("link")
    public SharingLink i;

    @InterfaceC3059a
    @InterfaceC3061c("roles")
    public List<String> j;

    @InterfaceC3059a
    @InterfaceC3061c("shareId")
    public String k;
    private transient C3003l l;
    private transient e m;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.m = eVar;
        this.l = c3003l;
    }
}
