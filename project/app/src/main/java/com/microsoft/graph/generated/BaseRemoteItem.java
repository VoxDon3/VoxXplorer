/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
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

public class BaseRemoteItem
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="createdBy")
    public IdentitySet c;
    @a
    @c(value="createdDateTime")
    public Calendar d;
    @a
    @c(value="file")
    public File e;
    @a
    @c(value="fileSystemInfo")
    public FileSystemInfo f;
    @a
    @c(value="folder")
    public Folder g;
    @a
    @c(value="id")
    public String h;
    @a
    @c(value="lastModifiedBy")
    public IdentitySet i;
    @a
    @c(value="lastModifiedDateTime")
    public Calendar j;
    @a
    @c(value="name")
    public String k;
    @a
    @c(value="package")
    public Package l;
    @a
    @c(value="parentReference")
    public ItemReference m;
    @a
    @c(value="shared")
    public Shared n;
    @a
    @c(value="sharepointIds")
    public SharepointIds o;
    @a
    @c(value="size")
    public Long p;
    @a
    @c(value="specialFolder")
    public SpecialFolder q;
    @a
    @c(value="webDavUrl")
    public String r;
    @a
    @c(value="webUrl")
    public String s;
    private transient l t;
    private transient e u;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.u = e8;
        this.t = l8;
    }
}

