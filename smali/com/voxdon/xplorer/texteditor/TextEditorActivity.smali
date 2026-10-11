.class public Lcom/voxdon/xplorer/texteditor/TextEditorActivity;
.super Lax/R2/c;
.source "SourceFile"

# interfaces
.implements Lax/a3/n$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;,
        Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;,
        Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;,
        Lcom/voxdon/xplorer/texteditor/TextEditorActivity$k;,
        Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;,
        Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;,
        Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g;,
        Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;
    }
.end annotation


# static fields
.field private static final D:Ljava/util/logging/Logger;

.field private static E:Z

.field private static final F:I

.field private static final G:I

.field private static H:Ljava/util/regex/Pattern;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:I

.field private a:Landroidx/appcompat/widget/Toolbar;

.field private b:Landroidx/recyclerview/widget/RecyclerView;

.field private c:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

.field private d:Landroidx/recyclerview/widget/RecyclerView$p;

.field private e:Landroid/widget/ProgressBar;

.field private f:Z

.field private g:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/nio/charset/Charset;

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field q:Lax/c0/s;

.field private r:Z

.field private s:Lcom/voxdon/xplorer/file/o;

.field private t:Lax/Z2/k;

.field private u:Landroid/view/ScaleGestureDetector;

.field private v:Landroid/view/View$OnTouchListener;

.field private w:F

.field private x:I

.field private y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;

.field private z:Landroidx/fragment/app/e;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const-class v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->D:Ljava/util/logging/Logger;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->E:Z

    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1e

    .line 15
    .line 16
    if-lt v0, v1, :cond_14

    .line 17
    .line 18
    const/16 v0, 0x5dc

    .line 19
    .line 20
    goto :goto_16

    .line 21
    :cond_14
    const/16 v0, 0x9c4

    .line 22
    .line 23
    :goto_16
    sput v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->F:I

    .line 24
    .line 25
    mul-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    sput v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->G:I

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/R2/c;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->m:I

    .line 6
    .line 7
    iput v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->o:I

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
.end method

