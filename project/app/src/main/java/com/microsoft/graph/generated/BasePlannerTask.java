/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.V0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.PlannerAppliedCategories;
import com.microsoft.graph.extensions.PlannerAssignedToTaskBoardTaskFormat;
import com.microsoft.graph.extensions.PlannerAssignments;
import com.microsoft.graph.extensions.PlannerBucketTaskBoardTaskFormat;
import com.microsoft.graph.extensions.PlannerProgressTaskBoardTaskFormat;
import com.microsoft.graph.extensions.PlannerTaskDetails;
import java.util.Calendar;

public class BasePlannerTask
extends Entity
implements d {
    @a
    @c(value="assignedToTaskBoardFormat")
    public PlannerAssignedToTaskBoardTaskFormat A;
    @a
    @c(value="progressTaskBoardFormat")
    public PlannerProgressTaskBoardTaskFormat B;
    @a
    @c(value="bucketTaskBoardFormat")
    public PlannerBucketTaskBoardTaskFormat C;
    private transient l D;
    private transient e E;
    @a
    @c(value="createdBy")
    public IdentitySet f;
    @a
    @c(value="planId")
    public String g;
    @a
    @c(value="bucketId")
    public String h;
    @a
    @c(value="title")
    public String i;
    @a
    @c(value="orderHint")
    public String j;
    @a
    @c(value="assigneePriority")
    public String k;
    @a
    @c(value="percentComplete")
    public Integer l;
    @a
    @c(value="startDateTime")
    public Calendar m;
    @a
    @c(value="createdDateTime")
    public Calendar n;
    @a
    @c(value="dueDateTime")
    public Calendar o;
    @a
    @c(value="hasDescription")
    public Boolean p;
    @a
    @c(value="previewType")
    public V0 q;
    @a
    @c(value="completedDateTime")
    public Calendar r;
    @a
    @c(value="completedBy")
    public IdentitySet s;
    @a
    @c(value="referenceCount")
    public Integer t;
    @a
    @c(value="checklistItemCount")
    public Integer u;
    @a
    @c(value="activeChecklistItemCount")
    public Integer v;
    @a
    @c(value="appliedCategories")
    public PlannerAppliedCategories w;
    @a
    @c(value="assignments")
    public PlannerAssignments x;
    @a
    @c(value="conversationThreadId")
    public String y;
    @a
    @c(value="details")
    public PlannerTaskDetails z;

    @Override
    public void d(e e8, l l8) {
        this.E = e8;
        this.D = l8;
    }
}

