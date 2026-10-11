.class Lax/d3/E$V;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->ga(Lax/W2/e$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/W2/e$e;

.field final synthetic d:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;Lax/W2/e$e;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/d3/E$V;->d:Lax/d3/E;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d3/E$V;->c:Lax/W2/e$e;

    .line 4
    .line 5
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/E$V;->c:Lax/W2/e$e;

    .line 2
    .line 3
    iget-object p1, p1, Lax/W2/e$e;->c:Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lax/d3/E$V;->d:Lax/d3/E;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lax/d3/E;->P8(Landroid/net/Uri;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method
