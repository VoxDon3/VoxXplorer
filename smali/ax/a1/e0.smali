.class public final synthetic Lax/a1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/a1/B$a;

.field public final synthetic q:Lax/a1/B$d;


# direct methods
.method public synthetic constructor <init>(Lax/a1/B$d;Lax/a1/B$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/e0;->q:Lax/a1/B$d;

    iput-object p2, p0, Lax/a1/e0;->c0:Lax/a1/B$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/e0;->q:Lax/a1/B$d;

    iget-object v1, p0, Lax/a1/e0;->c0:Lax/a1/B$a;

    invoke-static {v0, v1}, Lax/a1/f0;->F(Lax/a1/B$d;Lax/a1/B$a;)V

    return-void
.end method
