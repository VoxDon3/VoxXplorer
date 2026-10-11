.class public Lcom/voxdon/xplorer/widget/GridFilenameTextView;
.super Landroidx/appcompat/widget/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;
    }
.end annotation


# instance fields
.field private h:Landroid/text/SpannableString;

.field private i:Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Ljava/lang/CharSequence;

.field private n:Ljava/lang/String;

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const v0, 0x1010084

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/widget/GridFilenameTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Landroid/text/SpannableString;

    const-string p2, "..."

    invoke-direct {p1, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object p1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->h:Landroid/text/SpannableString;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->k:Z

    .line 5
    new-instance p1, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;-><init>(Lcom/voxdon/xplorer/widget/GridFilenameTextView;Lcom/voxdon/xplorer/widget/GridFilenameTextView$a;)V

    iput-object p1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->i:Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;

    return-void
.end method

.method static synthetic s(Lcom/voxdon/xplorer/widget/GridFilenameTextView;)Landroid/text/SpannableString;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->h:Landroid/text/SpannableString;

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

.method private t(Ljava/lang/String;)Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_b

    .line 10
    .line 11
    return v0

    .line 12
    :cond_b
    const/16 v1, 0x2e

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_18

    .line 19
    .line 20
    if-gez p1, :cond_16

    .line 21
    .line 22
    goto :goto_18

    .line 23
    :cond_16
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_18
    :goto_18
    return v0
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

.method private u()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->t(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_e

    .line 9
    .line 10
    iput-boolean v1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->k:Z

    .line 11
    .line 12
    iput-boolean v1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->j:Z

    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    invoke-virtual {p0}, Landroid/widget/TextView;->getMaxLines()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v2, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->m:Ljava/lang/CharSequence;

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    if-eq v0, v3, :cond_1f

    .line 23
    .line 24
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->i:Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->n:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3}, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->d(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_1f
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->m:Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_34

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->l:Z

    .line 42
    .line 43
    :try_start_2a
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_2d
    .catchall {:try_start_2a .. :try_end_2d} :catchall_30

    .line 44
    .line 45
    .line 46
    iput-boolean v1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->l:Z

    .line 47
    .line 48
    goto :goto_35

    .line 49
    :catchall_30
    move-exception v0

    .line 50
    iput-boolean v1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->l:Z

    .line 51
    .line 52
    throw v0

    .line 53
    :cond_34
    const/4 v0, 0x0

    .line 54
    :goto_35
    iput-boolean v1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->k:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->j:Z

    .line 57
    .line 58
    return-void
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
.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->k:Z

    .line 6
    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->u()V

    .line 10
    .line 11
    .line 12
    :cond_b
    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->m:Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-eqz p1, :cond_d

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    :goto_e
    iput-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->n:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->k:Z

    .line 19
    .line 20
    :cond_13
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public setUseFilenameEllipsize(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->o:Z

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
