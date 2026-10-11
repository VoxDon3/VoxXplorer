/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
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

public class BaseColumnDefinition
extends Entity
implements d {
    @a
    @c(value="boolean")
    public BooleanColumn f;
    @a
    @c(value="calculated")
    public CalculatedColumn g;
    @a
    @c(value="choice")
    public ChoiceColumn h;
    @a
    @c(value="columnGroup")
    public String i;
    @a
    @c(value="currency")
    public CurrencyColumn j;
    @a
    @c(value="dateTime")
    public DateTimeColumn k;
    @a
    @c(value="defaultValue")
    public DefaultColumnValue l;
    @a
    @c(value="description")
    public String m;
    @a
    @c(value="displayName")
    public String n;
    @a
    @c(value="enforceUniqueValues")
    public Boolean o;
    @a
    @c(value="hidden")
    public Boolean p;
    @a
    @c(value="indexed")
    public Boolean q;
    @a
    @c(value="lookup")
    public LookupColumn r;
    @a
    @c(value="name")
    public String s;
    @a
    @c(value="number")
    public NumberColumn t;
    @a
    @c(value="personOrGroup")
    public PersonOrGroupColumn u;
    @a
    @c(value="readOnly")
    public Boolean v;
    @a
    @c(value="required")
    public Boolean w;
    @a
    @c(value="text")
    public TextColumn x;
    private transient l y;
    private transient e z;

    @Override
    public void d(e e8, l l8) {
        this.z = e8;
        this.y = l8;
    }
}

