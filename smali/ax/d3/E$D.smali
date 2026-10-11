.class Lax/d3/E$D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/W2/z$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->m9(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E$D;->a:Lax/d3/E;

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
.method public a(Ljava/lang/String;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E$D;->a:Lax/d3/E;

    .line 2
    .line 3
    invoke-static {v0}, Lax/d3/E;->o5(Lax/d3/E;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    iget-object v0, p0, Lax/d3/E$D;->a:Lax/d3/E;

    .line 10
    .line 11
    iget-object v0, v0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/a;->X(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_14

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_14
    const/4 p1, 0x0

    .line 22
    return p1
.end method
