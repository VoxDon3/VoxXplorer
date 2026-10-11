.class public final synthetic Lax/d3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b0/a;


# instance fields
.field public final synthetic a:Lax/d3/l$a;

.field public final synthetic b:Lcom/voxdon/xplorer/file/b;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lax/d3/l$a;Lcom/voxdon/xplorer/file/b;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/d3/k;->a:Lax/d3/l$a;

    iput-object p2, p0, Lax/d3/k;->b:Lcom/voxdon/xplorer/file/b;

    iput-object p3, p0, Lax/d3/k;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/k;->a:Lax/d3/l$a;

    iget-object v1, p0, Lax/d3/k;->b:Lcom/voxdon/xplorer/file/b;

    iget-object v2, p0, Lax/d3/k;->c:Ljava/lang/String;

    check-cast p1, Lcom/voxdon/xplorer/file/b$e;

    invoke-static {v0, v1, v2, p1}, Lax/d3/l$a;->b(Lax/d3/l$a;Lcom/voxdon/xplorer/file/b;Ljava/lang/String;Lcom/voxdon/xplorer/file/b$e;)V

    return-void
.end method
