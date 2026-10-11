.class public final Lcom/voxdon/xplorer/viewer/g$b;
.super Lcom/voxdon/xplorer/viewer/g$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/viewer/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field final synthetic h:Lcom/voxdon/xplorer/viewer/g;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/viewer/g;Landroid/content/Context;Lcom/voxdon/xplorer/viewer/g$c;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/g$b;->h:Lcom/voxdon/xplorer/viewer/g;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/viewer/g$g;-><init>(Lcom/voxdon/xplorer/viewer/g;Landroid/content/Context;Lcom/voxdon/xplorer/viewer/g$c;)V

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

.method public static synthetic U(Lcom/voxdon/xplorer/viewer/g$b;Lax/P0/H;Landroid/view/View;)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_36

    .line 5
    .line 6
    const/16 p2, 0x1d

    .line 7
    .line 8
    invoke-interface {p1, p2}, Lax/P0/H;->c0(I)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_e

    .line 13
    .line 14
    goto :goto_36

    .line 15
    :cond_e
    invoke-interface {p1}, Lax/P0/H;->k0()Lax/P0/T;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p1}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lax/P0/H;

    .line 24
    .line 25
    invoke-virtual {p2}, Lax/P0/T;->I()Lax/P0/T$c;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-virtual {p2, v0}, Lax/P0/T$c;->G(I)Lax/P0/T$c;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {p2, v0, v1}, Lax/P0/T$c;->U(IZ)Lax/P0/T$c;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Lax/P0/T$c;->F()Lax/P0/T;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {p1, p2}, Lax/P0/H;->w(Lax/P0/T;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/g$b;->h:Lcom/voxdon/xplorer/viewer/g;

    .line 47
    .line 48
    invoke-static {p0}, Lcom/voxdon/xplorer/viewer/g;->b(Lcom/voxdon/xplorer/viewer/g;)Landroid/widget/PopupWindow;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 53
    .line 54
    .line 55
    :cond_36
    :goto_36
    return-void
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

.method private V(Lax/P0/T;)Z
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/g$g;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_25

    .line 10
    .line 11
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/g$g;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/voxdon/xplorer/viewer/g$f;

    .line 18
    .line 19
    iget-object v2, v2, Lcom/voxdon/xplorer/viewer/g$f;->a:Lax/P0/V$a;

    .line 20
    .line 21
    invoke-virtual {v2}, Lax/P0/V$a;->a()Lax/P0/P;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p1, Lax/P0/T;->D:Lax/r7/A;

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Lax/r7/A;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_22

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_22
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_25
    return v0
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


# virtual methods
.method public R(Lcom/voxdon/xplorer/viewer/g$d;)V
    .registers 5

    .line 1
    iget-object v0, p1, Lcom/voxdon/xplorer/viewer/g$d;->u:Landroid/widget/TextView;

    .line 2
    .line 3
    const v1, 0x7f13018f

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g$b;->h:Lcom/voxdon/xplorer/viewer/g;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/g;->h()Lax/P0/H;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lax/P0/H;

    .line 23
    .line 24
    invoke-interface {v1}, Lax/P0/H;->k0()Lax/P0/T;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/viewer/g$b;->V(Lax/P0/T;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, p1, Lcom/voxdon/xplorer/viewer/g$d;->v:Landroid/view/View;

    .line 33
    .line 34
    if-eqz v1, :cond_25

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    goto :goto_26

    .line 38
    :cond_25
    const/4 v1, 0x0

    .line 39
    :goto_26
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 43
    .line 44
    new-instance v1, Lax/w3/i;

    .line 45
    .line 46
    invoke-direct {v1, p0, v0}, Lax/w3/i;-><init>(Lcom/voxdon/xplorer/viewer/g$b;Lax/P0/H;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    .line 51
    .line 52
    return-void
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

.method public T(Ljava/lang/String;)V
    .registers 2

    .line 1
    return-void
.end method

.method public W(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/viewer/g$f;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/g$g;->d:Ljava/util/List;

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
