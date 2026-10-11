package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.BooleanColumn;
import com.microsoft.graph.extensions.CalculatedColumn;
import com.microsoft.graph.extensions.ChoiceColumn;
import com.microsoft.graph.extensions.CurrencyColumn;
import com.microsoft.graph.extensions.DateTimeColumn;
import com.microsoft.graph.extensions.DefaultColumnValue;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.LookupColumn;
import com.microsoft.graph.extensions.NumberColumn;
import com.microsoft.graph.extensions.PersonOrGroupColumn;
import com.microsoft.graph.extensions.TextColumn;

/* loaded from: classes3.dex */
public class BaseColumnDefinition extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("boolean")
    public BooleanColumn f;

    @InterfaceC3059a
    @InterfaceC3061c("calculated")
    public CalculatedColumn g;

    @InterfaceC3059a
    @InterfaceC3061c("choice")
    public ChoiceColumn h;

    @InterfaceC3059a
    @InterfaceC3061c("columnGroup")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("currency")
    public CurrencyColumn j;

    @InterfaceC3059a
    @InterfaceC3061c("dateTime")
    public DateTimeColumn k;

    @InterfaceC3059a
    @InterfaceC3061c("defaultValue")
    public DefaultColumnValue l;

    @InterfaceC3059a
    @InterfaceC3061c("description")
    public String m;

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String n;

    @InterfaceC3059a
    @InterfaceC3061c("enforceUniqueValues")
    public Boolean o;

    @InterfaceC3059a
    @InterfaceC3061c("hidden")
    public Boolean p;

    @InterfaceC3059a
    @InterfaceC3061c("indexed")
    public Boolean q;

    @InterfaceC3059a
    @InterfaceC3061c("lookup")
    public LookupColumn r;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String s;

    @InterfaceC3059a
    @InterfaceC3061c("number")
    public NumberColumn t;

    @InterfaceC3059a
    @InterfaceC3061c("personOrGroup")
    public PersonOrGroupColumn u;

    @InterfaceC3059a
    @InterfaceC3061c("readOnly")
    public Boolean v;

    @InterfaceC3059a
    @InterfaceC3061c("required")
    public Boolean w;

    @InterfaceC3059a
    @InterfaceC3061c("text")
    public TextColumn x;
    private transient C3003l y;
    private transient e z;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.z = eVar;
        this.y = c3003l;
    }
}
