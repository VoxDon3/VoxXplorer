package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Notebook;
import com.microsoft.graph.extensions.OnenoteEntitySchemaObjectModel;
import com.microsoft.graph.extensions.OnenoteSection;
import com.microsoft.graph.extensions.PageLinks;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseOnenotePage extends OnenoteEntitySchemaObjectModel implements d {

    @InterfaceC3059a
    @InterfaceC3061c("title")
    public String l;

    @InterfaceC3059a
    @InterfaceC3061c("createdByAppId")
    public String m;

    @InterfaceC3059a
    @InterfaceC3061c("links")
    public PageLinks n;

    @InterfaceC3059a
    @InterfaceC3061c("contentUrl")
    public String o;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar p;

    @InterfaceC3059a
    @InterfaceC3061c("level")
    public Integer q;

    @InterfaceC3059a
    @InterfaceC3061c("order")
    public Integer r;

    @InterfaceC3059a
    @InterfaceC3061c("userTags")
    public List<String> s;

    @InterfaceC3059a
    @InterfaceC3061c("parentSection")
    public OnenoteSection t;

    @InterfaceC3059a
    @InterfaceC3061c("parentNotebook")
    public Notebook u;
    private transient C3003l v;
    private transient e w;

    @Override // com.microsoft.graph.generated.BaseOnenoteEntitySchemaObjectModel, com.microsoft.graph.generated.BaseOnenoteEntityBaseModel, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.w = eVar;
        this.v = c3003l;
    }
}
