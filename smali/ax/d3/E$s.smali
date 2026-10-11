.class Lax/d3/E$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/p$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->P9(Lax/W2/m;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/W2/m;

.field final synthetic b:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;Lax/W2/m;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/E$s;->b:Lax/d3/E;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d3/E$s;->a:Lax/W2/m;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lax/a3/l;
    .registers 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/d3/E$s;->b:Lax/d3/E;

    .line 11
    .line 12
    invoke-static {v0}, Lax/d3/E;->o5(Lax/d3/E;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_28

    .line 17
    .line 18
    iget-object v0, p0, Lax/d3/E$s;->a:Lax/W2/m;

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/W2/m;->m()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lax/d3/E$s;->b:Lax/d3/E;

    .line 29
    .line 30
    iget-object v1, v1, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/a;->X(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_28

    .line 37
    .line 38
    sget-object p1, Lax/a3/l;->c0:Lax/a3/l;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_28
    iget-object v0, p0, Lax/d3/E$s;->a:Lax/W2/m;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lax/W2/m;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :try_start_2d
    iget-object p1, p0, Lax/d3/E$s;->b:Lax/d3/E;

    .line 47
    .line 48
    iget-object v0, p0, Lax/d3/E$s;->a:Lax/W2/m;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-virtual {p1, v0, v1}, Lax/d3/E;->l(Lax/W2/h;Z)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lax/a3/l;->q:Lax/a3/l;
    :try_end_37
    .catch Lax/b3/c; {:try_start_2d .. :try_end_37} :catch_38

    .line 55
    .line 56
    return-object p1

    .line 57
    :catch_38
    sget-object p1, Lax/a3/l;->d0:Lax/a3/l;

    .line 58
    .line 59
    return-object p1
    .line 60
    .line 61
.end method
