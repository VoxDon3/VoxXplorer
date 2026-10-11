.class public Lax/a3/z$g;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lax/U2/a;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Lax/c3/k;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field final synthetic k:Lax/a3/z;


# direct methods
.method constructor <init>(Lax/a3/z;Lax/c3/k;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/a3/z$g;->k:Lax/a3/z;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lax/a3/z$g;->h:Lax/c3/k;

    .line 9
    .line 10
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/z$g;->w([Ljava/lang/Void;)Lax/U2/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/U2/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/z$g;->x(Lax/U2/a;)V

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

.method protected varargs w([Ljava/lang/Void;)Lax/U2/a;
    .registers 3

    .line 1
    iget-object p1, p0, Lax/a3/z$g;->h:Lax/c3/k;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lax/c3/z;->f0:Lax/c3/z;

    .line 8
    .line 9
    if-ne p1, v0, :cond_13

    .line 10
    .line 11
    iget-object p1, p0, Lax/a3/z$g;->h:Lax/c3/k;

    .line 12
    .line 13
    invoke-virtual {p1}, Lax/c3/k;->f0()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lax/a3/z$g;->i:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_34

    .line 20
    :cond_13
    sget-object v0, Lax/c3/z;->e0:Lax/c3/z;

    .line 21
    .line 22
    if-ne p1, v0, :cond_28

    .line 23
    .line 24
    iget-object p1, p0, Lax/a3/z$g;->h:Lax/c3/k;

    .line 25
    .line 26
    invoke-virtual {p1}, Lax/c3/k;->h0()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lax/a3/z$g;->i:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p1, p0, Lax/a3/z$g;->h:Lax/c3/k;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/c3/k;->g0()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lax/a3/z$g;->j:Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_34

    .line 41
    :cond_28
    sget-object v0, Lax/c3/z;->c0:Lax/c3/z;

    .line 42
    .line 43
    if-ne p1, v0, :cond_34

    .line 44
    .line 45
    iget-object p1, p0, Lax/a3/z$g;->h:Lax/c3/k;

    .line 46
    .line 47
    invoke-virtual {p1}, Lax/c3/k;->g0()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lax/a3/z$g;->i:Ljava/lang/String;

    .line 52
    .line 53
    :cond_34
    :goto_34
    const/4 p1, 0x0

    .line 54
    return-object p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected x(Lax/U2/a;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/a3/z$g;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p1, :cond_18

    .line 4
    .line 5
    iget-object p1, p0, Lax/a3/z$g;->k:Lax/a3/z;

    .line 6
    .line 7
    invoke-static {p1}, Lax/a3/z;->p3(Lax/a3/z;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const v0, 0x7f0a01d3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/widget/TextView;

    .line 19
    .line 20
    iget-object v0, p0, Lax/a3/z$g;->i:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object p1, p0, Lax/a3/z$g;->j:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz p1, :cond_30

    .line 28
    .line 29
    iget-object p1, p0, Lax/a3/z$g;->k:Lax/a3/z;

    .line 30
    .line 31
    invoke-static {p1}, Lax/a3/z;->p3(Lax/a3/z;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const v0, 0x7f0a01d6

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Landroid/widget/TextView;

    .line 43
    .line 44
    iget-object v0, p0, Lax/a3/z$g;->j:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    :cond_30
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