.method static synthetic A0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->c:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic B0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->c:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic D0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->M0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static E0(Ljava/lang/String;C)I
    .registers 5

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    const/4 v0, 0x0

    .line 10
    :goto_9
    invoke-virtual {p0, p1, v1}, Ljava/lang/String;->indexOf(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, -0x1

    .line 15
    if-eq v1, v2, :cond_15

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_9

    .line 22
    :cond_15
    return v0
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

.method static synthetic F(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView$p;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->d:Landroidx/recyclerview/widget/RecyclerView$p;

    .line 2
    .line 3
    return-object p0
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

.method public static F0(Ljava/lang/String;Ljava/lang/String;)I
    .registers 5

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1f

    .line 7
    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    goto :goto_1f

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    :goto_f
    invoke-virtual {p0, p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, -0x1

    .line 21
    if-eq v1, v2, :cond_1e

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v1, v2

    .line 30
    goto :goto_f

    .line 31
    :cond_1e
    return v0

    .line 32
    :cond_1f
    :goto_1f
    return v1
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

.method private G0(Z)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    new-instance v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Z)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    new-array p1, p1, [Ljava/lang/Void;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
.end method

.method static synthetic H(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->f:Z

    .line 2
    .line 3
    return p0
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

.method public static H0(Ljava/lang/String;CI)I
    .registers 6

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_a
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->indexOf(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, v1, :cond_18

    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    if-ne v2, p2, :cond_15

    .line 20
    .line 21
    return v0

    .line 22
    :cond_15
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_a

    .line 25
    :cond_18
    return v1
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

.method static synthetic I(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->P0()V

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

.method private I0()V
    .registers 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->z:Landroidx/fragment/app/e;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->z:Landroidx/fragment/app/e;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/e;->O2()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_f} :catch_f

    .line 14
    .line 15
    .line 16
    :catch_f
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic J(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lax/Z2/k;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 2
    .line 3
    return-object p0
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

.method private J0()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->a:Landroidx/appcompat/widget/Toolbar;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/n/c;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Lax/n/a;->x(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->a:Landroidx/appcompat/widget/Toolbar;

    .line 15
    .line 16
    new-instance v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$f;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$f;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method static synthetic L(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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

.method private L0()V
    .registers 3

    .line 1
    const v0, 0x7f0a04a5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->a:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    const v0, 0x7f0a03a9

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    const v0, 0x7f0a0398

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/widget/ProgressBar;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->e:Landroid/widget/ProgressBar;

    .line 33
    .line 34
    new-instance v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$a;

    .line 35
    .line 36
    invoke-direct {v0, p0, p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$a;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->d:Landroidx/recyclerview/widget/RecyclerView$p;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 53
    .line 54
    new-instance v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$k;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$k;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->l(Landroidx/recyclerview/widget/RecyclerView$r;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->K0()V

    .line 63
    .line 64
    .line 65
    return-void
    .line 66
    .line 67
    .line 68
.end method

.method static synthetic M(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->I0()V

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

.method private M0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/Z2/k;->b()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lax/Q2/f;->Y(Lax/Q2/f;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;)V

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

.method private N0(Landroid/widget/EditText;)V
    .registers 3

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$b;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Landroid/widget/EditText;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

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

.method static synthetic O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
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

.method private O0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->g:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x2

    .line 8
    if-eq p1, v0, :cond_15

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    if-eq p1, v0, :cond_d

    .line 12
    .line 13
    goto :goto_2d

    .line 14
    :cond_d
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->a:Landroidx/appcompat/widget/Toolbar;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->i:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    goto :goto_2d

    .line 22
    :cond_15
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->a:Landroidx/appcompat/widget/Toolbar;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "* "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->i:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    :goto_2d
    invoke-virtual {p0}, Lax/n/c;->invalidateOptionsMenu()V

    .line 47
    .line 48
    .line 49
    return-void
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

.method private P0()V
    .registers 5

    .line 1
    new-instance v0, Lax/a3/D;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/a3/D;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->z:Landroidx/fragment/app/e;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->z:Landroidx/fragment/app/e;

    .line 13
    .line 14
    const-string v2, "save_progress"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-static {v0, v1, v2, v3}, Lax/u3/B;->d0(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/e;Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method static synthetic Q(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic R(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic S(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->k:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic U(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->k:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic V()Ljava/util/regex/Pattern;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->H:Ljava/util/regex/Pattern;

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

.method static synthetic W(Ljava/util/regex/Pattern;)Ljava/util/regex/Pattern;
    .registers 1

    .line 1
    sput-object p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->H:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic X(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroid/widget/ProgressBar;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->e:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic Y()Z
    .registers 1

    .line 1
    sget-boolean v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->E:Z

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

.method static synthetic a0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->r:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic b0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->r:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic c0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C:I

    .line 2
    .line 3
    return p0
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

.method static synthetic d0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C:I

    .line 2
    .line 3
    return p1
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

.method static synthetic e0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic f0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->B:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic g0()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->D:Ljava/util/logging/Logger;

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

.method static synthetic h0()I
    .registers 1

    .line 1
    sget v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->F:I

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

.method static synthetic i0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->m:I

    .line 2
    .line 3
    return p0
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

.method static synthetic j0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->m:I

    .line 2
    .line 3
    return p1
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

.method static synthetic k0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->n:I

    .line 2
    .line 3
    return p0
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

.method static synthetic l0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->n:I

    .line 2
    .line 3
    return p1
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

.method static synthetic m0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->o:I

    .line 2
    .line 3
    return p0
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

.method static synthetic n0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->o:I

    .line 2
    .line 3
    return p1
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

.method static synthetic o0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroid/view/ScaleGestureDetector;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->u:Landroid/view/ScaleGestureDetector;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic p0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->p:I

    .line 2
    .line 3
    return p0
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

.method static synthetic q0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->p:I

    .line 2
    .line 3
    return p1
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

.method static synthetic r0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroid/view/View$OnTouchListener;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->v:Landroid/view/View$OnTouchListener;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic s0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->G0(Z)V

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

.method static synthetic t0()I
    .registers 1

    .line 1
    sget v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->G:I

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

.method static synthetic u0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic v0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)F
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->w:F

    .line 2
    .line 3
    return p0
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

.method static synthetic w0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;F)F
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->w:F

    .line 2
    .line 3
    return p1
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

.method static synthetic x0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;F)F
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->w:F

    .line 2
    .line 3
    mul-float v0, v0, p1

    .line 4
    .line 5
    iput v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->w:F

    .line 6
    .line 7
    return v0
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

.method static synthetic y0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->x:I

    .line 2
    .line 3
    return p0
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

.method static synthetic z0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->x:I

    .line 2
    .line 3
    return p1
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


# virtual methods
.method public G(Lax/a3/n;)V
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

.method K0()V
    .registers 4

    .line 1
    new-instance v0, Lax/c0/s;

    .line 2
    .line 3
    new-instance v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lax/c0/s;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->q:Lax/c0/s;

    .line 12
    .line 13
    new-instance v0, Landroid/view/ScaleGestureDetector;

    .line 14
    .line 15
    new-instance v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$a;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->u:Landroid/view/ScaleGestureDetector;

    .line 25
    .line 26
    new-instance v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$d;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$d;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->v:Landroid/view/View$OnTouchListener;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    new-instance v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$e;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$e;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(Landroidx/recyclerview/widget/RecyclerView$t;)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public P(Lax/a3/n;)V
    .registers 4

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "menu_text_editor"

    .line 6
    .line 7
    const-string v1, "text_save"

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->i:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lax/c3/d0;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ext"

    .line 20
    .line 21
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->G0(Z)V

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

.method public Z(Lax/a3/n;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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

.method public isContentClipToPadding(Z)Z
    .registers 2

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public n()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->Q0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public onApplyWindowsInsets(Lax/T/b;Z)V
    .registers 4

    .line 1
    if-nez p2, :cond_11

    .line 2
    .line 3
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    if-eqz p2, :cond_11

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    iget p1, p1, Lax/T/b;->d:I

    .line 14
    .line 15
    invoke-virtual {p2, v0, v0, v0, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
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

.method public onBackPressed()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_29

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->g:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 8
    .line 9
    sget-object v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;->d0:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 10
    .line 11
    if-ne v0, v1, :cond_26

    .line 12
    .line 13
    const v0, 0x7f1302a8

    .line 14
    .line 15
    .line 16
    const v1, 0x7f130280

    .line 17
    .line 18
    .line 19
    const v2, 0x7f1300aa

    .line 20
    .line 21
    .line 22
    const v3, 0x7f1300ae

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3, v0, v1}, Lax/a3/n;->k3(IIII)Lax/a3/n;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "dialog"

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/e;->c3(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 40
    .line 41
    .line 42
    :cond_29
    return-void
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

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 12

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lax/Q2/b;->f(Landroid/content/Context;Z)V

    .line 3
    .line 4
    .line 5
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onCreate(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    const v1, 0x7f0d0026

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lax/n/c;->setContentView(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->L0()V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->J0()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_2e

    .line 29
    .line 30
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "TextEditor DataUri == null"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p0, v2}, Lax/R2/c;->onSetContentView(Z)V

    .line 49
    .line 50
    .line 51
    sget-object v3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;->q:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 52
    .line 53
    iput-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->g:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 54
    .line 55
    sget-object v3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->D:Ljava/util/logging/Logger;

    .line 56
    .line 57
    new-instance v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v5, "TextEditor open : "

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const-string v4, "read_only"

    .line 82
    .line 83
    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iput-boolean v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->f:Z

    .line 88
    .line 89
    const-string v3, "file"

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/4 v4, 0x0

    .line 100
    if-eqz v3, :cond_101

    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v0}, Lax/c3/x;->g(Ljava/lang/String;)Lcom/voxdon/xplorer/file/o;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 113
    .line 114
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->i:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v1, "original_file_location_uri"

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_fe

    .line 137
    .line 138
    :try_start_89
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Lax/Z2/k;->a(Landroid/net/Uri;)Lax/Z2/k;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 147
    .line 148
    invoke-virtual {v0}, Lax/Z2/k;->d()Lax/c3/K;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    sget-object v1, Lax/c3/K;->h:Lax/c3/K;

    .line 153
    .line 154
    if-ne v0, v1, :cond_a5

    .line 155
    .line 156
    invoke-static {v1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 161
    .line 162
    goto :goto_a5

    .line 163
    :catch_a2
    nop

    .line 164
    move-object v0, v4

    .line 165
    goto :goto_c0

    .line 166
    :cond_a5
    :goto_a5
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 167
    .line 168
    if-eqz v0, :cond_be

    .line 169
    .line 170
    invoke-virtual {v0}, Lax/Z2/k;->b()Lax/Q2/f;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0
    :try_end_b1
    .catch Ljava/lang/Exception; {:try_start_89 .. :try_end_b1} :catch_a2

    .line 178
    :try_start_b1
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 179
    .line 180
    invoke-virtual {v1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {v1}, Lax/c3/d0;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4
    :try_end_bb
    .catch Ljava/lang/Exception; {:try_start_b1 .. :try_end_bb} :catch_bc

    .line 188
    goto :goto_c0

    .line 189
    :catch_bc
    nop

    .line 190
    goto :goto_c0

    .line 191
    :cond_be
    move-object v0, v4

    .line 192
    goto :goto_c3

    .line 193
    :goto_c0
    move-object v9, v4

    .line 194
    move-object v4, v0

    .line 195
    move-object v0, v9

    .line 196
    :goto_c3
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 197
    .line 198
    if-eqz v1, :cond_1f2

    .line 199
    .line 200
    if-eqz p1, :cond_1f2

    .line 201
    .line 202
    const-string v1, "file_open_path"

    .line 203
    .line 204
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    const-string v3, "file_open_last_modified"

    .line 209
    .line 210
    const-wide/16 v5, -0x1

    .line 211
    .line 212
    invoke-virtual {p1, v3, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 213
    .line 214
    .line 215
    move-result-wide v7

    .line 216
    if-eqz v1, :cond_1f2

    .line 217
    .line 218
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 219
    .line 220
    invoke-virtual {p1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_1f2

    .line 229
    .line 230
    cmp-long p1, v7, v5

    .line 231
    .line 232
    if-eqz p1, :cond_1f2

    .line 233
    .line 234
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 239
    .line 240
    invoke-virtual {v1}, Lax/Z2/k;->d()Lax/c3/K;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 245
    .line 246
    invoke-virtual {v3}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {p1, v1, v3, v7, v8}, Lax/o3/e;->i(Lax/c3/K;Ljava/lang/String;J)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_1f2

    .line 254
    .line 255
    :cond_fe
    move-object v0, v4

    .line 256
    goto/16 :goto_1f2

    .line 257
    .line 258
    :cond_101
    const-string p1, "content"

    .line 259
    .line 260
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    const v3, 0x7f13013e

    .line 269
    .line 270
    .line 271
    if-eqz p1, :cond_15d

    .line 272
    .line 273
    invoke-static {v1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->B(Landroid/net/Uri;)Z

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    if-nez p1, :cond_128

    .line 278
    .line 279
    invoke-static {v1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->A(Landroid/net/Uri;)Z

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    if-eqz p1, :cond_11d

    .line 284
    .line 285
    goto :goto_128

    .line 286
    :cond_11d
    invoke-static {p0, v3, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :cond_128
    :goto_128
    invoke-static {v1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->e(Landroid/net/Uri;)Lax/Z2/k;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {p1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {p1}, Lax/Z2/k;->d()Lax/c3/K;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-static {p1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 316
    .line 317
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->i:Ljava/lang/String;

    .line 324
    .line 325
    if-eqz p1, :cond_159

    .line 326
    .line 327
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 328
    .line 329
    if-eqz v0, :cond_159

    .line 330
    .line 331
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 340
    .line 341
    invoke-static {p1}, Lax/c3/d0;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    goto :goto_15a

    .line 346
    :cond_159
    move-object p1, v4

    .line 347
    :goto_15a
    move-object v0, p1

    .line 348
    goto/16 :goto_1f2

    .line 349
    .line 350
    :cond_15d
    :try_start_15d
    invoke-static {v1}, Lax/Z2/k;->a(Landroid/net/Uri;)Lax/Z2/k;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-virtual {p1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    iput-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 359
    .line 360
    invoke-virtual {p1}, Lax/Z2/k;->d()Lax/c3/K;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-static {p1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    iput-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 369
    .line 370
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 371
    .line 372
    invoke-static {v1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    iput-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->i:Ljava/lang/String;

    .line 377
    .line 378
    if-eqz p1, :cond_18e

    .line 379
    .line 380
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 381
    .line 382
    if-eqz v1, :cond_18e

    .line 383
    .line 384
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    invoke-virtual {p1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h:Ljava/lang/String;

    .line 393
    .line 394
    invoke-static {v1}, Lax/c3/d0;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0
    :try_end_18d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_15d .. :try_end_18d} :catch_216

    .line 398
    goto :goto_190

    .line 399
    :cond_18e
    move-object p1, v4

    .line 400
    move-object v0, p1

    .line 401
    :goto_190
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 402
    .line 403
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-nez v1, :cond_1f1

    .line 408
    .line 409
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 410
    .line 411
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-static {v1}, Lax/Q2/f;->e0(Lax/Q2/f;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-nez v1, :cond_1b0

    .line 420
    .line 421
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 422
    .line 423
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-static {v1}, Lax/Q2/f;->o0(Lax/Q2/f;)Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-eqz v1, :cond_1b5

    .line 432
    .line 433
    :cond_1b0
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 434
    .line 435
    invoke-virtual {v1, v4}, Lcom/voxdon/xplorer/file/o;->h(Lcom/voxdon/xplorer/file/c$a;)V

    .line 436
    .line 437
    .line 438
    :cond_1b5
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 439
    .line 440
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-nez v1, :cond_1f1

    .line 445
    .line 446
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    const-string v0, "TextEditor : FileOperator not connected"

    .line 455
    .line 456
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    new-instance v0, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 463
    .line 464
    .line 465
    const-string v1, "location:"

    .line 466
    .line 467
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s:Lcom/voxdon/xplorer/file/o;

    .line 471
    .line 472
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 492
    .line 493
    .line 494
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 495
    .line 496
    .line 497
    return-void

    .line 498
    :cond_1f1
    move-object v4, p1

    .line 499
    :cond_1f2
    :goto_1f2
    if-eqz v4, :cond_1fa

    .line 500
    .line 501
    if-eqz v0, :cond_1fa

    .line 502
    .line 503
    iput-object v4, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A:Ljava/lang/String;

    .line 504
    .line 505
    iput-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->B:Ljava/lang/String;

    .line 506
    .line 507
    :cond_1fa
    invoke-static {p0}, Lax/t3/j;->m(Landroid/content/Context;)I

    .line 508
    .line 509
    .line 510
    move-result p1

    .line 511
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->x:I

    .line 512
    .line 513
    int-to-float p1, p1

    .line 514
    const/high16 v0, 0x41600000    # 14.0f

    .line 515
    .line 516
    div-float/2addr p1, v0

    .line 517
    iput p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->w:F

    .line 518
    .line 519
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->i:Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 522
    .line 523
    .line 524
    new-instance p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;

    .line 525
    .line 526
    invoke-direct {p1, p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 527
    .line 528
    .line 529
    new-array v0, v2, [Ljava/lang/Void;

    .line 530
    .line 531
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :catch_216
    invoke-static {p0, v3, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 536
    .line 537
    .line 538
    move-result-object p1

    .line 539
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 540
    .line 541
    .line 542
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 543
    .line 544
    .line 545
    return-void
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getMenuInflater()Landroid/view/MenuInflater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0f0025

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
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

.method public onIMEVisibilityChanged(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_f

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Landroid/widget/EditText;

    .line 8
    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    check-cast p1, Landroid/widget/EditText;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->N0(Landroid/widget/EditText;)V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 4

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a02e8

    .line 6
    .line 7
    .line 8
    if-eq v0, v1, :cond_e

    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_e
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "menu_text_editor"

    .line 20
    .line 21
    const-string v1, "text_save"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->i:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Lax/c3/d0;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "ext"

    .line 34
    .line 35
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->G0(Z)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    return p1
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

.method protected onPause()V
    .registers 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/f;->onPause()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->x:I

    .line 5
    .line 6
    invoke-static {p0}, Lax/t3/j;->m(Landroid/content/Context;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eq v0, v1, :cond_10

    .line 11
    .line 12
    iget v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->x:I

    .line 13
    .line 14
    invoke-static {p0, v0}, Lax/t3/j;->u(Landroid/content/Context;I)V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .registers 7

    .line 1
    const v0, 0x7f0a02e8

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_36

    .line 9
    .line 10
    iget-boolean v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->f:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_12

    .line 14
    .line 15
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 16
    .line 17
    .line 18
    goto :goto_4b

    .line 19
    :cond_12
    const/4 v1, 0x1

    .line 20
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->g:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 24
    .line 25
    sget-object v4, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;->d0:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 26
    .line 27
    if-ne v3, v4, :cond_29

    .line 28
    .line 29
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/16 v1, 0xff

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_4b

    .line 42
    :cond_29
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/16 v1, 0x55

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 52
    .line 53
    .line 54
    goto :goto_4b

    .line 55
    :cond_36
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "not created options menu!!"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 74
    .line 75
    .line 76
    :goto_4b
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1
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

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 7

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 5
    .line 6
    if-eqz v0, :cond_31

    .line 7
    .line 8
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 13
    .line 14
    invoke-virtual {v1}, Lax/Z2/k;->d()Lax/c3/K;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 19
    .line 20
    invoke-virtual {v2}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Lax/o3/e;->c(Lax/c3/K;Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    cmp-long v4, v0, v2

    .line 31
    .line 32
    if-eqz v4, :cond_31

    .line 33
    .line 34
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->t:Lax/Z2/k;

    .line 35
    .line 36
    invoke-virtual {v2}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "file_open_path"

    .line 41
    .line 42
    invoke-virtual {p1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "file_open_last_modified"

    .line 46
    .line 47
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 48
    .line 49
    .line 50
    :cond_31
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

.method protected onStart()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/n/c;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lax/Q2/a;->q(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method
