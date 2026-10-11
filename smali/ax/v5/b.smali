.class public final synthetic Lax/v5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/y5/b$a;


# instance fields
.field public final synthetic a:Lax/v5/c;

.field public final synthetic b:Lax/p5/p;

.field public final synthetic c:Lax/p5/i;


# direct methods
.method public synthetic constructor <init>(Lax/v5/c;Lax/p5/p;Lax/p5/i;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/v5/b;->a:Lax/v5/c;

    iput-object p2, p0, Lax/v5/b;->b:Lax/p5/p;

    iput-object p3, p0, Lax/v5/b;->c:Lax/p5/i;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/v5/b;->a:Lax/v5/c;

    iget-object v1, p0, Lax/v5/b;->b:Lax/p5/p;

    iget-object v2, p0, Lax/v5/b;->c:Lax/p5/i;

    invoke-static {v0, v1, v2}, Lax/v5/c;->b(Lax/v5/c;Lax/p5/p;Lax/p5/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
