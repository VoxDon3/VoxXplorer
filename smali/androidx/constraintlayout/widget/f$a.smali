.class public Landroidx/constraintlayout/widget/f$a;
.super Landroidx/constraintlayout/widget/ConstraintLayout$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public A0:F

.field public B0:F

.field public C0:F

.field public D0:F

.field public E0:F

.field public F0:F

.field public G0:F

.field public H0:F

.field public I0:F

.field public J0:F

.field public x0:F

.field public y0:Z

.field public z0:F


# direct methods
.method public constructor <init>(II)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(II)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    iput p1, p0, Landroidx/constraintlayout/widget/f$a;->x0:F

    const/4 p2, 0x0

    .line 3
    iput-boolean p2, p0, Landroidx/constraintlayout/widget/f$a;->y0:Z

    const/4 p2, 0x0

    .line 4
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->z0:F

    .line 5
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->A0:F

    .line 6
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->B0:F

    .line 7
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->C0:F

    .line 8
    iput p1, p0, Landroidx/constraintlayout/widget/f$a;->D0:F

    .line 9
    iput p1, p0, Landroidx/constraintlayout/widget/f$a;->E0:F

    .line 10
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->F0:F

    .line 11
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->G0:F

    .line 12
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->H0:F

    .line 13
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->I0:F

    .line 14
    iput p2, p0, Landroidx/constraintlayout/widget/f$a;->J0:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 15
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->x0:F

    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Landroidx/constraintlayout/widget/f$a;->y0:Z

    const/4 v2, 0x0

    .line 18
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->z0:F

    .line 19
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->A0:F

    .line 20
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->B0:F

    .line 21
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->C0:F

    .line 22
    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->D0:F

    .line 23
    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->E0:F

    .line 24
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->F0:F

    .line 25
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->G0:F

    .line 26
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->H0:F

    .line 27
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->I0:F

    .line 28
    iput v2, p0, Landroidx/constraintlayout/widget/f$a;->J0:F

    .line 29
    sget-object v0, Lax/L/c;->K4:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    :goto_2b
    if-ge v1, p2, :cond_d7

    .line 31
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v0

    .line 32
    sget v2, Lax/L/c;->L4:I

    if-ne v0, v2, :cond_3f

    .line 33
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->x0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->x0:F

    goto/16 :goto_d3

    .line 34
    :cond_3f
    sget v2, Lax/L/c;->W4:I

    if-ne v0, v2, :cond_50

    .line 35
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->z0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->z0:F

    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/f$a;->y0:Z

    goto/16 :goto_d3

    .line 37
    :cond_50
    sget v2, Lax/L/c;->T4:I

    if-ne v0, v2, :cond_5e

    .line 38
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->B0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->B0:F

    goto/16 :goto_d3

    .line 39
    :cond_5e
    sget v2, Lax/L/c;->U4:I

    if-ne v0, v2, :cond_6c

    .line 40
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->C0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->C0:F

    goto/16 :goto_d3

    .line 41
    :cond_6c
    sget v2, Lax/L/c;->S4:I

    if-ne v0, v2, :cond_79

    .line 42
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->A0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->A0:F

    goto :goto_d3

    .line 43
    :cond_79
    sget v2, Lax/L/c;->Q4:I

    if-ne v0, v2, :cond_86

    .line 44
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->D0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->D0:F

    goto :goto_d3

    .line 45
    :cond_86
    sget v2, Lax/L/c;->R4:I

    if-ne v0, v2, :cond_93

    .line 46
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->E0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->E0:F

    goto :goto_d3

    .line 47
    :cond_93
    sget v2, Lax/L/c;->M4:I

    if-ne v0, v2, :cond_a0

    .line 48
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->F0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->F0:F

    goto :goto_d3

    .line 49
    :cond_a0
    sget v2, Lax/L/c;->N4:I

    if-ne v0, v2, :cond_ad

    .line 50
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->G0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->G0:F

    goto :goto_d3

    .line 51
    :cond_ad
    sget v2, Lax/L/c;->O4:I

    if-ne v0, v2, :cond_ba

    .line 52
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->H0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->H0:F

    goto :goto_d3

    .line 53
    :cond_ba
    sget v2, Lax/L/c;->P4:I

    if-ne v0, v2, :cond_c7

    .line 54
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->I0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->I0:F

    goto :goto_d3

    .line 55
    :cond_c7
    sget v2, Lax/L/c;->V4:I

    if-ne v0, v2, :cond_d3

    .line 56
    iget v2, p0, Landroidx/constraintlayout/widget/f$a;->J0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/f$a;->J0:F

    :cond_d3
    :goto_d3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2b

    .line 57
    :cond_d7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
