.class public abstract Lax/d3/a;
.super Lax/d3/E;
.source "SourceFile"


# instance fields
.field s2:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/E;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/d3/a;->s2:Z

    .line 6
    .line 7
    return-void
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


# virtual methods
.method protected abstract B7()Ljava/lang/String;
.end method

.method public j1(Landroid/app/Activity;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Lax/d3/E;->j1(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lax/d3/a;->s2:Z

    .line 5
    .line 6
    if-eqz v0, :cond_17

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lax/d3/a;->s2:Z

    .line 10
    .line 11
    check-cast p1, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/d3/a;->z3()Lax/Q2/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p1, v0, v1}, Lcom/voxdon/xplorer/activity/MainActivity;->i2(Lax/Q2/f;I)V

    .line 22
    .line 23
    .line 24
    :cond_17
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
.end method

.method protected m8(ZLjava/lang/Object;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/d3/a;->ta()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, p1, p2, v0}, Lax/d3/E;->c9(ZLjava/lang/Object;Ljava/lang/String;)V

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

.method abstract ta()Ljava/lang/String;
.end method

.method public ua()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/d3/a;->B7()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/PathBar;->setRootTitle(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_21

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/d3/a;->z3()Lax/Q2/f;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v0, v1, v2}, Lcom/voxdon/xplorer/activity/MainActivity;->i2(Lax/Q2/f;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_21
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lax/d3/a;->s2:Z

    .line 36
    .line 37
    return-void
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

.method public abstract z3()Lax/Q2/f;
.end method
