.class Lax/d3/b$b;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/b;->I5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/T2/h;

.field final synthetic d:Lax/d3/b;


# direct methods
.method constructor <init>(Lax/d3/b;JLax/T2/h;)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/d3/b$b;->d:Lax/d3/b;

    .line 2
    .line 3
    iput-object p4, p0, Lax/d3/b$b;->c:Lax/T2/h;

    .line 4
    .line 5
    invoke-direct {p0, p2, p3}, Lax/g3/c;-><init>(J)V

    .line 6
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


# virtual methods
.method public a(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lax/d3/b$b;->d:Lax/d3/b;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/b;->v5(Lax/d3/b;)Lax/c3/K;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, Lax/d3/n;->Z2(Lax/c3/K;Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_e

    .line 13
    .line 14
    goto :goto_33

    .line 15
    :cond_e
    invoke-static {}, Lax/X2/Q;->z0()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_34

    .line 20
    .line 21
    invoke-static {}, Lax/u3/o;->c()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_34

    .line 26
    .line 27
    :try_start_1a
    new-instance p1, Landroid/content/Intent;

    .line 28
    .line 29
    const-string v0, "android.os.storage.action.CLEAR_APP_CACHE"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lax/d3/b$b;->d:Lax/d3/b;

    .line 35
    .line 36
    const v1, 0x9471

    .line 37
    .line 38
    .line 39
    invoke-static {v0, p1, v1}, Lax/c3/u;->r0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;I)V
    :try_end_29
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1a .. :try_end_29} :catch_2a

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catch_2a
    iget-object p1, p0, Lax/d3/b$b;->d:Lax/d3/b;

    .line 44
    .line 45
    const v0, 0x7f130137

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {p1, v0, v1}, Lax/d3/n;->E4(II)V

    .line 50
    .line 51
    .line 52
    :goto_33
    return-void

    .line 53
    :cond_34
    iget-object p1, p0, Lax/d3/b$b;->d:Lax/d3/b;

    .line 54
    .line 55
    iget-object v0, p0, Lax/d3/b$b;->c:Lax/T2/h;

    .line 56
    .line 57
    invoke-static {p1, v0}, Lax/d3/b;->w5(Lax/d3/b;Lax/T2/h;)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
.end method
