.class Lax/b2/e$a;
.super Lax/c0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/b2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lax/b2/e;


# direct methods
.method constructor <init>(Lax/b2/e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/b2/e$a;->d:Lax/b2/e;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/c0/a;-><init>()V

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
.end method


# virtual methods
.method public g(Landroid/view/View;Lax/d0/H;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/b2/e$a;->d:Lax/b2/e;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b2/e;->g:Lax/c0/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lax/c0/a;->g(Landroid/view/View;Lax/d0/H;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/b2/e$a;->d:Lax/b2/e;

    .line 9
    .line 10
    iget-object v0, v0, Lax/b2/e;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->k0(Landroid/view/View;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Lax/b2/e$a;->d:Lax/b2/e;

    .line 17
    .line 18
    iget-object v0, v0, Lax/b2/e;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Landroidx/preference/e;

    .line 25
    .line 26
    if-nez v1, :cond_1c

    .line 27
    .line 28
    goto :goto_24

    .line 29
    :cond_1c
    check-cast v0, Landroidx/preference/e;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroidx/preference/e;->Q(I)Landroidx/preference/Preference;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-nez p1, :cond_25

    .line 36
    .line 37
    :goto_24
    return-void

    .line 38
    :cond_25
    invoke-virtual {p1, p2}, Landroidx/preference/Preference;->h0(Lax/d0/H;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public j(Landroid/view/View;ILandroid/os/Bundle;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/b2/e$a;->d:Lax/b2/e;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b2/e;->g:Lax/c0/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lax/c0/a;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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
