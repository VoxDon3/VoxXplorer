/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.ColumnLink;
import com.microsoft.graph.extensions.ColumnLinkCollectionPage;
import com.microsoft.graph.extensions.ContentTypeOrder;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.ItemReference;
import com.microsoft.graph.generated.BaseColumnLink;
import com.microsoft.graph.generated.BaseColumnLinkCollectionResponse;
import java.util.Arrays;

public class BaseContentType
extends Entity
implements d {
    @a
    @c(value="description")
    public String f;
    @a
    @c(value="group")
    public String g;
    @a
    @c(value="hidden")
    public Boolean h;
    @a
    @c(value="inheritedFrom")
    public ItemReference i;
    @a
    @c(value="name")
    public String j;
    @a
    @c(value="order")
    public ContentTypeOrder k;
    @a
    @c(value="parentId")
    public String l;
    @a
    @c(value="readOnly")
    public Boolean m;
    @a
    @c(value="sealed")
    public Boolean n;
    public transient ColumnLinkCollectionPage o;
    private transient l p;
    private transient e q;

    @Override
    public void d(e e8, l object) {
        this.q = e8;
        this.p = object;
        if (((l)object).x("columnLinks")) {
            BaseColumnLinkCollectionResponse baseColumnLinkCollectionResponse = new BaseColumnLinkCollectionResponse();
            if (((l)object).x("columnLinks@odata.nextLink")) {
                baseColumnLinkCollectionResponse.b = ((l)object).t("columnLinks@odata.nextLink").k();
            }
            l[] lArray = e8.b(((l)object).t("columnLinks").toString(), l[].class);
            ColumnLink[] columnLinkArray = new ColumnLink[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                columnLinkArray[i8] = object = e8.b(lArray[i8].toString(), ColumnLink.class);
                ((BaseColumnLink)object).d(e8, lArray[i8]);
            }
            baseColumnLinkCollectionResponse.a = Arrays.asList(columnLinkArray);
            this.o = new ColumnLinkCollectionPage(baseColumnLinkCollectionResponse, null);
        }
    }
}

