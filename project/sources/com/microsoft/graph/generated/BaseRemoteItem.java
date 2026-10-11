package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.File;
import com.microsoft.graph.extensions.FileSystemInfo;
import com.microsoft.graph.extensions.Folder;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.ItemReference;
import com.microsoft.graph.extensions.Package;
import com.microsoft.graph.extensions.Shared;
import com.microsoft.graph.extensions.SharepointIds;
import com.microsoft.graph.extensions.SpecialFolder;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseRemoteItem implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("createdBy")
    public IdentitySet c;

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar d;

    @InterfaceC3059a
    @InterfaceC3061c("file")
    public File e;

    @InterfaceC3059a
    @InterfaceC3061c("fileSystemInfo")
    public FileSystemInfo f;

    @InterfaceC3059a
    @InterfaceC3061c("folder")
    public Folder g;

    @InterfaceC3059a
    @InterfaceC3061c("id")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedBy")
    public IdentitySet i;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar j;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String k;

    @InterfaceC3059a
    @InterfaceC3061c("package")
    public Package l;

    @InterfaceC3059a
    @InterfaceC3061c("parentReference")
    public ItemReference m;

    @InterfaceC3059a
    @InterfaceC3061c("shared")
    public Shared n;

    @InterfaceC3059a
    @InterfaceC3061c("sharepointIds")
    public SharepointIds o;

    @InterfaceC3059a
    @InterfaceC3061c("size")
    public Long p;

    @InterfaceC3059a
    @InterfaceC3061c("specialFolder")
    public SpecialFolder q;

    @InterfaceC3059a
    @InterfaceC3061c("webDavUrl")
    public String r;

    @InterfaceC3059a
    @InterfaceC3061c("webUrl")
    public String s;
    private transient C3003l t;
    private transient e u;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.u = eVar;
        this.t = c3003l;
    }
}
