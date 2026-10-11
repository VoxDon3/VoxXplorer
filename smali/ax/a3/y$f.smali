.class Lax/a3/y$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/y;->y3(Lax/W2/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lax/a3/y;


# direct methods
.method constructor <init>(Lax/a3/y;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/y$f;->q:Lax/a3/y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public run()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/a3/y$f;->q:Lax/a3/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3c

    .line 8
    .line 9
    iget-object v0, p0, Lax/a3/y$f;->q:Lax/a3/y;

    .line 10
    .line 11
    invoke-static {v0}, Lax/a3/y;->t3(Lax/a3/y;)Landroid/widget/ProgressBar;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lax/a3/y$f;->q:Lax/a3/y;

    .line 20
    .line 21
    invoke-static {v1}, Lax/a3/y;->h3(Lax/a3/y;)Landroid/widget/TextView;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lax/a3/y$f;->q:Lax/a3/y;

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v4, 0x1

    .line 32
    new-array v4, v4, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    aput-object v3, v4, v5

    .line 36
    .line 37
    const v3, 0x7f130381

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3, v4}, Landroidx/fragment/app/Fragment;->N0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lax/a3/y$f;->q:Lax/a3/y;

    .line 48
    .line 49
    invoke-static {v1}, Lax/a3/y;->t3(Lax/a3/y;)Landroid/widget/ProgressBar;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lax/a3/y$f;->q:Lax/a3/y;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/fragment/app/e;->O2()V

    .line 59
    .line 60
    .line 61
    :cond_3c
    return-void
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
