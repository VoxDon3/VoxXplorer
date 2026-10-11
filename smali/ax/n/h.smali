.class Lax/n/h;
.super Lax/n/f;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/n/h$m;,
        Lax/n/h$n;,
        Lax/n/h$g;,
        Lax/n/h$p;,
        Lax/n/h$s;,
        Lax/n/h$i;,
        Lax/n/h$r;,
        Lax/n/h$t;,
        Lax/n/h$h;,
        Lax/n/h$j;,
        Lax/n/h$k;,
        Lax/n/h$q;,
        Lax/n/h$o;,
        Lax/n/h$f;,
        Lax/n/h$l;
    }
.end annotation


# static fields
.field private static final j0:Lax/B/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/B/k<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final k0:Z

.field private static final l0:[I

.field private static final m0:Z


# instance fields
.field private A:Z

.field B:Landroid/view/ViewGroup;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/view/View;

.field private E:Z

.field private F:Z

.field G:Z

.field H:Z

.field I:Z

.field J:Z

.field K:Z

.field private L:Z

.field private M:[Lax/n/h$s;

.field private N:Lax/n/h$s;

.field private O:Z

.field private P:Z

.field private Q:Z

.field R:Z

.field private S:Landroid/content/res/Configuration;

.field private T:I

.field private U:I

.field private V:I

.field private W:Z

.field private X:Lax/n/h$p;

.field private Y:Lax/n/h$p;

.field Z:Z

.field a0:I

.field private final b0:Ljava/lang/Runnable;

.field private c0:Z

.field private d0:Landroid/graphics/Rect;

.field private e0:Landroid/graphics/Rect;

.field private f0:Lax/n/z;

.field private g0:Lax/n/B;

.field private h0:Landroid/window/OnBackInvokedDispatcher;

.field private i0:Landroid/window/OnBackInvokedCallback;

.field final j:Ljava/lang/Object;

.field final k:Landroid/content/Context;

.field l:Landroid/view/Window;

.field private m:Lax/n/h$n;

.field final n:Lax/n/d;

.field o:Lax/n/a;

.field p:Landroid/view/MenuInflater;

.field private q:Ljava/lang/CharSequence;

.field private r:Lax/u/k;

.field private s:Lax/n/h$h;

.field private t:Lax/n/h$t;

.field u:Landroidx/appcompat/view/a;

.field v:Landroidx/appcompat/widget/ActionBarContextView;

.field w:Landroid/widget/PopupWindow;

.field x:Ljava/lang/Runnable;

.field y:Lax/c0/n0;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/B/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/B/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/n/h;->j0:Lax/B/k;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-boolean v0, Lax/n/h;->k0:Z

    .line 10
    .line 11
    const v0, 0x1010054

    .line 12
    .line 13
    .line 14
    filled-new-array {v0}, [I

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lax/n/h;->l0:[I

    .line 19
    .line 20
    const-string v0, "robolectric"

    .line 21
    .line 22
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    xor-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    sput-boolean v0, Lax/n/h;->m0:Z

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method constructor <init>(Landroid/app/Activity;Lax/n/d;)V
    .registers 4

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2, p1}, Lax/n/h;-><init>(Landroid/content/Context;Landroid/view/Window;Lax/n/d;Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Landroid/app/Dialog;Lax/n/d;)V
    .registers 5

    .line 2
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2, p1}, Lax/n/h;-><init>(Landroid/content/Context;Landroid/view/Window;Lax/n/d;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/view/Window;Lax/n/d;Ljava/lang/Object;)V
    .registers 7

    .line 3
    invoke-direct {p0}, Lax/n/f;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lax/n/h;->y:Lax/c0/n0;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/n/h;->z:Z

    const/16 v0, -0x64

    .line 6
    iput v0, p0, Lax/n/h;->T:I

    .line 7
    new-instance v1, Lax/n/h$a;

    invoke-direct {v1, p0}, Lax/n/h$a;-><init>(Lax/n/h;)V

    iput-object v1, p0, Lax/n/h;->b0:Ljava/lang/Runnable;

    .line 8
    iput-object p1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 9
    iput-object p3, p0, Lax/n/h;->n:Lax/n/d;

    .line 10
    iput-object p4, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 11
    iget p1, p0, Lax/n/h;->T:I

    if-ne p1, v0, :cond_32

    instance-of p1, p4, Landroid/app/Dialog;

    if-eqz p1, :cond_32

    .line 12
    invoke-direct {p0}, Lax/n/h;->c1()Lax/n/c;

    move-result-object p1

    if-eqz p1, :cond_32

    .line 13
    invoke-virtual {p1}, Lax/n/c;->getDelegate()Lax/n/f;

    move-result-object p1

    invoke-virtual {p1}, Lax/n/f;->q()I

    move-result p1

    iput p1, p0, Lax/n/h;->T:I

    .line 14
    :cond_32
    iget p1, p0, Lax/n/h;->T:I

    if-ne p1, v0, :cond_59

    .line 15
    sget-object p1, Lax/n/h;->j0:Lax/B/k;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_59

    .line 16
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iput p3, p0, Lax/n/h;->T:I

    .line 17
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lax/B/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_59
    if-eqz p2, :cond_5e

    .line 18
    invoke-direct {p0, p2}, Lax/n/h;->Y(Landroid/view/Window;)V

    .line 19
    :cond_5e
    invoke-static {}, Landroidx/appcompat/widget/k;->h()V

    return-void
.end method

.method private A0(Lax/n/h$s;)Z
    .registers 5

    .line 1
    iget-object v0, p1, Lax/n/h$s;->i:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_8

    .line 5
    .line 6
    iput-object v0, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    iget-object v0, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    return v2

    .line 15
    :cond_e
    iget-object v0, p0, Lax/n/h;->t:Lax/n/h$t;

    .line 16
    .line 17
    if-nez v0, :cond_19

    .line 18
    .line 19
    new-instance v0, Lax/n/h$t;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lax/n/h$t;-><init>(Lax/n/h;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lax/n/h;->t:Lax/n/h$t;

    .line 25
    .line 26
    :cond_19
    iget-object v0, p0, Lax/n/h;->t:Lax/n/h$t;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lax/n/h$s;->a(Landroidx/appcompat/view/menu/j$a;)Landroidx/appcompat/view/menu/k;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/view/View;

    .line 33
    .line 34
    iput-object v0, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 35
    .line 36
    if-eqz v0, :cond_26

    .line 37
    .line 38
    return v1

    .line 39
    :cond_26
    return v2
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private B0(Lax/n/h$s;)Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/n/h;->r0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lax/n/h$s;->d(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lax/n/h$r;

    .line 9
    .line 10
    iget-object v1, p1, Lax/n/h$s;->l:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lax/n/h$r;-><init>(Lax/n/h;Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p1, Lax/n/h$s;->g:Landroid/view/ViewGroup;

    .line 16
    .line 17
    const/16 v0, 0x51

    .line 18
    .line 19
    iput v0, p1, Lax/n/h$s;->c:I

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1
.end method

.method private C0(Lax/n/h$s;)Z
    .registers 8

    .line 1
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 2
    .line 3
    iget v1, p1, Lax/n/h$s;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_b

    .line 7
    .line 8
    const/16 v3, 0x6c

    .line 9
    .line 10
    if-ne v1, v3, :cond_63

    .line 11
    .line 12
    :cond_b
    iget-object v1, p0, Lax/n/h;->r:Lax/u/k;

    .line 13
    .line 14
    if-eqz v1, :cond_63

    .line 15
    .line 16
    new-instance v1, Landroid/util/TypedValue;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget v4, Lax/m/a;->f:I

    .line 26
    .line 27
    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 28
    .line 29
    .line 30
    iget v4, v1, Landroid/util/TypedValue;->resourceId:I

    .line 31
    .line 32
    if-eqz v4, :cond_37

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 43
    .line 44
    .line 45
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    .line 46
    .line 47
    invoke-virtual {v4, v5, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 48
    .line 49
    .line 50
    sget v5, Lax/m/a;->g:I

    .line 51
    .line 52
    invoke-virtual {v4, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 53
    .line 54
    .line 55
    goto :goto_3d

    .line 56
    :cond_37
    sget v4, Lax/m/a;->g:I

    .line 57
    .line 58
    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    :goto_3d
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    .line 63
    .line 64
    if-eqz v5, :cond_53

    .line 65
    .line 66
    if-nez v4, :cond_4e

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 77
    .line 78
    .line 79
    :cond_4e
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    .line 80
    .line 81
    invoke-virtual {v4, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 82
    .line 83
    .line 84
    :cond_53
    if-eqz v4, :cond_63

    .line 85
    .line 86
    new-instance v1, Lax/s/c;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-direct {v1, v0, v3}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 97
    .line 98
    .line 99
    move-object v0, v1

    .line 100
    :cond_63
    new-instance v1, Landroidx/appcompat/view/menu/e;

    .line 101
    .line 102
    invoke-direct {v1, v0}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p0}, Landroidx/appcompat/view/menu/e;->S(Landroidx/appcompat/view/menu/e$a;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1}, Lax/n/h$s;->c(Landroidx/appcompat/view/menu/e;)V

    .line 109
    .line 110
    .line 111
    return v2
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private D0(I)V
    .registers 4

    .line 1
    iget v0, p0, Lax/n/h;->a0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int p1, v1, p1

    .line 5
    .line 6
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, Lax/n/h;->a0:I

    .line 8
    .line 9
    iget-boolean p1, p0, Lax/n/h;->Z:Z

    .line 10
    .line 11
    if-nez p1, :cond_19

    .line 12
    .line 13
    iget-object p1, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lax/n/h;->b0:Ljava/lang/Runnable;

    .line 20
    .line 21
    invoke-static {p1, v0}, Lax/c0/d0;->d0(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    iput-boolean v1, p0, Lax/n/h;->Z:Z

    .line 25
    .line 26
    :cond_19
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private I0(ILandroid/view/KeyEvent;)Z
    .registers 4

    .line 1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_14

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-boolean v0, p1, Lax/n/h$s;->o:Z

    .line 13
    .line 14
    if-nez v0, :cond_14

    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, Lax/n/h;->S0(Lax/n/h$s;Landroid/view/KeyEvent;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_14
    const/4 p1, 0x0

    .line 22
    return p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private L0(ILandroid/view/KeyEvent;)Z
    .registers 7

    .line 1
    iget-object v0, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez p1, :cond_43

    .line 13
    .line 14
    iget-object p1, p0, Lax/n/h;->r:Lax/u/k;

    .line 15
    .line 16
    if-eqz p1, :cond_43

    .line 17
    .line 18
    invoke-interface {p1}, Lax/u/k;->i()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_43

    .line 23
    .line 24
    iget-object p1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 25
    .line 26
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_43

    .line 35
    .line 36
    iget-object p1, p0, Lax/n/h;->r:Lax/u/k;

    .line 37
    .line 38
    invoke-interface {p1}, Lax/u/k;->d()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_3c

    .line 43
    .line 44
    iget-boolean p1, p0, Lax/n/h;->R:Z

    .line 45
    .line 46
    if-nez p1, :cond_62

    .line 47
    .line 48
    invoke-direct {p0, v2, p2}, Lax/n/h;->S0(Lax/n/h$s;Landroid/view/KeyEvent;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_62

    .line 53
    .line 54
    iget-object p1, p0, Lax/n/h;->r:Lax/u/k;

    .line 55
    .line 56
    invoke-interface {p1}, Lax/u/k;->l()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    goto :goto_68

    .line 61
    :cond_3c
    iget-object p1, p0, Lax/n/h;->r:Lax/u/k;

    .line 62
    .line 63
    invoke-interface {p1}, Lax/u/k;->k()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    goto :goto_68

    .line 68
    :cond_43
    iget-boolean p1, v2, Lax/n/h$s;->o:Z

    .line 69
    .line 70
    if-nez p1, :cond_64

    .line 71
    .line 72
    iget-boolean v3, v2, Lax/n/h$s;->n:Z

    .line 73
    .line 74
    if-eqz v3, :cond_4c

    .line 75
    .line 76
    goto :goto_64

    .line 77
    :cond_4c
    iget-boolean p1, v2, Lax/n/h$s;->m:Z

    .line 78
    .line 79
    if-eqz p1, :cond_62

    .line 80
    .line 81
    iget-boolean p1, v2, Lax/n/h$s;->r:Z

    .line 82
    .line 83
    if-eqz p1, :cond_5b

    .line 84
    .line 85
    iput-boolean v1, v2, Lax/n/h$s;->m:Z

    .line 86
    .line 87
    invoke-direct {p0, v2, p2}, Lax/n/h;->S0(Lax/n/h$s;Landroid/view/KeyEvent;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    goto :goto_5c

    .line 92
    :cond_5b
    const/4 p1, 0x1

    .line 93
    :goto_5c
    if-eqz p1, :cond_62

    .line 94
    .line 95
    invoke-direct {p0, v2, p2}, Lax/n/h;->P0(Lax/n/h$s;Landroid/view/KeyEvent;)V

    .line 96
    .line 97
    .line 98
    goto :goto_68

    .line 99
    :cond_62
    const/4 v0, 0x0

    .line 100
    goto :goto_68

    .line 101
    :cond_64
    :goto_64
    invoke-virtual {p0, v2, v0}, Lax/n/h;->f0(Lax/n/h$s;Z)V

    .line 102
    .line 103
    .line 104
    move v0, p1

    .line 105
    :goto_68
    if-eqz v0, :cond_85

    .line 106
    .line 107
    iget-object p1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string p2, "audio"

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Landroid/media/AudioManager;

    .line 120
    .line 121
    if-eqz p1, :cond_7e

    .line 122
    .line 123
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 124
    .line 125
    .line 126
    return v0

    .line 127
    :cond_7e
    const-string p1, "AppCompatDelegate"

    .line 128
    .line 129
    const-string p2, "Couldn\'t get audio manager"

    .line 130
    .line 131
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    :cond_85
    return v0
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private P0(Lax/n/h$s;Landroid/view/KeyEvent;)V
    .registers 14

    .line 1
    iget-boolean v0, p1, Lax/n/h$s;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_f5

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/n/h;->R:Z

    .line 6
    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    goto/16 :goto_f5

    .line 10
    .line 11
    :cond_a
    iget v0, p1, Lax/n/h$s;->a:I

    .line 12
    .line 13
    if-nez v0, :cond_20

    .line 14
    .line 15
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 26
    .line 27
    and-int/lit8 v0, v0, 0xf

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    if-ne v0, v1, :cond_20

    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    invoke-virtual {p0}, Lax/n/h;->y0()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x1

    .line 38
    if-eqz v0, :cond_35

    .line 39
    .line 40
    iget v2, p1, Lax/n/h$s;->a:I

    .line 41
    .line 42
    iget-object v3, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 43
    .line 44
    invoke-interface {v0, v2, v3}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_35

    .line 49
    .line 50
    invoke-virtual {p0, p1, v1}, Lax/n/h;->f0(Lax/n/h$s;Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 55
    .line 56
    const-string v2, "window"

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/view/WindowManager;

    .line 63
    .line 64
    if-nez v0, :cond_43

    .line 65
    .line 66
    goto/16 :goto_f5

    .line 67
    .line 68
    :cond_43
    invoke-direct {p0, p1, p2}, Lax/n/h;->S0(Lax/n/h$s;Landroid/view/KeyEvent;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_4b

    .line 73
    .line 74
    goto/16 :goto_f5

    .line 75
    .line 76
    :cond_4b
    iget-object p2, p1, Lax/n/h$s;->g:Landroid/view/ViewGroup;

    .line 77
    .line 78
    const/4 v2, -0x2

    .line 79
    if-eqz p2, :cond_66

    .line 80
    .line 81
    iget-boolean v3, p1, Lax/n/h$s;->q:Z

    .line 82
    .line 83
    if-eqz v3, :cond_55

    .line 84
    .line 85
    goto :goto_66

    .line 86
    :cond_55
    iget-object p2, p1, Lax/n/h$s;->i:Landroid/view/View;

    .line 87
    .line 88
    if-eqz p2, :cond_c9

    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-eqz p2, :cond_c9

    .line 95
    .line 96
    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 97
    .line 98
    const/4 v3, -0x1

    .line 99
    if-ne p2, v3, :cond_c9

    .line 100
    .line 101
    const/4 v4, -0x1

    .line 102
    goto :goto_ca

    .line 103
    :cond_66
    :goto_66
    if-nez p2, :cond_74

    .line 104
    .line 105
    invoke-direct {p0, p1}, Lax/n/h;->B0(Lax/n/h$s;)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_f5

    .line 110
    .line 111
    iget-object p2, p1, Lax/n/h$s;->g:Landroid/view/ViewGroup;

    .line 112
    .line 113
    if-nez p2, :cond_83

    .line 114
    .line 115
    goto/16 :goto_f5

    .line 116
    .line 117
    :cond_74
    iget-boolean v3, p1, Lax/n/h$s;->q:Z

    .line 118
    .line 119
    if-eqz v3, :cond_83

    .line 120
    .line 121
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-lez p2, :cond_83

    .line 126
    .line 127
    iget-object p2, p1, Lax/n/h$s;->g:Landroid/view/ViewGroup;

    .line 128
    .line 129
    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 130
    .line 131
    .line 132
    :cond_83
    invoke-direct {p0, p1}, Lax/n/h;->A0(Lax/n/h$s;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_f3

    .line 137
    .line 138
    invoke-virtual {p1}, Lax/n/h$s;->b()Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-nez p2, :cond_90

    .line 143
    .line 144
    goto :goto_f3

    .line 145
    :cond_90
    iget-object p2, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 146
    .line 147
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    if-nez p2, :cond_9d

    .line 152
    .line 153
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    .line 154
    .line 155
    invoke-direct {p2, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 156
    .line 157
    .line 158
    :cond_9d
    iget v3, p1, Lax/n/h$s;->b:I

    .line 159
    .line 160
    iget-object v4, p1, Lax/n/h$s;->g:Landroid/view/ViewGroup;

    .line 161
    .line 162
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 163
    .line 164
    .line 165
    iget-object v3, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 166
    .line 167
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 172
    .line 173
    if-eqz v4, :cond_b5

    .line 174
    .line 175
    check-cast v3, Landroid/view/ViewGroup;

    .line 176
    .line 177
    iget-object v4, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 178
    .line 179
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 180
    .line 181
    .line 182
    :cond_b5
    iget-object v3, p1, Lax/n/h$s;->g:Landroid/view/ViewGroup;

    .line 183
    .line 184
    iget-object v4, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 185
    .line 186
    invoke-virtual {v3, v4, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    .line 188
    .line 189
    iget-object p2, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 190
    .line 191
    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-nez p2, :cond_c9

    .line 196
    .line 197
    iget-object p2, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 198
    .line 199
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    .line 200
    .line 201
    .line 202
    :cond_c9
    const/4 v4, -0x2

    .line 203
    :goto_ca
    const/4 p2, 0x0

    .line 204
    iput-boolean p2, p1, Lax/n/h$s;->n:Z

    .line 205
    .line 206
    new-instance v3, Landroid/view/WindowManager$LayoutParams;

    .line 207
    .line 208
    iget v6, p1, Lax/n/h$s;->d:I

    .line 209
    .line 210
    iget v7, p1, Lax/n/h$s;->e:I

    .line 211
    .line 212
    const/high16 v9, 0x820000

    .line 213
    .line 214
    const/4 v10, -0x3

    .line 215
    const/4 v5, -0x2

    .line 216
    const/16 v8, 0x3ea

    .line 217
    .line 218
    invoke-direct/range {v3 .. v10}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 219
    .line 220
    .line 221
    iget p2, p1, Lax/n/h$s;->c:I

    .line 222
    .line 223
    iput p2, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 224
    .line 225
    iget p2, p1, Lax/n/h$s;->f:I

    .line 226
    .line 227
    iput p2, v3, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 228
    .line 229
    iget-object p2, p1, Lax/n/h$s;->g:Landroid/view/ViewGroup;

    .line 230
    .line 231
    invoke-interface {v0, p2, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 232
    .line 233
    .line 234
    iput-boolean v1, p1, Lax/n/h$s;->o:Z

    .line 235
    .line 236
    iget p1, p1, Lax/n/h$s;->a:I

    .line 237
    .line 238
    if-nez p1, :cond_f5

    .line 239
    .line 240
    invoke-virtual {p0}, Lax/n/h;->f1()V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_f3
    :goto_f3
    iput-boolean v1, p1, Lax/n/h$s;->q:Z

    .line 245
    .line 246
    :cond_f5
    :goto_f5
    return-void
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private R0(Lax/n/h$s;ILandroid/view/KeyEvent;I)Z
    .registers 7

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    iget-boolean v0, p1, Lax/n/h$s;->m:Z

    .line 10
    .line 11
    if-nez v0, :cond_12

    .line 12
    .line 13
    invoke-direct {p0, p1, p3}, Lax/n/h;->S0(Lax/n/h$s;Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1a

    .line 18
    .line 19
    :cond_12
    iget-object v0, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 20
    .line 21
    if-eqz v0, :cond_1a

    .line 22
    .line 23
    invoke-virtual {v0, p2, p3, p4}, Landroidx/appcompat/view/menu/e;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :cond_1a
    if-eqz v1, :cond_28

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    and-int/lit8 p3, p4, 0x1

    .line 31
    .line 32
    if-nez p3, :cond_28

    .line 33
    .line 34
    iget-object p3, p0, Lax/n/h;->r:Lax/u/k;

    .line 35
    .line 36
    if-nez p3, :cond_28

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2}, Lax/n/h;->f0(Lax/n/h$s;Z)V

    .line 39
    .line 40
    .line 41
    :cond_28
    return v1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private S0(Lax/n/h$s;Landroid/view/KeyEvent;)Z
    .registers 11

    .line 1
    iget-boolean v0, p0, Lax/n/h;->R:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-boolean v0, p1, Lax/n/h$s;->m:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return v2

    .line 13
    :cond_c
    iget-object v0, p0, Lax/n/h;->N:Lax/n/h$s;

    .line 14
    .line 15
    if-eqz v0, :cond_15

    .line 16
    .line 17
    if-eq v0, p1, :cond_15

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lax/n/h;->f0(Lax/n/h$s;Z)V

    .line 20
    .line 21
    .line 22
    :cond_15
    invoke-virtual {p0}, Lax/n/h;->y0()Landroid/view/Window$Callback;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_23

    .line 27
    .line 28
    iget v3, p1, Lax/n/h$s;->a:I

    .line 29
    .line 30
    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iput-object v3, p1, Lax/n/h$s;->i:Landroid/view/View;

    .line 35
    .line 36
    :cond_23
    iget v3, p1, Lax/n/h$s;->a:I

    .line 37
    .line 38
    if-eqz v3, :cond_2e

    .line 39
    .line 40
    const/16 v4, 0x6c

    .line 41
    .line 42
    if-ne v3, v4, :cond_2c

    .line 43
    .line 44
    goto :goto_2e

    .line 45
    :cond_2c
    const/4 v3, 0x0

    .line 46
    goto :goto_2f

    .line 47
    :cond_2e
    :goto_2e
    const/4 v3, 0x1

    .line 48
    :goto_2f
    if-eqz v3, :cond_38

    .line 49
    .line 50
    iget-object v4, p0, Lax/n/h;->r:Lax/u/k;

    .line 51
    .line 52
    if-eqz v4, :cond_38

    .line 53
    .line 54
    invoke-interface {v4}, Lax/u/k;->g()V

    .line 55
    .line 56
    .line 57
    :cond_38
    iget-object v4, p1, Lax/n/h$s;->i:Landroid/view/View;

    .line 58
    .line 59
    if-nez v4, :cond_e2

    .line 60
    .line 61
    if-eqz v3, :cond_46

    .line 62
    .line 63
    invoke-virtual {p0}, Lax/n/h;->Q0()Lax/n/a;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    instance-of v4, v4, Lax/n/E;

    .line 68
    .line 69
    if-nez v4, :cond_e2

    .line 70
    .line 71
    :cond_46
    iget-object v4, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    if-eqz v4, :cond_4f

    .line 75
    .line 76
    iget-boolean v6, p1, Lax/n/h$s;->r:Z

    .line 77
    .line 78
    if-eqz v6, :cond_96

    .line 79
    .line 80
    :cond_4f
    if-nez v4, :cond_5c

    .line 81
    .line 82
    invoke-direct {p0, p1}, Lax/n/h;->C0(Lax/n/h$s;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_5b

    .line 87
    .line 88
    iget-object v4, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 89
    .line 90
    if-nez v4, :cond_5c

    .line 91
    .line 92
    :cond_5b
    return v1

    .line 93
    :cond_5c
    if-eqz v3, :cond_76

    .line 94
    .line 95
    iget-object v4, p0, Lax/n/h;->r:Lax/u/k;

    .line 96
    .line 97
    if-eqz v4, :cond_76

    .line 98
    .line 99
    iget-object v4, p0, Lax/n/h;->s:Lax/n/h$h;

    .line 100
    .line 101
    if-nez v4, :cond_6d

    .line 102
    .line 103
    new-instance v4, Lax/n/h$h;

    .line 104
    .line 105
    invoke-direct {v4, p0}, Lax/n/h$h;-><init>(Lax/n/h;)V

    .line 106
    .line 107
    .line 108
    iput-object v4, p0, Lax/n/h;->s:Lax/n/h$h;

    .line 109
    .line 110
    :cond_6d
    iget-object v4, p0, Lax/n/h;->r:Lax/u/k;

    .line 111
    .line 112
    iget-object v6, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 113
    .line 114
    iget-object v7, p0, Lax/n/h;->s:Lax/n/h$h;

    .line 115
    .line 116
    invoke-interface {v4, v6, v7}, Lax/u/k;->c(Landroid/view/Menu;Landroidx/appcompat/view/menu/j$a;)V

    .line 117
    .line 118
    .line 119
    :cond_76
    iget-object v4, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 120
    .line 121
    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->f0()V

    .line 122
    .line 123
    .line 124
    iget v4, p1, Lax/n/h$s;->a:I

    .line 125
    .line 126
    iget-object v6, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 127
    .line 128
    invoke-interface {v0, v4, v6}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_94

    .line 133
    .line 134
    invoke-virtual {p1, v5}, Lax/n/h$s;->c(Landroidx/appcompat/view/menu/e;)V

    .line 135
    .line 136
    .line 137
    if-eqz v3, :cond_93

    .line 138
    .line 139
    iget-object p1, p0, Lax/n/h;->r:Lax/u/k;

    .line 140
    .line 141
    if-eqz p1, :cond_93

    .line 142
    .line 143
    iget-object p2, p0, Lax/n/h;->s:Lax/n/h$h;

    .line 144
    .line 145
    invoke-interface {p1, v5, p2}, Lax/u/k;->c(Landroid/view/Menu;Landroidx/appcompat/view/menu/j$a;)V

    .line 146
    .line 147
    .line 148
    :cond_93
    return v1

    .line 149
    :cond_94
    iput-boolean v1, p1, Lax/n/h$s;->r:Z

    .line 150
    .line 151
    :cond_96
    iget-object v4, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 152
    .line 153
    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->f0()V

    .line 154
    .line 155
    .line 156
    iget-object v4, p1, Lax/n/h$s;->s:Landroid/os/Bundle;

    .line 157
    .line 158
    if-eqz v4, :cond_a6

    .line 159
    .line 160
    iget-object v6, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 161
    .line 162
    invoke-virtual {v6, v4}, Landroidx/appcompat/view/menu/e;->Q(Landroid/os/Bundle;)V

    .line 163
    .line 164
    .line 165
    iput-object v5, p1, Lax/n/h$s;->s:Landroid/os/Bundle;

    .line 166
    .line 167
    :cond_a6
    iget-object v4, p1, Lax/n/h$s;->i:Landroid/view/View;

    .line 168
    .line 169
    iget-object v6, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 170
    .line 171
    invoke-interface {v0, v1, v4, v6}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_c1

    .line 176
    .line 177
    if-eqz v3, :cond_bb

    .line 178
    .line 179
    iget-object p2, p0, Lax/n/h;->r:Lax/u/k;

    .line 180
    .line 181
    if-eqz p2, :cond_bb

    .line 182
    .line 183
    iget-object v0, p0, Lax/n/h;->s:Lax/n/h$h;

    .line 184
    .line 185
    invoke-interface {p2, v5, v0}, Lax/u/k;->c(Landroid/view/Menu;Landroidx/appcompat/view/menu/j$a;)V

    .line 186
    .line 187
    .line 188
    :cond_bb
    iget-object p1, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 189
    .line 190
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->e0()V

    .line 191
    .line 192
    .line 193
    return v1

    .line 194
    :cond_c1
    if-eqz p2, :cond_c8

    .line 195
    .line 196
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    goto :goto_c9

    .line 201
    :cond_c8
    const/4 p2, -0x1

    .line 202
    :goto_c9
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    if-eq p2, v2, :cond_d5

    .line 211
    .line 212
    const/4 p2, 0x1

    .line 213
    goto :goto_d6

    .line 214
    :cond_d5
    const/4 p2, 0x0

    .line 215
    :goto_d6
    iput-boolean p2, p1, Lax/n/h$s;->p:Z

    .line 216
    .line 217
    iget-object v0, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 218
    .line 219
    invoke-virtual {v0, p2}, Landroidx/appcompat/view/menu/e;->setQwertyMode(Z)V

    .line 220
    .line 221
    .line 222
    iget-object p2, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 223
    .line 224
    invoke-virtual {p2}, Landroidx/appcompat/view/menu/e;->e0()V

    .line 225
    .line 226
    .line 227
    :cond_e2
    iput-boolean v2, p1, Lax/n/h$s;->m:Z

    .line 228
    .line 229
    iput-boolean v1, p1, Lax/n/h$s;->n:Z

    .line 230
    .line 231
    iput-object p1, p0, Lax/n/h;->N:Lax/n/h$s;

    .line 232
    .line 233
    return v2
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private T0(Z)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/n/h;->r:Lax/u/k;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_82

    .line 6
    .line 7
    invoke-interface {v0}, Lax/u/k;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_82

    .line 12
    .line 13
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_20

    .line 24
    .line 25
    iget-object v0, p0, Lax/n/h;->r:Lax/u/k;

    .line 26
    .line 27
    invoke-interface {v0}, Lax/u/k;->j()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_82

    .line 32
    .line 33
    :cond_20
    invoke-virtual {p0}, Lax/n/h;->y0()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v3, p0, Lax/n/h;->r:Lax/u/k;

    .line 38
    .line 39
    invoke-interface {v3}, Lax/u/k;->d()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/16 v4, 0x6c

    .line 44
    .line 45
    if-eqz v3, :cond_44

    .line 46
    .line 47
    if-nez p1, :cond_31

    .line 48
    .line 49
    goto :goto_44

    .line 50
    :cond_31
    iget-object p1, p0, Lax/n/h;->r:Lax/u/k;

    .line 51
    .line 52
    invoke-interface {p1}, Lax/u/k;->k()Z

    .line 53
    .line 54
    .line 55
    iget-boolean p1, p0, Lax/n/h;->R:Z

    .line 56
    .line 57
    if-nez p1, :cond_81

    .line 58
    .line 59
    invoke-virtual {p0, v2, v1}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 64
    .line 65
    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_44
    :goto_44
    if-eqz v0, :cond_81

    .line 70
    .line 71
    iget-boolean p1, p0, Lax/n/h;->R:Z

    .line 72
    .line 73
    if-nez p1, :cond_81

    .line 74
    .line 75
    iget-boolean p1, p0, Lax/n/h;->Z:Z

    .line 76
    .line 77
    if-eqz p1, :cond_63

    .line 78
    .line 79
    iget p1, p0, Lax/n/h;->a0:I

    .line 80
    .line 81
    and-int/2addr p1, v1

    .line 82
    if-eqz p1, :cond_63

    .line 83
    .line 84
    iget-object p1, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v3, p0, Lax/n/h;->b0:Ljava/lang/Runnable;

    .line 91
    .line 92
    invoke-virtual {p1, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lax/n/h;->b0:Ljava/lang/Runnable;

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 98
    .line 99
    .line 100
    :cond_63
    invoke-virtual {p0, v2, v1}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object v1, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 105
    .line 106
    if-eqz v1, :cond_81

    .line 107
    .line 108
    iget-boolean v3, p1, Lax/n/h$s;->r:Z

    .line 109
    .line 110
    if-nez v3, :cond_81

    .line 111
    .line 112
    iget-object v3, p1, Lax/n/h$s;->i:Landroid/view/View;

    .line 113
    .line 114
    invoke-interface {v0, v2, v3, v1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_81

    .line 119
    .line 120
    iget-object p1, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 121
    .line 122
    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Lax/n/h;->r:Lax/u/k;

    .line 126
    .line 127
    invoke-interface {p1}, Lax/u/k;->l()Z

    .line 128
    .line 129
    .line 130
    :cond_81
    return-void

    .line 131
    :cond_82
    invoke-virtual {p0, v2, v1}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-boolean v1, p1, Lax/n/h$s;->q:Z

    .line 136
    .line 137
    invoke-virtual {p0, p1, v2}, Lax/n/h;->f0(Lax/n/h$s;Z)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-direct {p0, p1, v0}, Lax/n/h;->P0(Lax/n/h$s;Landroid/view/KeyEvent;)V

    .line 142
    .line 143
    .line 144
    return-void
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private U0(I)I
    .registers 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const-string v1, "AppCompatDelegate"

    .line 4
    .line 5
    if-ne p1, v0, :cond_e

    .line 6
    .line 7
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 8
    .line 9
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    const/16 p1, 0x6c

    .line 13
    .line 14
    return p1

    .line 15
    :cond_e
    const/16 v0, 0x9

    .line 16
    .line 17
    if-ne p1, v0, :cond_19

    .line 18
    .line 19
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    .line 20
    .line 21
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    const/16 p1, 0x6d

    .line 25
    .line 26
    :cond_19
    return p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private V(Z)Z
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lax/n/h;->W(ZZ)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private W(ZZ)Z
    .registers 7

    .line 1
    iget-boolean v0, p0, Lax/n/h;->R:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_6
    invoke-direct {p0}, Lax/n/h;->a0()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lax/n/h;->F0(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v3, 0x21

    .line 20
    .line 21
    if-ge v2, v3, :cond_1d

    .line 22
    .line 23
    iget-object v2, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lax/n/h;->Z(Landroid/content/Context;)Lax/Y/h;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    const/4 v2, 0x0

    .line 31
    :goto_1e
    if-nez p2, :cond_30

    .line 32
    .line 33
    if-eqz v2, :cond_30

    .line 34
    .line 35
    iget-object p2, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p0, p2}, Lax/n/h;->v0(Landroid/content/res/Configuration;)Lax/Y/h;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_30
    invoke-direct {p0, v1, v2, p1}, Lax/n/h;->e1(ILax/Y/h;Z)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez v0, :cond_40

    .line 54
    .line 55
    iget-object p2, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 56
    .line 57
    invoke-direct {p0, p2}, Lax/n/h;->u0(Landroid/content/Context;)Lax/n/h$p;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p2}, Lax/n/h$p;->e()V

    .line 62
    .line 63
    .line 64
    goto :goto_47

    .line 65
    :cond_40
    iget-object p2, p0, Lax/n/h;->X:Lax/n/h$p;

    .line 66
    .line 67
    if-eqz p2, :cond_47

    .line 68
    .line 69
    invoke-virtual {p2}, Lax/n/h$p;->a()V

    .line 70
    .line 71
    .line 72
    :cond_47
    :goto_47
    const/4 p2, 0x3

    .line 73
    if-ne v0, p2, :cond_54

    .line 74
    .line 75
    iget-object p2, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 76
    .line 77
    invoke-direct {p0, p2}, Lax/n/h;->t0(Landroid/content/Context;)Lax/n/h$p;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2}, Lax/n/h$p;->e()V

    .line 82
    .line 83
    .line 84
    return p1

    .line 85
    :cond_54
    iget-object p2, p0, Lax/n/h;->Y:Lax/n/h$p;

    .line 86
    .line 87
    if-eqz p2, :cond_5b

    .line 88
    .line 89
    invoke-virtual {p2}, Lax/n/h$p;->a()V

    .line 90
    .line 91
    .line 92
    :cond_5b
    return p1
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private X()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 2
    .line 3
    const v1, 0x1020002

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 11
    .line 12
    iget-object v1, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/appcompat/widget/ContentFrameLayout;->a(IIII)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 38
    .line 39
    sget-object v2, Lax/m/j;->y0:[I

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget v2, Lax/m/j;->K0:I

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 52
    .line 53
    .line 54
    sget v2, Lax/m/j;->L0:I

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 61
    .line 62
    .line 63
    sget v2, Lax/m/j;->I0:I

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4d

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 76
    .line 77
    .line 78
    :cond_4d
    sget v2, Lax/m/j;->J0:I

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_5c

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 91
    .line 92
    .line 93
    :cond_5c
    sget v2, Lax/m/j;->G0:I

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_6b

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 106
    .line 107
    .line 108
    :cond_6b
    sget v2, Lax/m/j;->H0:I

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_7a

    .line 115
    .line 116
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 121
    .line 122
    .line 123
    :cond_7a
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 127
    .line 128
    .line 129
    return-void
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private Y(Landroid/view/Window;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 2
    .line 3
    const-string v1, "AppCompat has already installed itself into the Window"

    .line 4
    .line 5
    if-nez v0, :cond_44

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v2, v0, Lax/n/h$n;

    .line 12
    .line 13
    if-nez v2, :cond_3e

    .line 14
    .line 15
    new-instance v1, Lax/n/h$n;

    .line 16
    .line 17
    invoke-direct {v1, p0, v0}, Lax/n/h$n;-><init>(Lax/n/h;Landroid/view/Window$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 26
    .line 27
    sget-object v1, Lax/n/h;->l0:[I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v0, v2, v1}, Landroidx/appcompat/widget/L;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/widget/L;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/L;->h(I)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_2b

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    invoke-virtual {v0}, Landroidx/appcompat/widget/L;->x()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 48
    .line 49
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/16 v0, 0x21

    .line 52
    .line 53
    if-lt p1, v0, :cond_3d

    .line 54
    .line 55
    iget-object p1, p0, Lax/n/h;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 56
    .line 57
    if-nez p1, :cond_3d

    .line 58
    .line 59
    invoke-virtual {p0, v2}, Lax/n/h;->O(Landroid/window/OnBackInvokedDispatcher;)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    return-void

    .line 63
    :cond_3e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_44
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private Y0(Landroid/view/ViewParent;)Z
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    iget-object v1, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_a
    if-nez p1, :cond_e

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_e
    if-eq p1, v1, :cond_23

    .line 16
    .line 17
    instance-of v2, p1, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_23

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    check-cast v2, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1e

    .line 29
    .line 30
    goto :goto_23

    .line 31
    :cond_1e
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_a

    .line 36
    :cond_23
    :goto_23
    return v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private a0()I
    .registers 3

    .line 1
    iget v0, p0, Lax/n/h;->T:I

    .line 2
    .line 3
    const/16 v1, -0x64

    .line 4
    .line 5
    if-eq v0, v1, :cond_7

    .line 6
    .line 7
    return v0

    .line 8
    :cond_7
    invoke-static {}, Lax/n/f;->o()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private b1()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/n/h;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 7
    .line 8
    const-string v1, "Window feature must be requested before adding content"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private c1()Lax/n/c;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 2
    .line 3
    :goto_2
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_17

    .line 5
    .line 6
    instance-of v2, v0, Lax/n/c;

    .line 7
    .line 8
    if-eqz v2, :cond_c

    .line 9
    .line 10
    check-cast v0, Lax/n/c;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_c
    instance-of v2, v0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    if-eqz v2, :cond_17

    .line 16
    .line 17
    check-cast v0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_2

    .line 24
    :cond_17
    return-object v1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private d0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/n/h;->X:Lax/n/h$p;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/n/h$p;->a()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lax/n/h;->Y:Lax/n/h$p;

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/n/h$p;->a()V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private d1(Landroid/content/res/Configuration;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    instance-of v1, v0, Lax/G0/h;

    .line 6
    .line 7
    if-eqz v1, :cond_1f

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lax/G0/h;

    .line 11
    .line 12
    invoke-interface {v1}, Lax/G0/h;->getLifecycle()Landroidx/lifecycle/d;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroidx/lifecycle/d;->b()Landroidx/lifecycle/d$b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, Landroidx/lifecycle/d$b;->d0:Landroidx/lifecycle/d$b;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroidx/lifecycle/d$b;->h(Landroidx/lifecycle/d$b;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2a

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    iget-boolean v1, p0, Lax/n/h;->Q:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2a

    .line 35
    .line 36
    iget-boolean v1, p0, Lax/n/h;->R:Z

    .line 37
    .line 38
    if-nez v1, :cond_2a

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private e1(ILax/Y/h;Z)Z
    .registers 14

    .line 1
    iget-object v1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move v2, p1

    .line 7
    move-object v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lax/n/h;->g0(Landroid/content/Context;ILax/Y/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, v0, Lax/n/h;->k:Landroid/content/Context;

    .line 13
    .line 14
    invoke-direct {p0, p2}, Lax/n/h;->s0(Landroid/content/Context;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v1, v0, Lax/n/h;->S:Landroid/content/res/Configuration;

    .line 19
    .line 20
    if-nez v1, :cond_1f

    .line 21
    .line 22
    iget-object v1, v0, Lax/n/h;->k:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_1f
    iget v4, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 33
    .line 34
    and-int/lit8 v4, v4, 0x30

    .line 35
    .line 36
    iget v5, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 37
    .line 38
    and-int/lit8 v5, v5, 0x30

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lax/n/h;->v0(Landroid/content/res/Configuration;)Lax/Y/h;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v6, 0x0

    .line 45
    if-nez v3, :cond_30

    .line 46
    .line 47
    move-object v7, v6

    .line 48
    goto :goto_34

    .line 49
    :cond_30
    invoke-virtual {p0, p1}, Lax/n/h;->v0(Landroid/content/res/Configuration;)Lax/Y/h;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    :goto_34
    const/4 v8, 0x0

    .line 54
    if-eq v4, v5, :cond_3a

    .line 55
    .line 56
    const/16 v4, 0x200

    .line 57
    .line 58
    goto :goto_3b

    .line 59
    :cond_3a
    const/4 v4, 0x0

    .line 60
    :goto_3b
    if-eqz v7, :cond_45

    .line 61
    .line 62
    invoke-virtual {v1, v7}, Lax/Y/h;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_45

    .line 67
    .line 68
    or-int/lit16 v4, v4, 0x2004

    .line 69
    .line 70
    :cond_45
    not-int v1, p2

    .line 71
    and-int/2addr v1, v4

    .line 72
    const/4 v9, 0x1

    .line 73
    if-eqz v1, :cond_8c

    .line 74
    .line 75
    if-eqz p3, :cond_8c

    .line 76
    .line 77
    iget-boolean p3, v0, Lax/n/h;->P:Z

    .line 78
    .line 79
    if-eqz p3, :cond_8c

    .line 80
    .line 81
    sget-boolean p3, Lax/n/h;->m0:Z

    .line 82
    .line 83
    if-nez p3, :cond_58

    .line 84
    .line 85
    iget-boolean p3, v0, Lax/n/h;->Q:Z

    .line 86
    .line 87
    if-eqz p3, :cond_8c

    .line 88
    .line 89
    :cond_58
    iget-object p3, v0, Lax/n/h;->j:Ljava/lang/Object;

    .line 90
    .line 91
    instance-of v1, p3, Landroid/app/Activity;

    .line 92
    .line 93
    if-eqz v1, :cond_8c

    .line 94
    .line 95
    check-cast p3, Landroid/app/Activity;

    .line 96
    .line 97
    invoke-virtual {p3}, Landroid/app/Activity;->isChild()Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-nez p3, :cond_8c

    .line 102
    .line 103
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 104
    .line 105
    const/16 v1, 0x1f

    .line 106
    .line 107
    if-lt p3, v1, :cond_83

    .line 108
    .line 109
    and-int/lit16 p3, v4, 0x2000

    .line 110
    .line 111
    if-eqz p3, :cond_83

    .line 112
    .line 113
    iget-object p3, v0, Lax/n/h;->j:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p3, Landroid/app/Activity;

    .line 116
    .line 117
    invoke-virtual {p3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-virtual {p3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 130
    .line 131
    .line 132
    :cond_83
    iget-object p1, v0, Lax/n/h;->j:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p1, Landroid/app/Activity;

    .line 135
    .line 136
    invoke-static {p1}, Lax/P/b;->r(Landroid/app/Activity;)V

    .line 137
    .line 138
    .line 139
    const/4 p1, 0x1

    .line 140
    goto :goto_8d

    .line 141
    :cond_8c
    const/4 p1, 0x0

    .line 142
    :goto_8d
    if-nez p1, :cond_9a

    .line 143
    .line 144
    if-eqz v4, :cond_9a

    .line 145
    .line 146
    and-int p1, v4, p2

    .line 147
    .line 148
    if-ne p1, v4, :cond_96

    .line 149
    .line 150
    const/4 v8, 0x1

    .line 151
    :cond_96
    invoke-direct {p0, v5, v7, v8, v6}, Lax/n/h;->g1(ILax/Y/h;ZLandroid/content/res/Configuration;)V

    .line 152
    .line 153
    .line 154
    goto :goto_9b

    .line 155
    :cond_9a
    move v9, p1

    .line 156
    :goto_9b
    if-eqz v9, :cond_b7

    .line 157
    .line 158
    iget-object p1, v0, Lax/n/h;->j:Ljava/lang/Object;

    .line 159
    .line 160
    instance-of p2, p1, Lax/n/c;

    .line 161
    .line 162
    if-eqz p2, :cond_b7

    .line 163
    .line 164
    and-int/lit16 p2, v4, 0x200

    .line 165
    .line 166
    if-eqz p2, :cond_ac

    .line 167
    .line 168
    check-cast p1, Lax/n/c;

    .line 169
    .line 170
    invoke-virtual {p1, v2}, Lax/n/c;->onNightModeChanged(I)V

    .line 171
    .line 172
    .line 173
    :cond_ac
    and-int/lit8 p1, v4, 0x4

    .line 174
    .line 175
    if-eqz p1, :cond_b7

    .line 176
    .line 177
    iget-object p1, v0, Lax/n/h;->j:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p1, Lax/n/c;

    .line 180
    .line 181
    invoke-virtual {p1, v3}, Lax/n/c;->onLocalesChanged(Lax/Y/h;)V

    .line 182
    .line 183
    .line 184
    :cond_b7
    if-eqz v7, :cond_ca

    .line 185
    .line 186
    iget-object p1, v0, Lax/n/h;->k:Landroid/content/Context;

    .line 187
    .line 188
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p0, p1}, Lax/n/h;->v0(Landroid/content/res/Configuration;)Lax/Y/h;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p0, p1}, Lax/n/h;->W0(Lax/Y/h;)V

    .line 201
    .line 202
    .line 203
    :cond_ca
    return v9
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method private g0(Landroid/content/Context;ILax/Y/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p2, v0, :cond_1e

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p2, v0, :cond_1b

    .line 6
    .line 7
    if-eqz p5, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_20

    .line 11
    :cond_a
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/lit8 p1, p1, 0x30

    .line 26
    .line 27
    goto :goto_20

    .line 28
    :cond_1b
    const/16 p1, 0x20

    .line 29
    .line 30
    goto :goto_20

    .line 31
    :cond_1e
    const/16 p1, 0x10

    .line 32
    .line 33
    :goto_20
    new-instance p2, Landroid/content/res/Configuration;

    .line 34
    .line 35
    invoke-direct {p2}, Landroid/content/res/Configuration;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 p5, 0x0

    .line 39
    iput p5, p2, Landroid/content/res/Configuration;->fontScale:F

    .line 40
    .line 41
    if-eqz p4, :cond_2d

    .line 42
    .line 43
    invoke-virtual {p2, p4}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    iget p4, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 p4, p4, -0x31

    .line 49
    .line 50
    or-int/2addr p1, p4

    .line 51
    iput p1, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 52
    .line 53
    if-eqz p3, :cond_39

    .line 54
    .line 55
    invoke-virtual {p0, p2, p3}, Lax/n/h;->V0(Landroid/content/res/Configuration;Lax/Y/h;)V

    .line 56
    .line 57
    .line 58
    :cond_39
    return-object p2
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method private g1(ILax/Y/h;ZLandroid/content/res/Configuration;)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroid/content/res/Configuration;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 14
    .line 15
    .line 16
    if-eqz p4, :cond_14

    .line 17
    .line 18
    invoke-virtual {v1, p4}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    .line 19
    .line 20
    .line 21
    :cond_14
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    iget p4, p4, Landroid/content/res/Configuration;->uiMode:I

    .line 26
    .line 27
    and-int/lit8 p4, p4, -0x31

    .line 28
    .line 29
    or-int/2addr p1, p4

    .line 30
    iput p1, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 31
    .line 32
    if-eqz p2, :cond_24

    .line 33
    .line 34
    invoke-virtual {p0, v1, p2}, Lax/n/h;->V0(Landroid/content/res/Configuration;Lax/Y/h;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    const/4 p1, 0x0

    .line 38
    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 39
    .line 40
    .line 41
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 p2, 0x1a

    .line 44
    .line 45
    if-ge p1, p2, :cond_31

    .line 46
    .line 47
    invoke-static {v0}, Lax/n/D;->a(Landroid/content/res/Resources;)V

    .line 48
    .line 49
    .line 50
    :cond_31
    iget p2, p0, Lax/n/h;->U:I

    .line 51
    .line 52
    if-eqz p2, :cond_4a

    .line 53
    .line 54
    iget-object p4, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {p4, p2}, Landroid/content/Context;->setTheme(I)V

    .line 57
    .line 58
    .line 59
    const/16 p2, 0x17

    .line 60
    .line 61
    if-lt p1, p2, :cond_4a

    .line 62
    .line 63
    iget-object p1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget p2, p0, Lax/n/h;->U:I

    .line 70
    .line 71
    const/4 p4, 0x1

    .line 72
    invoke-virtual {p1, p2, p4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 73
    .line 74
    .line 75
    :cond_4a
    if-eqz p3, :cond_55

    .line 76
    .line 77
    iget-object p1, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 78
    .line 79
    instance-of p1, p1, Landroid/app/Activity;

    .line 80
    .line 81
    if-eqz p1, :cond_55

    .line 82
    .line 83
    invoke-direct {p0, v1}, Lax/n/h;->d1(Landroid/content/res/Configuration;)V

    .line 84
    .line 85
    .line 86
    :cond_55
    return-void
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private h0()Landroid/view/ViewGroup;
    .registers 8

    .line 1
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lax/m/j;->y0:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lax/m/j;->D0:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_18e

    .line 16
    .line 17
    sget v2, Lax/m/j;->M0:I

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v4, 0x1

    .line 25
    if-eqz v2, :cond_1e

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Lax/n/h;->I(I)Z

    .line 28
    .line 29
    .line 30
    goto :goto_29

    .line 31
    :cond_1e
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_29

    .line 36
    .line 37
    const/16 v1, 0x6c

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lax/n/h;->I(I)Z

    .line 40
    .line 41
    .line 42
    :cond_29
    :goto_29
    sget v1, Lax/m/j;->E0:I

    .line 43
    .line 44
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/16 v2, 0x6d

    .line 49
    .line 50
    if-eqz v1, :cond_36

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Lax/n/h;->I(I)Z

    .line 53
    .line 54
    .line 55
    :cond_36
    sget v1, Lax/m/j;->F0:I

    .line 56
    .line 57
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_43

    .line 62
    .line 63
    const/16 v1, 0xa

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Lax/n/h;->I(I)Z

    .line 66
    .line 67
    .line 68
    :cond_43
    sget v1, Lax/m/j;->z0:I

    .line 69
    .line 70
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iput-boolean v1, p0, Lax/n/h;->J:Z

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0}, Lax/n/h;->o0()V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 88
    .line 89
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-boolean v1, p0, Lax/n/h;->K:Z

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    if-nez v1, :cond_d4

    .line 97
    .line 98
    iget-boolean v1, p0, Lax/n/h;->J:Z

    .line 99
    .line 100
    if-eqz v1, :cond_73

    .line 101
    .line 102
    sget v1, Lax/m/g;->f:I

    .line 103
    .line 104
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Landroid/view/ViewGroup;

    .line 109
    .line 110
    iput-boolean v3, p0, Lax/n/h;->H:Z

    .line 111
    .line 112
    iput-boolean v3, p0, Lax/n/h;->G:Z

    .line 113
    .line 114
    goto/16 :goto_e9

    .line 115
    .line 116
    :cond_73
    iget-boolean v0, p0, Lax/n/h;->G:Z

    .line 117
    .line 118
    if-eqz v0, :cond_d2

    .line 119
    .line 120
    new-instance v0, Landroid/util/TypedValue;

    .line 121
    .line 122
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 126
    .line 127
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    sget v6, Lax/m/a;->f:I

    .line 132
    .line 133
    invoke-virtual {v1, v6, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v1, :cond_95

    .line 139
    .line 140
    new-instance v1, Lax/s/c;

    .line 141
    .line 142
    iget-object v4, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 143
    .line 144
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 145
    .line 146
    invoke-direct {v1, v4, v0}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_97

    .line 150
    :cond_95
    iget-object v1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 151
    .line 152
    :goto_97
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget v1, Lax/m/g;->p:I

    .line 157
    .line 158
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Landroid/view/ViewGroup;

    .line 163
    .line 164
    sget v1, Lax/m/f;->p:I

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Lax/u/k;

    .line 171
    .line 172
    iput-object v1, p0, Lax/n/h;->r:Lax/u/k;

    .line 173
    .line 174
    invoke-virtual {p0}, Lax/n/h;->y0()Landroid/view/Window$Callback;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-interface {v1, v4}, Lax/u/k;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 179
    .line 180
    .line 181
    iget-boolean v1, p0, Lax/n/h;->H:Z

    .line 182
    .line 183
    if-eqz v1, :cond_bd

    .line 184
    .line 185
    iget-object v1, p0, Lax/n/h;->r:Lax/u/k;

    .line 186
    .line 187
    invoke-interface {v1, v2}, Lax/u/k;->m(I)V

    .line 188
    .line 189
    .line 190
    :cond_bd
    iget-boolean v1, p0, Lax/n/h;->E:Z

    .line 191
    .line 192
    if-eqz v1, :cond_c7

    .line 193
    .line 194
    iget-object v1, p0, Lax/n/h;->r:Lax/u/k;

    .line 195
    .line 196
    const/4 v2, 0x2

    .line 197
    invoke-interface {v1, v2}, Lax/u/k;->m(I)V

    .line 198
    .line 199
    .line 200
    :cond_c7
    iget-boolean v1, p0, Lax/n/h;->F:Z

    .line 201
    .line 202
    if-eqz v1, :cond_e9

    .line 203
    .line 204
    iget-object v1, p0, Lax/n/h;->r:Lax/u/k;

    .line 205
    .line 206
    const/4 v2, 0x5

    .line 207
    invoke-interface {v1, v2}, Lax/u/k;->m(I)V

    .line 208
    .line 209
    .line 210
    goto :goto_e9

    .line 211
    :cond_d2
    move-object v0, v5

    .line 212
    goto :goto_e9

    .line 213
    :cond_d4
    iget-boolean v1, p0, Lax/n/h;->I:Z

    .line 214
    .line 215
    if-eqz v1, :cond_e1

    .line 216
    .line 217
    sget v1, Lax/m/g;->o:I

    .line 218
    .line 219
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Landroid/view/ViewGroup;

    .line 224
    .line 225
    goto :goto_e9

    .line 226
    :cond_e1
    sget v1, Lax/m/g;->n:I

    .line 227
    .line 228
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Landroid/view/ViewGroup;

    .line 233
    .line 234
    :cond_e9
    :goto_e9
    if-eqz v0, :cond_148

    .line 235
    .line 236
    new-instance v1, Lax/n/h$b;

    .line 237
    .line 238
    invoke-direct {v1, p0}, Lax/n/h$b;-><init>(Lax/n/h;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v0, v1}, Lax/c0/d0;->v0(Landroid/view/View;Lax/c0/I;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, p0, Lax/n/h;->r:Lax/u/k;

    .line 245
    .line 246
    if-nez v1, :cond_101

    .line 247
    .line 248
    sget v1, Lax/m/f;->D:I

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    check-cast v1, Landroid/widget/TextView;

    .line 255
    .line 256
    iput-object v1, p0, Lax/n/h;->C:Landroid/widget/TextView;

    .line 257
    .line 258
    :cond_101
    invoke-static {v0}, Landroidx/appcompat/widget/O;->c(Landroid/view/View;)V

    .line 259
    .line 260
    .line 261
    sget v1, Lax/m/f;->b:I

    .line 262
    .line 263
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 268
    .line 269
    iget-object v2, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 270
    .line 271
    const v4, 0x1020002

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    check-cast v2, Landroid/view/ViewGroup;

    .line 279
    .line 280
    if-eqz v2, :cond_13a

    .line 281
    .line 282
    :goto_119
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-lez v6, :cond_12a

    .line 287
    .line 288
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 296
    .line 297
    .line 298
    goto :goto_119

    .line 299
    :cond_12a
    const/4 v3, -0x1

    .line 300
    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v4}, Landroid/view/View;->setId(I)V

    .line 304
    .line 305
    .line 306
    instance-of v3, v2, Landroid/widget/FrameLayout;

    .line 307
    .line 308
    if-eqz v3, :cond_13a

    .line 309
    .line 310
    check-cast v2, Landroid/widget/FrameLayout;

    .line 311
    .line 312
    invoke-virtual {v2, v5}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 313
    .line 314
    .line 315
    :cond_13a
    iget-object v2, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 316
    .line 317
    invoke-virtual {v2, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 318
    .line 319
    .line 320
    new-instance v2, Lax/n/h$c;

    .line 321
    .line 322
    invoke-direct {v2, p0}, Lax/n/h$c;-><init>(Lax/n/h;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    .line 326
    .line 327
    .line 328
    return-object v0

    .line 329
    :cond_148
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 330
    .line 331
    new-instance v1, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    .line 337
    .line 338
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    iget-boolean v2, p0, Lax/n/h;->G:Z

    .line 342
    .line 343
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v2, ", windowActionBarOverlay: "

    .line 347
    .line 348
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    iget-boolean v2, p0, Lax/n/h;->H:Z

    .line 352
    .line 353
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string v2, ", android:windowIsFloating: "

    .line 357
    .line 358
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    iget-boolean v2, p0, Lax/n/h;->J:Z

    .line 362
    .line 363
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    const-string v2, ", windowActionModeOverlay: "

    .line 367
    .line 368
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    iget-boolean v2, p0, Lax/n/h;->I:Z

    .line 372
    .line 373
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v2, ", windowNoTitle: "

    .line 377
    .line 378
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    iget-boolean v2, p0, Lax/n/h;->K:Z

    .line 382
    .line 383
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v2, " }"

    .line 387
    .line 388
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :cond_18e
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 400
    .line 401
    .line 402
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 403
    .line 404
    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    .line 405
    .line 406
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw v0
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private i1(Landroid/view/View;)V
    .registers 4

    .line 1
    invoke-static {p1}, Lax/c0/d0;->L(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0x2000

    .line 6
    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 10
    .line 11
    sget v1, Lax/m/c;->b:I

    .line 12
    .line 13
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_19

    .line 18
    :cond_11
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 19
    .line 20
    sget v1, Lax/m/c;->a:I

    .line 21
    .line 22
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_19
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private n0()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/n/h;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_50

    .line 4
    .line 5
    invoke-direct {p0}, Lax/n/h;->h0()Landroid/view/ViewGroup;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/n/h;->x0()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_31

    .line 20
    .line 21
    iget-object v1, p0, Lax/n/h;->r:Lax/u/k;

    .line 22
    .line 23
    if-eqz v1, :cond_1c

    .line 24
    .line 25
    invoke-interface {v1, v0}, Lax/u/k;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    goto :goto_31

    .line 29
    :cond_1c
    invoke-virtual {p0}, Lax/n/h;->Q0()Lax/n/a;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_2a

    .line 34
    .line 35
    invoke-virtual {p0}, Lax/n/h;->Q0()Lax/n/a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v0}, Lax/n/a;->I(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    goto :goto_31

    .line 43
    :cond_2a
    iget-object v1, p0, Lax/n/h;->C:Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v1, :cond_31

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    :cond_31
    :goto_31
    invoke-direct {p0}, Lax/n/h;->X()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lax/n/h;->O0(Landroid/view/ViewGroup;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Lax/n/h;->A:Z

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0, v0, v0}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-boolean v1, p0, Lax/n/h;->R:Z

    .line 67
    .line 68
    if-nez v1, :cond_50

    .line 69
    .line 70
    if-eqz v0, :cond_4b

    .line 71
    .line 72
    iget-object v0, v0, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 73
    .line 74
    if-nez v0, :cond_50

    .line 75
    .line 76
    :cond_4b
    const/16 v0, 0x6c

    .line 77
    .line 78
    invoke-direct {p0, v0}, Lax/n/h;->D0(I)V

    .line 79
    .line 80
    .line 81
    :cond_50
    return-void
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private o0()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v1, :cond_13

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Lax/n/h;->Y(Landroid/view/Window;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz v0, :cond_18

    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "We have not been given a Window"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private static q0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;
    .registers 7

    .line 1
    new-instance v0, Landroid/content/res/Configuration;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 8
    .line 9
    if-eqz p1, :cond_101

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_12

    .line 16
    .line 17
    goto/16 :goto_101

    .line 18
    .line 19
    :cond_12
    iget v1, p0, Landroid/content/res/Configuration;->fontScale:F

    .line 20
    .line 21
    iget v2, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 22
    .line 23
    cmpl-float v1, v1, v2

    .line 24
    .line 25
    if-eqz v1, :cond_1c

    .line 26
    .line 27
    iput v2, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 28
    .line 29
    :cond_1c
    iget v1, p0, Landroid/content/res/Configuration;->mcc:I

    .line 30
    .line 31
    iget v2, p1, Landroid/content/res/Configuration;->mcc:I

    .line 32
    .line 33
    if-eq v1, v2, :cond_24

    .line 34
    .line 35
    iput v2, v0, Landroid/content/res/Configuration;->mcc:I

    .line 36
    .line 37
    :cond_24
    iget v1, p0, Landroid/content/res/Configuration;->mnc:I

    .line 38
    .line 39
    iget v2, p1, Landroid/content/res/Configuration;->mnc:I

    .line 40
    .line 41
    if-eq v1, v2, :cond_2c

    .line 42
    .line 43
    iput v2, v0, Landroid/content/res/Configuration;->mnc:I

    .line 44
    .line 45
    :cond_2c
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v2, 0x18

    .line 48
    .line 49
    if-lt v1, v2, :cond_36

    .line 50
    .line 51
    invoke-static {p0, p1, v0}, Lax/n/h$k;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 52
    .line 53
    .line 54
    goto :goto_44

    .line 55
    :cond_36
    iget-object v2, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 56
    .line 57
    iget-object v3, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 58
    .line 59
    invoke-static {v2, v3}, Lax/b0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_44

    .line 64
    .line 65
    iget-object v2, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 66
    .line 67
    iput-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 68
    .line 69
    :cond_44
    :goto_44
    iget v2, p0, Landroid/content/res/Configuration;->touchscreen:I

    .line 70
    .line 71
    iget v3, p1, Landroid/content/res/Configuration;->touchscreen:I

    .line 72
    .line 73
    if-eq v2, v3, :cond_4c

    .line 74
    .line 75
    iput v3, v0, Landroid/content/res/Configuration;->touchscreen:I

    .line 76
    .line 77
    :cond_4c
    iget v2, p0, Landroid/content/res/Configuration;->keyboard:I

    .line 78
    .line 79
    iget v3, p1, Landroid/content/res/Configuration;->keyboard:I

    .line 80
    .line 81
    if-eq v2, v3, :cond_54

    .line 82
    .line 83
    iput v3, v0, Landroid/content/res/Configuration;->keyboard:I

    .line 84
    .line 85
    :cond_54
    iget v2, p0, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 86
    .line 87
    iget v3, p1, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 88
    .line 89
    if-eq v2, v3, :cond_5c

    .line 90
    .line 91
    iput v3, v0, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 92
    .line 93
    :cond_5c
    iget v2, p0, Landroid/content/res/Configuration;->navigation:I

    .line 94
    .line 95
    iget v3, p1, Landroid/content/res/Configuration;->navigation:I

    .line 96
    .line 97
    if-eq v2, v3, :cond_64

    .line 98
    .line 99
    iput v3, v0, Landroid/content/res/Configuration;->navigation:I

    .line 100
    .line 101
    :cond_64
    iget v2, p0, Landroid/content/res/Configuration;->navigationHidden:I

    .line 102
    .line 103
    iget v3, p1, Landroid/content/res/Configuration;->navigationHidden:I

    .line 104
    .line 105
    if-eq v2, v3, :cond_6c

    .line 106
    .line 107
    iput v3, v0, Landroid/content/res/Configuration;->navigationHidden:I

    .line 108
    .line 109
    :cond_6c
    iget v2, p0, Landroid/content/res/Configuration;->orientation:I

    .line 110
    .line 111
    iget v3, p1, Landroid/content/res/Configuration;->orientation:I

    .line 112
    .line 113
    if-eq v2, v3, :cond_74

    .line 114
    .line 115
    iput v3, v0, Landroid/content/res/Configuration;->orientation:I

    .line 116
    .line 117
    :cond_74
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 118
    .line 119
    and-int/lit8 v2, v2, 0xf

    .line 120
    .line 121
    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    .line 122
    .line 123
    and-int/lit8 v4, v3, 0xf

    .line 124
    .line 125
    if-eq v2, v4, :cond_85

    .line 126
    .line 127
    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 128
    .line 129
    and-int/lit8 v3, v3, 0xf

    .line 130
    .line 131
    or-int/2addr v2, v3

    .line 132
    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 133
    .line 134
    :cond_85
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 135
    .line 136
    and-int/lit16 v2, v2, 0xc0

    .line 137
    .line 138
    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    .line 139
    .line 140
    and-int/lit16 v4, v3, 0xc0

    .line 141
    .line 142
    if-eq v2, v4, :cond_96

    .line 143
    .line 144
    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 145
    .line 146
    and-int/lit16 v3, v3, 0xc0

    .line 147
    .line 148
    or-int/2addr v2, v3

    .line 149
    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 150
    .line 151
    :cond_96
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 152
    .line 153
    and-int/lit8 v2, v2, 0x30

    .line 154
    .line 155
    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    .line 156
    .line 157
    and-int/lit8 v4, v3, 0x30

    .line 158
    .line 159
    if-eq v2, v4, :cond_a7

    .line 160
    .line 161
    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 162
    .line 163
    and-int/lit8 v3, v3, 0x30

    .line 164
    .line 165
    or-int/2addr v2, v3

    .line 166
    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 167
    .line 168
    :cond_a7
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 169
    .line 170
    and-int/lit16 v2, v2, 0x300

    .line 171
    .line 172
    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    .line 173
    .line 174
    and-int/lit16 v4, v3, 0x300

    .line 175
    .line 176
    if-eq v2, v4, :cond_b8

    .line 177
    .line 178
    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 179
    .line 180
    and-int/lit16 v3, v3, 0x300

    .line 181
    .line 182
    or-int/2addr v2, v3

    .line 183
    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 184
    .line 185
    :cond_b8
    const/16 v2, 0x1a

    .line 186
    .line 187
    if-lt v1, v2, :cond_bf

    .line 188
    .line 189
    invoke-static {p0, p1, v0}, Lax/n/h$l;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 190
    .line 191
    .line 192
    :cond_bf
    iget v1, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 193
    .line 194
    and-int/lit8 v1, v1, 0xf

    .line 195
    .line 196
    iget v2, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 197
    .line 198
    and-int/lit8 v3, v2, 0xf

    .line 199
    .line 200
    if-eq v1, v3, :cond_d0

    .line 201
    .line 202
    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 203
    .line 204
    and-int/lit8 v2, v2, 0xf

    .line 205
    .line 206
    or-int/2addr v1, v2

    .line 207
    iput v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 208
    .line 209
    :cond_d0
    iget v1, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 210
    .line 211
    and-int/lit8 v1, v1, 0x30

    .line 212
    .line 213
    iget v2, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 214
    .line 215
    and-int/lit8 v3, v2, 0x30

    .line 216
    .line 217
    if-eq v1, v3, :cond_e1

    .line 218
    .line 219
    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 220
    .line 221
    and-int/lit8 v2, v2, 0x30

    .line 222
    .line 223
    or-int/2addr v1, v2

    .line 224
    iput v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 225
    .line 226
    :cond_e1
    iget v1, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 227
    .line 228
    iget v2, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 229
    .line 230
    if-eq v1, v2, :cond_e9

    .line 231
    .line 232
    iput v2, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 233
    .line 234
    :cond_e9
    iget v1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 235
    .line 236
    iget v2, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 237
    .line 238
    if-eq v1, v2, :cond_f1

    .line 239
    .line 240
    iput v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 241
    .line 242
    :cond_f1
    iget v1, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 243
    .line 244
    iget v2, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 245
    .line 246
    if-eq v1, v2, :cond_f9

    .line 247
    .line 248
    iput v2, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 249
    .line 250
    :cond_f9
    iget p0, p0, Landroid/content/res/Configuration;->densityDpi:I

    .line 251
    .line 252
    iget p1, p1, Landroid/content/res/Configuration;->densityDpi:I

    .line 253
    .line 254
    if-eq p0, p1, :cond_101

    .line 255
    .line 256
    iput p1, v0, Landroid/content/res/Configuration;->densityDpi:I

    .line 257
    .line 258
    :cond_101
    :goto_101
    return-object v0
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private s0(Landroid/content/Context;)I
    .registers 7

    .line 1
    iget-boolean v0, p0, Lax/n/h;->W:Z

    .line 2
    .line 3
    if-nez v0, :cond_43

    .line 4
    .line 5
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v0, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v0, :cond_43

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    :try_start_12
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v3, 0x1d

    .line 22
    .line 23
    if-lt v2, v3, :cond_1b

    .line 24
    .line 25
    const/high16 v2, 0x100c0000

    .line 26
    .line 27
    goto :goto_23

    .line 28
    :cond_1b
    const/16 v3, 0x18

    .line 29
    .line 30
    if-lt v2, v3, :cond_22

    .line 31
    .line 32
    const/high16 v2, 0xc0000

    .line 33
    .line 34
    goto :goto_23

    .line 35
    :cond_22
    const/4 v2, 0x0

    .line 36
    :goto_23
    new-instance v3, Landroid/content/ComponentName;

    .line 37
    .line 38
    iget-object v4, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_43

    .line 52
    .line 53
    iget p1, p1, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 54
    .line 55
    iput p1, p0, Lax/n/h;->V:I
    :try_end_38
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_12 .. :try_end_38} :catch_39

    .line 56
    .line 57
    goto :goto_43

    .line 58
    :catch_39
    move-exception p1

    .line 59
    const-string v0, "AppCompatDelegate"

    .line 60
    .line 61
    const-string v2, "Exception while getting ActivityInfo"

    .line 62
    .line 63
    invoke-static {v0, v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 64
    .line 65
    .line 66
    iput v1, p0, Lax/n/h;->V:I

    .line 67
    .line 68
    :cond_43
    :goto_43
    const/4 p1, 0x1

    .line 69
    iput-boolean p1, p0, Lax/n/h;->W:Z

    .line 70
    .line 71
    iget p1, p0, Lax/n/h;->V:I

    .line 72
    .line 73
    return p1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private t0(Landroid/content/Context;)Lax/n/h$p;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/h;->Y:Lax/n/h$p;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/n/h$o;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lax/n/h$o;-><init>(Lax/n/h;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/n/h;->Y:Lax/n/h$p;

    .line 11
    .line 12
    :cond_b
    iget-object p1, p0, Lax/n/h;->Y:Lax/n/h$p;

    .line 13
    .line 14
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private u0(Landroid/content/Context;)Lax/n/h$p;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/h;->X:Lax/n/h$p;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    new-instance v0, Lax/n/h$q;

    .line 6
    .line 7
    invoke-static {p1}, Lax/n/G;->a(Landroid/content/Context;)Lax/n/G;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p0, p1}, Lax/n/h$q;-><init>(Lax/n/h;Lax/n/G;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lax/n/h;->X:Lax/n/h$p;

    .line 15
    .line 16
    :cond_f
    iget-object p1, p0, Lax/n/h;->X:Lax/n/h$p;

    .line 17
    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private z0()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/n/h;->n0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lax/n/h;->G:Z

    .line 5
    .line 6
    if-eqz v0, :cond_38

    .line 7
    .line 8
    iget-object v0, p0, Lax/n/h;->o:Lax/n/a;

    .line 9
    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    goto :goto_38

    .line 13
    :cond_c
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v1, :cond_20

    .line 18
    .line 19
    new-instance v0, Lax/n/H;

    .line 20
    .line 21
    iget-object v1, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroid/app/Activity;

    .line 24
    .line 25
    iget-boolean v2, p0, Lax/n/h;->H:Z

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Lax/n/H;-><init>(Landroid/app/Activity;Z)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lax/n/h;->o:Lax/n/a;

    .line 31
    .line 32
    goto :goto_2f

    .line 33
    :cond_20
    instance-of v0, v0, Landroid/app/Dialog;

    .line 34
    .line 35
    if-eqz v0, :cond_2f

    .line 36
    .line 37
    new-instance v0, Lax/n/H;

    .line 38
    .line 39
    iget-object v1, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Landroid/app/Dialog;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lax/n/H;-><init>(Landroid/app/Dialog;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/n/h;->o:Lax/n/a;

    .line 47
    .line 48
    :cond_2f
    :goto_2f
    iget-object v0, p0, Lax/n/h;->o:Lax/n/a;

    .line 49
    .line 50
    if-eqz v0, :cond_38

    .line 51
    .line 52
    iget-boolean v1, p0, Lax/n/h;->c0:Z

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lax/n/a;->w(Z)V

    .line 55
    .line 56
    .line 57
    :cond_38
    :goto_38
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public A()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-static {p0}, Lax/n/f;->G(Lax/n/f;)V

    .line 8
    .line 9
    .line 10
    :cond_9
    iget-boolean v0, p0, Lax/n/h;->Z:Z

    .line 11
    .line 12
    if-eqz v0, :cond_18

    .line 13
    .line 14
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lax/n/h;->b0:Ljava/lang/Runnable;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_18
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lax/n/h;->R:Z

    .line 27
    .line 28
    iget v0, p0, Lax/n/h;->T:I

    .line 29
    .line 30
    const/16 v1, -0x64

    .line 31
    .line 32
    if-eq v0, v1, :cond_45

    .line 33
    .line 34
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 35
    .line 36
    instance-of v1, v0, Landroid/app/Activity;

    .line 37
    .line 38
    if-eqz v1, :cond_45

    .line 39
    .line 40
    check-cast v0, Landroid/app/Activity;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_45

    .line 47
    .line 48
    sget-object v0, Lax/n/h;->j0:Lax/B/k;

    .line 49
    .line 50
    iget-object v1, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget v2, p0, Lax/n/h;->T:I

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v1, v2}, Lax/B/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_54

    .line 70
    :cond_45
    sget-object v0, Lax/n/h;->j0:Lax/B/k;

    .line 71
    .line 72
    iget-object v1, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Lax/B/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :goto_54
    iget-object v0, p0, Lax/n/h;->o:Lax/n/a;

    .line 86
    .line 87
    if-eqz v0, :cond_5b

    .line 88
    .line 89
    invoke-virtual {v0}, Lax/n/a;->r()V

    .line 90
    .line 91
    .line 92
    :cond_5b
    invoke-direct {p0}, Lax/n/h;->d0()V

    .line 93
    .line 94
    .line 95
    return-void
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public B(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/n/h;->n0()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public C()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Lax/n/a;->E(Z)V

    .line 9
    .line 10
    .line 11
    :cond_a
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public D(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public E()V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lax/n/h;->W(ZZ)Z

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public E0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/n/h;->z:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public F()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lax/n/a;->E(Z)V

    .line 9
    .line 10
    .line 11
    :cond_a
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method F0(Landroid/content/Context;I)I
    .registers 5

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq p2, v0, :cond_46

    .line 5
    .line 6
    if-eq p2, v1, :cond_45

    .line 7
    .line 8
    if-eqz p2, :cond_23

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p2, v0, :cond_45

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq p2, v0, :cond_45

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p2, v0, :cond_1b

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lax/n/h;->t0(Landroid/content/Context;)Lax/n/h$p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lax/n/h$p;->c()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_23
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v0, 0x17

    .line 39
    .line 40
    if-lt p2, v0, :cond_3c

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const-string v0, "uimode"

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Landroid/app/UiModeManager;

    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_3c

    .line 59
    .line 60
    return v1

    .line 61
    :cond_3c
    invoke-direct {p0, p1}, Lax/n/h;->u0(Landroid/content/Context;)Lax/n/h$p;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lax/n/h$p;->c()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_45
    return p2

    .line 71
    :cond_46
    return v1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method G0()Z
    .registers 6

    .line 1
    iget-boolean v0, p0, Lax/n/h;->O:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lax/n/h;->O:Z

    .line 5
    .line 6
    invoke-virtual {p0, v1, v1}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v2, :cond_16

    .line 12
    .line 13
    iget-boolean v4, v2, Lax/n/h$s;->o:Z

    .line 14
    .line 15
    if-eqz v4, :cond_16

    .line 16
    .line 17
    if-nez v0, :cond_15

    .line 18
    .line 19
    invoke-virtual {p0, v2, v3}, Lax/n/h;->f0(Lax/n/h$s;Z)V

    .line 20
    .line 21
    .line 22
    :cond_15
    return v3

    .line 23
    :cond_16
    iget-object v0, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 24
    .line 25
    if-eqz v0, :cond_1e

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/appcompat/view/a;->c()V

    .line 28
    .line 29
    .line 30
    return v3

    .line 31
    :cond_1e
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2b

    .line 36
    .line 37
    invoke-virtual {v0}, Lax/n/a;->i()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2b

    .line 42
    .line 43
    return v3

    .line 44
    :cond_2b
    return v1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method H0(ILandroid/view/KeyEvent;)Z
    .registers 6

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq p1, v0, :cond_e

    .line 5
    .line 6
    const/16 v0, 0x52

    .line 7
    .line 8
    if-eq p1, v0, :cond_a

    .line 9
    .line 10
    goto :goto_1a

    .line 11
    :cond_a
    invoke-direct {p0, v2, p2}, Lax/n/h;->I0(ILandroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    return v1

    .line 15
    :cond_e
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getFlags()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    and-int/lit16 p1, p1, 0x80

    .line 20
    .line 21
    if-eqz p1, :cond_17

    .line 22
    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 v1, 0x0

    .line 25
    :goto_18
    iput-boolean v1, p0, Lax/n/h;->O:Z

    .line 26
    .line 27
    :goto_1a
    return v2
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public I(I)Z
    .registers 6

    .line 1
    invoke-direct {p0, p1}, Lax/n/h;->U0(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-boolean v0, p0, Lax/n/h;->K:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x6c

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    if-ne p1, v2, :cond_e

    .line 13
    .line 14
    return v1

    .line 15
    :cond_e
    iget-boolean v0, p0, Lax/n/h;->G:Z

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    if-eqz v0, :cond_17

    .line 19
    .line 20
    if-ne p1, v3, :cond_17

    .line 21
    .line 22
    iput-boolean v1, p0, Lax/n/h;->G:Z

    .line 23
    .line 24
    :cond_17
    if-eq p1, v3, :cond_4e

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    if-eq p1, v0, :cond_48

    .line 28
    .line 29
    const/4 v0, 0x5

    .line 30
    if-eq p1, v0, :cond_42

    .line 31
    .line 32
    const/16 v0, 0xa

    .line 33
    .line 34
    if-eq p1, v0, :cond_3c

    .line 35
    .line 36
    if-eq p1, v2, :cond_36

    .line 37
    .line 38
    const/16 v0, 0x6d

    .line 39
    .line 40
    if-eq p1, v0, :cond_30

    .line 41
    .line 42
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_30
    invoke-direct {p0}, Lax/n/h;->b1()V

    .line 50
    .line 51
    .line 52
    iput-boolean v3, p0, Lax/n/h;->H:Z

    .line 53
    .line 54
    return v3

    .line 55
    :cond_36
    invoke-direct {p0}, Lax/n/h;->b1()V

    .line 56
    .line 57
    .line 58
    iput-boolean v3, p0, Lax/n/h;->G:Z

    .line 59
    .line 60
    return v3

    .line 61
    :cond_3c
    invoke-direct {p0}, Lax/n/h;->b1()V

    .line 62
    .line 63
    .line 64
    iput-boolean v3, p0, Lax/n/h;->I:Z

    .line 65
    .line 66
    return v3

    .line 67
    :cond_42
    invoke-direct {p0}, Lax/n/h;->b1()V

    .line 68
    .line 69
    .line 70
    iput-boolean v3, p0, Lax/n/h;->F:Z

    .line 71
    .line 72
    return v3

    .line 73
    :cond_48
    invoke-direct {p0}, Lax/n/h;->b1()V

    .line 74
    .line 75
    .line 76
    iput-boolean v3, p0, Lax/n/h;->E:Z

    .line 77
    .line 78
    return v3

    .line 79
    :cond_4e
    invoke-direct {p0}, Lax/n/h;->b1()V

    .line 80
    .line 81
    .line 82
    iput-boolean v3, p0, Lax/n/h;->K:Z

    .line 83
    .line 84
    return v3
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method J0(ILandroid/view/KeyEvent;)Z
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_e

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lax/n/a;->s(ILandroid/view/KeyEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_e

    .line 13
    .line 14
    return v1

    .line 15
    :cond_e
    iget-object p1, p0, Lax/n/h;->N:Lax/n/h$s;

    .line 16
    .line 17
    if-eqz p1, :cond_23

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {p0, p1, v0, p2, v1}, Lax/n/h;->R0(Lax/n/h$s;ILandroid/view/KeyEvent;I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_23

    .line 28
    .line 29
    iget-object p1, p0, Lax/n/h;->N:Lax/n/h$s;

    .line 30
    .line 31
    if-eqz p1, :cond_22

    .line 32
    .line 33
    iput-boolean v1, p1, Lax/n/h$s;->n:Z

    .line 34
    .line 35
    :cond_22
    return v1

    .line 36
    :cond_23
    iget-object p1, p0, Lax/n/h;->N:Lax/n/h$s;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    if-nez p1, :cond_3c

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1, p2}, Lax/n/h;->S0(Lax/n/h$s;Landroid/view/KeyEvent;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-direct {p0, p1, v2, p2, v1}, Lax/n/h;->R0(Lax/n/h$s;ILandroid/view/KeyEvent;I)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iput-boolean v0, p1, Lax/n/h$s;->m:Z

    .line 57
    .line 58
    if-eqz p2, :cond_3c

    .line 59
    .line 60
    return v1

    .line 61
    :cond_3c
    return v0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method public K(I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/n/h;->n0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 28
    .line 29
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Lax/n/h$n;->c(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method K0(ILandroid/view/KeyEvent;)Z
    .registers 6

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq p1, v0, :cond_e

    .line 5
    .line 6
    const/16 v0, 0x52

    .line 7
    .line 8
    if-eq p1, v0, :cond_a

    .line 9
    .line 10
    goto :goto_15

    .line 11
    :cond_a
    invoke-direct {p0, v2, p2}, Lax/n/h;->L0(ILandroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    return v1

    .line 15
    :cond_e
    invoke-virtual {p0}, Lax/n/h;->G0()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    :goto_15
    return v2
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public L(Landroid/view/View;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/n/h;->n0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 22
    .line 23
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lax/n/h$n;->c(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public M(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/n/h;->n0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 22
    .line 23
    iget-object p2, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1, p2}, Lax/n/h$n;->c(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method M0(I)V
    .registers 3

    .line 1
    const/16 v0, 0x6c

    .line 2
    .line 3
    if-ne p1, v0, :cond_e

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_e

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p1, v0}, Lax/n/a;->j(Z)V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method N0(I)V
    .registers 4

    .line 1
    const/16 v0, 0x6c

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_f

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_1d

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lax/n/a;->j(Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    if-nez p1, :cond_1d

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-boolean v0, p1, Lax/n/h$s;->o:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1d

    .line 26
    .line 27
    invoke-virtual {p0, p1, v1}, Lax/n/h;->f0(Lax/n/h$s;Z)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public O(Landroid/window/OnBackInvokedDispatcher;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Lax/n/f;->O(Landroid/window/OnBackInvokedDispatcher;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/n/h;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 5
    .line 6
    if-eqz v0, :cond_11

    .line 7
    .line 8
    iget-object v1, p0, Lax/n/h;->i0:Landroid/window/OnBackInvokedCallback;

    .line 9
    .line 10
    if-eqz v1, :cond_11

    .line 11
    .line 12
    invoke-static {v0, v1}, Lax/n/h$m;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lax/n/h;->i0:Landroid/window/OnBackInvokedCallback;

    .line 17
    .line 18
    :cond_11
    if-nez p1, :cond_2c

    .line 19
    .line 20
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 21
    .line 22
    instance-of v1, v0, Landroid/app/Activity;

    .line 23
    .line 24
    if-eqz v1, :cond_2c

    .line 25
    .line 26
    check-cast v0, Landroid/app/Activity;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2c

    .line 33
    .line 34
    iget-object p1, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Landroid/app/Activity;

    .line 37
    .line 38
    invoke-static {p1}, Lax/n/h$m;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lax/n/h;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 43
    .line 44
    goto :goto_2e

    .line 45
    :cond_2c
    iput-object p1, p0, Lax/n/h;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 46
    .line 47
    :goto_2e
    invoke-virtual {p0}, Lax/n/h;->f1()V

    .line 48
    .line 49
    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method O0(Landroid/view/ViewGroup;)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public P(Landroidx/appcompat/widget/Toolbar;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, Lax/n/H;

    .line 13
    .line 14
    if-nez v1, :cond_3d

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lax/n/h;->p:Landroid/view/MenuInflater;

    .line 18
    .line 19
    if-eqz v0, :cond_17

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/n/a;->r()V

    .line 22
    .line 23
    .line 24
    :cond_17
    iput-object v1, p0, Lax/n/h;->o:Lax/n/a;

    .line 25
    .line 26
    if-eqz p1, :cond_34

    .line 27
    .line 28
    new-instance v0, Lax/n/E;

    .line 29
    .line 30
    invoke-virtual {p0}, Lax/n/h;->x0()Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 35
    .line 36
    invoke-direct {v0, p1, v1, v2}, Lax/n/E;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lax/n/h;->o:Lax/n/a;

    .line 40
    .line 41
    iget-object v1, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 42
    .line 43
    iget-object v0, v0, Lax/n/E;->c:Lax/n/h$g;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lax/n/h$n;->e(Lax/n/h$g;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_39

    .line 53
    :cond_34
    iget-object p1, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Lax/n/h$n;->e(Lax/n/h$g;)V

    .line 56
    .line 57
    .line 58
    :goto_39
    invoke-virtual {p0}, Lax/n/h;->w()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public Q(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/n/h;->U:I

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method final Q0()Lax/n/a;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/n/h;->o:Lax/n/a;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final R(Ljava/lang/CharSequence;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/n/h;->q:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v0, p0, Lax/n/h;->r:Lax/u/k;

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lax/u/k;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-virtual {p0}, Lax/n/h;->Q0()Lax/n/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_18

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/n/h;->Q0()Lax/n/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lax/n/a;->I(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object v0, p0, Lax/n/h;->C:Landroid/widget/TextView;

    .line 26
    .line 27
    if-eqz v0, :cond_1f

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public S(Landroidx/appcompat/view/a$a;)Landroidx/appcompat/view/a;
    .registers 4

    .line 1
    if-eqz p1, :cond_33

    .line 2
    .line 3
    iget-object v0, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/view/a;->c()V

    .line 8
    .line 9
    .line 10
    :cond_9
    new-instance v0, Lax/n/h$i;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lax/n/h$i;-><init>(Lax/n/h;Landroidx/appcompat/view/a$a;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_23

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lax/n/a;->K(Landroidx/appcompat/view/a$a;)Landroidx/appcompat/view/a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 26
    .line 27
    if-eqz p1, :cond_23

    .line 28
    .line 29
    iget-object v1, p0, Lax/n/h;->n:Lax/n/d;

    .line 30
    .line 31
    if-eqz v1, :cond_23

    .line 32
    .line 33
    invoke-interface {v1, p1}, Lax/n/d;->onSupportActionModeStarted(Landroidx/appcompat/view/a;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    iget-object p1, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 37
    .line 38
    if-nez p1, :cond_2d

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lax/n/h;->a1(Landroidx/appcompat/view/a$a;)Landroidx/appcompat/view/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 45
    .line 46
    :cond_2d
    invoke-virtual {p0}, Lax/n/h;->f1()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_33
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string v0, "ActionMode callback can not be null."

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
    .line 60
    .line 61
.end method

.method V0(Landroid/content/res/Configuration;Lax/Y/h;)V
    .registers 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_a

    .line 6
    .line 7
    invoke-static {p1, p2}, Lax/n/h$k;->d(Landroid/content/res/Configuration;Lax/Y/h;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p2, v0}, Lax/Y/h;->d(I)Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1, v1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, Lax/Y/h;->d(I)Ljava/util/Locale;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method W0(Lax/Y/h;)V
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_a

    .line 6
    .line 7
    invoke-static {p1}, Lax/n/h$k;->c(Lax/Y/h;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Lax/Y/h;->d(I)Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method final X0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/n/h;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v0, :cond_10

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_10

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method Z(Landroid/content/Context;)Lax/Y/h;
    .registers 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_8

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_8
    invoke-static {}, Lax/n/f;->t()Lax/Y/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_f

    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_f
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Lax/n/h;->v0(Landroid/content/res/Configuration;)Lax/Y/h;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/16 v2, 0x18

    .line 33
    .line 34
    if-lt v0, v2, :cond_28

    .line 35
    .line 36
    invoke-static {v1, p1}, Lax/n/C;->b(Lax/Y/h;Lax/Y/h;)Lax/Y/h;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_40

    .line 41
    :cond_28
    invoke-virtual {v1}, Lax/Y/h;->f()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_33

    .line 46
    .line 47
    invoke-static {}, Lax/Y/h;->e()Lax/Y/h;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_40

    .line 52
    :cond_33
    const/4 v0, 0x0

    .line 53
    invoke-virtual {v1, v0}, Lax/Y/h;->d(I)Ljava/util/Locale;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lax/n/h$j;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lax/Y/h;->c(Ljava/lang/String;)Lax/Y/h;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_40
    invoke-virtual {v0}, Lax/Y/h;->f()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_47

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_47
    return-object v0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method Z0()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/n/h;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-virtual {p0, v1, v1}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_12

    .line 13
    .line 14
    iget-boolean v0, v0, Lax/n/h$s;->o:Z

    .line 15
    .line 16
    if-eqz v0, :cond_12

    .line 17
    .line 18
    return v2

    .line 19
    :cond_12
    iget-object v0, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 20
    .line 21
    if-eqz v0, :cond_17

    .line 22
    .line 23
    return v2

    .line 24
    :cond_17
    return v1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/n/h;->y0()Landroid/view/Window$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1b

    .line 6
    .line 7
    iget-boolean v1, p0, Lax/n/h;->R:Z

    .line 8
    .line 9
    if-nez v1, :cond_1b

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->D()Landroidx/appcompat/view/menu/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lax/n/h;->p0(Landroid/view/Menu;)Lax/n/h$s;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1b

    .line 20
    .line 21
    iget p1, p1, Lax/n/h$s;->a:I

    .line 22
    .line 23
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1b
    const/4 p1, 0x0

    .line 29
    return p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method a1(Landroidx/appcompat/view/a$a;)Landroidx/appcompat/view/a;
    .registers 9

    .line 1
    invoke-virtual {p0}, Lax/n/h;->m0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/view/a;->c()V

    .line 9
    .line 10
    .line 11
    :cond_a
    instance-of v0, p1, Lax/n/h$i;

    .line 12
    .line 13
    if-nez v0, :cond_14

    .line 14
    .line 15
    new-instance v0, Lax/n/h$i;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lax/n/h$i;-><init>(Lax/n/h;Landroidx/appcompat/view/a$a;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :cond_14
    iget-object v0, p0, Lax/n/h;->n:Lax/n/d;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_23

    .line 25
    .line 26
    iget-boolean v2, p0, Lax/n/h;->R:Z

    .line 27
    .line 28
    if-nez v2, :cond_23

    .line 29
    .line 30
    :try_start_1d
    invoke-interface {v0, p1}, Lax/n/d;->onWindowStartingSupportActionMode(Landroidx/appcompat/view/a$a;)Landroidx/appcompat/view/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_21
    .catch Ljava/lang/AbstractMethodError; {:try_start_1d .. :try_end_21} :catch_22

    .line 34
    goto :goto_24

    .line 35
    :catch_22
    nop

    .line 36
    :cond_23
    move-object v0, v1

    .line 37
    :goto_24
    if-eqz v0, :cond_2a

    .line 38
    .line 39
    iput-object v0, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 40
    .line 41
    goto/16 :goto_15c

    .line 42
    .line 43
    :cond_2a
    iget-object v0, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x1

    .line 47
    if-nez v0, :cond_d5

    .line 48
    .line 49
    iget-boolean v0, p0, Lax/n/h;->J:Z

    .line 50
    .line 51
    if-eqz v0, :cond_b6

    .line 52
    .line 53
    new-instance v0, Landroid/util/TypedValue;

    .line 54
    .line 55
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget v5, Lax/m/a;->f:I

    .line 65
    .line 66
    invoke-virtual {v4, v5, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 67
    .line 68
    .line 69
    iget v5, v0, Landroid/util/TypedValue;->resourceId:I

    .line 70
    .line 71
    if-eqz v5, :cond_69

    .line 72
    .line 73
    iget-object v5, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v5, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 84
    .line 85
    .line 86
    iget v4, v0, Landroid/util/TypedValue;->resourceId:I

    .line 87
    .line 88
    invoke-virtual {v5, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 89
    .line 90
    .line 91
    new-instance v4, Lax/s/c;

    .line 92
    .line 93
    iget-object v6, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 94
    .line 95
    invoke-direct {v4, v6, v2}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 103
    .line 104
    .line 105
    goto :goto_6b

    .line 106
    :cond_69
    iget-object v4, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 107
    .line 108
    :goto_6b
    new-instance v5, Landroidx/appcompat/widget/ActionBarContextView;

    .line 109
    .line 110
    invoke-direct {v5, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    .line 111
    .line 112
    .line 113
    iput-object v5, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 114
    .line 115
    new-instance v5, Landroid/widget/PopupWindow;

    .line 116
    .line 117
    sget v6, Lax/m/a;->i:I

    .line 118
    .line 119
    invoke-direct {v5, v4, v1, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 120
    .line 121
    .line 122
    iput-object v5, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 123
    .line 124
    const/4 v6, 0x2

    .line 125
    invoke-static {v5, v6}, Lax/h0/h;->b(Landroid/widget/PopupWindow;I)V

    .line 126
    .line 127
    .line 128
    iget-object v5, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 129
    .line 130
    iget-object v6, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 131
    .line 132
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    iget-object v5, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 136
    .line 137
    const/4 v6, -0x1

    .line 138
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    sget v6, Lax/m/a;->b:I

    .line 146
    .line 147
    invoke-virtual {v5, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 148
    .line 149
    .line 150
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 151
    .line 152
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-static {v0, v4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    iget-object v4, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 165
    .line 166
    invoke-virtual {v4, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 170
    .line 171
    const/4 v4, -0x2

    .line 172
    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 173
    .line 174
    .line 175
    new-instance v0, Lax/n/h$d;

    .line 176
    .line 177
    invoke-direct {v0, p0}, Lax/n/h$d;-><init>(Lax/n/h;)V

    .line 178
    .line 179
    .line 180
    iput-object v0, p0, Lax/n/h;->x:Ljava/lang/Runnable;

    .line 181
    .line 182
    goto :goto_d5

    .line 183
    :cond_b6
    iget-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 184
    .line 185
    sget v4, Lax/m/f;->h:I

    .line 186
    .line 187
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Landroidx/appcompat/widget/ViewStubCompat;

    .line 192
    .line 193
    if-eqz v0, :cond_d5

    .line 194
    .line 195
    invoke-virtual {p0}, Lax/n/h;->r0()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 211
    .line 212
    iput-object v0, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 213
    .line 214
    :cond_d5
    :goto_d5
    iget-object v0, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 215
    .line 216
    if-eqz v0, :cond_15c

    .line 217
    .line 218
    invoke-virtual {p0}, Lax/n/h;->m0()V

    .line 219
    .line 220
    .line 221
    iget-object v0, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 222
    .line 223
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    .line 224
    .line 225
    .line 226
    new-instance v0, Landroidx/appcompat/view/b;

    .line 227
    .line 228
    iget-object v4, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 229
    .line 230
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    iget-object v5, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 235
    .line 236
    iget-object v6, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 237
    .line 238
    if-nez v6, :cond_f0

    .line 239
    .line 240
    goto :goto_f1

    .line 241
    :cond_f0
    const/4 v3, 0x0

    .line 242
    :goto_f1
    invoke-direct {v0, v4, v5, p1, v3}, Landroidx/appcompat/view/b;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Landroidx/appcompat/view/a$a;Z)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Landroidx/appcompat/view/a;->e()Landroid/view/Menu;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-interface {p1, v0, v3}, Landroidx/appcompat/view/a$a;->b(Landroidx/appcompat/view/a;Landroid/view/Menu;)Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-eqz p1, :cond_15a

    .line 254
    .line 255
    invoke-virtual {v0}, Landroidx/appcompat/view/a;->k()V

    .line 256
    .line 257
    .line 258
    iget-object p1, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 259
    .line 260
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->h(Landroidx/appcompat/view/a;)V

    .line 261
    .line 262
    .line 263
    iput-object v0, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 264
    .line 265
    invoke-virtual {p0}, Lax/n/h;->X0()Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    const/high16 v0, 0x3f800000    # 1.0f

    .line 270
    .line 271
    if-eqz p1, :cond_12b

    .line 272
    .line 273
    iget-object p1, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 274
    .line 275
    const/4 v1, 0x0

    .line 276
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 277
    .line 278
    .line 279
    iget-object p1, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 280
    .line 281
    invoke-static {p1}, Lax/c0/d0;->e(Landroid/view/View;)Lax/c0/n0;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {p1, v0}, Lax/c0/n0;->b(F)Lax/c0/n0;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    iput-object p1, p0, Lax/n/h;->y:Lax/c0/n0;

    .line 290
    .line 291
    new-instance v0, Lax/n/h$e;

    .line 292
    .line 293
    invoke-direct {v0, p0}, Lax/n/h$e;-><init>(Lax/n/h;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, v0}, Lax/c0/n0;->g(Lax/c0/o0;)Lax/c0/n0;

    .line 297
    .line 298
    .line 299
    goto :goto_14a

    .line 300
    :cond_12b
    iget-object p1, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 301
    .line 302
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 303
    .line 304
    .line 305
    iget-object p1, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 306
    .line 307
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 308
    .line 309
    .line 310
    iget-object p1, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 311
    .line 312
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    instance-of p1, p1, Landroid/view/View;

    .line 317
    .line 318
    if-eqz p1, :cond_14a

    .line 319
    .line 320
    iget-object p1, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 321
    .line 322
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    check-cast p1, Landroid/view/View;

    .line 327
    .line 328
    invoke-static {p1}, Lax/c0/d0;->i0(Landroid/view/View;)V

    .line 329
    .line 330
    .line 331
    :cond_14a
    :goto_14a
    iget-object p1, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 332
    .line 333
    if-eqz p1, :cond_15c

    .line 334
    .line 335
    iget-object p1, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 336
    .line 337
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    iget-object v0, p0, Lax/n/h;->x:Ljava/lang/Runnable;

    .line 342
    .line 343
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_15c

    .line 347
    :cond_15a
    iput-object v1, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 348
    .line 349
    :cond_15c
    :goto_15c
    iget-object p1, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 350
    .line 351
    if-eqz p1, :cond_167

    .line 352
    .line 353
    iget-object v0, p0, Lax/n/h;->n:Lax/n/d;

    .line 354
    .line 355
    if-eqz v0, :cond_167

    .line 356
    .line 357
    invoke-interface {v0, p1}, Lax/n/d;->onSupportActionModeStarted(Landroidx/appcompat/view/a;)V

    .line 358
    .line 359
    .line 360
    :cond_167
    invoke-virtual {p0}, Lax/n/h;->f1()V

    .line 361
    .line 362
    .line 363
    iget-object p1, p0, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 364
    .line 365
    return-object p1
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .registers 2

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lax/n/h;->T0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method b0(ILax/n/h$s;Landroid/view/Menu;)V
    .registers 6

    .line 1
    if-nez p3, :cond_11

    .line 2
    .line 3
    if-nez p2, :cond_d

    .line 4
    .line 5
    if-ltz p1, :cond_d

    .line 6
    .line 7
    iget-object v0, p0, Lax/n/h;->M:[Lax/n/h$s;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge p1, v1, :cond_d

    .line 11
    .line 12
    aget-object p2, v0, p1

    .line 13
    .line 14
    :cond_d
    if-eqz p2, :cond_11

    .line 15
    .line 16
    iget-object p3, p2, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 17
    .line 18
    :cond_11
    if-eqz p2, :cond_18

    .line 19
    .line 20
    iget-boolean p2, p2, Lax/n/h$s;->o:Z

    .line 21
    .line 22
    if-nez p2, :cond_18

    .line 23
    .line 24
    goto :goto_27

    .line 25
    :cond_18
    iget-boolean p2, p0, Lax/n/h;->R:Z

    .line 26
    .line 27
    if-nez p2, :cond_27

    .line 28
    .line 29
    iget-object p2, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 30
    .line 31
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p2, v0, p1, p3}, Lax/n/h$n;->d(Landroid/view/Window$Callback;ILandroid/view/Menu;)V

    .line 38
    .line 39
    .line 40
    :cond_27
    :goto_27
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method c0(Landroidx/appcompat/view/menu/e;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/n/h;->L:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lax/n/h;->L:Z

    .line 8
    .line 9
    iget-object v0, p0, Lax/n/h;->r:Lax/u/k;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/u/k;->n()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lax/n/h;->y0()Landroid/view/Window$Callback;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1c

    .line 19
    .line 20
    iget-boolean v1, p0, Lax/n/h;->R:Z

    .line 21
    .line 22
    if-nez v1, :cond_1c

    .line 23
    .line 24
    const/16 v1, 0x6c

    .line 25
    .line 26
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, p0, Lax/n/h;->L:Z

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/n/h;->n0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 19
    .line 20
    iget-object p2, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Lax/n/h$n;->c(Landroid/view/Window$Callback;)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method e0(I)V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p1, v0}, Lax/n/h;->f0(Lax/n/h$s;Z)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public f()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/n/h;->V(Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method f0(Lax/n/h$s;Z)V
    .registers 6

    .line 1
    if-eqz p2, :cond_16

    .line 2
    .line 3
    iget v0, p1, Lax/n/h$s;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_16

    .line 6
    .line 7
    iget-object v0, p0, Lax/n/h;->r:Lax/u/k;

    .line 8
    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    invoke-interface {v0}, Lax/u/k;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_16

    .line 16
    .line 17
    iget-object p1, p1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lax/n/h;->c0(Landroidx/appcompat/view/menu/e;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 24
    .line 25
    const-string v1, "window"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/view/WindowManager;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_35

    .line 35
    .line 36
    iget-boolean v2, p1, Lax/n/h$s;->o:Z

    .line 37
    .line 38
    if-eqz v2, :cond_35

    .line 39
    .line 40
    iget-object v2, p1, Lax/n/h$s;->g:Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v2, :cond_35

    .line 43
    .line 44
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    if-eqz p2, :cond_35

    .line 48
    .line 49
    iget p2, p1, Lax/n/h$s;->a:I

    .line 50
    .line 51
    invoke-virtual {p0, p2, p1, v1}, Lax/n/h;->b0(ILax/n/h$s;Landroid/view/Menu;)V

    .line 52
    .line 53
    .line 54
    :cond_35
    const/4 p2, 0x0

    .line 55
    iput-boolean p2, p1, Lax/n/h$s;->m:Z

    .line 56
    .line 57
    iput-boolean p2, p1, Lax/n/h$s;->n:Z

    .line 58
    .line 59
    iput-boolean p2, p1, Lax/n/h$s;->o:Z

    .line 60
    .line 61
    iput-object v1, p1, Lax/n/h$s;->h:Landroid/view/View;

    .line 62
    .line 63
    const/4 p2, 0x1

    .line 64
    iput-boolean p2, p1, Lax/n/h$s;->q:Z

    .line 65
    .line 66
    iget-object p2, p0, Lax/n/h;->N:Lax/n/h$s;

    .line 67
    .line 68
    if-ne p2, p1, :cond_47

    .line 69
    .line 70
    iput-object v1, p0, Lax/n/h;->N:Lax/n/h$s;

    .line 71
    .line 72
    :cond_47
    iget p1, p1, Lax/n/h$s;->a:I

    .line 73
    .line 74
    if-nez p1, :cond_4e

    .line 75
    .line 76
    invoke-virtual {p0}, Lax/n/h;->f1()V

    .line 77
    .line 78
    .line 79
    :cond_4e
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method f1()V
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_27

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/n/h;->Z0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_19

    .line 12
    .line 13
    iget-object v1, p0, Lax/n/h;->i0:Landroid/window/OnBackInvokedCallback;

    .line 14
    .line 15
    if-nez v1, :cond_19

    .line 16
    .line 17
    iget-object v0, p0, Lax/n/h;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 18
    .line 19
    invoke-static {v0, p0}, Lax/n/h$m;->b(Ljava/lang/Object;Lax/n/h;)Landroid/window/OnBackInvokedCallback;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lax/n/h;->i0:Landroid/window/OnBackInvokedCallback;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    if-nez v0, :cond_27

    .line 27
    .line 28
    iget-object v0, p0, Lax/n/h;->i0:Landroid/window/OnBackInvokedCallback;

    .line 29
    .line 30
    if-eqz v0, :cond_27

    .line 31
    .line 32
    iget-object v1, p0, Lax/n/h;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 33
    .line 34
    invoke-static {v1, v0}, Lax/n/h$m;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lax/n/h;->i0:Landroid/window/OnBackInvokedCallback;

    .line 39
    .line 40
    :cond_27
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method final h1(Lax/c0/F0;Landroid/graphics/Rect;)I
    .registers 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    invoke-virtual {p1}, Lax/c0/F0;->l()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_e

    .line 9
    :cond_8
    if-eqz p2, :cond_d

    .line 10
    .line 11
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 12
    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v1, 0x0

    .line 15
    :goto_e
    iget-object v2, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 16
    .line 17
    const/16 v3, 0x8

    .line 18
    .line 19
    if-eqz v2, :cond_10d

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    instance-of v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 26
    .line 27
    if-eqz v2, :cond_10d

    .line 28
    .line 29
    iget-object v2, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 36
    .line 37
    iget-object v4, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x1

    .line 44
    if-eqz v4, :cond_fb

    .line 45
    .line 46
    iget-object v4, p0, Lax/n/h;->d0:Landroid/graphics/Rect;

    .line 47
    .line 48
    if-nez v4, :cond_3f

    .line 49
    .line 50
    new-instance v4, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v4, p0, Lax/n/h;->d0:Landroid/graphics/Rect;

    .line 56
    .line 57
    new-instance v4, Landroid/graphics/Rect;

    .line 58
    .line 59
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v4, p0, Lax/n/h;->e0:Landroid/graphics/Rect;

    .line 63
    .line 64
    :cond_3f
    iget-object v4, p0, Lax/n/h;->d0:Landroid/graphics/Rect;

    .line 65
    .line 66
    iget-object v6, p0, Lax/n/h;->e0:Landroid/graphics/Rect;

    .line 67
    .line 68
    if-nez p1, :cond_49

    .line 69
    .line 70
    invoke-virtual {v4, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 71
    .line 72
    .line 73
    goto :goto_5c

    .line 74
    :cond_49
    invoke-virtual {p1}, Lax/c0/F0;->j()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    invoke-virtual {p1}, Lax/c0/F0;->l()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    invoke-virtual {p1}, Lax/c0/F0;->k()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    invoke-virtual {p1}, Lax/c0/F0;->i()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-virtual {v4, p2, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 91
    .line 92
    .line 93
    :goto_5c
    iget-object p1, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 94
    .line 95
    invoke-static {p1, v4, v6}, Landroidx/appcompat/widget/O;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 96
    .line 97
    .line 98
    iget p1, v4, Landroid/graphics/Rect;->top:I

    .line 99
    .line 100
    iget p2, v4, Landroid/graphics/Rect;->left:I

    .line 101
    .line 102
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 103
    .line 104
    iget-object v6, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 105
    .line 106
    invoke-static {v6}, Lax/c0/d0;->G(Landroid/view/View;)Lax/c0/F0;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    if-nez v6, :cond_71

    .line 111
    .line 112
    const/4 v7, 0x0

    .line 113
    goto :goto_75

    .line 114
    :cond_71
    invoke-virtual {v6}, Lax/c0/F0;->j()I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    :goto_75
    if-nez v6, :cond_79

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    goto :goto_7d

    .line 122
    :cond_79
    invoke-virtual {v6}, Lax/c0/F0;->k()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    :goto_7d
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 127
    .line 128
    if-ne v8, p1, :cond_8c

    .line 129
    .line 130
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 131
    .line 132
    if-ne v8, p2, :cond_8c

    .line 133
    .line 134
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 135
    .line 136
    if-eq v8, v4, :cond_8a

    .line 137
    .line 138
    goto :goto_8c

    .line 139
    :cond_8a
    const/4 p2, 0x0

    .line 140
    goto :goto_93

    .line 141
    :cond_8c
    :goto_8c
    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 142
    .line 143
    iput p2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 144
    .line 145
    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 146
    .line 147
    const/4 p2, 0x1

    .line 148
    :goto_93
    if-lez p1, :cond_bb

    .line 149
    .line 150
    iget-object p1, p0, Lax/n/h;->D:Landroid/view/View;

    .line 151
    .line 152
    if-nez p1, :cond_bb

    .line 153
    .line 154
    new-instance p1, Landroid/view/View;

    .line 155
    .line 156
    iget-object v4, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 157
    .line 158
    invoke-direct {p1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 159
    .line 160
    .line 161
    iput-object p1, p0, Lax/n/h;->D:Landroid/view/View;

    .line 162
    .line 163
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 164
    .line 165
    .line 166
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 167
    .line 168
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 169
    .line 170
    const/16 v8, 0x33

    .line 171
    .line 172
    const/4 v9, -0x1

    .line 173
    invoke-direct {p1, v9, v4, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 174
    .line 175
    .line 176
    iput v7, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 177
    .line 178
    iput v6, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 179
    .line 180
    iget-object v4, p0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 181
    .line 182
    iget-object v6, p0, Lax/n/h;->D:Landroid/view/View;

    .line 183
    .line 184
    invoke-virtual {v4, v6, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 185
    .line 186
    .line 187
    goto :goto_de

    .line 188
    :cond_bb
    iget-object p1, p0, Lax/n/h;->D:Landroid/view/View;

    .line 189
    .line 190
    if-eqz p1, :cond_de

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 197
    .line 198
    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 199
    .line 200
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 201
    .line 202
    if-ne v4, v8, :cond_d3

    .line 203
    .line 204
    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 205
    .line 206
    if-ne v4, v7, :cond_d3

    .line 207
    .line 208
    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 209
    .line 210
    if-eq v4, v6, :cond_de

    .line 211
    .line 212
    :cond_d3
    iput v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 213
    .line 214
    iput v7, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 215
    .line 216
    iput v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 217
    .line 218
    iget-object v4, p0, Lax/n/h;->D:Landroid/view/View;

    .line 219
    .line 220
    invoke-virtual {v4, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 221
    .line 222
    .line 223
    :cond_de
    :goto_de
    iget-object p1, p0, Lax/n/h;->D:Landroid/view/View;

    .line 224
    .line 225
    if-eqz p1, :cond_e3

    .line 226
    .line 227
    goto :goto_e4

    .line 228
    :cond_e3
    const/4 v5, 0x0

    .line 229
    :goto_e4
    if-eqz v5, :cond_f1

    .line 230
    .line 231
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eqz p1, :cond_f1

    .line 236
    .line 237
    iget-object p1, p0, Lax/n/h;->D:Landroid/view/View;

    .line 238
    .line 239
    invoke-direct {p0, p1}, Lax/n/h;->i1(Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    :cond_f1
    iget-boolean p1, p0, Lax/n/h;->I:Z

    .line 243
    .line 244
    if-nez p1, :cond_f8

    .line 245
    .line 246
    if-eqz v5, :cond_f8

    .line 247
    .line 248
    const/4 v1, 0x0

    .line 249
    :cond_f8
    move p1, v5

    .line 250
    move v5, p2

    .line 251
    goto :goto_105

    .line 252
    :cond_fb
    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 253
    .line 254
    if-eqz p1, :cond_103

    .line 255
    .line 256
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 257
    .line 258
    const/4 p1, 0x0

    .line 259
    goto :goto_105

    .line 260
    :cond_103
    const/4 p1, 0x0

    .line 261
    const/4 v5, 0x0

    .line 262
    :goto_105
    if-eqz v5, :cond_10e

    .line 263
    .line 264
    iget-object p2, p0, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 265
    .line 266
    invoke-virtual {p2, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 267
    .line 268
    .line 269
    goto :goto_10e

    .line 270
    :cond_10d
    const/4 p1, 0x0

    .line 271
    :cond_10e
    :goto_10e
    iget-object p2, p0, Lax/n/h;->D:Landroid/view/View;

    .line 272
    .line 273
    if-eqz p2, :cond_11a

    .line 274
    .line 275
    if-eqz p1, :cond_115

    .line 276
    .line 277
    goto :goto_117

    .line 278
    :cond_115
    const/16 v0, 0x8

    .line 279
    .line 280
    :goto_117
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 281
    .line 282
    .line 283
    :cond_11a
    return v1
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method public i(Landroid/content/Context;)Landroid/content/Context;
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/n/h;->P:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lax/n/h;->a0()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, p1, v0}, Lax/n/h;->F0(Landroid/content/Context;I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {p1}, Lax/n/f;->x(Landroid/content/Context;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_14

    .line 17
    .line 18
    invoke-static {p1}, Lax/n/f;->U(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    invoke-virtual {p0, p1}, Lax/n/h;->Z(Landroid/content/Context;)Lax/Y/h;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    instance-of v0, p1, Landroid/view/ContextThemeWrapper;

    .line 26
    .line 27
    if-eqz v0, :cond_2d

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v1, p0

    .line 32
    move-object v2, p1

    .line 33
    invoke-direct/range {v1 .. v6}, Lax/n/h;->g0(Landroid/content/Context;ILax/Y/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :try_start_24
    move-object v0, v2

    .line 38
    check-cast v0, Landroid/view/ContextThemeWrapper;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_2a
    .catch Ljava/lang/IllegalStateException; {:try_start_24 .. :try_end_2a} :catch_2b

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    :catch_2b
    nop

    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    move-object v2, p1

    .line 47
    :goto_2e
    nop

    .line 48
    instance-of p1, v2, Lax/s/c;

    .line 49
    .line 50
    if-eqz p1, :cond_42

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    move-object v1, p0

    .line 55
    invoke-direct/range {v1 .. v6}, Lax/n/h;->g0(Landroid/content/Context;ILax/Y/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :try_start_3a
    move-object v0, v2

    .line 60
    check-cast v0, Lax/s/c;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Lax/s/c;->a(Landroid/content/res/Configuration;)V
    :try_end_40
    .catch Ljava/lang/IllegalStateException; {:try_start_3a .. :try_end_40} :catch_41

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    :catch_41
    nop

    .line 67
    :cond_42
    sget-boolean p1, Lax/n/h;->m0:Z

    .line 68
    .line 69
    if-nez p1, :cond_4b

    .line 70
    .line 71
    invoke-super {p0, v2}, Lax/n/f;->i(Landroid/content/Context;)Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_4b
    new-instance p1, Landroid/content/res/Configuration;

    .line 77
    .line 78
    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    .line 79
    .line 80
    .line 81
    const/4 v0, -0x1

    .line 82
    iput v0, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    iput v0, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 86
    .line 87
    invoke-virtual {v2, p1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 108
    .line 109
    iput v1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_7a

    .line 116
    .line 117
    invoke-static {p1, v0}, Lax/n/h;->q0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    :goto_78
    move-object v5, p1

    .line 122
    goto :goto_7c

    .line 123
    :cond_7a
    const/4 p1, 0x0

    .line 124
    goto :goto_78

    .line 125
    :goto_7c
    const/4 v6, 0x1

    .line 126
    move-object v1, p0

    .line 127
    invoke-direct/range {v1 .. v6}, Lax/n/h;->g0(Landroid/content/Context;ILax/Y/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v0, Lax/s/c;

    .line 132
    .line 133
    sget v3, Lax/m/i;->d:I

    .line 134
    .line 135
    invoke-direct {v0, v2, v3}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p1}, Lax/s/c;->a(Landroid/content/res/Configuration;)V

    .line 139
    .line 140
    .line 141
    :try_start_8c
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 142
    .line 143
    .line 144
    move-result-object p1
    :try_end_90
    .catch Ljava/lang/NullPointerException; {:try_start_8c .. :try_end_90} :catch_99

    .line 145
    if-eqz p1, :cond_99

    .line 146
    .line 147
    invoke-virtual {v0}, Lax/s/c;->getTheme()Landroid/content/res/Resources$Theme;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1}, Lax/S/h$f;->a(Landroid/content/res/Resources$Theme;)V

    .line 152
    .line 153
    .line 154
    :catch_99
    :cond_99
    invoke-super {p0, v0}, Lax/n/f;->i(Landroid/content/Context;)Landroid/content/Context;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public i0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .registers 15

    .line 1
    iget-object v0, p0, Lax/n/h;->f0:Lax/n/z;

    .line 2
    .line 3
    if-nez v0, :cond_5a

    .line 4
    .line 5
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v1, Lax/m/j;->y0:[I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget v1, Lax/m/j;->C0:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    .line 21
    .line 22
    if-nez v1, :cond_1f

    .line 23
    .line 24
    new-instance v0, Lax/n/z;

    .line 25
    .line 26
    invoke-direct {v0}, Lax/n/z;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lax/n/h;->f0:Lax/n/z;

    .line 30
    .line 31
    goto :goto_5a

    .line 32
    :cond_1f
    :try_start_1f
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lax/n/z;

    .line 52
    .line 53
    iput-object v0, p0, Lax/n/h;->f0:Lax/n/z;
    :try_end_36
    .catchall {:try_start_1f .. :try_end_36} :catchall_37

    .line 54
    .line 55
    goto :goto_5a

    .line 56
    :catchall_37
    move-exception v0

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v3, "Failed to instantiate custom view inflater "

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ". Falling back to default."

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "AppCompatDelegate"

    .line 80
    .line 81
    invoke-static {v2, v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 82
    .line 83
    .line 84
    new-instance v0, Lax/n/z;

    .line 85
    .line 86
    invoke-direct {v0}, Lax/n/z;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lax/n/h;->f0:Lax/n/z;

    .line 90
    .line 91
    :cond_5a
    :goto_5a
    sget-boolean v7, Lax/n/h;->k0:Z

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    if-eqz v7, :cond_8d

    .line 95
    .line 96
    iget-object v1, p0, Lax/n/h;->g0:Lax/n/B;

    .line 97
    .line 98
    if-nez v1, :cond_6a

    .line 99
    .line 100
    new-instance v1, Lax/n/B;

    .line 101
    .line 102
    invoke-direct {v1}, Lax/n/B;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, Lax/n/h;->g0:Lax/n/B;

    .line 106
    .line 107
    :cond_6a
    iget-object v1, p0, Lax/n/h;->g0:Lax/n/B;

    .line 108
    .line 109
    invoke-virtual {v1, p4}, Lax/n/B;->a(Landroid/util/AttributeSet;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const/4 v2, 0x1

    .line 114
    if-eqz v1, :cond_75

    .line 115
    .line 116
    const/4 v6, 0x1

    .line 117
    goto :goto_8e

    .line 118
    :cond_75
    instance-of v1, p4, Lorg/xmlpull/v1/XmlPullParser;

    .line 119
    .line 120
    if-eqz v1, :cond_84

    .line 121
    .line 122
    move-object v1, p4

    .line 123
    check-cast v1, Lorg/xmlpull/v1/XmlPullParser;

    .line 124
    .line 125
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-le v1, v2, :cond_8b

    .line 130
    .line 131
    const/4 v0, 0x1

    .line 132
    goto :goto_8b

    .line 133
    :cond_84
    move-object v0, p1

    .line 134
    check-cast v0, Landroid/view/ViewParent;

    .line 135
    .line 136
    invoke-direct {p0, v0}, Lax/n/h;->Y0(Landroid/view/ViewParent;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    :cond_8b
    :goto_8b
    move v6, v0

    .line 141
    goto :goto_8e

    .line 142
    :cond_8d
    const/4 v6, 0x0

    .line 143
    :goto_8e
    iget-object v1, p0, Lax/n/h;->f0:Lax/n/z;

    .line 144
    .line 145
    const/4 v8, 0x1

    .line 146
    invoke-static {}, Landroidx/appcompat/widget/N;->d()Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    move-object v2, p1

    .line 151
    move-object v3, p2

    .line 152
    move-object v4, p3

    .line 153
    move-object v5, p4

    .line 154
    invoke-virtual/range {v1 .. v9}, Lax/n/z;->r(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method j0()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/h;->r:Lax/u/k;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0}, Lax/u/k;->n()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 9
    .line 10
    if-eqz v0, :cond_26

    .line 11
    .line 12
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lax/n/h;->x:Ljava/lang/Runnable;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_23

    .line 30
    .line 31
    :try_start_1e
    iget-object v0, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_23
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1e .. :try_end_23} :catch_23

    .line 34
    .line 35
    .line 36
    :catch_23
    :cond_23
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 38
    .line 39
    :cond_26
    invoke-virtual {p0}, Lax/n/h;->m0()V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0, v0}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_37

    .line 48
    .line 49
    iget-object v0, v0, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 50
    .line 51
    if-eqz v0, :cond_37

    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->close()V

    .line 54
    .line 55
    .line 56
    :cond_37
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method k0(Landroid/view/KeyEvent;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lax/c0/u$a;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_b

    .line 7
    .line 8
    instance-of v0, v0, Lax/n/x;

    .line 9
    .line 10
    if-eqz v0, :cond_1a

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1a

    .line 19
    .line 20
    invoke-static {v0, p1}, Lax/c0/u;->d(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1a

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1a
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v1, 0x52

    .line 32
    .line 33
    if-ne v0, v1, :cond_31

    .line 34
    .line 35
    iget-object v0, p0, Lax/n/h;->m:Lax/n/h$n;

    .line 36
    .line 37
    iget-object v1, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1, p1}, Lax/n/h$n;->b(Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_31

    .line 48
    .line 49
    return v2

    .line 50
    :cond_31
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_40

    .line 59
    .line 60
    invoke-virtual {p0, v0, p1}, Lax/n/h;->H0(ILandroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    return p1

    .line 65
    :cond_40
    invoke-virtual {p0, v0, p1}, Lax/n/h;->K0(ILandroid/view/KeyEvent;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public l(I)Landroid/view/View;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/n/h;->n0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method l0(I)V
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 7
    .line 8
    if-eqz v2, :cond_25

    .line 9
    .line 10
    new-instance v2, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Landroidx/appcompat/view/menu/e;->R(Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-lez v3, :cond_1b

    .line 25
    .line 26
    iput-object v2, v1, Lax/n/h$s;->s:Landroid/os/Bundle;

    .line 27
    .line 28
    :cond_1b
    iget-object v2, v1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->f0()V

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->clear()V

    .line 36
    .line 37
    .line 38
    :cond_25
    iput-boolean v0, v1, Lax/n/h$s;->r:Z

    .line 39
    .line 40
    iput-boolean v0, v1, Lax/n/h$s;->q:Z

    .line 41
    .line 42
    const/16 v0, 0x6c

    .line 43
    .line 44
    if-eq p1, v0, :cond_2f

    .line 45
    .line 46
    if-nez p1, :cond_40

    .line 47
    .line 48
    :cond_2f
    iget-object p1, p0, Lax/n/h;->r:Lax/u/k;

    .line 49
    .line 50
    if-eqz p1, :cond_40

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1, p1}, Lax/n/h;->w0(IZ)Lax/n/h$s;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_40

    .line 58
    .line 59
    iput-boolean p1, v0, Lax/n/h$s;->m:Z

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-direct {p0, v0, p1}, Lax/n/h;->S0(Lax/n/h$s;Landroid/view/KeyEvent;)Z

    .line 63
    .line 64
    .line 65
    :cond_40
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method m0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/n/h;->y:Lax/c0/n0;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/c0/n0;->c()V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public n()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .registers 5

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lax/n/h;->i0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .registers 5

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, Lax/n/h;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final p()Lax/n/b;
    .registers 2

    .line 1
    new-instance v0, Lax/n/h$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/n/h$f;-><init>(Lax/n/h;)V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method p0(Landroid/view/Menu;)Lax/n/h$s;
    .registers 7

    .line 1
    iget-object v0, p0, Lax/n/h;->M:[Lax/n/h$s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 v2, 0x0

    .line 9
    :goto_8
    if-ge v1, v2, :cond_16

    .line 10
    .line 11
    aget-object v3, v0, v1

    .line 12
    .line 13
    if-eqz v3, :cond_13

    .line 14
    .line 15
    iget-object v4, v3, Lax/n/h$s;->j:Landroidx/appcompat/view/menu/e;

    .line 16
    .line 17
    if-ne v4, p1, :cond_13

    .line 18
    .line 19
    return-object v3

    .line 20
    :cond_13
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_8

    .line 23
    :cond_16
    const/4 p1, 0x0

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public q()I
    .registers 2

    .line 1
    iget v0, p0, Lax/n/h;->T:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method final r0()Landroid/content/Context;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/n/a;->m()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    :goto_c
    if-nez v0, :cond_10

    .line 14
    .line 15
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 16
    .line 17
    :cond_10
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public s()Landroid/view/MenuInflater;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/h;->p:Landroid/view/MenuInflater;

    .line 2
    .line 3
    if-nez v0, :cond_19

    .line 4
    .line 5
    invoke-direct {p0}, Lax/n/h;->z0()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lax/s/d;

    .line 9
    .line 10
    iget-object v1, p0, Lax/n/h;->o:Lax/n/a;

    .line 11
    .line 12
    if-eqz v1, :cond_12

    .line 13
    .line 14
    invoke-virtual {v1}, Lax/n/a;->m()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_14

    .line 19
    :cond_12
    iget-object v1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 20
    .line 21
    :goto_14
    invoke-direct {v0, v1}, Lax/s/d;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lax/n/h;->p:Landroid/view/MenuInflater;

    .line 25
    .line 26
    :cond_19
    iget-object v0, p0, Lax/n/h;->p:Landroid/view/MenuInflater;

    .line 27
    .line 28
    return-object v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public u()Lax/n/a;
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/n/h;->z0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/n/h;->o:Lax/n/a;

    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public v()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_10

    .line 12
    .line 13
    invoke-static {v0, p0}, Lax/c0/v;->a(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v0, v0, Lax/n/h;

    .line 22
    .line 23
    if-nez v0, :cond_1f

    .line 24
    .line 25
    const-string v0, "AppCompatDelegate"

    .line 26
    .line 27
    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method v0(Landroid/content/res/Configuration;)Lax/Y/h;
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_b

    .line 6
    .line 7
    invoke-static {p1}, Lax/n/h$k;->b(Landroid/content/res/Configuration;)Lax/Y/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_b
    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 13
    .line 14
    invoke-static {p1}, Lax/n/h$j;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lax/Y/h;->c(Ljava/lang/String;)Lax/Y/h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public w()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/n/h;->Q0()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_15

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/n/a;->o()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_15

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, v0}, Lax/n/h;->D0(I)V

    .line 20
    .line 21
    .line 22
    :cond_15
    :goto_15
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected w0(IZ)Lax/n/h$s;
    .registers 6

    .line 1
    iget-object p2, p0, Lax/n/h;->M:[Lax/n/h$s;

    .line 2
    .line 3
    if-eqz p2, :cond_7

    .line 4
    .line 5
    array-length v0, p2

    .line 6
    if-gt v0, p1, :cond_15

    .line 7
    .line 8
    :cond_7
    add-int/lit8 v0, p1, 0x1

    .line 9
    .line 10
    new-array v0, v0, [Lax/n/h$s;

    .line 11
    .line 12
    if-eqz p2, :cond_12

    .line 13
    .line 14
    array-length v1, p2

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_12
    iput-object v0, p0, Lax/n/h;->M:[Lax/n/h$s;

    .line 20
    .line 21
    move-object p2, v0

    .line 22
    :cond_15
    aget-object v0, p2, p1

    .line 23
    .line 24
    if-nez v0, :cond_20

    .line 25
    .line 26
    new-instance v0, Lax/n/h$s;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Lax/n/h$s;-><init>(I)V

    .line 29
    .line 30
    .line 31
    aput-object v0, p2, p1

    .line 32
    .line 33
    :cond_20
    return-object v0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method final x0()Ljava/lang/CharSequence;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v1, :cond_d

    .line 6
    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_d
    iget-object v0, p0, Lax/n/h;->q:Ljava/lang/CharSequence;

    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public y(Landroid/content/res/Configuration;)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/n/h;->G:Z

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/n/h;->A:Z

    .line 6
    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/n/h;->u()Lax/n/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_11

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lax/n/a;->q(Landroid/content/res/Configuration;)V

    .line 16
    .line 17
    .line 18
    :cond_11
    invoke-static {}, Landroidx/appcompat/widget/k;->b()Landroidx/appcompat/widget/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/k;->g(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Landroid/content/res/Configuration;

    .line 28
    .line 29
    iget-object v0, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lax/n/h;->S:Landroid/content/res/Configuration;

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-direct {p0, p1, p1}, Lax/n/h;->W(ZZ)Z

    .line 46
    .line 47
    .line 48
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method final y0()Landroid/view/Window$Callback;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/n/h;->l:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public z(Landroid/os/Bundle;)V
    .registers 4

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lax/n/h;->P:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Lax/n/h;->V(Z)Z

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lax/n/h;->o0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/n/h;->j:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v1, v0, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v1, :cond_29

    .line 16
    .line 17
    :try_start_10
    check-cast v0, Landroid/app/Activity;

    .line 18
    .line 19
    invoke-static {v0}, Lax/P/j;->c(Landroid/app/Activity;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_16
    .catch Ljava/lang/IllegalArgumentException; {:try_start_10 .. :try_end_16} :catch_17

    .line 23
    goto :goto_18

    .line 24
    :catch_17
    const/4 v0, 0x0

    .line 25
    :goto_18
    if-eqz v0, :cond_26

    .line 26
    .line 27
    invoke-virtual {p0}, Lax/n/h;->Q0()Lax/n/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_23

    .line 32
    .line 33
    iput-boolean p1, p0, Lax/n/h;->c0:Z

    .line 34
    .line 35
    goto :goto_26

    .line 36
    :cond_23
    invoke-virtual {v0, p1}, Lax/n/a;->w(Z)V

    .line 37
    .line 38
    .line 39
    :cond_26
    :goto_26
    invoke-static {p0}, Lax/n/f;->d(Lax/n/f;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    new-instance v0, Landroid/content/res/Configuration;

    .line 43
    .line 44
    iget-object v1, p0, Lax/n/h;->k:Landroid/content/Context;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lax/n/h;->S:Landroid/content/res/Configuration;

    .line 58
    .line 59
    iput-boolean p1, p0, Lax/n/h;->Q:Z

    .line 60
    .line 61
    return-void
.end method
