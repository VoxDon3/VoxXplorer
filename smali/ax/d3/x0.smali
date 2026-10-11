.class public Lax/d3/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/d3/x0$a;
    }
.end annotation


# instance fields
.field private a:Lax/d3/x0$a;

.field private b:Lax/n/c;

.field private c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

.field private d:Z

.field private e:Lax/c0/F0;


# direct methods
.method public constructor <init>(Lax/n/c;Lax/d3/x0$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/d3/x0;->b:Lax/n/c;

    .line 5
    .line 6
    iput-object p2, p0, Lax/d3/x0;->a:Lax/d3/x0$a;

    .line 7
    .line 8
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

.method public static synthetic a(Lax/d3/x0;Landroid/view/View;Lax/c0/F0;)Lax/c0/F0;
    .registers 3

    .line 1
    invoke-direct {p0, p2}, Lax/d3/x0;->c(Lax/c0/F0;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p1}, Lax/d3/x0;->f(Z)Z

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lax/d3/x0;->c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lax/d3/x0;->b(Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;Lax/c0/F0;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lax/d3/x0;->e:Lax/c0/F0;

    .line 14
    .line 15
    sget-object p0, Lax/c0/F0;->b:Lax/c0/F0;

    .line 16
    .line 17
    return-object p0
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

.method private c(Lax/c0/F0;)Z
    .registers 3

    .line 1
    invoke-static {}, Lax/c0/F0$m;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Lax/c0/F0;->f(I)Lax/T/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lax/T/b;->d:I

    .line 10
    .line 11
    if-lez p1, :cond_e

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_e
    const/4 p1, 0x0

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private e()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/d3/x0;->d:Z

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

.method private f(Z)Z
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/d3/x0;->d:Z

    .line 2
    .line 3
    iput-boolean p1, p0, Lax/d3/x0;->d:Z

    .line 4
    .line 5
    if-eq v0, p1, :cond_b

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/x0;->a:Lax/d3/x0$a;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lax/d3/x0$a;->onIMEVisibilityChanged(Z)V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-boolean p1, p0, Lax/d3/x0;->d:Z

    .line 13
    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public b(Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;Lax/c0/F0;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/x0;->a:Lax/d3/x0$a;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/d3/x0;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Lax/d3/x0$a;->isContentClipToPadding(Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1, p2, v0}, Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;->d(Lax/c0/F0;Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;->getAppliedInsets()Lax/T/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p0, Lax/d3/x0;->a:Lax/d3/x0$a;

    .line 19
    .line 20
    invoke-interface {p2, p1, v0}, Lax/d3/Y;->onApplyWindowsInsets(Lax/T/b;Z)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lax/d3/x0;->b:Lax/n/c;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->v0()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :cond_24
    :goto_24
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3a

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 48
    .line 49
    instance-of v2, v1, Lax/d3/Y;

    .line 50
    .line 51
    if-eqz v2, :cond_24

    .line 52
    .line 53
    check-cast v1, Lax/d3/Y;

    .line 54
    .line 55
    invoke-interface {v1, p1, v0}, Lax/d3/Y;->onApplyWindowsInsets(Lax/T/b;Z)V

    .line 56
    .line 57
    .line 58
    goto :goto_24

    .line 59
    :cond_3a
    return-void
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
.end method

.method public d(Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/d3/x0;->c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 p1, 0x0

    .line 8
    :goto_7
    invoke-static {p1}, Lax/u3/b;->d(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lax/d3/x0;->c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 12
    .line 13
    if-nez p1, :cond_f

    .line 14
    .line 15
    goto :goto_2d

    .line 16
    :cond_f
    invoke-static {}, Lax/X2/Q;->W1()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_2d

    .line 21
    .line 22
    iget-object p1, p0, Lax/d3/x0;->b:Lax/n/c;

    .line 23
    .line 24
    const v0, 0x1010031

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Lax/u3/z;->o(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object v0, p0, Lax/d3/x0;->c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;->setNavigationBarColor(I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lax/d3/x0;->c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 37
    .line 38
    new-instance v0, Lax/d3/w0;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lax/d3/w0;-><init>(Lax/d3/x0;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, Lax/c0/d0;->v0(Landroid/view/View;Lax/c0/I;)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    :goto_2d
    return-void
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

.method public g()V
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->W1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/x0;->e:Lax/c0/F0;

    .line 8
    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    iget-object v1, p0, Lax/d3/x0;->c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lax/d3/x0;->b(Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;Lax/c0/F0;)V

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
.end method

.method public h(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/x0;->c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;->setNavigationBarColor(I)V

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
    .line 22
.end method

.method public i(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/x0;->c:Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;->setStatusBarColor(I)V

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
    .line 22
.end method
